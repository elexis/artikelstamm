package info.artikelstamm.builder;

import java.io.File;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

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
import info.artikelstamm.model.ARTIKELSTAMM.LIMITATIONS.LIMITATION;
import info.artikelstamm.model.ARTIKELSTAMM.PRODUCTS.PRODUCT;

public class ArtikelstammBuilder {
	
	private static SchemaFactory schemaFactory =
		SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	
	public static final String OPTION_ODDB2XML_ARTICLE_FILE = "oddb2xmlArticleFile";
	public static final String OPTION_ODDB2XML_LIMITATION_FILE = "oddb2xmlLimitationFile";
	public static final String OPTION_ODDB2XML_PRODUCT_FILE = "oddb2xmlProductFile";
	public static final String OPTION_ODDB2XML_SEQUENCES_FILE = "oddb2xmlSequencesFile";
	public static final String OPTION_ARTIKELSTAMM_VALIDATION_SCHEMA =
		"artikelstammSchema";
	
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
	@SuppressWarnings("static-access")
	static Option artikelstammValidationSchema =
		OptionBuilder.withArgName(OPTION_ARTIKELSTAMM_VALIDATION_SCHEMA).hasArg()
			.withDescription("Elexis_Artikelstamm_v4.xsd file")
			.create(OPTION_ARTIKELSTAMM_VALIDATION_SCHEMA);
	
	static DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
	
	static String oddb2xmlArticleFileName = null;
	static String oddb2xmlLimitationFileName = null;
	static String oddb2xmlProductFileName = null;
	static String oddb2xmlSequencesFileName = null;
	static String artikelstammSchemaFileName = null;
	
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
		options.addOption(artikelstammValidationSchema);
		
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
			artikelstammSchemaFileName = line.getOptionValue(OPTION_ARTIKELSTAMM_VALIDATION_SCHEMA);
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
		if (error) {
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
			}
		});
		
		List<LIMITATION> limitation = artikelstamm.getLIMITATIONS().getLIMITATION();
		Collections.sort(limitation, new Comparator<LIMITATION>() {

			@Override
			public int compare(LIMITATION o1, LIMITATION o2){
				return o1.getLIMNAMEBAG().compareTo(o2.getLIMNAMEBAG());
			}
		});
		
		URL validationFileUrl = null;
		if (artikelstammSchemaFileName != null) {
			File file = new File(artikelstammSchemaFileName);
			if (file.exists()) {
				validationFileUrl = file.toURI().toURL();
			} else {
				System.out.println("Validation schema location provided, but file does not exist ["
					+ artikelstammSchemaFileName + "]");
			}
		}
		
		ArtikelstammBuilder.marshallToFileSystem(artikelstamm, outputFile, validationFileUrl);
		System.out.println("[OK] " + outputFile.getAbsolutePath());
	}
	
	public static void marshallToFileSystem(Object newData, File outputFile, URL validationFileUrl)
		throws SAXException, JAXBException{
		Marshaller m = JAXBContext.newInstance(ARTIKELSTAMM.class).createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		if (validationFileUrl != null) {
			Schema validationSchema = schemaFactory.newSchema(validationFileUrl);
			m.setSchema(validationSchema);
		}
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
