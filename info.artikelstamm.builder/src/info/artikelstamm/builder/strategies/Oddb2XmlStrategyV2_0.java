package info.artikelstamm.builder.strategies;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.ywesee.oddb2xml.Oddb2XmlHelper;
import com.ywesee.oddb2xml.article.ART;
import com.ywesee.oddb2xml.article.ARTICLE;
import com.ywesee.oddb2xml.article.ARTPRI;
import com.ywesee.oddb2xml.limitation.LIM;
import com.ywesee.oddb2xml.limitation.LIMITATION;
import com.ywesee.oddb2xml.product.PRD;
import com.ywesee.oddb2xml.sequences.Sequence.SequenceItem;
import com.ywesee.oddb2xml.sequences.SequencesHelper;

import at.medevit.atc_codes.ATCCode;
import at.medevit.atc_codes.internal.ATCCodes;
import info.artikelstamm.builder.mapping.Mapping;
import info.artikelstamm.model.v5.ARTIKELSTAMM;
import info.artikelstamm.model.v5.ARTIKELSTAMM.ITEMS.ITEM;
import info.artikelstamm.model.v5.ARTIKELSTAMM.ITEMS.ITEM.COMP;
import info.artikelstamm.model.v5.ARTIKELSTAMM.PRODUCTS.PRODUCT;
import info.artikelstamm.model.v5.DATASOURCEType;
import info.artikelstamm.model.v5.SALECDType;

public class Oddb2XmlStrategyV2_0 implements IArtikelstammBuildStrategy {
	
	private int pharmaProductCounter = 0;
	private int pharmaArticleCounter = 0;
	private int nonPharmaArticleCounter = 0;
	private int invalidPackageSize = 0;
	private int noAmendFromArticleXml = 0;
	private int noAmendFromProductXml = 0;
	
	private Map<String, List<ITEM>> prodToItemCache = new HashMap<>();
	
	@Override
	public ARTIKELSTAMM generate(File[] inputFiles, Mapping mapping)
		throws IOException, JAXBException, DatatypeConfigurationException, ParseException{
		
		Map<String, com.ywesee.oddb2xml.sequences.Sequence> oddb2xmlSequences =
			SequencesHelper.unmarshallSequences(inputFiles[0]);
		com.ywesee.oddb2xml.product.PRODUCT oddb2xmlProducts =
			(com.ywesee.oddb2xml.product.PRODUCT) Oddb2XmlHelper.unmarshallFile(inputFiles[1]);
		com.ywesee.oddb2xml.article.ARTICLE oddb2xmlArticle =
			(com.ywesee.oddb2xml.article.ARTICLE) Oddb2XmlHelper.unmarshallFile(inputFiles[2]);
		com.ywesee.oddb2xml.limitation.LIMITATION oddb2xmlLimitations =
			(com.ywesee.oddb2xml.limitation.LIMITATION) Oddb2XmlHelper
				.unmarshallFile(inputFiles[3]);
		
		Date parse = sdf.parse(oddb2xmlArticle.getPRODDATE());
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(parse);
		
		ARTIKELSTAMM artikelstamm = initializeArtikelstamm(gc, DATASOURCEType.ODDB_2_XML);
		
		System.out
			.println("(S1) Import pharma products and articles from oddb2xml_swissmedic_sequences");
		S1_populatePharmaFromSequences(artikelstamm, oddb2xmlSequences, mapping);
		System.out.println("(S2) Import non-pharma articles from oddb_article");
		S2_populateNonPharmaFromOddb2Xml(artikelstamm, oddb2xmlProducts, oddb2xmlArticle,
			oddb2xmlLimitations, mapping);
		System.out.println("(S3) Amend product and article attributes via oddb_product.xml");
		S3_amendProductAndArticleAttributes(artikelstamm, oddb2xmlProducts, oddb2xmlArticle);
		System.out.println("(S4) Amend article attributes via oddb_article.xml");
		S4_amendArticleAttributes(artikelstamm, oddb2xmlArticle);
		System.out.println("(S5) Amend limitation information via oddb_limitation.xml");
		S5_amendLimitationInformation(artikelstamm, oddb2xmlLimitations);
		System.out.println("(S9) save gtin to prodno mappings");
		System.out.println("(FINISHED)");
		
		System.out.println("pharmaProductCounter " + pharmaProductCounter);
		System.out.println("pharmaArticleCounter " + pharmaArticleCounter);
		System.out.println("nonPharmaArticleCounter " + nonPharmaArticleCounter);
		System.out.println("invalidPackageSize " + invalidPackageSize);
		System.out.println("noAmendFromProductXml (PRODNO not found in oddb_product.xml) "
			+ noAmendFromProductXml);
		System.out.println(
			"noAmendFromArticleXml (GTIN to article not resolvable) " + noAmendFromArticleXml);
		
		System.out.println("# of products " + artikelstamm.getPRODUCTS().getPRODUCT().size());
		System.out.println("# of items " + artikelstamm.getITEMS().getITEM().size());
		System.out
			.println("# of limitations " + artikelstamm.getLIMITATIONS().getLIMITATION().size());
		
		return artikelstamm;
	}
	
	/**
	 * Populate Artikelstamm with PHARMA items from oddb2xml sequences.
	 * 
	 * @param artikelstamm
	 * @param oddb2xmlSequences
	 */
	private void S1_populatePharmaFromSequences(ARTIKELSTAMM artikelstamm,
		Map<String, com.ywesee.oddb2xml.sequences.Sequence> oddb2xmlSequences, Mapping mapping){
		
		Set<Entry<String, com.ywesee.oddb2xml.sequences.Sequence>> entrySet =
			oddb2xmlSequences.entrySet();
		for (Entry<String, com.ywesee.oddb2xml.sequences.Sequence> entry : entrySet) {
			com.ywesee.oddb2xml.sequences.Sequence seqProduct = entry.getValue();
			
			PRODUCT astammProduct = new PRODUCT();
			astammProduct.setDSCR(seqProduct.getDscr());
			astammProduct.setDSCRF(seqProduct.getDcsrf());
			astammProduct.setPRODNO(seqProduct.getProdno());
			astammProduct.setSALECD(SALECDType.A);
			
			List<PRODUCT> astammProductsList = artikelstamm.getPRODUCTS().getPRODUCT();
			if (!astammProductsList.contains(astammProduct)) {
				pharmaProductCounter++;
				astammProductsList.add(astammProduct);
			}
			
			Map<String, SequenceItem> sequenceItems = seqProduct.getSequenceItems();
			for (SequenceItem sequenceItem : sequenceItems.values()) {
				pharmaArticleCounter++;
				ITEM item = new ITEM();
				item.setSALECD(SALECDType.A);
				item.setPRODNO(seqProduct.getProdno());
				item.setPHARMATYPE("P");
				item.setDSCR(sequenceItem.getDesc1());
				item.setDSCRF("--missing--");
				item.setGTIN(sequenceItem.getGtin());
				mapping.add(DATASOURCEType.ODDB_2_XML, item.getGTIN(), item.getPRODNO(),
					item.getDSCR());
				try {
					int amount = Integer.parseInt(sequenceItem.getAmount());
					item.setPKGSIZE(amount);
				} catch (NumberFormatException nfe) {
					System.out.println("{" + item.getGTIN() + "} Invalid amount integer ["
						+ sequenceItem.getAmount() + "] in oddb2xml sequences file.");
					invalidPackageSize++;
				}
				
				item.setMEASURE(sequenceItem.getMunit());
				
				item.setDOSAGEFORM(sequenceItem.getGalenicForm());
				
				artikelstamm.getITEMS().getITEM().add(item);
				
				List<ITEM> list = prodToItemCache.get(astammProduct.getPRODNO());
				if (list == null) {
					list = new ArrayList<>();
				}
				list.add(item);
				prodToItemCache.put(astammProduct.getPRODNO(), list);
			}
		}
		
	}
	
	private Map<BigInteger, BigInteger> gtinToSwissMedicNo = new HashMap<>();
	
	private void S2_populateNonPharmaFromOddb2Xml(ARTIKELSTAMM artikelstamm,
		com.ywesee.oddb2xml.product.PRODUCT oddb2xmlProducts, ARTICLE oddb2xmlArticle,
		LIMITATION oddb2xmlLimitations, Mapping mapping){
		List<ART> articles = oddb2xmlArticle.getART();
		for (ART oddb2xmlArt : articles) {
			// pre-fetch mapping for limitations (speedup)
			BigInteger barcode = oddb2xmlArt.getARTBAR().getBC();
			if (barcode == null || BigInteger.ZERO.equals(barcode)) {
				System.out.println("[INFO] GTIN is null ["+oddb2xmlArt.getDSCRD()+"] ("+oddb2xmlArt.getSALECD()+")");
				continue;
			}
			
			gtinToSwissMedicNo.put(oddb2xmlArt.getARTBAR().getBC(), oddb2xmlArt.getSMNO());
			
			boolean isPharma = Oddb2XmlHelper.determineIfPharma(oddb2xmlArt);
			if (isPharma) {
				// TODO skips a lot of articles, like 7680091430332 LYSOFORM
				// which appears in oddb_article but not swissemedic_sequences
				continue;
			}
			
			nonPharmaArticleCounter++;
			
			ITEM artikelstammItem = new ITEM();
			artikelstammItem.setSALECD(SALECDType.fromValue(oddb2xmlArt.getSALECD()));
			artikelstammItem.setPHARMATYPE("N");
			
			String gtin = String.format("%013d", barcode);
			artikelstammItem.setGTIN(gtin);
			
			// limit to max 50 chars
			//			int dscrdL = (a.getDSCRD().trim().length() > 49) ? 50 : a.getDSCRD().trim().length();
			//			item.setDSCR(a.getDSCRD().trim().substring(0, dscrdL));
			artikelstammItem.setDSCR(oddb2xmlArt.getDSCRD().trim());
			artikelstammItem.setDSCRF(oddb2xmlArt.getDSCRF().trim());
			
			mapping.add(DATASOURCEType.ODDB_2_XML, gtin, "NO_ODDB2XML_PROD",
				artikelstammItem.getDSCR());
			
			if (oddb2xmlArt.getARTCOMP() != null) {
				if (oddb2xmlArt.getARTCOMP().getCOMPNO() != null) {
					COMP comp = new COMP();
					comp.setGLN(oddb2xmlArt.getARTCOMP().getCOMPNO().toString());
					artikelstammItem.setCOMP(comp);
				}
			}
			
			artikelstamm.getITEMS().getITEM().add(artikelstammItem);
		}
		
	}
	
	private void S3_amendProductAndArticleAttributes(ARTIKELSTAMM artikelstamm,
		com.ywesee.oddb2xml.product.PRODUCT oddb2xmlProducts,
		com.ywesee.oddb2xml.article.ARTICLE oddb2xmlArticle){
		List<PRODUCT> products = artikelstamm.getPRODUCTS().getPRODUCT();
		for (PRODUCT product : products) {
			PRD prd = findProductByProdNo(oddb2xmlProducts, product.getPRODNO());
			if (prd != null) {
				product.setATC(prd.getATC());
				if (prd.getATC() != null) {
					ATCCode atcCode = ATCCodes.getInstance().getATCCode(prd.getATC());
					if (atcCode != null && atcCode.level == 5) {
						product.setSUBSTANCE(atcCode.name_german);
					}
				}
				
				List<ITEM> items = prodToItemCache.get(product.getPRODNO());
				for (ITEM item : items) {
					// GENCD
					String gencd = prd.getGENCD();
					// co-marketing article, requires artikelstamm update, will
					// remove for the time being - 4194
					gencd = ("C".equalsIgnoreCase(gencd)) ? null : gencd;
					item.setGENERICTYPE(gencd);
				}
			} else {
				noAmendFromProductXml++;
			}
		}
		List<ITEM> item = artikelstamm.getITEMS().getITEM();
		for (ITEM item2 : item) {
			if ("P".equals(item2.getPHARMATYPE())) {
				ART findArticleByGTIN =
					findArticleByGTIN(oddb2xmlArticle, new BigInteger(item2.getGTIN()));
				if (findArticleByGTIN != null) {
					String phar = findArticleByGTIN.getPHAR();
					if (phar != null) {
						item2.setPHAR(new BigInteger(phar));
					}
				}
			}
		}
	}
	
	private Map<String, PRD> cacheMapOddbProduct;
	
	/**
	 * Find the resp. product in oddb2xmlProducts by prodno if available
	 * 
	 * @param oddb2xmlProducts
	 * @param prodno
	 * @return <code>null</code> if none found
	 */
	private PRD findProductByProdNo(com.ywesee.oddb2xml.product.PRODUCT oddb2xmlProducts,
		String prodno){
		if (cacheMapOddbProduct == null) {
			cacheMapOddbProduct = new HashMap<>();
			
			List<PRD> prd = oddb2xmlProducts.getPRD();
			for (PRD prd2 : prd) {
				cacheMapOddbProduct.put(prd2.getPRODNO(), prd2);
			}
		}
		
		return cacheMapOddbProduct.get(prodno);
	}
	
	private void S4_amendArticleAttributes(ARTIKELSTAMM artikelstamm, ARTICLE oddb2xmlArticle){
		List<ITEM> artikelstammItems = artikelstamm.getITEMS().getITEM();
		for (ITEM artikelstammItem : artikelstammItems) {
			if (artikelstammItem.getGTIN().length() == 0) {
				System.out
					.println("No GTIN defined for article [" + artikelstammItem.getDSCR() + "]");
				continue;
			}
			
			ART article =
				findArticleByGTIN(oddb2xmlArticle, new BigInteger(artikelstammItem.getGTIN()));
			if (article != null) {
				
				artikelstammItem.setSALECD(SALECDType.fromValue(article.getSALECD()));
				
				setPriceInformation(article, artikelstammItem);
				
				if (article.getARTINS() != null) {
					BigInteger nincd = article.getARTINS().getNINCD();
					if (nincd != null) {
						int nincdInt = nincd.intValue();
						// SL_ENTRY
						if (nincdInt == 10 || nincdInt == 12)
							artikelstammItem.setSLENTRY(true);
						// LPPV
						if (nincdInt == 20)
							artikelstammItem.setLPPV(true);
					}
				}
				
				// IKSCAT
				artikelstammItem.setIKSCAT(article.getSMCAT());
				
				// DEDUCTIBLE
				// Co-Payment information
				// 1: 20 %
				// 2: 10 %
				if (article.getSLOPLUS() != null) {
					int value = article.getSLOPLUS().intValue();
					if (value == 1) {
						artikelstammItem.setDEDUCTIBLE(20);
					} else if (value == 2) {
						artikelstammItem.setDEDUCTIBLE(10);
					}
				}
				
				// NARCOTIC
				if ("Y".equalsIgnoreCase(article.getCDBG())
					&& "Y".equalsIgnoreCase(article.getBG())) {
					artikelstammItem.setNARCOTIC(true);
				}
				
			} else {
				noAmendFromArticleXml++;
			}
		}
		
	}
	
	private Map<BigInteger, ART> cacheMapOddbArticle;
	
	private ART findArticleByGTIN(ARTICLE oddb2xmlArticle, BigInteger gtin){
		if (cacheMapOddbArticle == null) {
			cacheMapOddbArticle = new HashMap<>();
			
			List<ART> art = oddb2xmlArticle.getART();
			for (ART art2 : art) {
				cacheMapOddbArticle.put(art2.getARTBAR().getBC(), art2);
			}
		}
		
		return cacheMapOddbArticle.get(gtin);
	}
	
	private void S5_amendLimitationInformation(ARTIKELSTAMM artikelstamm,
		LIMITATION oddb2xmlLimitations){
		
		Map<String, LIM> employedLimitations = new HashMap<>();
		
		List<ITEM> items = artikelstamm.getITEMS().getITEM();
		for (ITEM item : items) {
			if (item.getGTIN().length() == 0) {
				System.out.println("No GTIN [" + item.getDSCR() + "]");
				continue;
			}
			BigInteger smno = gtinToSwissMedicNo.get(new BigInteger(item.getGTIN()));
			if (smno != null) {
				LIM limitation = Oddb2XmlHelper
					.getItemInLimitationListBySwissmedicNo(oddb2xmlLimitations.getLIM(), smno);
				if (limitation != null) {
					PRODUCT product =
						findArtikelstammProductByItemProdNo(artikelstamm, item.getPRODNO());
					employedLimitations.put(limitation.getLIMNAMEBAG(), limitation);
					product.setLIMNAMEBAG(limitation.getLIMNAMEBAG());
				}
			}
		}
		
		for (LIM limitation : employedLimitations.values()) {
			info.artikelstamm.model.v5.ARTIKELSTAMM.LIMITATIONS.LIMITATION astammLimitation =
				new info.artikelstamm.model.v5.ARTIKELSTAMM.LIMITATIONS.LIMITATION();
			astammLimitation.setDSCR(limitation.getDSCRD().trim());
			astammLimitation.setDSCRF(limitation.getDSCRF().trim());
			astammLimitation.setLIMNAMEBAG(limitation.getLIMNAMEBAG());
			// LIMITATION_PTS
			if (limitation.getLIMVAL() != null && limitation.getLIMVAL().length() > 0) {
				astammLimitation.setLIMITATIONPTS(Integer.parseInt(limitation.getLIMVAL()));
			}
			artikelstamm.getLIMITATIONS().getLIMITATION().add(astammLimitation);
		}
		
	}
	
	private Map<String, PRODUCT> cacheMapArtikelstammProduct;
	
	private PRODUCT findArtikelstammProductByItemProdNo(ARTIKELSTAMM artikelstamm, String prodno){
		if (cacheMapArtikelstammProduct == null) {
			cacheMapArtikelstammProduct = new HashMap<>();
			
			List<PRODUCT> products = artikelstamm.getPRODUCTS().getPRODUCT();
			for (PRODUCT product : products) {
				cacheMapArtikelstammProduct.put(product.getPRODNO(), product);
			}
		}
		
		return cacheMapArtikelstammProduct.get(prodno);
	}
	
	/**
	 * set the price for the item; if we have official values go first. if e.g. we have PPUB and
	 * ZURROSEPPUB, PPUB goes first
	 * 
	 * https://redmine.medelexis.ch/issues/3404 we do prefer zurRose prices now
	 * 
	 * @param a
	 * @param item
	 */
	private static void setPriceInformation(ART a, ITEM item){
		Double ppub = null;
		Double pexf = null;
		
		HashMap<String, ARTPRI> hmPrices = new HashMap<>();
		for (ARTPRI artpri : a.getARTPRI()) {
			if (artpri.getPTYP() == null || artpri.getPRICE() == null) {
				System.out.println("{" + item.getGTIN() + "} Invalid or no price information.");
				continue;
			}
			hmPrices.put(artpri.getPTYP(), artpri);
		}
		
		// #3645
		if (item.isSLENTRY() != null && item.isSLENTRY()) {
			if (hmPrices.containsKey("PPUB")) {
				ppub = hmPrices.get("PPUB").getPRICE().doubleValue();
			} else {
				System.out.println("{" + item.getGTIN() + "} No PPUB for " + item.getDSCR());
			}
			
			if (hmPrices.containsKey("PEXF")) {
				pexf = hmPrices.get("PEXF").getPRICE().doubleValue();
			} else {
				System.out.println("{" + item.getGTIN() + "} No PEXF for " + item.getDSCR());
			}
		} else {
			// fetch public prices
			if (hmPrices.containsKey("ZURROSEPUB")) {
				ppub = hmPrices.get("ZURROSEPUB").getPRICE().doubleValue();
			} else if (hmPrices.containsKey("PPUB")) {
				ppub = hmPrices.get("PPUB").getPRICE().doubleValue();
			}
			
			// fetch ex-factory prices
			if (hmPrices.containsKey("ZURROSE")) {
				pexf = hmPrices.get("ZURROSE").getPRICE().doubleValue();
			} else if (hmPrices.containsKey("PEXF")) {
				pexf = hmPrices.get("PEXF").getPRICE().doubleValue();
			}
		}
		
		if (ppub != null)
			item.setPPUB(ppub);
		if (pexf != null)
			item.setPEXF(pexf);
	}
	
}
