package ch.hcisolutions.index;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class MedindexHelper {
	
	public static Object unmarshallFile(File xmlFile) throws JAXBException{
		System.out.println("[INFO] Trying to unmarshall " + xmlFile);
		Unmarshaller u =
			JAXBContext.newInstance(PRODUCT.class, ARTICLE.class, LIMITATION.class, SUBSTANCE.class, CODE.class, ARTICLEPRICE.class)
				.createUnmarshaller();
		return u.unmarshal(xmlFile);
		
	}
	
}
