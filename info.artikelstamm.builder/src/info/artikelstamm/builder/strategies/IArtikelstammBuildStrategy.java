package info.artikelstamm.builder.strategies;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import info.artikelstamm.model.ARTIKELSTAMM;
import info.artikelstamm.model.ARTIKELSTAMM.ITEMS;
import info.artikelstamm.model.ARTIKELSTAMM.LIMITATIONS;
import info.artikelstamm.model.ARTIKELSTAMM.PRODUCTS;

public interface IArtikelstammBuildStrategy {
	
	ARTIKELSTAMM generate(File oddb2xmlSequencesFileObj, File oddb2xmlProductFileObj,
		File oddb2xmlArticleFileObj, File oddb2xmlLimitationFileObj) throws Exception;
	
	final static String pattern = "yyyy-MM-dd'T'hh:mm:ssZ";
	final static SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	
	/**
	 * Initialize an empty Artikelstamm object with basic values set
	 * 
	 * @param creationDate
	 * 
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public default ARTIKELSTAMM initializeArtikelstamm(GregorianCalendar creationDate)
		throws DatatypeConfigurationException{
		ARTIKELSTAMM artikelstamm = new ARTIKELSTAMM();
		artikelstamm.setSETTYPE("F"); // full data-set
		
		if (creationDate == null) {
			creationDate = GregorianCalendar.from(ZonedDateTime.now());
		}
		
		XMLGregorianCalendar xmlgc = DatatypeFactory.newInstance()
			.newXMLGregorianCalendar(creationDate);
		
		artikelstamm.setITEMS(new ITEMS());
		artikelstamm.setPRODUCTS(new PRODUCTS());
		artikelstamm.setLIMITATIONS(new LIMITATIONS());
		artikelstamm.setCREATIONDATETIME(xmlgc);
		artikelstamm.setMONTH(xmlgc.getMonth());
		artikelstamm.setYEAR(xmlgc.getYear());
		
		artikelstamm.setBUILDDATETIME(
			DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		artikelstamm.setLANG("DE");
		
		return artikelstamm;
	}
}
