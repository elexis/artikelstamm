package info.artikelstamm.builder;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.xml.sax.SAXException;

import com.ywesee.oddb2xml.Oddb2xmlValidator;
import com.ywesee.oddb2xml.sequences.SequencesValidator;

import info.artikelstamm.builder.strategies.IArtikelstammBuildStrategy;
import info.artikelstamm.builder.strategies.StrategyV12;
import info.artikelstamm.model.ARTIKELSTAMM;
import info.artikelstamm.model.ARTIKELSTAMM.PRODUCTS.PRODUCT;

public class ArtikelstammBuilder {
	
	public static final String OPTION_ODDB2XML_ARTICLE_FILE = "oddb2xmlArticleFile";
	public static final String OPTION_ODDB2XML_LIMITATION_FILE = "oddb2xmlLimitationFile";
	public static final String OPTION_ODDB2XML_PRODUCT_FILE = "oddb2xmlProductFile";
	public static final String OPTION_ODDB2XML_SEQUENCES_FILE = "oddb2xmlSequencesFile";
	
	@SuppressWarnings("static-access")
	static Option oddbSwissmedicSequencesFileOption =
		OptionBuilder.withArgName(OPTION_ODDB2XML_SEQUENCES_FILE).hasArg()
			.withDescription("oddb2xml_swissmedic_sequences.csv file")
			.create(OPTION_ODDB2XML_SEQUENCES_FILE);
	@SuppressWarnings("static-access")
	static Option oddbArticleFileOption = OptionBuilder.withArgName(OPTION_ODDB2XML_ARTICLE_FILE)
		.hasArg().withDescription("oddb2xml_article.xml file").create(OPTION_ODDB2XML_ARTICLE_FILE);
	@SuppressWarnings("static-access")
	static Option oddbLimitationFileOption =
		OptionBuilder.withArgName(OPTION_ODDB2XML_LIMITATION_FILE).hasArg()
			.withDescription("oddb_limitation.xml file").create(OPTION_ODDB2XML_LIMITATION_FILE);
	@SuppressWarnings("static-access")
	static Option oddbProductFileOption = OptionBuilder.withArgName(OPTION_ODDB2XML_PRODUCT_FILE)
		.hasArg().withDescription("oddb_product.xml file").create(OPTION_ODDB2XML_PRODUCT_FILE);
	
	static DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
	
	static String oddb2xmlArticleFileName = null;
	static String oddb2xmlLimitationFileName = null;
	static String oddb2xmlProductFileName = null;
	static String oddb2xmlSequencesFileName = null;
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("---------------------------------------------");
		System.out.println(ArtikelstammBuilder.class.getName());
		System.out.println("| parameters:");
		for (int i = 0; i < args.length; i++) {
			System.out.println("|- " + args[i]);
		}
		System.out.println("---------------------------------------------");
		
		Options options = new Options();
		options.addOption(oddbSwissmedicSequencesFileOption);
		options.addOption(oddbArticleFileOption);
		options.addOption(oddbLimitationFileOption);
		options.addOption(oddbProductFileOption);
		
		// create the parser
		CommandLineParser parser = new GnuParser();
		try {
			// parse the command line arguments
			CommandLine line = parser.parse(options, args);
			if (!line.hasOption(OPTION_ODDB2XML_ARTICLE_FILE)
				|| !line.hasOption(OPTION_ODDB2XML_SEQUENCES_FILE)
				|| !line.hasOption(OPTION_ODDB2XML_LIMITATION_FILE)
				|| !line.hasOption(OPTION_ODDB2XML_PRODUCT_FILE)) {
				// automatically generate the help statement
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("ConvertToArtikelstamm v4", options);
				return;
			}
			
			oddb2xmlSequencesFileName = line.getOptionValue(OPTION_ODDB2XML_SEQUENCES_FILE);
			oddb2xmlArticleFileName = line.getOptionValue(OPTION_ODDB2XML_ARTICLE_FILE);
			oddb2xmlLimitationFileName = line.getOptionValue(OPTION_ODDB2XML_LIMITATION_FILE);
			oddb2xmlProductFileName = line.getOptionValue(OPTION_ODDB2XML_PRODUCT_FILE);
		} catch (ParseException exp) {
			// oops, something went wrong
			System.err.println("Parsing failed.  Reason: " + exp.getMessage());
		}
		
		File oddb2xmlArticleFileObj = new File(oddb2xmlArticleFileName);
		File oddb2xmlLimitationFileObj = new File(oddb2xmlLimitationFileName);
		File oddb2xmlProductFileObj = new File(oddb2xmlProductFileName);
		File oddb2xmlSequencesFileObj = new File(oddb2xmlSequencesFileName);
		
		boolean error = SequencesValidator.validateSequencesFile(oddb2xmlSequencesFileObj);
		error |= Oddb2xmlValidator.validateOddb2XmlFiles(oddb2xmlProductFileObj,
			oddb2xmlArticleFileObj, oddb2xmlLimitationFileObj);
		if (error) {
			System.out.println("Validation error in source files. Exiting.");
			return;
		}
		
		IArtikelstammBuildStrategy strategy = new StrategyV12();
		ARTIKELSTAMM artikelstamm = strategy.generate(oddb2xmlSequencesFileObj,
			oddb2xmlProductFileObj, oddb2xmlArticleFileObj, oddb2xmlLimitationFileObj);
		
		System.out.println("(VALIDATING)");
		ArtikelstammValidator av = new ArtikelstammValidator(artikelstamm);
		error = av.validate();
		if(error) {
			System.out.println("Validation error in target file. Exiting.");
			return;
		}
		
		File outputFile =
			ArtikelstammBuilder.determineOutputFileName(artikelstamm, oddb2xmlArticleFileObj, null);
		
		List<PRODUCT> product = artikelstamm.getPRODUCTS().getPRODUCT();
		Collections.sort(product, new Comparator<PRODUCT>() {

			@Override
			public int compare(PRODUCT o1, PRODUCT o2){
				return o1.getPRODNO().compareTo(o2.getPRODNO());
			}});
		
		ArtikelstammBuilder.marshallToFileSystem(artikelstamm, outputFile);
		System.out.println("[OK] " + outputFile.getAbsolutePath());
	}
	
	public static void marshallToFileSystem(Object newData, File outputFile)
		throws SAXException, JAXBException{
		Marshaller m = JAXBContext.newInstance(ARTIKELSTAMM.class).createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(newData, outputFile);
	}
	
	/**
	 * Determine an output file for a given input dataset and filename, use this to maintain
	 * consistent output file names. Output file is in the same directory as input file
	 * 
	 * @param converted
	 * @param inboundFileObj
	 * @param string
	 * @return
	 */
	public static File determineOutputFileName(ARTIKELSTAMM converted, File inboundFileObj,
		String string){
		Date outputDate = converted.getCREATIONDATETIME().toGregorianCalendar().getTime();
		String filename;
		if (string != null) {
			filename = "artikelstamm_" + dateFormat.format(outputDate) + "_" + string + ".xml";
		} else {
			filename = "artikelstamm_" + dateFormat.format(outputDate) + ".xml";
		}
		
		return new File(inboundFileObj.getParent(), filename);
	}
	
}
