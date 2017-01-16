//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.17 um 12:27:07 PM CET 
//


package com.ywesee.oddb2xml.article;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ywesee.oddb2xml.article package. 
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

    private final static QName _SORTF_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SORTF");
    private final static QName _SORTD_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SORTD");
    private final static QName _QTY_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "QTY");
    private final static QName _COOL_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "COOL");
    private final static QName _VDAT_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "VDAT");
    private final static QName _PHAR_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "PHAR");
    private final static QName _COMPNO_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "COMPNO");
    private final static QName _BC_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "BC");
    private final static QName _LIMPTS_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "LIMPTS");
    private final static QName _BG_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "BG");
    private final static QName _CDTYP_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "CDTYP");
    private final static QName _OKERROR_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "OK_ERROR");
    private final static QName _CDBG_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "CDBG");
    private final static QName _NINCD_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "NINCD");
    private final static QName _PTYP_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "PTYP");
    private final static QName _SMNO_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SMNO");
    private final static QName _NBRRECORD_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "NBR_RECORD");
    private final static QName _SALECD_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SALECD");
    private final static QName _SMCAT_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SMCAT");
    private final static QName _DSCRF_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "DSCRF");
    private final static QName _BCSTAT_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "BCSTAT");
    private final static QName _DSCRD_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "DSCRD");
    private final static QName _SYN1D_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SYN1D");
    private final static QName _SYN1F_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SYN1F");
    private final static QName _SLOPLUS_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SLOPLUS");
    private final static QName _PRICE_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "PRICE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ywesee.oddb2xml.article
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ART }
     * 
     */
    public ART createART() {
        return new ART();
    }

    /**
     * Create an instance of {@link ARTCOMP }
     * 
     */
    public ARTCOMP createARTCOMP() {
        return new ARTCOMP();
    }

    /**
     * Create an instance of {@link ARTBAR }
     * 
     */
    public ARTBAR createARTBAR() {
        return new ARTBAR();
    }

    /**
     * Create an instance of {@link ARTPRI }
     * 
     */
    public ARTPRI createARTPRI() {
        return new ARTPRI();
    }

    /**
     * Create an instance of {@link ARTINS }
     * 
     */
    public ARTINS createARTINS() {
        return new ARTINS();
    }

    /**
     * Create an instance of {@link ERRORCODE }
     * 
     */
    public ERRORCODE createERRORCODE() {
        return new ERRORCODE();
    }

    /**
     * Create an instance of {@link MESSAGE }
     * 
     */
    public MESSAGE createMESSAGE() {
        return new MESSAGE();
    }

    /**
     * Create an instance of {@link ARTICLE }
     * 
     */
    public ARTICLE createARTICLE() {
        return new ARTICLE();
    }

    /**
     * Create an instance of {@link RESULT }
     * 
     */
    public RESULT createRESULT() {
        return new RESULT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SORTF")
    public JAXBElement<String> createSORTF(String value) {
        return new JAXBElement<String>(_SORTF_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SORTD")
    public JAXBElement<String> createSORTD(String value) {
        return new JAXBElement<String>(_SORTD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "QTY")
    public JAXBElement<String> createQTY(String value) {
        return new JAXBElement<String>(_QTY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "COOL")
    public JAXBElement<BigInteger> createCOOL(BigInteger value) {
        return new JAXBElement<BigInteger>(_COOL_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "VDAT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVDAT(String value) {
        return new JAXBElement<String>(_VDAT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "PHAR")
    public JAXBElement<String> createPHAR(String value) {
        return new JAXBElement<String>(_PHAR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "COMPNO")
    public JAXBElement<BigInteger> createCOMPNO(BigInteger value) {
        return new JAXBElement<BigInteger>(_COMPNO_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "BC")
    public JAXBElement<BigInteger> createBC(BigInteger value) {
        return new JAXBElement<BigInteger>(_BC_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "LIMPTS")
    public JAXBElement<BigInteger> createLIMPTS(BigInteger value) {
        return new JAXBElement<BigInteger>(_LIMPTS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "BG")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBG(String value) {
        return new JAXBElement<String>(_BG_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "CDTYP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCDTYP(String value) {
        return new JAXBElement<String>(_CDTYP_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "OK_ERROR")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOKERROR(String value) {
        return new JAXBElement<String>(_OKERROR_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "CDBG")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCDBG(String value) {
        return new JAXBElement<String>(_CDBG_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "NINCD")
    public JAXBElement<BigInteger> createNINCD(BigInteger value) {
        return new JAXBElement<BigInteger>(_NINCD_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "PTYP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPTYP(String value) {
        return new JAXBElement<String>(_PTYP_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SMNO")
    public JAXBElement<BigInteger> createSMNO(BigInteger value) {
        return new JAXBElement<BigInteger>(_SMNO_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "NBR_RECORD")
    public JAXBElement<BigInteger> createNBRRECORD(BigInteger value) {
        return new JAXBElement<BigInteger>(_NBRRECORD_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SALECD")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSALECD(String value) {
        return new JAXBElement<String>(_SALECD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SMCAT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSMCAT(String value) {
        return new JAXBElement<String>(_SMCAT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "DSCRF")
    public JAXBElement<String> createDSCRF(String value) {
        return new JAXBElement<String>(_DSCRF_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "BCSTAT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBCSTAT(String value) {
        return new JAXBElement<String>(_BCSTAT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "DSCRD")
    public JAXBElement<String> createDSCRD(String value) {
        return new JAXBElement<String>(_DSCRD_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SYN1D")
    public JAXBElement<String> createSYN1D(String value) {
        return new JAXBElement<String>(_SYN1D_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SYN1F")
    public JAXBElement<String> createSYN1F(String value) {
        return new JAXBElement<String>(_SYN1F_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SLOPLUS")
    public JAXBElement<BigInteger> createSLOPLUS(BigInteger value) {
        return new JAXBElement<BigInteger>(_SLOPLUS_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "PRICE")
    public JAXBElement<BigDecimal> createPRICE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICE_QNAME, BigDecimal.class, null, value);
    }

}
