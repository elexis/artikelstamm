
package ch.hcisolutions.index;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAQ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SBLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="QULNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="QTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NSFLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="DT" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RESULT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OK_ERROR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="OK"/>
 *                         &lt;enumeration value="ERROR"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NBR_RECORD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CREATION_DATETIME" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="PROD_DATE" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="VALID_DATE" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paq",
    "result"
})
@XmlRootElement(name = "PRODUCT_SUBSTANCE_ALTERNATIVE_QUANTITY")
public class PRODUCTSUBSTANCEALTERNATIVEQUANTITY {

    @XmlElement(name = "PAQ")
    protected List<PRODUCTSUBSTANCEALTERNATIVEQUANTITY.PAQ> paq;
    @XmlElement(name = "RESULT")
    protected PRODUCTSUBSTANCEALTERNATIVEQUANTITY.RESULT result;
    @XmlAttribute(name = "CREATION_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdatetime;
    @XmlAttribute(name = "PROD_DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proddate;
    @XmlAttribute(name = "VALID_DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validdate;

    /**
     * Gets the value of the paq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRODUCTSUBSTANCEALTERNATIVEQUANTITY.PAQ }
     * 
     * 
     */
    public List<PRODUCTSUBSTANCEALTERNATIVEQUANTITY.PAQ> getPAQ() {
        if (paq == null) {
            paq = new ArrayList<PRODUCTSUBSTANCEALTERNATIVEQUANTITY.PAQ>();
        }
        return this.paq;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCTSUBSTANCEALTERNATIVEQUANTITY.RESULT }
     *     
     */
    public PRODUCTSUBSTANCEALTERNATIVEQUANTITY.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCTSUBSTANCEALTERNATIVEQUANTITY.RESULT }
     *     
     */
    public void setRESULT(PRODUCTSUBSTANCEALTERNATIVEQUANTITY.RESULT value) {
        this.result = value;
    }

    /**
     * Ruft den Wert der creationdatetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATIONDATETIME() {
        return creationdatetime;
    }

    /**
     * Legt den Wert der creationdatetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATIONDATETIME(XMLGregorianCalendar value) {
        this.creationdatetime = value;
    }

    /**
     * Ruft den Wert der proddate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRODDATE() {
        return proddate;
    }

    /**
     * Legt den Wert der proddate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRODDATE(XMLGregorianCalendar value) {
        this.proddate = value;
    }

    /**
     * Ruft den Wert der validdate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALIDDATE() {
        return validdate;
    }

    /**
     * Legt den Wert der validdate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALIDDATE(XMLGregorianCalendar value) {
        this.validdate = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="SBLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="QULNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="QTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NSFLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *       &lt;attribute name="DT" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prdno",
        "cptlno",
        "subno",
        "clno",
        "sblno",
        "qulno",
        "qty",
        "qtyu",
        "nsflag",
        "del"
    })
    public static class PAQ {

        @XmlElement(name = "PRDNO")
        protected int prdno;
        @XmlElement(name = "CPTLNO")
        protected int cptlno;
        @XmlElement(name = "SUBNO", required = true, type = Integer.class, nillable = true)
        protected Integer subno;
        @XmlElement(name = "CLNO")
        protected int clno;
        @XmlElement(name = "SBLNO")
        protected int sblno;
        @XmlElement(name = "QULNO")
        protected int qulno;
        @XmlElement(name = "QTY")
        protected Double qty;
        @XmlElement(name = "QTYU")
        protected String qtyu;
        @XmlElement(name = "NSFLAG")
        protected Boolean nsflag;
        @XmlElement(name = "DEL", required = true, type = Boolean.class, nillable = true)
        protected Boolean del;
        @XmlAttribute(name = "DT", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dt;

        /**
         * Ruft den Wert der prdno-Eigenschaft ab.
         * 
         */
        public int getPRDNO() {
            return prdno;
        }

        /**
         * Legt den Wert der prdno-Eigenschaft fest.
         * 
         */
        public void setPRDNO(int value) {
            this.prdno = value;
        }

        /**
         * Ruft den Wert der cptlno-Eigenschaft ab.
         * 
         */
        public int getCPTLNO() {
            return cptlno;
        }

        /**
         * Legt den Wert der cptlno-Eigenschaft fest.
         * 
         */
        public void setCPTLNO(int value) {
            this.cptlno = value;
        }

        /**
         * Ruft den Wert der subno-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSUBNO() {
            return subno;
        }

        /**
         * Legt den Wert der subno-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSUBNO(Integer value) {
            this.subno = value;
        }

        /**
         * Ruft den Wert der clno-Eigenschaft ab.
         * 
         */
        public int getCLNO() {
            return clno;
        }

        /**
         * Legt den Wert der clno-Eigenschaft fest.
         * 
         */
        public void setCLNO(int value) {
            this.clno = value;
        }

        /**
         * Ruft den Wert der sblno-Eigenschaft ab.
         * 
         */
        public int getSBLNO() {
            return sblno;
        }

        /**
         * Legt den Wert der sblno-Eigenschaft fest.
         * 
         */
        public void setSBLNO(int value) {
            this.sblno = value;
        }

        /**
         * Ruft den Wert der qulno-Eigenschaft ab.
         * 
         */
        public int getQULNO() {
            return qulno;
        }

        /**
         * Legt den Wert der qulno-Eigenschaft fest.
         * 
         */
        public void setQULNO(int value) {
            this.qulno = value;
        }

        /**
         * Ruft den Wert der qty-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getQTY() {
            return qty;
        }

        /**
         * Legt den Wert der qty-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setQTY(Double value) {
            this.qty = value;
        }

        /**
         * Ruft den Wert der qtyu-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQTYU() {
            return qtyu;
        }

        /**
         * Legt den Wert der qtyu-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQTYU(String value) {
            this.qtyu = value;
        }

        /**
         * Ruft den Wert der nsflag-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNSFLAG() {
            return nsflag;
        }

        /**
         * Legt den Wert der nsflag-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNSFLAG(Boolean value) {
            this.nsflag = value;
        }

        /**
         * Ruft den Wert der del-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDEL() {
            return del;
        }

        /**
         * Legt den Wert der del-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDEL(Boolean value) {
            this.del = value;
        }

        /**
         * Ruft den Wert der dt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDT() {
            return dt;
        }

        /**
         * Legt den Wert der dt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDT(XMLGregorianCalendar value) {
            this.dt = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OK_ERROR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="OK"/>
     *               &lt;enumeration value="ERROR"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NBR_RECORD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "okerror",
        "nbrrecord",
        "errorcode",
        "message"
    })
    public static class RESULT {

        @XmlElement(name = "OK_ERROR", required = true)
        protected String okerror;
        @XmlElement(name = "NBR_RECORD")
        protected Integer nbrrecord;
        @XmlElement(name = "ERROR_CODE")
        protected String errorcode;
        @XmlElement(name = "MESSAGE")
        protected String message;

        /**
         * Ruft den Wert der okerror-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOKERROR() {
            return okerror;
        }

        /**
         * Legt den Wert der okerror-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOKERROR(String value) {
            this.okerror = value;
        }

        /**
         * Ruft den Wert der nbrrecord-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNBRRECORD() {
            return nbrrecord;
        }

        /**
         * Legt den Wert der nbrrecord-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNBRRECORD(Integer value) {
            this.nbrrecord = value;
        }

        /**
         * Ruft den Wert der errorcode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERRORCODE() {
            return errorcode;
        }

        /**
         * Legt den Wert der errorcode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERRORCODE(String value) {
            this.errorcode = value;
        }

        /**
         * Ruft den Wert der message-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMESSAGE() {
            return message;
        }

        /**
         * Legt den Wert der message-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMESSAGE(String value) {
            this.message = value;
        }

    }

}
