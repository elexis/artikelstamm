package info.artikelstamm.builder.strategies;

import java.io.File;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import ch.hcisolutions.index.ARTICLE;
import ch.hcisolutions.index.ARTICLE.ART;
import ch.hcisolutions.index.ARTICLE.ART.ARTINS;
import ch.hcisolutions.index.ARTICLE.ART.ARTLIM;
import ch.hcisolutions.index.ARTICLE.ART.ARTPRI;
import ch.hcisolutions.index.LIMITATION;
import ch.hcisolutions.index.LIMITATION.LIM;
import ch.hcisolutions.index.MedindexHelper;
import ch.hcisolutions.index.PRODUCT;
import ch.hcisolutions.index.PRODUCT.PRD;
import ch.hcisolutions.index.PRODUCT.PRD.CPT;
import ch.hcisolutions.index.PRODUCT.PRD.CPT.CPTCMP;
import ch.hcisolutions.index.SUBSTANCE;
import ch.hcisolutions.index.SUBSTANCE.SB;
import info.artikelstamm.builder.mapping.Mapping;
import info.artikelstamm.model.v5.ARTIKELSTAMM;
import info.artikelstamm.model.v5.ARTIKELSTAMM.ITEMS.ITEM;
import info.artikelstamm.model.v5.ARTIKELSTAMM.PRODUCTS;
import info.artikelstamm.model.v5.DATASOURCEType;
import info.artikelstamm.model.v5.SALECDType;

public class MedindexStrategyV1 implements IArtikelstammBuildStrategy {
	
	private static boolean ADD_ONLY_PRODUCTS_WITH_ARTICLES = true;
	
	private Map<String, PRD> prodNoToProduct = new HashMap<>();
	private Set<String> articleReferencedProductNumbers = new HashSet<>();
	
	private Map<BigInteger, SB> substanceNo;
	private Map<Integer, String> productLimitations = new HashMap<>();
	private Set<String> usedLimitations = new HashSet<>();
	
	@Override
	public ARTIKELSTAMM generate(File[] inputFiles, Mapping mapping) throws Exception{
		
		File productFile = inputFiles[0];
		File articleFile = inputFiles[1];
		File limitationsFile = inputFiles[2];
		File substancesFile = inputFiles[3];
		
		PRODUCT product = (PRODUCT) MedindexHelper.unmarshallFile(productFile);
		for (PRD prd : product.getPRD()) {
			prodNoToProduct.put(Integer.toString(prd.getPRDNO()), prd);
		}
		
		ARTICLE articles = (ARTICLE) MedindexHelper.unmarshallFile(articleFile);
		LIMITATION limitations = (LIMITATION) MedindexHelper.unmarshallFile(limitationsFile);
		
		SUBSTANCE substances = (SUBSTANCE) MedindexHelper.unmarshallFile(substancesFile);
		substanceNo = substances.getSB().stream()
			.collect(Collectors.toMap(SB::getSUBNO, Function.identity()));
		
		ARTIKELSTAMM artikelstamm = initializeArtikelstamm(
			articles.getCREATIONDATETIME().toGregorianCalendar(), DATASOURCEType.MEDINDEX);
		
		System.out.println("(S1) populate items from articles");
		populateItemsFromArticles(artikelstamm, articles, mapping);
		System.out.println(
			"(S2) add products -> only referenced products = " + ADD_ONLY_PRODUCTS_WITH_ARTICLES);
		populateProducts(artikelstamm, product);
		
		System.out.println("(S3) populate limitations");
		populateLimitations(artikelstamm, limitations);
		
		System.out.println("(S9) save gtin to prodno mappings");
		//		Files.write(
		//			new File(productFile.getParentFile(),
		//				DATASOURCEType.MEDINDEX.value() + "_gtin_to_prodno.csv").toPath(),
		//			() -> gtinToProdNo.entrySet().stream()
		//				.<CharSequence> map(e -> e.getKey() + "," + e.getValue()).iterator());
		
		System.out.println("# of products " + artikelstamm.getPRODUCTS().getPRODUCT().size());
		System.out.println("# of items " + artikelstamm.getITEMS().getITEM().size());
		System.out
			.println("# of limitations " + artikelstamm.getLIMITATIONS().getLIMITATION().size());
		
		return artikelstamm;
	}
	
	private void populateLimitations(ARTIKELSTAMM artikelstamm, LIMITATION limitations){
		
		Map<String, LIM> addedLimitations = new HashMap<>();
		
		List<LIM> lim = limitations.getLIM();
		for (LIM lim2 : lim) {
			if (usedLimitations.contains(lim2.getLIMCD())) {
				if ("MIG".equals(lim2.getLIMTYP())) {
					// skip MIG type limitations, they do not contain descriptive texts
					System.out.println("Skipping limitation " + lim2.getLIMCD());
					continue;
				}
				
				info.artikelstamm.model.v5.ARTIKELSTAMM.LIMITATIONS.LIMITATION limitation =
					new info.artikelstamm.model.v5.ARTIKELSTAMM.LIMITATIONS.LIMITATION();
				limitation.setDSCR(lim2.getDSCRD());
				limitation.setDSCRF(lim2.getDSCRF());
				limitation.setLIMNAMEBAG(lim2.getLIMCD());
				if ("PTS".equals(lim2.getLIMTYP())) {
					if (lim2.getLIMVAL() != null) {
						limitation.setLIMITATIONPTS(lim2.getLIMVAL().intValue());
					}
				}
				
				
				if(!addedLimitations.containsKey(lim2.getLIMCD())) {
					addedLimitations.put(lim2.getLIMCD(), lim2);
					artikelstamm.getLIMITATIONS().getLIMITATION().add(limitation);
				} else {
					System.out.println("WARNING skipping duplicate limitation code ["+lim2.getLIMCD()+"]");
				}
				
			}
		}
		
		// Clean skipped limitation references;
		PRODUCTS products = artikelstamm.getPRODUCTS();
		for (info.artikelstamm.model.v5.ARTIKELSTAMM.PRODUCTS.PRODUCT prod : products
			.getPRODUCT()) {
			String limnamebag = prod.getLIMNAMEBAG();
			if (limnamebag != null) {
				if (!addedLimitations.containsKey(limnamebag)) {
					System.out.println("Cleaning limitation " + limnamebag);
					prod.setLIMNAMEBAG(null);
				}
			}
		}
		
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
		info.artikelstamm.model.v5.ARTIKELSTAMM.PRODUCTS.PRODUCT product =
			new info.artikelstamm.model.v5.ARTIKELSTAMM.PRODUCTS.PRODUCT();
		product.setDSCR(prd.getDSCRD());
		product.setDSCRF(prd.getDSCRF());
		product.setATC(prd.getATC());
		product.setPRODNO(Integer.toString(prd.getPRDNO()));
		
		// PRD/CPT/CPTCMP -> WHK=W => SUBNO-> DSCRD
		List<CPT> cptl = prd.getCPT();
		if (cptl.size() > 0) {
			// TODO what if more components??
			CPT cpt = cptl.get(0);
			List<CPTCMP> cptcmpl = cpt.getCPTCMP();
			for (CPTCMP cptcmp : cptcmpl) {
				if ("W".equals(cptcmp.getWHK())) {
					SB substance = substanceNo.get(BigInteger.valueOf(cptcmp.getSUBNO()));
					if (substance != null) {
						product.setSUBSTANCE(substance.getNAMD());
						product.setSUBSTANCEF(substance.getNAMF());
						break;
					}
				}
			}
		}
		
		String limcd = productLimitations.get(prd.getPRDNO());
		if (limcd != null) {
			product.setLIMNAMEBAG(limcd);
			usedLimitations.add(limcd);
		}
		
		artikelstamm.getPRODUCTS().getPRODUCT().add(product);
	}
	
	private void populateItemsFromArticles(ARTIKELSTAMM artikelstamm, ARTICLE articles,
		Mapping mapping){
		List<ART> art = articles.getART();
		for (ART a : art) {
			ITEM item = new ITEM();
			
			item.setGTIN(a.getGTIN());
			if(item.getGTIN()==null) {
				System.out.println("[INFO] GTIN is null ["+a.getDSCRD()+"] ("+a.getSALECD()+")");
				continue;
			}
			
			// 8-stellige Nummer, die von Swissmedic nach Zulassung eines Arzneimittels erteilt wird; 
			// ist Teil vom GTIN 7680.
			if (a.getSMNO() != null) {
				item.setPHARMATYPE("P");
			} else {
				item.setPHARMATYPE("N");
			}
			
			if (item.getPHARMATYPE().equals("P")) {
				item.setPRODNO(Integer.toString(a.getPRDNO()));
				PRD prd = prodNoToProduct.get(item.getPRODNO());
				if (prd == null) {
					System.out.println("[ERROR] No product [" + a.getPRDNO() + "] for article ["
						+ a.getARTNO() + "]");
					
					return;
				}
				item.setGENERICTYPE(prd.getGENCD());
				articleReferencedProductNumbers.add(item.getPRODNO());
			}
			
			String salecd = a.getSALECD();
			if ("N".equals(salecd)) {
				item.setSALECD(SALECDType.A);
			} else {
				item.setSALECD(SALECDType.I);
			}
			
			item.setDSCR(a.getDSCRD());
			mapping.add(DATASOURCEType.MEDINDEX, item.getGTIN(),
				"N_" + Integer.toString(a.getPRDNO()), item.getDSCR());
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
			item.setPKGSIZE((a.getQTY()!=null) ? a.getQTY().intValue() : null);
			item.setPKGSIZESTRING(item.getPKGSIZE() + " " + a.getQTYUD());
			item.setMEASURE(a.getQTYUD());
			item.setDOSAGEFORM(a.getPCKTYPD());
			
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
			// Y=drug is under law for narcotics (galdat 3.0,Table.Field: AC.CodeBG)
			if ("Y".equalsIgnoreCase(a.getBG())) {
				item.setNARCOTIC(true);
			}
			
			// LIMITATIONS
			List<ARTLIM> artlim = a.getARTLIM();
			if (artlim.size() > 0) {
				// TODO collect limitions, only the first one is collected
				String limcd = artlim.get(0).getLIMCD();
				productLimitations.put(a.getPRDNO(), limcd);
			}
			// TODO NARCOTIC_CAS via SUBSTANCE)
			
			artikelstamm.getITEMS().getITEM().add(item);
		}
		
	}
	
}
