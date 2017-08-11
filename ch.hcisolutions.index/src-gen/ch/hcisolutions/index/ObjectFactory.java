
package ch.hcisolutions.index;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.hcisolutions.index package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DownloadCDSInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadCDSInput");
    private final static QName _DownloadKompendiumImageInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadKompendium_ImageInput");
    private final static QName _DownloadWholesalerInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadWholesalerInput");
    private final static QName _DownloadCodeInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadCodeInput");
    private final static QName _DownloadKompendiumProductInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadKompendium_ProductInput");
    private final static QName _DownloadSubstanceInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadSubstanceInput");
    private final static QName _DownloadCompanyInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadCompanyInput");
    private final static QName _DownloadInsuranceInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadInsuranceInput");
    private final static QName _DownloadProductProprietaryQuantityInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadProduct_Proprietary_QuantityInput");
    private final static QName _DownloadCodexInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadCodexInput");
    private final static QName _DownloadBrevierInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadBrevierInput");
    private final static QName _DownloadArticleWholesalerInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadArticle_WholesalerInput");
    private final static QName _DownloadLimitationInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadLimitationInput");
    private final static QName _DownloadServiceProviderInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadServiceProviderInput");
    private final static QName _DownloadInteractionInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadInteractionInput");
    private final static QName _DownloadArticleInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadArticleInput");
    private final static QName _DownloadArticleProprietaryQuantityInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadArticle_Proprietary_QuantityInput");
    private final static QName _DownloadCompendiumInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadCompendiumInput");
    private final static QName _DownloadProductSubstanceAlternativeQuantityInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadProduct_Substance_Alternative_QuantityInput");
    private final static QName _DownloadCDSCodeInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadCDSCodeInput");
    private final static QName _DownloadCDSDSPInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadCDSDSPInput");
    private final static QName _DownloadProductInput_QNAME = new QName("http://www.hcisolutions.ch/index", "DownloadProductInput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.hcisolutions.index
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CDSCODE }
     * 
     */
    public CDSCODE createCDSCODE() {
        return new CDSCODE();
    }

    /**
     * Create an instance of {@link INSURANCE }
     * 
     */
    public INSURANCE createINSURANCE() {
        return new INSURANCE();
    }

    /**
     * Create an instance of {@link KOMPENDIUMPRODUCT }
     * 
     */
    public KOMPENDIUMPRODUCT createKOMPENDIUMPRODUCT() {
        return new KOMPENDIUMPRODUCT();
    }

    /**
     * Create an instance of {@link ARTICLEPROPRIETARYQUANTITY }
     * 
     */
    public ARTICLEPROPRIETARYQUANTITY createARTICLEPROPRIETARYQUANTITY() {
        return new ARTICLEPROPRIETARYQUANTITY();
    }

    /**
     * Create an instance of {@link INTERACTION }
     * 
     */
    public INTERACTION createINTERACTION() {
        return new INTERACTION();
    }

    /**
     * Create an instance of {@link WHOLESALER }
     * 
     */
    public WHOLESALER createWHOLESALER() {
        return new WHOLESALER();
    }

    /**
     * Create an instance of {@link CDS }
     * 
     */
    public CDS createCDS() {
        return new CDS();
    }

    /**
     * Create an instance of {@link PRODUCT }
     * 
     */
    public PRODUCT createPRODUCT() {
        return new PRODUCT();
    }

    /**
     * Create an instance of {@link CODEX }
     * 
     */
    public CODEX createCODEX() {
        return new CODEX();
    }

    /**
     * Create an instance of {@link LIMITATION }
     * 
     */
    public LIMITATION createLIMITATION() {
        return new LIMITATION();
    }

    /**
     * Create an instance of {@link PRODUCTPROPRIETARYQUANTITY }
     * 
     */
    public PRODUCTPROPRIETARYQUANTITY createPRODUCTPROPRIETARYQUANTITY() {
        return new PRODUCTPROPRIETARYQUANTITY();
    }

    /**
     * Create an instance of {@link BREVIER }
     * 
     */
    public BREVIER createBREVIER() {
        return new BREVIER();
    }

    /**
     * Create an instance of {@link PRODUCTSUBSTANCEALTERNATIVEQUANTITY }
     * 
     */
    public PRODUCTSUBSTANCEALTERNATIVEQUANTITY createPRODUCTSUBSTANCEALTERNATIVEQUANTITY() {
        return new PRODUCTSUBSTANCEALTERNATIVEQUANTITY();
    }

    /**
     * Create an instance of {@link DownloadCatalogResponse }
     * 
     */
    public DownloadCatalogResponse createDownloadCatalogResponse() {
        return new DownloadCatalogResponse();
    }

    /**
     * Create an instance of {@link COMPANY }
     * 
     */
    public COMPANY createCOMPANY() {
        return new COMPANY();
    }

    /**
     * Create an instance of {@link ARTICLEWHOLESALER }
     * 
     */
    public ARTICLEWHOLESALER createARTICLEWHOLESALER() {
        return new ARTICLEWHOLESALER();
    }

    /**
     * Create an instance of {@link KOMPENDIUMIMAGE }
     * 
     */
    public KOMPENDIUMIMAGE createKOMPENDIUMIMAGE() {
        return new KOMPENDIUMIMAGE();
    }

    /**
     * Create an instance of {@link ARTICLE }
     * 
     */
    public ARTICLE createARTICLE() {
        return new ARTICLE();
    }

    /**
     * Create an instance of {@link CODE }
     * 
     */
    public CODE createCODE() {
        return new CODE();
    }

    /**
     * Create an instance of {@link CDSDSP }
     * 
     */
    public CDSDSP createCDSDSP() {
        return new CDSDSP();
    }

    /**
     * Create an instance of {@link COMPENDIUM }
     * 
     */
    public COMPENDIUM createCOMPENDIUM() {
        return new COMPENDIUM();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER }
     * 
     */
    public SERVICEPROVIDER createSERVICEPROVIDER() {
        return new SERVICEPROVIDER();
    }

    /**
     * Create an instance of {@link SUBSTANCE }
     * 
     */
    public SUBSTANCE createSUBSTANCE() {
        return new SUBSTANCE();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER.SP }
     * 
     */
    public SERVICEPROVIDER.SP createSERVICEPROVIDERSP() {
        return new SERVICEPROVIDER.SP();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER.SP.ADDR }
     * 
     */
    public SERVICEPROVIDER.SP.ADDR createSERVICEPROVIDERSPADDR() {
        return new SERVICEPROVIDER.SP.ADDR();
    }

    /**
     * Create an instance of {@link COMPENDIUM.CP }
     * 
     */
    public COMPENDIUM.CP createCOMPENDIUMCP() {
        return new COMPENDIUM.CP();
    }

    /**
     * Create an instance of {@link COMPENDIUM.CP.PARAGRAPHS }
     * 
     */
    public COMPENDIUM.CP.PARAGRAPHS createCOMPENDIUMCPPARAGRAPHS() {
        return new COMPENDIUM.CP.PARAGRAPHS();
    }

    /**
     * Create an instance of {@link CDSDSP.DSP }
     * 
     */
    public CDSDSP.DSP createCDSDSPDSP() {
        return new CDSDSP.DSP();
    }

    /**
     * Create an instance of {@link ARTICLE.ART }
     * 
     */
    public ARTICLE.ART createARTICLEART() {
        return new ARTICLE.ART();
    }

    /**
     * Create an instance of {@link ARTICLEWHOLESALER.AW }
     * 
     */
    public ARTICLEWHOLESALER.AW createARTICLEWHOLESALERAW() {
        return new ARTICLEWHOLESALER.AW();
    }

    /**
     * Create an instance of {@link PRODUCT.PRD }
     * 
     */
    public PRODUCT.PRD createPRODUCTPRD() {
        return new PRODUCT.PRD();
    }

    /**
     * Create an instance of {@link PRODUCT.PRD.CPT }
     * 
     */
    public PRODUCT.PRD.CPT createPRODUCTPRDCPT() {
        return new PRODUCT.PRD.CPT();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD }
     * 
     */
    public CDS.CDSPRD createCDSCDSPRD() {
        return new CDS.CDSPRD();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD.PRDDSK }
     * 
     */
    public CDS.CDSPRD.PRDDSK createCDSCDSPRDPRDDSK() {
        return new CDS.CDSPRD.PRDDSK();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD.PRDDSM }
     * 
     */
    public CDS.CDSPRD.PRDDSM createCDSCDSPRDPRDDSM() {
        return new CDS.CDSPRD.PRDDSM();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD.PRDDSM.DSMDOS }
     * 
     */
    public CDS.CDSPRD.PRDDSM.DSMDOS createCDSCDSPRDPRDDSMDSMDOS() {
        return new CDS.CDSPRD.PRDDSM.DSMDOS();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD.PRDCCH }
     * 
     */
    public CDS.CDSPRD.PRDCCH createCDSCDSPRDPRDCCH() {
        return new CDS.CDSPRD.PRDCCH();
    }

    /**
     * Create an instance of {@link INTERACTION.IX }
     * 
     */
    public INTERACTION.IX createINTERACTIONIX() {
        return new INTERACTION.IX();
    }

    /**
     * Create an instance of {@link INSURANCE.INS }
     * 
     */
    public INSURANCE.INS createINSURANCEINS() {
        return new INSURANCE.INS();
    }

    /**
     * Create an instance of {@link CDSCODE.CCH }
     * 
     */
    public CDSCODE.CCH createCDSCODECCH() {
        return new CDSCODE.CCH();
    }

    /**
     * Create an instance of {@link DownloadKompendiumImageInput }
     * 
     */
    public DownloadKompendiumImageInput createDownloadKompendiumImageInput() {
        return new DownloadKompendiumImageInput();
    }

    /**
     * Create an instance of {@link DownloadWholesalerInput }
     * 
     */
    public DownloadWholesalerInput createDownloadWholesalerInput() {
        return new DownloadWholesalerInput();
    }

    /**
     * Create an instance of {@link CDSCODE.RESULT }
     * 
     */
    public CDSCODE.RESULT createCDSCODERESULT() {
        return new CDSCODE.RESULT();
    }

    /**
     * Create an instance of {@link INSURANCE.RESULT }
     * 
     */
    public INSURANCE.RESULT createINSURANCERESULT() {
        return new INSURANCE.RESULT();
    }

    /**
     * Create an instance of {@link DownloadProductProprietaryQuantityInput }
     * 
     */
    public DownloadProductProprietaryQuantityInput createDownloadProductProprietaryQuantityInput() {
        return new DownloadProductProprietaryQuantityInput();
    }

    /**
     * Create an instance of {@link KOMPENDIUMPRODUCT.KP }
     * 
     */
    public KOMPENDIUMPRODUCT.KP createKOMPENDIUMPRODUCTKP() {
        return new KOMPENDIUMPRODUCT.KP();
    }

    /**
     * Create an instance of {@link KOMPENDIUMPRODUCT.RESULT }
     * 
     */
    public KOMPENDIUMPRODUCT.RESULT createKOMPENDIUMPRODUCTRESULT() {
        return new KOMPENDIUMPRODUCT.RESULT();
    }

    /**
     * Create an instance of {@link DownloadCompanyInput }
     * 
     */
    public DownloadCompanyInput createDownloadCompanyInput() {
        return new DownloadCompanyInput();
    }

    /**
     * Create an instance of {@link DownloadInsuranceInput }
     * 
     */
    public DownloadInsuranceInput createDownloadInsuranceInput() {
        return new DownloadInsuranceInput();
    }

    /**
     * Create an instance of {@link ARTICLEPROPRIETARYQUANTITY.APQ }
     * 
     */
    public ARTICLEPROPRIETARYQUANTITY.APQ createARTICLEPROPRIETARYQUANTITYAPQ() {
        return new ARTICLEPROPRIETARYQUANTITY.APQ();
    }

    /**
     * Create an instance of {@link ARTICLEPROPRIETARYQUANTITY.RESULT }
     * 
     */
    public ARTICLEPROPRIETARYQUANTITY.RESULT createARTICLEPROPRIETARYQUANTITYRESULT() {
        return new ARTICLEPROPRIETARYQUANTITY.RESULT();
    }

    /**
     * Create an instance of {@link INTERACTION.RESULT }
     * 
     */
    public INTERACTION.RESULT createINTERACTIONRESULT() {
        return new INTERACTION.RESULT();
    }

    /**
     * Create an instance of {@link DownloadKompendiumProductInput }
     * 
     */
    public DownloadKompendiumProductInput createDownloadKompendiumProductInput() {
        return new DownloadKompendiumProductInput();
    }

    /**
     * Create an instance of {@link DownloadSubstanceInput }
     * 
     */
    public DownloadSubstanceInput createDownloadSubstanceInput() {
        return new DownloadSubstanceInput();
    }

    /**
     * Create an instance of {@link WHOLESALER.WHS }
     * 
     */
    public WHOLESALER.WHS createWHOLESALERWHS() {
        return new WHOLESALER.WHS();
    }

    /**
     * Create an instance of {@link WHOLESALER.RESULT }
     * 
     */
    public WHOLESALER.RESULT createWHOLESALERRESULT() {
        return new WHOLESALER.RESULT();
    }

    /**
     * Create an instance of {@link DownloadCodeInput }
     * 
     */
    public DownloadCodeInput createDownloadCodeInput() {
        return new DownloadCodeInput();
    }

    /**
     * Create an instance of {@link DownloadInteractionInput }
     * 
     */
    public DownloadInteractionInput createDownloadInteractionInput() {
        return new DownloadInteractionInput();
    }

    /**
     * Create an instance of {@link CDS.RESULT }
     * 
     */
    public CDS.RESULT createCDSRESULT() {
        return new CDS.RESULT();
    }

    /**
     * Create an instance of {@link DownloadArticleWholesalerInput }
     * 
     */
    public DownloadArticleWholesalerInput createDownloadArticleWholesalerInput() {
        return new DownloadArticleWholesalerInput();
    }

    /**
     * Create an instance of {@link DownloadLimitationInput }
     * 
     */
    public DownloadLimitationInput createDownloadLimitationInput() {
        return new DownloadLimitationInput();
    }

    /**
     * Create an instance of {@link DownloadCodexInput }
     * 
     */
    public DownloadCodexInput createDownloadCodexInput() {
        return new DownloadCodexInput();
    }

    /**
     * Create an instance of {@link PRODUCT.RESULT }
     * 
     */
    public PRODUCT.RESULT createPRODUCTRESULT() {
        return new PRODUCT.RESULT();
    }

    /**
     * Create an instance of {@link DownloadCompendiumInput }
     * 
     */
    public DownloadCompendiumInput createDownloadCompendiumInput() {
        return new DownloadCompendiumInput();
    }

    /**
     * Create an instance of {@link DownloadProductSubstanceAlternativeQuantityInput }
     * 
     */
    public DownloadProductSubstanceAlternativeQuantityInput createDownloadProductSubstanceAlternativeQuantityInput() {
        return new DownloadProductSubstanceAlternativeQuantityInput();
    }

    /**
     * Create an instance of {@link DownloadArticleInput }
     * 
     */
    public DownloadArticleInput createDownloadArticleInput() {
        return new DownloadArticleInput();
    }

    /**
     * Create an instance of {@link CODEX.CDX }
     * 
     */
    public CODEX.CDX createCODEXCDX() {
        return new CODEX.CDX();
    }

    /**
     * Create an instance of {@link CODEX.RESULT }
     * 
     */
    public CODEX.RESULT createCODEXRESULT() {
        return new CODEX.RESULT();
    }

    /**
     * Create an instance of {@link LIMITATION.LIM }
     * 
     */
    public LIMITATION.LIM createLIMITATIONLIM() {
        return new LIMITATION.LIM();
    }

    /**
     * Create an instance of {@link LIMITATION.RESULT }
     * 
     */
    public LIMITATION.RESULT createLIMITATIONRESULT() {
        return new LIMITATION.RESULT();
    }

    /**
     * Create an instance of {@link DownloadArticleProprietaryQuantityInput }
     * 
     */
    public DownloadArticleProprietaryQuantityInput createDownloadArticleProprietaryQuantityInput() {
        return new DownloadArticleProprietaryQuantityInput();
    }

    /**
     * Create an instance of {@link PRODUCTPROPRIETARYQUANTITY.PQ }
     * 
     */
    public PRODUCTPROPRIETARYQUANTITY.PQ createPRODUCTPROPRIETARYQUANTITYPQ() {
        return new PRODUCTPROPRIETARYQUANTITY.PQ();
    }

    /**
     * Create an instance of {@link PRODUCTPROPRIETARYQUANTITY.RESULT }
     * 
     */
    public PRODUCTPROPRIETARYQUANTITY.RESULT createPRODUCTPROPRIETARYQUANTITYRESULT() {
        return new PRODUCTPROPRIETARYQUANTITY.RESULT();
    }

    /**
     * Create an instance of {@link DownloadCDSInput }
     * 
     */
    public DownloadCDSInput createDownloadCDSInput() {
        return new DownloadCDSInput();
    }

    /**
     * Create an instance of {@link BREVIER.BRV }
     * 
     */
    public BREVIER.BRV createBREVIERBRV() {
        return new BREVIER.BRV();
    }

    /**
     * Create an instance of {@link BREVIER.RESULT }
     * 
     */
    public BREVIER.RESULT createBREVIERRESULT() {
        return new BREVIER.RESULT();
    }

    /**
     * Create an instance of {@link PRODUCTSUBSTANCEALTERNATIVEQUANTITY.PAQ }
     * 
     */
    public PRODUCTSUBSTANCEALTERNATIVEQUANTITY.PAQ createPRODUCTSUBSTANCEALTERNATIVEQUANTITYPAQ() {
        return new PRODUCTSUBSTANCEALTERNATIVEQUANTITY.PAQ();
    }

    /**
     * Create an instance of {@link PRODUCTSUBSTANCEALTERNATIVEQUANTITY.RESULT }
     * 
     */
    public PRODUCTSUBSTANCEALTERNATIVEQUANTITY.RESULT createPRODUCTSUBSTANCEALTERNATIVEQUANTITYRESULT() {
        return new PRODUCTSUBSTANCEALTERNATIVEQUANTITY.RESULT();
    }

    /**
     * Create an instance of {@link DownloadCatalogResponse.DownloadCatalogResult }
     * 
     */
    public DownloadCatalogResponse.DownloadCatalogResult createDownloadCatalogResponseDownloadCatalogResult() {
        return new DownloadCatalogResponse.DownloadCatalogResult();
    }

    /**
     * Create an instance of {@link COMPANY.CP }
     * 
     */
    public COMPANY.CP createCOMPANYCP() {
        return new COMPANY.CP();
    }

    /**
     * Create an instance of {@link COMPANY.RESULT }
     * 
     */
    public COMPANY.RESULT createCOMPANYRESULT() {
        return new COMPANY.RESULT();
    }

    /**
     * Create an instance of {@link DownloadCatalog }
     * 
     */
    public DownloadCatalog createDownloadCatalog() {
        return new DownloadCatalog();
    }

    /**
     * Create an instance of {@link ARTICLEWHOLESALER.RESULT }
     * 
     */
    public ARTICLEWHOLESALER.RESULT createARTICLEWHOLESALERRESULT() {
        return new ARTICLEWHOLESALER.RESULT();
    }

    /**
     * Create an instance of {@link KOMPENDIUMIMAGE.KI }
     * 
     */
    public KOMPENDIUMIMAGE.KI createKOMPENDIUMIMAGEKI() {
        return new KOMPENDIUMIMAGE.KI();
    }

    /**
     * Create an instance of {@link KOMPENDIUMIMAGE.RESULT }
     * 
     */
    public KOMPENDIUMIMAGE.RESULT createKOMPENDIUMIMAGERESULT() {
        return new KOMPENDIUMIMAGE.RESULT();
    }

    /**
     * Create an instance of {@link ARTICLE.RESULT }
     * 
     */
    public ARTICLE.RESULT createARTICLERESULT() {
        return new ARTICLE.RESULT();
    }

    /**
     * Create an instance of {@link CODE.CD }
     * 
     */
    public CODE.CD createCODECD() {
        return new CODE.CD();
    }

    /**
     * Create an instance of {@link CODE.RESULT }
     * 
     */
    public CODE.RESULT createCODERESULT() {
        return new CODE.RESULT();
    }

    /**
     * Create an instance of {@link DownloadServiceProviderInput }
     * 
     */
    public DownloadServiceProviderInput createDownloadServiceProviderInput() {
        return new DownloadServiceProviderInput();
    }

    /**
     * Create an instance of {@link CDSDSP.RESULT }
     * 
     */
    public CDSDSP.RESULT createCDSDSPRESULT() {
        return new CDSDSP.RESULT();
    }

    /**
     * Create an instance of {@link DownloadBrevierInput }
     * 
     */
    public DownloadBrevierInput createDownloadBrevierInput() {
        return new DownloadBrevierInput();
    }

    /**
     * Create an instance of {@link COMPENDIUM.RESULT }
     * 
     */
    public COMPENDIUM.RESULT createCOMPENDIUMRESULT() {
        return new COMPENDIUM.RESULT();
    }

    /**
     * Create an instance of {@link DownloadProductInput }
     * 
     */
    public DownloadProductInput createDownloadProductInput() {
        return new DownloadProductInput();
    }

    /**
     * Create an instance of {@link DownloadCDSCodeInput }
     * 
     */
    public DownloadCDSCodeInput createDownloadCDSCodeInput() {
        return new DownloadCDSCodeInput();
    }

    /**
     * Create an instance of {@link DownloadCDSDSPInput }
     * 
     */
    public DownloadCDSDSPInput createDownloadCDSDSPInput() {
        return new DownloadCDSDSPInput();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER.RESULT }
     * 
     */
    public SERVICEPROVIDER.RESULT createSERVICEPROVIDERRESULT() {
        return new SERVICEPROVIDER.RESULT();
    }

    /**
     * Create an instance of {@link SUBSTANCE.SB }
     * 
     */
    public SUBSTANCE.SB createSUBSTANCESB() {
        return new SUBSTANCE.SB();
    }

    /**
     * Create an instance of {@link SUBSTANCE.RESULT }
     * 
     */
    public SUBSTANCE.RESULT createSUBSTANCERESULT() {
        return new SUBSTANCE.RESULT();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER.SP.REFNO }
     * 
     */
    public SERVICEPROVIDER.SP.REFNO createSERVICEPROVIDERSPREFNO() {
        return new SERVICEPROVIDER.SP.REFNO();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER.SP.NDA }
     * 
     */
    public SERVICEPROVIDER.SP.NDA createSERVICEPROVIDERSPNDA() {
        return new SERVICEPROVIDER.SP.NDA();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER.SP.ROLES }
     * 
     */
    public SERVICEPROVIDER.SP.ROLES createSERVICEPROVIDERSPROLES() {
        return new SERVICEPROVIDER.SP.ROLES();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER.SP.ADDR.ADDRCOM }
     * 
     */
    public SERVICEPROVIDER.SP.ADDR.ADDRCOM createSERVICEPROVIDERSPADDRADDRCOM() {
        return new SERVICEPROVIDER.SP.ADDR.ADDRCOM();
    }

    /**
     * Create an instance of {@link SERVICEPROVIDER.SP.ADDR.ADDRECOM }
     * 
     */
    public SERVICEPROVIDER.SP.ADDR.ADDRECOM createSERVICEPROVIDERSPADDRADDRECOM() {
        return new SERVICEPROVIDER.SP.ADDR.ADDRECOM();
    }

    /**
     * Create an instance of {@link COMPENDIUM.CP.NAME }
     * 
     */
    public COMPENDIUM.CP.NAME createCOMPENDIUMCPNAME() {
        return new COMPENDIUM.CP.NAME();
    }

    /**
     * Create an instance of {@link COMPENDIUM.CP.CONTENT }
     * 
     */
    public COMPENDIUM.CP.CONTENT createCOMPENDIUMCPCONTENT() {
        return new COMPENDIUM.CP.CONTENT();
    }

    /**
     * Create an instance of {@link COMPENDIUM.CP.PARAGRAPHS.TITLE }
     * 
     */
    public COMPENDIUM.CP.PARAGRAPHS.TITLE createCOMPENDIUMCPPARAGRAPHSTITLE() {
        return new COMPENDIUM.CP.PARAGRAPHS.TITLE();
    }

    /**
     * Create an instance of {@link CDSDSP.DSP.DSPTXT }
     * 
     */
    public CDSDSP.DSP.DSPTXT createCDSDSPDSPDSPTXT() {
        return new CDSDSP.DSP.DSPTXT();
    }

    /**
     * Create an instance of {@link CDSDSP.DSP.DSPDOC }
     * 
     */
    public CDSDSP.DSP.DSPDOC createCDSDSPDSPDSPDOC() {
        return new CDSDSP.DSP.DSPDOC();
    }

    /**
     * Create an instance of {@link CDSDSP.DSP.DSPLNK }
     * 
     */
    public CDSDSP.DSP.DSPLNK createCDSDSPDSPDSPLNK() {
        return new CDSDSP.DSP.DSPLNK();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTCOMP }
     * 
     */
    public ARTICLE.ART.ARTCOMP createARTICLEARTARTCOMP() {
        return new ARTICLE.ART.ARTCOMP();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTBAR }
     * 
     */
    public ARTICLE.ART.ARTBAR createARTICLEARTARTBAR() {
        return new ARTICLE.ART.ARTBAR();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTCH }
     * 
     */
    public ARTICLE.ART.ARTCH createARTICLEARTARTCH() {
        return new ARTICLE.ART.ARTCH();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTPRI }
     * 
     */
    public ARTICLE.ART.ARTPRI createARTICLEARTARTPRI() {
        return new ARTICLE.ART.ARTPRI();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTMIG }
     * 
     */
    public ARTICLE.ART.ARTMIG createARTICLEARTARTMIG() {
        return new ARTICLE.ART.ARTMIG();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTDAN }
     * 
     */
    public ARTICLE.ART.ARTDAN createARTICLEARTARTDAN() {
        return new ARTICLE.ART.ARTDAN();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTLIM }
     * 
     */
    public ARTICLE.ART.ARTLIM createARTICLEARTARTLIM() {
        return new ARTICLE.ART.ARTLIM();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTINS }
     * 
     */
    public ARTICLE.ART.ARTINS createARTICLEARTARTINS() {
        return new ARTICLE.ART.ARTINS();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.ARTADR }
     * 
     */
    public ARTICLE.ART.ARTADR createARTICLEARTARTADR() {
        return new ARTICLE.ART.ARTADR();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.SIZE }
     * 
     */
    public ARTICLE.ART.SIZE createARTICLEARTSIZE() {
        return new ARTICLE.ART.SIZE();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.PIC }
     * 
     */
    public ARTICLE.ART.PIC createARTICLEARTPIC() {
        return new ARTICLE.ART.PIC();
    }

    /**
     * Create an instance of {@link ARTICLE.ART.SDS }
     * 
     */
    public ARTICLE.ART.SDS createARTICLEARTSDS() {
        return new ARTICLE.ART.SDS();
    }

    /**
     * Create an instance of {@link ARTICLEWHOLESALER.AW.WHSACT }
     * 
     */
    public ARTICLEWHOLESALER.AW.WHSACT createARTICLEWHOLESALERAWWHSACT() {
        return new ARTICLEWHOLESALER.AW.WHSACT();
    }

    /**
     * Create an instance of {@link ARTICLEWHOLESALER.AW.WHSPRI }
     * 
     */
    public ARTICLEWHOLESALER.AW.WHSPRI createARTICLEWHOLESALERAWWHSPRI() {
        return new ARTICLEWHOLESALER.AW.WHSPRI();
    }

    /**
     * Create an instance of {@link PRODUCT.PRD.PRDICD }
     * 
     */
    public PRODUCT.PRD.PRDICD createPRODUCTPRDPRDICD() {
        return new PRODUCT.PRD.PRDICD();
    }

    /**
     * Create an instance of {@link PRODUCT.PRD.GSASA }
     * 
     */
    public PRODUCT.PRD.GSASA createPRODUCTPRDGSASA() {
        return new PRODUCT.PRD.GSASA();
    }

    /**
     * Create an instance of {@link PRODUCT.PRD.CPT.CPTCMP }
     * 
     */
    public PRODUCT.PRD.CPT.CPTCMP createPRODUCTPRDCPTCPTCMP() {
        return new PRODUCT.PRD.CPT.CPTCMP();
    }

    /**
     * Create an instance of {@link PRODUCT.PRD.CPT.CPTIX }
     * 
     */
    public PRODUCT.PRD.CPT.CPTIX createPRODUCTPRDCPTCPTIX() {
        return new PRODUCT.PRD.CPT.CPTIX();
    }

    /**
     * Create an instance of {@link PRODUCT.PRD.CPT.CPTROA }
     * 
     */
    public PRODUCT.PRD.CPT.CPTROA createPRODUCTPRDCPTCPTROA() {
        return new PRODUCT.PRD.CPT.CPTROA();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD.PRDDSK.DSKDSP }
     * 
     */
    public CDS.CDSPRD.PRDDSK.DSKDSP createCDSCDSPRDPRDDSKDSKDSP() {
        return new CDS.CDSPRD.PRDDSK.DSKDSP();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD.PRDDSM.DSMDOS.DOSUNIT }
     * 
     */
    public CDS.CDSPRD.PRDDSM.DSMDOS.DOSUNIT createCDSCDSPRDPRDDSMDSMDOSDOSUNIT() {
        return new CDS.CDSPRD.PRDDSM.DSMDOS.DOSUNIT();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD.PRDDSM.DSMDOS.DOSDSP }
     * 
     */
    public CDS.CDSPRD.PRDDSM.DSMDOS.DOSDSP createCDSCDSPRDPRDDSMDSMDOSDOSDSP() {
        return new CDS.CDSPRD.PRDDSM.DSMDOS.DOSDSP();
    }

    /**
     * Create an instance of {@link CDS.CDSPRD.PRDCCH.CCHDSP }
     * 
     */
    public CDS.CDSPRD.PRDCCH.CCHDSP createCDSCDSPRDPRDCCHCCHDSP() {
        return new CDS.CDSPRD.PRDCCH.CCHDSP();
    }

    /**
     * Create an instance of {@link INTERACTION.IX.IXMCH }
     * 
     */
    public INTERACTION.IX.IXMCH createINTERACTIONIXIXMCH() {
        return new INTERACTION.IX.IXMCH();
    }

    /**
     * Create an instance of {@link INSURANCE.INS.ADDR }
     * 
     */
    public INSURANCE.INS.ADDR createINSURANCEINSADDR() {
        return new INSURANCE.INS.ADDR();
    }

    /**
     * Create an instance of {@link INSURANCE.INS.COM }
     * 
     */
    public INSURANCE.INS.COM createINSURANCEINSCOM() {
        return new INSURANCE.INS.COM();
    }

    /**
     * Create an instance of {@link INSURANCE.INS.ECOM }
     * 
     */
    public INSURANCE.INS.ECOM createINSURANCEINSECOM() {
        return new INSURANCE.INS.ECOM();
    }

    /**
     * Create an instance of {@link INSURANCE.INS.REFNO }
     * 
     */
    public INSURANCE.INS.REFNO createINSURANCEINSREFNO() {
        return new INSURANCE.INS.REFNO();
    }

    /**
     * Create an instance of {@link CDSCODE.CCH.CCHCCH }
     * 
     */
    public CDSCODE.CCH.CCHCCH createCDSCODECCHCCHCCH() {
        return new CDSCODE.CCH.CCHCCH();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadCDSInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadCDSInput")
    public JAXBElement<DownloadCDSInput> createDownloadCDSInput(DownloadCDSInput value) {
        return new JAXBElement<DownloadCDSInput>(_DownloadCDSInput_QNAME, DownloadCDSInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadKompendiumImageInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadKompendium_ImageInput")
    public JAXBElement<DownloadKompendiumImageInput> createDownloadKompendiumImageInput(DownloadKompendiumImageInput value) {
        return new JAXBElement<DownloadKompendiumImageInput>(_DownloadKompendiumImageInput_QNAME, DownloadKompendiumImageInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadWholesalerInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadWholesalerInput")
    public JAXBElement<DownloadWholesalerInput> createDownloadWholesalerInput(DownloadWholesalerInput value) {
        return new JAXBElement<DownloadWholesalerInput>(_DownloadWholesalerInput_QNAME, DownloadWholesalerInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadCodeInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadCodeInput")
    public JAXBElement<DownloadCodeInput> createDownloadCodeInput(DownloadCodeInput value) {
        return new JAXBElement<DownloadCodeInput>(_DownloadCodeInput_QNAME, DownloadCodeInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadKompendiumProductInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadKompendium_ProductInput")
    public JAXBElement<DownloadKompendiumProductInput> createDownloadKompendiumProductInput(DownloadKompendiumProductInput value) {
        return new JAXBElement<DownloadKompendiumProductInput>(_DownloadKompendiumProductInput_QNAME, DownloadKompendiumProductInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadSubstanceInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadSubstanceInput")
    public JAXBElement<DownloadSubstanceInput> createDownloadSubstanceInput(DownloadSubstanceInput value) {
        return new JAXBElement<DownloadSubstanceInput>(_DownloadSubstanceInput_QNAME, DownloadSubstanceInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadCompanyInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadCompanyInput")
    public JAXBElement<DownloadCompanyInput> createDownloadCompanyInput(DownloadCompanyInput value) {
        return new JAXBElement<DownloadCompanyInput>(_DownloadCompanyInput_QNAME, DownloadCompanyInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadInsuranceInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadInsuranceInput")
    public JAXBElement<DownloadInsuranceInput> createDownloadInsuranceInput(DownloadInsuranceInput value) {
        return new JAXBElement<DownloadInsuranceInput>(_DownloadInsuranceInput_QNAME, DownloadInsuranceInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadProductProprietaryQuantityInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadProduct_Proprietary_QuantityInput")
    public JAXBElement<DownloadProductProprietaryQuantityInput> createDownloadProductProprietaryQuantityInput(DownloadProductProprietaryQuantityInput value) {
        return new JAXBElement<DownloadProductProprietaryQuantityInput>(_DownloadProductProprietaryQuantityInput_QNAME, DownloadProductProprietaryQuantityInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadCodexInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadCodexInput")
    public JAXBElement<DownloadCodexInput> createDownloadCodexInput(DownloadCodexInput value) {
        return new JAXBElement<DownloadCodexInput>(_DownloadCodexInput_QNAME, DownloadCodexInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadBrevierInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadBrevierInput")
    public JAXBElement<DownloadBrevierInput> createDownloadBrevierInput(DownloadBrevierInput value) {
        return new JAXBElement<DownloadBrevierInput>(_DownloadBrevierInput_QNAME, DownloadBrevierInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadArticleWholesalerInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadArticle_WholesalerInput")
    public JAXBElement<DownloadArticleWholesalerInput> createDownloadArticleWholesalerInput(DownloadArticleWholesalerInput value) {
        return new JAXBElement<DownloadArticleWholesalerInput>(_DownloadArticleWholesalerInput_QNAME, DownloadArticleWholesalerInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadLimitationInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadLimitationInput")
    public JAXBElement<DownloadLimitationInput> createDownloadLimitationInput(DownloadLimitationInput value) {
        return new JAXBElement<DownloadLimitationInput>(_DownloadLimitationInput_QNAME, DownloadLimitationInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadServiceProviderInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadServiceProviderInput")
    public JAXBElement<DownloadServiceProviderInput> createDownloadServiceProviderInput(DownloadServiceProviderInput value) {
        return new JAXBElement<DownloadServiceProviderInput>(_DownloadServiceProviderInput_QNAME, DownloadServiceProviderInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadInteractionInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadInteractionInput")
    public JAXBElement<DownloadInteractionInput> createDownloadInteractionInput(DownloadInteractionInput value) {
        return new JAXBElement<DownloadInteractionInput>(_DownloadInteractionInput_QNAME, DownloadInteractionInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadArticleInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadArticleInput")
    public JAXBElement<DownloadArticleInput> createDownloadArticleInput(DownloadArticleInput value) {
        return new JAXBElement<DownloadArticleInput>(_DownloadArticleInput_QNAME, DownloadArticleInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadArticleProprietaryQuantityInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadArticle_Proprietary_QuantityInput")
    public JAXBElement<DownloadArticleProprietaryQuantityInput> createDownloadArticleProprietaryQuantityInput(DownloadArticleProprietaryQuantityInput value) {
        return new JAXBElement<DownloadArticleProprietaryQuantityInput>(_DownloadArticleProprietaryQuantityInput_QNAME, DownloadArticleProprietaryQuantityInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadCompendiumInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadCompendiumInput")
    public JAXBElement<DownloadCompendiumInput> createDownloadCompendiumInput(DownloadCompendiumInput value) {
        return new JAXBElement<DownloadCompendiumInput>(_DownloadCompendiumInput_QNAME, DownloadCompendiumInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadProductSubstanceAlternativeQuantityInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadProduct_Substance_Alternative_QuantityInput")
    public JAXBElement<DownloadProductSubstanceAlternativeQuantityInput> createDownloadProductSubstanceAlternativeQuantityInput(DownloadProductSubstanceAlternativeQuantityInput value) {
        return new JAXBElement<DownloadProductSubstanceAlternativeQuantityInput>(_DownloadProductSubstanceAlternativeQuantityInput_QNAME, DownloadProductSubstanceAlternativeQuantityInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadCDSCodeInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadCDSCodeInput")
    public JAXBElement<DownloadCDSCodeInput> createDownloadCDSCodeInput(DownloadCDSCodeInput value) {
        return new JAXBElement<DownloadCDSCodeInput>(_DownloadCDSCodeInput_QNAME, DownloadCDSCodeInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadCDSDSPInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadCDSDSPInput")
    public JAXBElement<DownloadCDSDSPInput> createDownloadCDSDSPInput(DownloadCDSDSPInput value) {
        return new JAXBElement<DownloadCDSDSPInput>(_DownloadCDSDSPInput_QNAME, DownloadCDSDSPInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadProductInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hcisolutions.ch/index", name = "DownloadProductInput")
    public JAXBElement<DownloadProductInput> createDownloadProductInput(DownloadProductInput value) {
        return new JAXBElement<DownloadProductInput>(_DownloadProductInput_QNAME, DownloadProductInput.class, null, value);
    }

}
