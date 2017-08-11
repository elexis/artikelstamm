
package ch.hcisolutions.index;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "downloadSoap", targetNamespace = "http://www.hcisolutions.ch/index")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DownloadSoap {


    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadArticle_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.ARTICLE
     */
    @WebMethod(operationName = "DownloadArticle", action = "http://www.hcisolutions.ch/index/DownloadArticle")
    @WebResult(name = "ARTICLE", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadArticleResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ARTICLE downloadArticle(
        @WebParam(name = "DownloadArticleInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadArticleInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadArticle_Proprietary_Quantity_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.ARTICLEPROPRIETARYQUANTITY
     */
    @WebMethod(operationName = "DownloadArticle_Proprietary_Quantity", action = "http://www.hcisolutions.ch/index/DownloadArticle_Proprietary_Quantity")
    @WebResult(name = "ARTICLE_PROPRIETARY_QUANTITY", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadArticle_Proprietary_QuantityResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ARTICLEPROPRIETARYQUANTITY downloadArticleProprietaryQuantity(
        @WebParam(name = "DownloadArticle_Proprietary_QuantityInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadArticleProprietaryQuantityInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadArticle_Wholesaler_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.ARTICLEWHOLESALER
     */
    @WebMethod(operationName = "DownloadArticle_Wholesaler", action = "http://www.hcisolutions.ch/index/DownloadArticle_Wholesaler")
    @WebResult(name = "ARTICLE_WHOLESALER", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadArticle_WholesalerResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ARTICLEWHOLESALER downloadArticleWholesaler(
        @WebParam(name = "DownloadArticle_WholesalerInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadArticleWholesalerInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadBrevier_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.BREVIER
     */
    @WebMethod(operationName = "DownloadBrevier", action = "http://www.hcisolutions.ch/index/DownloadBrevier")
    @WebResult(name = "BREVIER", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadBrevierResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public BREVIER downloadBrevier(
        @WebParam(name = "DownloadBrevierInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadBrevierInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadCode_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.CODE
     */
    @WebMethod(operationName = "DownloadCode", action = "http://www.hcisolutions.ch/index/DownloadCode")
    @WebResult(name = "CODE", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadCodeResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public CODE downloadCode(
        @WebParam(name = "DownloadCodeInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadCodeInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadCodex_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.CODEX
     */
    @WebMethod(operationName = "DownloadCodex", action = "http://www.hcisolutions.ch/index/DownloadCodex")
    @WebResult(name = "CODEX", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadCodexResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public CODEX downloadCodex(
        @WebParam(name = "DownloadCodexInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadCodexInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadCompany_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.COMPANY
     */
    @WebMethod(operationName = "DownloadCompany", action = "http://www.hcisolutions.ch/index/DownloadCompany")
    @WebResult(name = "COMPANY", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadCompanyResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public COMPANY downloadCompany(
        @WebParam(name = "DownloadCompanyInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadCompanyInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadCompendium_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.COMPENDIUM
     */
    @WebMethod(operationName = "DownloadCompendium", action = "http://www.hcisolutions.ch/index/DownloadCompendium")
    @WebResult(name = "COMPENDIUM", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadCompendiumResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public COMPENDIUM downloadCompendium(
        @WebParam(name = "DownloadCompendiumInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadCompendiumInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadInsurance_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.INSURANCE
     */
    @WebMethod(operationName = "DownloadInsurance", action = "http://www.hcisolutions.ch/index/DownloadInsurance")
    @WebResult(name = "INSURANCE", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadInsuranceResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public INSURANCE downloadInsurance(
        @WebParam(name = "DownloadInsuranceInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadInsuranceInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadInteraction_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.INTERACTION
     */
    @WebMethod(operationName = "DownloadInteraction", action = "http://www.hcisolutions.ch/index/DownloadInteraction")
    @WebResult(name = "INTERACTION", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadInteractionResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public INTERACTION downloadInteraction(
        @WebParam(name = "DownloadInteractionInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadInteractionInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadKompendium_Product_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.KOMPENDIUMPRODUCT
     */
    @WebMethod(operationName = "DownloadKompendium_Product", action = "http://www.hcisolutions.ch/index/DownloadKompendium_Product")
    @WebResult(name = "KOMPENDIUM_PRODUCT", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadKompendium_ProductResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public KOMPENDIUMPRODUCT downloadKompendiumProduct(
        @WebParam(name = "DownloadKompendium_ProductInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadKompendiumProductInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadKompendium_Image_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.KOMPENDIUMIMAGE
     */
    @WebMethod(operationName = "DownloadKompendium_Image", action = "http://www.hcisolutions.ch/index/DownloadKompendium_Image")
    @WebResult(name = "KOMPENDIUM_IMAGE", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadKompendium_ImageResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public KOMPENDIUMIMAGE downloadKompendiumImage(
        @WebParam(name = "DownloadKompendium_ImageInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadKompendiumImageInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadLimitation_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.LIMITATION
     */
    @WebMethod(operationName = "DownloadLimitation", action = "http://www.hcisolutions.ch/index/DownloadLimitation")
    @WebResult(name = "LIMITATION", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadLimitationResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public LIMITATION downloadLimitation(
        @WebParam(name = "DownloadLimitationInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadLimitationInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadProduct_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.PRODUCT
     */
    @WebMethod(operationName = "DownloadProduct", action = "http://www.hcisolutions.ch/index/DownloadProduct")
    @WebResult(name = "PRODUCT", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadProductResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public PRODUCT downloadProduct(
        @WebParam(name = "DownloadProductInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadProductInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadProduct_Proprietary_Quantity_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.PRODUCTPROPRIETARYQUANTITY
     */
    @WebMethod(operationName = "DownloadProduct_Proprietary_Quantity", action = "http://www.hcisolutions.ch/index/DownloadProduct_Proprietary_Quantity")
    @WebResult(name = "PRODUCT_PROPRIETARY_QUANTITY", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadProduct_Proprietary_QuantityResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public PRODUCTPROPRIETARYQUANTITY downloadProductProprietaryQuantity(
        @WebParam(name = "DownloadProduct_Proprietary_QuantityInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadProductProprietaryQuantityInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadProduct_Substance_Alternative_Quantity_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.PRODUCTSUBSTANCEALTERNATIVEQUANTITY
     */
    @WebMethod(operationName = "DownloadProduct_Substance_Alternative_Quantity", action = "http://www.hcisolutions.ch/index/DownloadProduct_Substance_Alternative_Quantity")
    @WebResult(name = "PRODUCT_SUBSTANCE_ALTERNATIVE_QUANTITY", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadProduct_Substance_Alternative_QuantityResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public PRODUCTSUBSTANCEALTERNATIVEQUANTITY downloadProductSubstanceAlternativeQuantity(
        @WebParam(name = "DownloadProduct_Substance_Alternative_QuantityInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadProductSubstanceAlternativeQuantityInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadServiceProvider_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.SERVICEPROVIDER
     */
    @WebMethod(operationName = "DownloadServiceProvider", action = "http://www.hcisolutions.ch/index/DownloadServiceProvider")
    @WebResult(name = "SERVICEPROVIDER", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadServiceProviderResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public SERVICEPROVIDER downloadServiceProvider(
        @WebParam(name = "DownloadServiceProviderInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadServiceProviderInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadSubstance_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.SUBSTANCE
     */
    @WebMethod(operationName = "DownloadSubstance", action = "http://www.hcisolutions.ch/index/DownloadSubstance")
    @WebResult(name = "SUBSTANCE", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadSubstanceResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public SUBSTANCE downloadSubstance(
        @WebParam(name = "DownloadSubstanceInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadSubstanceInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadWholesaler_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.WHOLESALER
     */
    @WebMethod(operationName = "DownloadWholesaler", action = "http://www.hcisolutions.ch/index/DownloadWholesaler")
    @WebResult(name = "WHOLESALER", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadWholesalerResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public WHOLESALER downloadWholesaler(
        @WebParam(name = "DownloadWholesalerInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadWholesalerInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadCDS_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.CDS
     */
    @WebMethod(operationName = "DownloadCDS", action = "http://www.hcisolutions.ch/index/DownloadCDS")
    @WebResult(name = "CDS", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadCDSResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public CDS downloadCDS(
        @WebParam(name = "DownloadCDSInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadCDSInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadCDSCode_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.CDSCODE
     */
    @WebMethod(operationName = "DownloadCDSCode", action = "http://www.hcisolutions.ch/index/DownloadCDSCode")
    @WebResult(name = "CDSCODE", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadCDSCodeResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public CDSCODE downloadCDSCode(
        @WebParam(name = "DownloadCDSCodeInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadCDSCodeInput input);

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Download_in.xsd'>here</a> to open the XML Schema (XSD) validation file for the Input Data.</p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadCDSDSP_out.xsd'>here</a> to open the XML Schema (XSD) validation file for the Output Data.</p>
     * 
     * @param input
     * @return
     *     returns ch.hcisolutions.index.CDSDSP
     */
    @WebMethod(operationName = "DownloadCDSDSP", action = "http://www.hcisolutions.ch/index/DownloadCDSDSP")
    @WebResult(name = "CDSDSP", targetNamespace = "http://www.hcisolutions.ch/index", partName = "DownloadCDSDSPResult")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public CDSDSP downloadCDSDSP(
        @WebParam(name = "DownloadCDSDSPInput", targetNamespace = "http://www.hcisolutions.ch/index", partName = "input")
        DownloadCDSDSPInput input);

    /**
     * 
     * @param system
     * @param catalogOwnerGln
     * @param id
     * @param lang
     * @param fromdate
     * @return
     *     returns ch.hcisolutions.index.DownloadCatalogResponse.DownloadCatalogResult
     */
    @WebMethod(operationName = "DownloadCatalog", action = "http://www.hcisolutions.ch/index/DownloadCatalog")
    @WebResult(name = "DownloadCatalogResult", targetNamespace = "http://www.hcisolutions.ch/index")
    @RequestWrapper(localName = "DownloadCatalog", targetNamespace = "http://www.hcisolutions.ch/index", className = "ch.hcisolutions.index.DownloadCatalog")
    @ResponseWrapper(localName = "DownloadCatalogResponse", targetNamespace = "http://www.hcisolutions.ch/index", className = "ch.hcisolutions.index.DownloadCatalogResponse")
    public ch.hcisolutions.index.DownloadCatalogResponse.DownloadCatalogResult downloadCatalog(
        @WebParam(name = "id", targetNamespace = "http://www.hcisolutions.ch/index")
        String id,
        @WebParam(name = "lang", targetNamespace = "http://www.hcisolutions.ch/index")
        String lang,
        @WebParam(name = "fromdate", targetNamespace = "http://www.hcisolutions.ch/index")
        String fromdate,
        @WebParam(name = "system", targetNamespace = "http://www.hcisolutions.ch/index")
        String system,
        @WebParam(name = "catalogOwnerGln", targetNamespace = "http://www.hcisolutions.ch/index")
        String catalogOwnerGln);

}
