
package ch.hcisolutions.index;

import java.math.BigInteger;
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
 *         &lt;element name="CP" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRTNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NAMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NAML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STRT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PBOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CNTCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="APPENDIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
    "cp",
    "result"
})
@XmlRootElement(name = "COMPANY")
public class COMPANY {

    @XmlElement(name = "CP")
    protected List<COMPANY.CP> cp;
    @XmlElement(name = "RESULT")
    protected COMPANY.RESULT result;
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
     * Gets the value of the cp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COMPANY.CP }
     * 
     * 
     */
    public List<COMPANY.CP> getCP() {
        if (cp == null) {
            cp = new ArrayList<COMPANY.CP>();
        }
        return this.cp;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COMPANY.RESULT }
     *     
     */
    public COMPANY.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPANY.RESULT }
     *     
     */
    public void setRESULT(COMPANY.RESULT value) {
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
     *         &lt;element name="PRTNO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NAMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NAML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STRT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PBOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CNTCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WWW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="APPENDIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *       &lt;attribute name="DT" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prtno",
        "nams",
        "naml",
        "adnam",
        "strt",
        "zip",
        "city",
        "cntry",
        "pbox",
        "tel",
        "fax",
        "cntct",
        "email",
        "www",
        "gln",
        "appendix",
        "del"
    })
    public static class CP {

        @XmlElement(name = "PRTNO")
        protected BigInteger prtno;
        @XmlElement(name = "NAMS")
        protected String nams;
        @XmlElement(name = "NAML")
        protected String naml;
        @XmlElement(name = "ADNAM")
        protected String adnam;
        @XmlElement(name = "STRT")
        protected String strt;
        @XmlElement(name = "ZIP")
        protected String zip;
        @XmlElement(name = "CITY")
        protected String city;
        @XmlElement(name = "CNTRY")
        protected String cntry;
        @XmlElement(name = "PBOX")
        protected String pbox;
        @XmlElement(name = "TEL")
        protected String tel;
        @XmlElement(name = "FAX")
        protected String fax;
        @XmlElement(name = "CNTCT")
        protected String cntct;
        @XmlElement(name = "EMAIL")
        protected String email;
        @XmlElement(name = "WWW")
        protected String www;
        @XmlElement(name = "GLN")
        protected String gln;
        @XmlElement(name = "APPENDIX")
        protected String appendix;
        @XmlElement(name = "DEL")
        protected boolean del;
        @XmlAttribute(name = "DT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dt;

        /**
         * Ruft den Wert der prtno-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPRTNO() {
            return prtno;
        }

        /**
         * Legt den Wert der prtno-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPRTNO(BigInteger value) {
            this.prtno = value;
        }

        /**
         * Ruft den Wert der nams-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAMS() {
            return nams;
        }

        /**
         * Legt den Wert der nams-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAMS(String value) {
            this.nams = value;
        }

        /**
         * Ruft den Wert der naml-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAML() {
            return naml;
        }

        /**
         * Legt den Wert der naml-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAML(String value) {
            this.naml = value;
        }

        /**
         * Ruft den Wert der adnam-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADNAM() {
            return adnam;
        }

        /**
         * Legt den Wert der adnam-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADNAM(String value) {
            this.adnam = value;
        }

        /**
         * Ruft den Wert der strt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTRT() {
            return strt;
        }

        /**
         * Legt den Wert der strt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTRT(String value) {
            this.strt = value;
        }

        /**
         * Ruft den Wert der zip-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZIP() {
            return zip;
        }

        /**
         * Legt den Wert der zip-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZIP(String value) {
            this.zip = value;
        }

        /**
         * Ruft den Wert der city-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCITY() {
            return city;
        }

        /**
         * Legt den Wert der city-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCITY(String value) {
            this.city = value;
        }

        /**
         * Ruft den Wert der cntry-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNTRY() {
            return cntry;
        }

        /**
         * Legt den Wert der cntry-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNTRY(String value) {
            this.cntry = value;
        }

        /**
         * Ruft den Wert der pbox-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPBOX() {
            return pbox;
        }

        /**
         * Legt den Wert der pbox-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPBOX(String value) {
            this.pbox = value;
        }

        /**
         * Ruft den Wert der tel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTEL() {
            return tel;
        }

        /**
         * Legt den Wert der tel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTEL(String value) {
            this.tel = value;
        }

        /**
         * Ruft den Wert der fax-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAX() {
            return fax;
        }

        /**
         * Legt den Wert der fax-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAX(String value) {
            this.fax = value;
        }

        /**
         * Ruft den Wert der cntct-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNTCT() {
            return cntct;
        }

        /**
         * Legt den Wert der cntct-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNTCT(String value) {
            this.cntct = value;
        }

        /**
         * Ruft den Wert der email-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMAIL() {
            return email;
        }

        /**
         * Legt den Wert der email-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMAIL(String value) {
            this.email = value;
        }

        /**
         * Ruft den Wert der www-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWWW() {
            return www;
        }

        /**
         * Legt den Wert der www-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWWW(String value) {
            this.www = value;
        }

        /**
         * Ruft den Wert der gln-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGLN() {
            return gln;
        }

        /**
         * Legt den Wert der gln-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGLN(String value) {
            this.gln = value;
        }

        /**
         * Ruft den Wert der appendix-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPPENDIX() {
            return appendix;
        }

        /**
         * Legt den Wert der appendix-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPPENDIX(String value) {
            this.appendix = value;
        }

        /**
         * Ruft den Wert der del-Eigenschaft ab.
         * 
         */
        public boolean isDEL() {
            return del;
        }

        /**
         * Legt den Wert der del-Eigenschaft fest.
         * 
         */
        public void setDEL(boolean value) {
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
