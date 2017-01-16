/*******************************************************************************
 * Copyright (c) 2013 MEDEVIT.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     MEDEVIT <office@medevit.at> - initial API and implementation
 ******************************************************************************/
package com.ywesee.oddb2xml;

import java.io.File;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ywesee.oddb2xml.article.ART;
import com.ywesee.oddb2xml.article.ARTBAR;
import com.ywesee.oddb2xml.article.ARTICLE;
import com.ywesee.oddb2xml.limitation.LIM;
import com.ywesee.oddb2xml.limitation.LIMITATION;
import com.ywesee.oddb2xml.product.PRD;
import com.ywesee.oddb2xml.product.PRODUCT;
import com.ywesee.oddb2xml.sequences.Sequence;

public class Oddb2XmlHelper {
	private static HashMap<String, LIM> limitationListCache;
	private static HashMap<String, PRD> productListCache;
	
	/**
	 * Unmarshall an file
	 * 
	 * @param xmlFile
	 *            being either of type {@link ARTICLE}, {@link LIMITATION} or {@link PRODUCT}
	 * @throws JAXBException
	 */
	public static Object unmarshallFile(File xmlFile) throws JAXBException{
		System.out.println("[INFO] Trying to unmarshall " + xmlFile);
		Unmarshaller u = JAXBContext.newInstance(ARTICLE.class, LIMITATION.class, PRODUCT.class)
			.createUnmarshaller();
		return u.unmarshal(xmlFile);
	}
	
	/**
	 * determines if an article is pharma or non pharma, according to following rule if article
	 * barcode ARTBAR/BC starts with 7680 its pharma, any other case non-pharma
	 * 
	 * @param a
	 * @return true if Pharma
	 */
	public static boolean determineIfPharma(ART a){
		ARTBAR artbar = a.getARTBAR();
		if (artbar == null)
			return false;
		BigInteger bc = artbar.getBC();
		if (bc == null)
			return false;
		return (bc.toString().startsWith("7680"));
	}
	
	/**
	 * WARNING do not change parameter limitList after first calling of this method, cache will not
	 * be re-initialized!
	 * 
	 * @param limitList
	 * @param smno
	 *            a swissmedic 5 or 8 number, will try both combinations
	 * @return the {@link LIM} or <code>null</code> if not found
	 */
	public static LIM getItemInLimitationListBySwissmedicNo(List<LIM> limitList, BigInteger smno){
		if (smno == null)
			throw new IllegalArgumentException("swissmedic number is null");
		if (limitList == null)
			throw new IllegalArgumentException("limitlist is null");
		
		LIM ret = null;
		if (limitationListCache == null) {
			System.out.println("[INFO] Initializing limitationList HashMap with " + limitList.size()
				+ " elements");
			limitationListCache = new HashMap<String, LIM>(limitList.size());
			for (LIM item : limitList) {
				if (item.getSwissmedicNo5() != null) {
					limitationListCache.put(item.getSwissmedicNo5().toString(), item);
				} else if (item.getSwissmedicNo8() != null) {
					limitationListCache.put(item.getSwissmedicNo8().toString(), item);
				} else {
					System.out
						.println("[ERROR] No SwissmediNo for limitation-item " + item + " found!");
				}
			}
		}
		if (limitationListCache.containsKey(smno.toString()))
			ret = limitationListCache.get(smno.toString());
		if (ret == null && smno.toString().length() > 4
			&& limitationListCache.containsKey(smno.toString().substring(0, 5)))
			ret = limitationListCache.get(smno.toString().substring(0, 5));
		return ret;
	}
	
	/**
	 * WARNING do not change parameter productList after first calling of this method, cache will
	 * not be re-initialized!
	 * 
	 * @param productList
	 * @param pharmacode
	 * @return the {@link PRD} or <code>null</code> if not found
	 */
	public static PRD getItemInProductListByGTIN(List<PRD> productList, String gtin){
		if (productListCache == null) {
			System.out.println(
				"[INFO] Initializing productList HashMap with " + productList.size() + " elements");
			productListCache = new HashMap<String, PRD>(productList.size());
			for (PRD item : productList) {
				if (item.getGTIN() != null) {
					productListCache.put(item.getGTIN().toString().trim(), item);
				} else {
					System.out.println("[ERROR] No GTIN for product-item " + item + " found!");
				}
			}
		}
		if (productListCache.containsKey(gtin)) {
			return productListCache.get(gtin);
		}
		return null;
	}
}
