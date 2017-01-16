//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.17 um 12:27:07 PM CET 
//


package com.ywesee.oddb2xml.limitation;

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
 * generated in the com.ywesee.oddb2xml.limitation package. 
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

    private final static QName _IT_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "IT");
    private final static QName _OKERROR_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "OK_ERROR");
    private final static QName _VDAT_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "VDAT");
    private final static QName _LIMVAL_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "LIMVAL");
    private final static QName _DSCRF_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "DSCRF");
    private final static QName _NBRRECORD_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "NBR_RECORD");
    private final static QName _LIMTYP_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "LIMTYP");
    private final static QName _DSCRD_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "DSCRD");
    private final static QName _LIMNIV_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "LIMNIV");
    private final static QName _SwissmedicNo8_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SwissmedicNo8");
    private final static QName _LIMNAMEBAG_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "LIMNAMEBAG");
    private final static QName _SwissmedicNo5_QNAME = new QName("http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", "SwissmedicNo5");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ywesee.oddb2xml.limitation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ERRORCODE }
     * 
     */
    public ERRORCODE createERRORCODE() {
        return new ERRORCODE();
    }

    /**
     * Create an instance of {@link LIM }
     * 
     */
    public LIM createLIM() {
        return new LIM();
    }

    /**
     * Create an instance of {@link MESSAGE }
     * 
     */
    public MESSAGE createMESSAGE() {
        return new MESSAGE();
    }

    /**
     * Create an instance of {@link RESULT }
     * 
     */
    public RESULT createRESULT() {
        return new RESULT();
    }

    /**
     * Create an instance of {@link LIMITATION }
     * 
     */
    public LIMITATION createLIMITATION() {
        return new LIMITATION();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "IT")
    public JAXBElement<String> createIT(String value) {
        return new JAXBElement<String>(_IT_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "VDAT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVDAT(String value) {
        return new JAXBElement<String>(_VDAT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "LIMVAL")
    public JAXBElement<String> createLIMVAL(String value) {
        return new JAXBElement<String>(_LIMVAL_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "LIMTYP")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLIMTYP(String value) {
        return new JAXBElement<String>(_LIMTYP_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "LIMNIV")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLIMNIV(String value) {
        return new JAXBElement<String>(_LIMNIV_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SwissmedicNo8")
    public JAXBElement<BigInteger> createSwissmedicNo8(BigInteger value) {
        return new JAXBElement<BigInteger>(_SwissmedicNo8_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "LIMNAMEBAG")
    public JAXBElement<String> createLIMNAMEBAG(String value) {
        return new JAXBElement<String>(_LIMNAMEBAG_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wiki.oddb.org/wiki.php?pagename=Swissmedic.Datendeklaration", name = "SwissmedicNo5")
    public JAXBElement<BigInteger> createSwissmedicNo5(BigInteger value) {
        return new JAXBElement<BigInteger>(_SwissmedicNo5_QNAME, BigInteger.class, null, value);
    }

}
