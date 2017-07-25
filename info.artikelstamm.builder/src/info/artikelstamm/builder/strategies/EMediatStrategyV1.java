package info.artikelstamm.builder.strategies;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch.hcisolutions.index.ARTICLE;
import ch.hcisolutions.index.ARTICLE.ART;
import ch.hcisolutions.index.ARTICLE.ART.ARTINS;
import ch.hcisolutions.index.ARTICLE.ART.ARTPRI;
import ch.hcisolutions.index.MedindexHelper;
import ch.hcisolutions.index.PRODUCT;
import ch.hcisolutions.index.PRODUCT.PRD;
import info.artikelstamm.model.ARTIKELSTAMM;
import info.artikelstamm.model.ARTIKELSTAMM.ITEMS.ITEM;
import info.artikelstamm.model.DATASOURCEType;

public class EMediatStrategyV1 implements IArtikelstammBuildStrategy {
	
	private static boolean ADD_ONLY_PRODUCTS_WITH_ARTICLES = false;
	
	private Map<String, PRD> prodNoToProduct = new HashMap<>();
	private Set<String> articleReferencedProductNumbers = new HashSet<>();
	
	private Map<String, String> gtinToProdNo = new HashMap<>();
	
	@Override
	public ARTIKELSTAMM generate(File sequencesFile, File productFile, File articleFile,
		File limitationsFile) throws Exception{
		
		PRODUCT product = (PRODUCT) MedindexHelper.unmarshallFile(productFile);
		for (PRD prd : product.getPRD()) {
			prodNoToProduct.put(Integer.toString(prd.getPRDNO()), prd);
		}
		
		ARTICLE articles = (ARTICLE) MedindexHelper.unmarshallFile(articleFile);
		//		LIMITATION limitations = (LIMITATION) MedindexHelper.unmarshallFile(oddb2xmlLimitationFileObj);
		
		ARTIKELSTAMM artikelstamm = initializeArtikelstamm(
			articles.getCREATIONDATETIME().toGregorianCalendar(), DATASOURCEType.MEDINDEX);
		
		System.out.println("(S1) populate items from articles");
		populateItemsFromArticles(artikelstamm, articles);
		System.out.println(
			"(S2) add products -> only referenced products = " + ADD_ONLY_PRODUCTS_WITH_ARTICLES);
		populateProducts(artikelstamm, product);
		
		System.out.println("(S9) save gtin to prodno mappings");
		Files.write(
			new File(productFile.getParentFile(),
				DATASOURCEType.MEDINDEX.value() + "_gtin_to_prodno.csv").toPath(),
			() -> gtinToProdNo.entrySet().stream()
				.<CharSequence> map(e -> e.getKey() + "," + e.getValue()).iterator());
		
		System.out.println("# of products " + artikelstamm.getPRODUCTS().getPRODUCT().size());
		System.out.println("# of items " + artikelstamm.getITEMS().getITEM().size());
		System.out
			.println("# of limitations " + artikelstamm.getLIMITATIONS().getLIMITATION().size());
		
		return artikelstamm;
	}
	
	private void populateProducts(ARTIKELSTAMM artikelstamm, PRODUCT product){
		if (ADD_ONLY_PRODUCTS_WITH_ARTICLES) {
			for (String prodno : articleReferencedProductNumbers) {
				PRD prd = prodNoToProduct.get(prodno);
				addProduct(artikelstamm, prd);
			}
		} else {
			List<PRD> products = product.getPRD();
			for (PRD prd : products) {
				addProduct(artikelstamm, prd);
			}
		}
	}
	
	private void addProduct(ARTIKELSTAMM artikelstamm, PRD prd){
		info.artikelstamm.model.ARTIKELSTAMM.PRODUCTS.PRODUCT product =
			new info.artikelstamm.model.ARTIKELSTAMM.PRODUCTS.PRODUCT();
		product.setDSCR(prd.getDSCRD());
		product.setDSCRF(prd.getDSCRF());
		product.setATC(prd.getATC());
		product.setPRODNO(Integer.toString(prd.getPRDNO()));
		
		artikelstamm.getPRODUCTS().getPRODUCT().add(product);
	}
	
	private void populateItemsFromArticles(ARTIKELSTAMM artikelstamm, ARTICLE articles){
		List<ART> art = articles.getART();
		for (ART a : art) {
			ITEM item = new ITEM();
			item.setPRODNO(Integer.toString(a.getPRDNO()));
			PRD prd = prodNoToProduct.get(item.getPRODNO());
			if (prd == null) {
				System.out.println(
					"[ERROR] No product [" + a.getPRDNO() + "] for article [" + a.getARTNO() + "]");
				return;
			}
			articleReferencedProductNumbers.add(item.getPRODNO());
			item.setGTIN(a.getGTIN());
			gtinToProdNo.put(item.getGTIN(), item.getPRODNO());
			
			String salecd = a.getSALECD();
			// R, N, H --> was ist mit H?
			
			// TODO item.setPHARMATYPE(value);
			
			item.setDSCR(a.getDSCRD());
			item.setDSCRF(a.getDSCRF());
			item.setPHAR(BigInteger.valueOf(Long.parseLong(a.getPHAR())));
			// TODO COMP
			List<ARTPRI> prices = a.getARTPRI();
			for (ARTPRI artpri : prices) {
				if ("PEXF".equals(artpri.getPTYP())) {
					// TODO validity date
					item.setPEXF(artpri.getPRICE());
				} else if ("PPUB".equals(artpri.getPTYP())) {
					// TODO validity date
					item.setPPUB(artpri.getPRICE());
				}
			}
			item.setPKGSIZE(a.getNOPCS());
			// TODO OR PCKGTYPD??
			item.setPKGSIZESTRING(a.getNOPCS() + " " + a.getQTYUD());
			item.setMEASURE(a.getQTYUD());
			
			List<ARTINS> artins = a.getARTINS();
			for (ARTINS artin : artins) {
				// https://index.hcisolutions.ch/DataDoc/element/ARTICLE/ART/ARTINS/NINCD
				if (artin.getNINCD() == 10) {
					// 10 = Spezialitätenliste (SL)
					item.setSLENTRY(true);
				} else if (artin.getNINCD() == 20) {
					// 20 = LPPV (Liste pharmazeutischer Präparate mit spezieller Verwendung)
					item.setLPPV(true);
				}
			}
			item.setIKSCAT(a.getSMCAT());
			item.setGENERICTYPE(prd.getGENCD());
			// TODO HAS_GENERIC (? REMOVE ?)
			
			// DEDUCTIBLE
			// Co-Payment information
			// https://index.hcisolutions.ch/DataDoc/element/ARTICLE/ART/SLOPLUS
			if (a.getSLOPLUS() != null) {
				// 1: 20 %
				// 2: 10 %
				int value = a.getSLOPLUS().intValue();
				if (value == 1) {
					item.setDEDUCTIBLE(20);
				} else if (value == 2) {
					item.setDEDUCTIBLE(10);
				}
			}
			// NARCOTIC
			// TODO Y existiert nicht in CDBG
			// https://index.hcisolutions.ch/DataDoc/element/ARTICLE/ART/CDBG
			//			if ("Y".equalsIgnoreCase(a.getCDBG())
			//				&& "Y".equalsIgnoreCase(a.getBG())) {
			//				item.setNARCOTIC(true);
			//			}
			// TODO NARCOTIC_CAS via SUBSTANCE)
			
			artikelstamm.getITEMS().getITEM().add(item);
		}
		
	}

	@Override
	public Map<String, String> getGtinToProdnoMapping(){
		return gtinToProdNo;
	}
	
}
