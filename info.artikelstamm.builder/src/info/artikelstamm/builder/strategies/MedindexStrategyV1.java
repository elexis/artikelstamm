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
import ch.hcisolutions.index.ARTICLEPRICE;
import ch.hcisolutions.index.ARTICLEPRICE.AP;
import ch.hcisolutions.index.CODE;
import ch.hcisolutions.index.CODE.CD;
import ch.hcisolutions.index.LIMITATION;
import ch.hcisolutions.index.LIMITATION.LIM;
import ch.hcisolutions.index.MedindexHelper;
import ch.hcisolutions.index.PRODUCT;
import ch.hcisolutions.index.PRODUCT.PRD;
import info.artikelstamm.builder.mapping.Mapping;
import info.artikelstamm.model.v5.ARTIKELSTAMM;
import info.artikelstamm.model.v5.ARTIKELSTAMM.ITEMS.ITEM;
import info.artikelstamm.model.v5.ARTIKELSTAMM.PRODUCTS;
import info.artikelstamm.model.v5.DATASOURCEType;
import info.artikelstamm.model.v5.SALECDType;

public class MedindexStrategyV1 implements IArtikelstammBuildStrategy {
	
	private int noGtin;
	
	private Map<String, PRD> prodNoToProduct = new HashMap<>();
	private Set<String> articleReferencedProductNumbers = new HashSet<>();
	
	private Map<String, CD> atcCode;
	private Map<Integer, String> productLimitations = new HashMap<>();
	private Set<String> usedLimitations = new HashSet<>();
	
	@Override
	public ARTIKELSTAMM generate(File[] inputFiles, Mapping mapping) throws Exception{
		
		File productFile = inputFiles[0];
		File articleFile = inputFiles[1];
		File limitationsFile = inputFiles[2];
		File codeFile = inputFiles[3];
		File articlePriceFile = inputFiles[4];
		
		PRODUCT product = (PRODUCT) MedindexHelper.unmarshallFile(productFile);
		for (PRD prd : product.getPRD()) {
			prodNoToProduct.put(Integer.toString(prd.getPRDNO()), prd);
		}
		
		ARTICLE articles = (ARTICLE) MedindexHelper.unmarshallFile(articleFile);
		ARTICLEPRICE articleprices = (ARTICLEPRICE) MedindexHelper.unmarshallFile(articlePriceFile);
		LIMITATION limitations = (LIMITATION) MedindexHelper.unmarshallFile(limitationsFile);
		
		CODE codes = (CODE) MedindexHelper.unmarshallFile(codeFile);
		atcCode = codes.getCD().stream().filter(c -> c.getCDTYP() == 3)
			.collect(Collectors.toMap(CD::getCDVAL, Function.identity()));
		
		ARTIKELSTAMM artikelstamm = initializeArtikelstamm(
			articles.getCREATIONDATETIME().toGregorianCalendar(), DATASOURCEType.MEDINDEX);
		
		System.out.println("(S1) populate items from articles");
		populateItemsFromArticles(artikelstamm, articles, articleprices, mapping);
		System.out.println("(S2) add products");
		populateProducts(artikelstamm, product);
		
		System.out.println("(S3) populate limitations");
		populateLimitations(artikelstamm, limitations);
		
		System.out.println("(S9) save gtin to prodno mappings");
		//		Files.write(
		//			new File(productFile.getParentFile(),
		//				DATASOURCEType.MEDINDEX.value() + "_gtin_to_prodno.csv").toPath(),
		//			() -> gtinToProdNo.entrySet().stream()
		//				.<CharSequence> map(e -> e.getKey() + "," + e.getValue()).iterator());
		System.out.println("# no GTIN " + noGtin);
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
				
				if (!addedLimitations.containsKey(lim2.getLIMCD())) {
					addedLimitations.put(lim2.getLIMCD(), lim2);
					artikelstamm.getLIMITATIONS().getLIMITATION().add(limitation);
				} else {
					System.out.println(
						"WARNING skipping duplicate limitation code [" + lim2.getLIMCD() + "]");
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
		List<PRD> products = product.getPRD();
		for (PRD prd : products) {
			addProduct(artikelstamm, prd);
		}
	}
	
	private void addProduct(ARTIKELSTAMM artikelstamm, PRD prd){
		info.artikelstamm.model.v5.ARTIKELSTAMM.PRODUCTS.PRODUCT product =
			new info.artikelstamm.model.v5.ARTIKELSTAMM.PRODUCTS.PRODUCT();
		product.setDSCR(prd.getDSCRD());
		product.setDSCRF(prd.getDSCRF());
		product.setATC(prd.getATC());
		// https://index.hcisolutions.ch/DataDoc/element/PRODUCT/PRD/TRADE
		product.setSALECD("iH".equalsIgnoreCase(prd.getTRADE()) ? SALECDType.A : SALECDType.I);
		product.setPRODNO(Integer.toString(prd.getPRDNO()));
		
		String atc = prd.getATC();
		if (atc != null) {
			CD cd = atcCode.get(atc);
			if (cd != null) {
				product.setSUBSTANCE(cd.getDSCRD());
				product.setSUBSTANCEF(cd.getDSCRF());
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
		ARTICLEPRICE articleprices, Mapping mapping){
		List<ART> art = articles.getART();
		for (ART a : art) {
			ITEM item = new ITEM();
			
			item.setGTIN(a.getGTIN());
			if (item.getGTIN() == null) {
				noGtin++;
				System.out
					.println("[INFO] GTIN is null [" + a.getDSCRD() + "] (" + a.getSALECD() + ")");
				continue;
			}
			
			// 8-stellige Nummer, die von Swissmedic nach Zulassung eines Arzneimittels erteilt wird; 
			// ist Teil vom GTIN 7680.
			if (a.getSMNO() != null) {
				item.setPHARMATYPE("P");
			} else {
				item.setPHARMATYPE("N");
			}
			
			item.setPRODNO(Integer.toString(a.getPRDNO()));
			PRD prd = prodNoToProduct.get(item.getPRODNO());
			if (prd == null) {
				System.out.println(
					"[ERROR] No product [" + a.getPRDNO() + "] for article [" + a.getPHARMACODE() + "]");
				
				return;
			}
			item.setGENERICTYPE(prd.getGENCD());
			articleReferencedProductNumbers.add(item.getPRODNO());
			
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
			List<AP> articlePrices = articleprices.getAP().stream().filter(ap -> a.getPHARMACODE() == ap.getPHARMACODE()).collect(Collectors.toList());
			for (AP artpri : articlePrices) {
				if ("PEXF".equals(artpri.getPTYP())) {
					// TODO validity date
					item.setPEXF(artpri.getPRICE());
				} else if ("PPUB".equals(artpri.getPTYP())) {
					// TODO validity date
					item.setPPUB(artpri.getPRICE());
				}				
			}
			// https://index.hcisolutions.ch/DataDoc/element/ARTICLE/ART/ARTTYP
			String arttyp = a.getARTTYP();
			if("4".equals(arttyp)) {
				// 4 = Abgabeeinheit (1 Kapsel, 1 Tablette, 1 Ampulle etc)
				item.setPKGSIZE(1);
				
				item.setMEASURE("Stk");
				item.setMEASUREF("pce");
			} else {
				item.setPKGSIZE((a.getNOPCS() != null) ? a.getNOPCS().intValue() : null);
				
				item.setMEASURE(a.getQTYUD());
				item.setMEASUREF(a.getQTYUF());
				
				String pcktypd = a.getPCKTYPD();
				if (pcktypd != null) {
					if (a.getQTY() != null) {
						item.setDOSAGEFORM(pcktypd + " " + a.getQTY());
					} else {
						item.setDOSAGEFORM(pcktypd);
					}
				} else {
					item.setDOSAGEFORM(a.getQTY().toString());
				}
				
				String pcktypf = a.getPCKTYPF();
				if (pcktypf != null) {
					if (a.getQTY() != null) {
						item.setDOSAGEFORMF(pcktypf + " " + a.getQTY());
					} else {
						item.setDOSAGEFORMF(pcktypf);
					}
				} else {
					item.setDOSAGEFORMF(a.getQTY().toString());
				}
			}
			
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
			if (a.getARTSL() != null && a.getARTSL().getSLOPLUS() != null) {
				// 1: 20 %
				// 2: 10 %
				int value = a.getARTSL().getSLOPLUS().intValue();
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
