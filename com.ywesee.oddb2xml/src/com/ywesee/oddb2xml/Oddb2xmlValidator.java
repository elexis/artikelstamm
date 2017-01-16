package com.ywesee.oddb2xml;

import java.io.File;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import com.ywesee.oddb2xml.article.ART;
import com.ywesee.oddb2xml.article.ARTICLE;

public class Oddb2xmlValidator {
	public static boolean validateOddb2XmlFiles(File oddb2xmlProductFileObj,
		File oddb2xmlArticleFileObj, File oddb2xmlLimitationFileObj) throws Exception{
		ARTICLE articles = (ARTICLE) Oddb2XmlHelper.unmarshallFile(oddb2xmlArticleFileObj);
		boolean doubleUniqueIds = checkForAvailableGTINSAndDoubleUniqueIds(articles);
		return doubleUniqueIds;
	}
	
	private static boolean checkForAvailableGTINSAndDoubleUniqueIds(ARTICLE articles){
		Set<BigInteger> uniqueIds = new HashSet<>();
		boolean containsDouble = false;
		for (ART art : articles.getART()) {
			BigInteger bc = art.getARTBAR().getBC();
			if (bc == null) {
				System.out.println("No GTIN found for " + art.getDSCRD());
			}
			
			BigInteger uniqueId = new BigInteger(bc + "" + art.getPHAR());
			if (uniqueIds.contains(uniqueId)) {
				containsDouble = true;
				System.out.println("Double UniqueId found in " + uniqueId);
			} else {
				uniqueIds.add(uniqueId);
			}
			
		}
		return containsDouble;
	}
}
