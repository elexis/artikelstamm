
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
 *         &lt;element name="PQ" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="STDQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="STDQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRPQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="PRPQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="APPROX" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DIV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *       &lt;attribute name="RELEASE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pq",
    "result"
})
@XmlRootElement(name = "PRODUCT_PROPRIETARY_QUANTITY")
public class PRODUCTPROPRIETARYQUANTITY {

    @XmlElement(name = "PQ")
    protected List<PRODUCTPROPRIETARYQUANTITY.PQ> pq;
    @XmlElement(name = "RESULT")
    protected PRODUCTPROPRIETARYQUANTITY.RESULT result;
    @XmlAttribute(name = "CREATION_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdatetime;
    @XmlAttribute(name = "PROD_DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proddate;
    @XmlAttribute(name = "VALID_DATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validdate;
    @XmlAttribute(name = "RELEASE")
    protected String release;

    /**
     * Gets the value of the pq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRODUCTPROPRIETARYQUANTITY.PQ }
     * 
     * 
     */
    public List<PRODUCTPROPRIETARYQUANTITY.PQ> getPQ() {
        if (pq == null) {
            pq = new ArrayList<PRODUCTPROPRIETARYQUANTITY.PQ>();
        }
        return this.pq;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCTPROPRIETARYQUANTITY.RESULT }
     *     
     */
    public PRODUCTPROPRIETARYQUANTITY.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCTPROPRIETARYQUANTITY.RESULT }
     *     
     */
    public void setRESULT(PRODUCTPROPRIETARYQUANTITY.RESULT value) {
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
     * Ruft den Wert der release-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELEASE() {
        return release;
    }

    /**
     * Legt den Wert der release-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELEASE(String value) {
        this.release = value;
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
     *         &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="STDQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="STDQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRPQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="PRPQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="APPROX" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DIV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "lno",
        "stdqty",
        "stdqtyu",
        "prpqty",
        "prpqtyu",
        "approx",
        "div",
        "del"
    })
    public static class PQ {

        @XmlElement(name = "PRDNO")
        protected Integer prdno;
        @XmlElement(name = "CPTLNO")
        protected Integer cptlno;
        @XmlElement(name = "LNO")
        protected Integer lno;
        @XmlElement(name = "STDQTY")
        protected Double stdqty;
        @XmlElement(name = "STDQTYU")
        protected String stdqtyu;
        @XmlElement(name = "PRPQTY")
        protected Double prpqty;
        @XmlElement(name = "PRPQTYU")
        protected String prpqtyu;
        @XmlElement(name = "APPROX")
        protected Boolean approx;
        @XmlElement(name = "DIV")
        protected Integer div;
        @XmlElement(name = "DEL", required = true, type = Boolean.class, nillable = true)
        protected Boolean del;
        @XmlAttribute(name = "DT", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dt;

        /**
         * Ruft den Wert der prdno-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPRDNO() {
            return prdno;
        }

        /**
         * Legt den Wert der prdno-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPRDNO(Integer value) {
            this.prdno = value;
        }

        /**
         * Ruft den Wert der cptlno-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCPTLNO() {
            return cptlno;
        }

        /**
         * Legt den Wert der cptlno-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCPTLNO(Integer value) {
            this.cptlno = value;
        }

        /**
         * Ruft den Wert der lno-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLNO() {
            return lno;
        }

        /**
         * Legt den Wert der lno-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLNO(Integer value) {
            this.lno = value;
        }

        /**
         * Ruft den Wert der stdqty-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getSTDQTY() {
            return stdqty;
        }

        /**
         * Legt den Wert der stdqty-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSTDQTY(Double value) {
            this.stdqty = value;
        }

        /**
         * Ruft den Wert der stdqtyu-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTDQTYU() {
            return stdqtyu;
        }

        /**
         * Legt den Wert der stdqtyu-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTDQTYU(String value) {
            this.stdqtyu = value;
        }

        /**
         * Ruft den Wert der prpqty-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getPRPQTY() {
            return prpqty;
        }

        /**
         * Legt den Wert der prpqty-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setPRPQTY(Double value) {
            this.prpqty = value;
        }

        /**
         * Ruft den Wert der prpqtyu-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRPQTYU() {
            return prpqtyu;
        }

        /**
         * Legt den Wert der prpqtyu-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRPQTYU(String value) {
            this.prpqtyu = value;
        }

        /**
         * Ruft den Wert der approx-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAPPROX() {
            return approx;
        }

        /**
         * Legt den Wert der approx-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAPPROX(Boolean value) {
            this.approx = value;
        }

        /**
         * Ruft den Wert der div-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDIV() {
            return div;
        }

        /**
         * Legt den Wert der div-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDIV(Integer value) {
            this.div = value;
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
