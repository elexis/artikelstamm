package info.artikelstamm.builder.strategies;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import info.artikelstamm.builder.mapping.Mapping;
import info.artikelstamm.model.ARTIKELSTAMM;
import info.artikelstamm.model.ARTIKELSTAMM.ITEMS;
import info.artikelstamm.model.ARTIKELSTAMM.LIMITATIONS;
import info.artikelstamm.model.ARTIKELSTAMM.PRODUCTS;
import info.artikelstamm.model.DATASOURCEType;

public interface IArtikelstammBuildStrategy {
	
	
	
	ARTIKELSTAMM generate(File[] inputFiles, Mapping mapping) throws Exception;
	
	final static String pattern = "yyyy-MM-dd'T'hh:mm:ssZ";
	final static SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	
	/**
	 * Initialize an empty Artikelstamm object with basic values set
	 * 
	 * @param creationDate
	 * @param source
	 *            the source the content originates from
	 * 
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public default ARTIKELSTAMM initializeArtikelstamm(GregorianCalendar creationDate,
		DATASOURCEType source) throws DatatypeConfigurationException{
		ARTIKELSTAMM artikelstamm = new ARTIKELSTAMM();
		
		if (creationDate == null) {
			creationDate = GregorianCalendar.from(ZonedDateTime.now());
		}
		
		XMLGregorianCalendar xmlgc =
			DatatypeFactory.newInstance().newXMLGregorianCalendar(creationDate);
		
		artikelstamm.setITEMS(new ITEMS());
		artikelstamm.setDATASOURCE(source);
		artikelstamm.setPRODUCTS(new PRODUCTS());
		artikelstamm.setLIMITATIONS(new LIMITATIONS());
		artikelstamm.setCREATIONDATETIME(xmlgc);
		
		artikelstamm.setBUILDDATETIME(
			DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		
		return artikelstamm;
	}

}
