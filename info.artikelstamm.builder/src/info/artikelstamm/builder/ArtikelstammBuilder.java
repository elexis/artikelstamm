package info.artikelstamm.builder;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.xml.sax.SAXException;

import com.ywesee.oddb2xml.Oddb2xmlValidator;
import com.ywesee.oddb2xml.sequences.SequencesValidator;

import info.artikelstamm.builder.mapping.MappingEntry;
import info.artikelstamm.builder.strategies.EMediatStrategyV1;
import info.artikelstamm.builder.strategies.IArtikelstammBuildStrategy;
import info.artikelstamm.builder.strategies.Oddb2XmlStrategyV1_2;
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
	
	public static final String OPTION_EMEDIAT_PRODUCT_FILE = "emediatProductFile";
	public static final String OPTION_EMEDIAT_ARTICLE_FILE = "emediatArticleFile";
	public static final String OPTION_EMEDIAT_LIMITATIONS_FILE = "emediatLimitationFile";
	
	public static final String OPTION_ARTIKELSTAMM_VALIDATION_SCHEMA = "artikelstammSchema";
	
	static DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
	
	static String oddb2xmlArticleFileName = null;
	static String oddb2xmlLimitationFileName = null;
	static String oddb2xmlProductFileName = null;
	static String oddb2xmlSequencesFileName = null;
	static String emediatProductFile = null;
	static String emediatArticleFile = null;
	static String emediatLimitationsFile = null;
	static String artikelstammSchemaFileName = null;
	
	private static Options options = new Options();
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("---------------------------------------------");
		System.out.println(ArtikelstammBuilder.class.getName());
		System.out.println("| parameters:");
		for (int i = 0; i < args.length; i++) {
			System.out.println("|- " + args[i]);
		}
		System.out.println("---------------------------------------------");
		
		options.addOption(OPTION_ODDB2XML_PRODUCT_FILE, true, "oddb2xml_product.xml file");
		options.addOption(OPTION_ODDB2XML_ARTICLE_FILE, true, "oddb2xml_article.xml file");
		options.addOption(OPTION_ODDB2XML_LIMITATION_FILE, true, "oddb2xml_limitation.xml file");
		options.addOption(OPTION_ODDB2XML_SEQUENCES_FILE, true, "oddb2xml_sequences.xml file");
		options.addOption(OPTION_EMEDIAT_PRODUCT_FILE, true, "emediat_product.xml file");
		options.addOption(OPTION_EMEDIAT_ARTICLE_FILE, true, "emediat_article.xml file");
		options.addOption(OPTION_EMEDIAT_LIMITATIONS_FILE, true, "emediat_limitations.xml file");
		Option required = new Option(OPTION_ARTIKELSTAMM_VALIDATION_SCHEMA, true,
			"Elexis_Artikelstamm_v4.xsd file");
		required.setRequired(true);
		options.addOption(required);
		
		boolean buildOddb2Xml = false;
		boolean buildMedindex = false;
		
		// create the parser
		CommandLineParser parser = new GnuParser();
		try {
			// parse the command line arguments
			CommandLine line = parser.parse(options, args);
			
			if (args.length < 1) {
				printHelp();
				return;
			}
			
			buildOddb2Xml = (line.hasOption(OPTION_ODDB2XML_PRODUCT_FILE)
				&& line.hasOption(OPTION_ODDB2XML_ARTICLE_FILE)
				&& line.hasOption(OPTION_ODDB2XML_LIMITATION_FILE)
				&& line.hasOption(OPTION_ODDB2XML_SEQUENCES_FILE));
			buildMedindex = (line.hasOption(OPTION_EMEDIAT_PRODUCT_FILE)
				&& line.hasOption(OPTION_EMEDIAT_ARTICLE_FILE)
				&& line.hasOption(OPTION_EMEDIAT_LIMITATIONS_FILE));
			
			if (!buildOddb2Xml && !buildMedindex) {
				printHelp();
				return;
			}
			
			oddb2xmlSequencesFileName = line.getOptionValue(OPTION_ODDB2XML_SEQUENCES_FILE);
			oddb2xmlArticleFileName = line.getOptionValue(OPTION_ODDB2XML_ARTICLE_FILE);
			oddb2xmlLimitationFileName = line.getOptionValue(OPTION_ODDB2XML_LIMITATION_FILE);
			oddb2xmlProductFileName = line.getOptionValue(OPTION_ODDB2XML_PRODUCT_FILE);
			
			emediatProductFile = line.getOptionValue(OPTION_EMEDIAT_PRODUCT_FILE);
			emediatArticleFile = line.getOptionValue(OPTION_EMEDIAT_ARTICLE_FILE);
			emediatLimitationsFile = line.getOptionValue(OPTION_EMEDIAT_LIMITATIONS_FILE);
			
			artikelstammSchemaFileName = line.getOptionValue(OPTION_ARTIKELSTAMM_VALIDATION_SCHEMA);
		} catch (ParseException exp) {
			System.out.println(exp);
			printHelp();
			return;
		}
		
		Map<String, MappingEntry> gtinToProducts = new HashMap<>();
		if (buildOddb2Xml) {
			System.out.println("--- Building oddb2xml based artikelstamm file");
			Set<Entry<String, String>> entrySet =
				buildOddb2Xml().getGtinToProdnoMapping().entrySet();
			entrySet.forEach(c -> gtinToProducts.put(c.getKey(),
				new MappingEntry(c.getKey(), c.getValue(), null)));
		}
		
		if (buildMedindex) {
			System.out.println("--- Building e-mediat based artikelstamm file");
			Set<Entry<String, String>> entrySet =
				buildEmediat().getGtinToProdnoMapping().entrySet();
			for (Entry<String, String> entry : entrySet) {
				if (gtinToProducts.containsKey(entry.getKey())) {
					MappingEntry mappingEntry = gtinToProducts.get(entry.getKey());
					mappingEntry.setMedindex_prodno(entry.getValue());
					gtinToProducts.put(entry.getKey(), mappingEntry);
				} else {
					gtinToProducts.put(entry.getKey(),
						new MappingEntry(entry.getKey(), null, entry.getValue()));
				}
			}
		}
		
		Path path = new File("gtin_to_prodno.csv").toPath();
		System.out.println("--- Writing gtin/prodno mapping file [" + path.toAbsolutePath() + "]");
		Files.write(path, () -> gtinToProducts.entrySet().stream()
			.<CharSequence> map(e -> e.getValue().toString()).iterator());
	}
	
	private static IArtikelstammBuildStrategy buildEmediat() throws Exception{
		File productFile = new File(emediatProductFile);
		File articlesFile = new File(emediatArticleFile);
		File limitationsFile = new File(emediatLimitationsFile);
		
		IArtikelstammBuildStrategy strategy = new EMediatStrategyV1();
		ARTIKELSTAMM artikelstamm =
			strategy.generate(null, productFile, articlesFile, limitationsFile);
		
		sortAndOutputToFile(artikelstamm, productFile.getParentFile());
		return strategy;
	}
	
	private static IArtikelstammBuildStrategy buildOddb2Xml() throws Exception{
		File oddb2xmlArticleFileObj = new File(oddb2xmlArticleFileName);
		File oddb2xmlLimitationFileObj = new File(oddb2xmlLimitationFileName);
		File oddb2xmlProductFileObj = new File(oddb2xmlProductFileName);
		File oddb2xmlSequencesFileObj = new File(oddb2xmlSequencesFileName);
		
		boolean error = SequencesValidator.validateSequencesFile(oddb2xmlSequencesFileObj);
		error |= Oddb2xmlValidator.validateOddb2XmlFiles(oddb2xmlProductFileObj,
			oddb2xmlArticleFileObj, oddb2xmlLimitationFileObj);
		if (error) {
			System.out.println("Validation error in source files. Exiting.");
			return null;
		}
		
		IArtikelstammBuildStrategy strategy = new Oddb2XmlStrategyV1_2();
		ARTIKELSTAMM artikelstamm = strategy.generate(oddb2xmlSequencesFileObj,
			oddb2xmlProductFileObj, oddb2xmlArticleFileObj, oddb2xmlLimitationFileObj);
		
		System.out.println("(VALIDATING)");
		ArtikelstammValidator av = new ArtikelstammValidator(artikelstamm);
		error = av.validate();
		if (error) {
			System.out.println("Validation error in target file. Exiting.");
			return strategy;
		}
		
		sortAndOutputToFile(artikelstamm, oddb2xmlProductFileObj.getParentFile());
		return strategy;
	}
	
	private static void sortAndOutputToFile(ARTIKELSTAMM artikelstamm, File outputDirectory)
		throws Exception{
		
		File outputFile =
			ArtikelstammBuilder.determineOutputFileName(artikelstamm, outputDirectory, null);
		
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
	
	private static void printHelp(){
		HelpFormatter formatter = new HelpFormatter();
		PrintWriter printWriter = new PrintWriter(System.out);
		formatter.printUsage(printWriter, 100, "this", options);
		printWriter.flush();
		printWriter.close();
		return;
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
	 * @param outputDirectory
	 * @param string
	 * @return
	 */
	public static File determineOutputFileName(ARTIKELSTAMM converted, File outputDirectory,
		String string){
		Date outputDate = converted.getCREATIONDATETIME().toGregorianCalendar().getTime();
		String filename;
		if (string != null) {
			filename = "artikelstamm_" + converted.getDATASOURCE().value() + "_"
				+ dateFormat.format(outputDate) + "_" + string + ".xml";
		} else {
			filename = "artikelstamm_" + converted.getDATASOURCE().value() + "_"
				+ dateFormat.format(outputDate) + ".xml";
		}
		
		return new File(outputDirectory, filename);
	}
	
}
