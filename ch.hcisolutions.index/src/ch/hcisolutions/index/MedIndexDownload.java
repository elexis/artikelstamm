package ch.hcisolutions.index;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.BindingProvider;

import org.xml.sax.SAXException;

public class MedIndexDownload {
	
	public static final String INDEX_MEDINDEX = "medindex";
	public static final String FILTER_ONLY_ACTIVE = "A";
	public static final XMLGregorianCalendar START_2000 =
		new DateConverter().convertToXMLGregorianCalendar(LocalDateTime.of(2000, 1, 1, 0, 0));
	
	private static SchemaFactory schemaFactory =
		SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	
	public static final String OPTION_USERNAME = "username";
	public static final String OPTION_PASSWORD = "password";
	
	public static void main(String[] args)
		throws SAXException, JAXBException, MalformedURLException{
		
		if (args.length != 2) {
			System.out.println("Usage MedindexDownload username password");
			System.out.println("See https://redmine.medelexis.ch/issues/6592");
			return;
		}
		
		String username = args[0];
		String password = args[1];
		
		File medindexDir = new File("medindex");
		medindexDir.mkdir();
		
		DownloadSoap download =
			new Download(MedIndexDownload.class.getResource("hcisolutions_index_download.wsdl"))
				.getDownloadSoap12();
		
		((BindingProvider) download).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,
			username);
		((BindingProvider) download).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,
			password);
		
		DownloadArticleInput dai = new DownloadArticleInput();
		dai.setINDEX(INDEX_MEDINDEX);
		dai.setFILTER(FILTER_ONLY_ACTIVE);
		dai.setFROMDATE(START_2000);
		marshallToFileSystem(dai, new File(medindexDir, "DownloadArticleInput.xml"), null,
			DownloadArticleInput.class);
		
		System.out.println("Downloading articles ...");
		ARTICLE downloadArticle = download.downloadArticle(dai);
		marshallToFileSystem(downloadArticle, new File(medindexDir, "medindex_article.xml"), null,
			ARTICLE.class);
		
		DownloadProductInput dpi = new DownloadProductInput();
		dpi.setINDEX(INDEX_MEDINDEX);
		dpi.setFILTER(FILTER_ONLY_ACTIVE);
		dpi.setFROMDATE(START_2000);
		System.out.println("Downloading products ... ");
		PRODUCT downloadProduct = download.downloadProduct(dpi);
		marshallToFileSystem(downloadProduct, new File(medindexDir, "medindex_product.xml"), null,
			PRODUCT.class);
		
		DownloadLimitationInput dli = new DownloadLimitationInput();
		dli.setFROMDATE(START_2000);
		dli.setINDEX(INDEX_MEDINDEX);
		System.out.println("Downloading limitations ... ");
		LIMITATION downloadLimitation = download.downloadLimitation(dli);
		marshallToFileSystem(downloadLimitation, new File(medindexDir, "medindex_limitation.xml"),
			null, LIMITATION.class);
		
//		DownloadSubstanceInput dsi = new DownloadSubstanceInput();
//		dsi.setFROMDATE(START_2000);
//		dsi.setINDEX(INDEX_MEDINDEX);
//		dsi.setFILTER(FILTER_ONLY_ACTIVE);
//		System.out.println("Downloading substances ... ");
//		SUBSTANCE downloadSubstance = download.downloadSubstance(dsi);
//		marshallToFileSystem(downloadSubstance, new File(medindexDir, "medindex_substance.xml"),
//			null, SUBSTANCE.class);
		
		DownloadCodeInput dci = new DownloadCodeInput();
		dci.setFROMDATE(START_2000);
		dci.setINDEX(INDEX_MEDINDEX);
		dci.setFILTER(FILTER_ONLY_ACTIVE);
		System.out.println("Downloading codes ... ");
		CODE downloadCode = download.downloadCode(dci);
		marshallToFileSystem(downloadCode, new File(medindexDir, "medindex_code.xml"), null, CODE.class);
	}
	
	public static void marshallToFileSystem(Object newData, File outputFile, URL validationFileUrl,
		Class<?> clazz) throws SAXException, JAXBException{
		Marshaller m = JAXBContext.newInstance(clazz).createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		if (validationFileUrl != null) {
			Schema validationSchema = schemaFactory.newSchema(validationFileUrl);
			m.setSchema(validationSchema);
		}
		m.marshal(newData, outputFile);
		System.out.println("["+outputFile.getAbsolutePath()+"]");
	}
	
}
