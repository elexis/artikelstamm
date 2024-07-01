
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
 *         &lt;element name="INS" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DESCR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DESCR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DIV_GLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GROUP_GLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ADDR" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="POBOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="COM" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRECOUNTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PREFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="E_COM" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="REFNO" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "ins",
    "result"
})
@XmlRootElement(name = "INSURANCE")
public class INSURANCE {

    @XmlElement(name = "INS")
    protected List<INSURANCE.INS> ins;
    @XmlElement(name = "RESULT")
    protected INSURANCE.RESULT result;
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
     * Gets the value of the ins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INSURANCE.INS }
     * 
     * 
     */
    public List<INSURANCE.INS> getINS() {
        if (ins == null) {
            ins = new ArrayList<INSURANCE.INS>();
        }
        return this.ins;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link INSURANCE.RESULT }
     *     
     */
    public INSURANCE.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link INSURANCE.RESULT }
     *     
     */
    public void setRESULT(INSURANCE.RESULT value) {
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
     *         &lt;element name="GLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DESCR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DESCR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DIV_GLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GROUP_GLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ADDR" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="POBOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="COM" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRECOUNTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PREFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="E_COM" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="REFNO" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "gln",
        "role",
        "lang",
        "descr1",
        "descr2",
        "divgln",
        "groupgln",
        "del",
        "addr",
        "com",
        "ecom",
        "refno"
    })
    public static class INS {

        @XmlElement(name = "GLN")
        protected String gln;
        @XmlElement(name = "ROLE")
        protected String role;
        @XmlElement(name = "LANG")
        protected String lang;
        @XmlElement(name = "DESCR1")
        protected String descr1;
        @XmlElement(name = "DESCR2")
        protected String descr2;
        @XmlElement(name = "DIV_GLN")
        protected String divgln;
        @XmlElement(name = "GROUP_GLN")
        protected String groupgln;
        @XmlElement(name = "DEL")
        protected boolean del;
        @XmlElement(name = "ADDR")
        protected List<INSURANCE.INS.ADDR> addr;
        @XmlElement(name = "COM")
        protected List<INSURANCE.INS.COM> com;
        @XmlElement(name = "E_COM")
        protected List<INSURANCE.INS.ECOM> ecom;
        @XmlElement(name = "REFNO")
        protected List<INSURANCE.INS.REFNO> refno;
        @XmlAttribute(name = "DT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dt;

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
         * Ruft den Wert der role-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROLE() {
            return role;
        }

        /**
         * Legt den Wert der role-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROLE(String value) {
            this.role = value;
        }

        /**
         * Ruft den Wert der lang-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLANG() {
            return lang;
        }

        /**
         * Legt den Wert der lang-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLANG(String value) {
            this.lang = value;
        }

        /**
         * Ruft den Wert der descr1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCR1() {
            return descr1;
        }

        /**
         * Legt den Wert der descr1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCR1(String value) {
            this.descr1 = value;
        }

        /**
         * Ruft den Wert der descr2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCR2() {
            return descr2;
        }

        /**
         * Legt den Wert der descr2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCR2(String value) {
            this.descr2 = value;
        }

        /**
         * Ruft den Wert der divgln-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDIVGLN() {
            return divgln;
        }

        /**
         * Legt den Wert der divgln-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDIVGLN(String value) {
            this.divgln = value;
        }

        /**
         * Ruft den Wert der groupgln-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGROUPGLN() {
            return groupgln;
        }

        /**
         * Legt den Wert der groupgln-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGROUPGLN(String value) {
            this.groupgln = value;
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
         * Gets the value of the addr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getADDR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INSURANCE.INS.ADDR }
         * 
         * 
         */
        public List<INSURANCE.INS.ADDR> getADDR() {
            if (addr == null) {
                addr = new ArrayList<INSURANCE.INS.ADDR>();
            }
            return this.addr;
        }

        /**
         * Gets the value of the com property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the com property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INSURANCE.INS.COM }
         * 
         * 
         */
        public List<INSURANCE.INS.COM> getCOM() {
            if (com == null) {
                com = new ArrayList<INSURANCE.INS.COM>();
            }
            return this.com;
        }

        /**
         * Gets the value of the ecom property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ecom property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getECOM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INSURANCE.INS.ECOM }
         * 
         * 
         */
        public List<INSURANCE.INS.ECOM> getECOM() {
            if (ecom == null) {
                ecom = new ArrayList<INSURANCE.INS.ECOM>();
            }
            return this.ecom;
        }

        /**
         * Gets the value of the refno property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refno property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getREFNO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INSURANCE.INS.REFNO }
         * 
         * 
         */
        public List<INSURANCE.INS.REFNO> getREFNO() {
            if (refno == null) {
                refno = new ArrayList<INSURANCE.INS.REFNO>();
            }
            return this.refno;
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
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="POBOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "type",
            "country",
            "state",
            "zip",
            "city",
            "street",
            "strno",
            "pobox"
        })
        public static class ADDR {

            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "COUNTRY")
            protected String country;
            @XmlElement(name = "STATE")
            protected String state;
            @XmlElement(name = "ZIP")
            protected String zip;
            @XmlElement(name = "CITY")
            protected String city;
            @XmlElement(name = "STREET")
            protected String street;
            @XmlElement(name = "STRNO")
            protected String strno;
            @XmlElement(name = "POBOX")
            protected String pobox;

            /**
             * Ruft den Wert der type-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Legt den Wert der type-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Ruft den Wert der country-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRY() {
                return country;
            }

            /**
             * Legt den Wert der country-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRY(String value) {
                this.country = value;
            }

            /**
             * Ruft den Wert der state-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTATE() {
                return state;
            }

            /**
             * Legt den Wert der state-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTATE(String value) {
                this.state = value;
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
             * Ruft den Wert der street-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTREET() {
                return street;
            }

            /**
             * Legt den Wert der street-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTREET(String value) {
                this.street = value;
            }

            /**
             * Ruft den Wert der strno-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTRNO() {
                return strno;
            }

            /**
             * Legt den Wert der strno-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTRNO(String value) {
                this.strno = value;
            }

            /**
             * Ruft den Wert der pobox-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOBOX() {
                return pobox;
            }

            /**
             * Legt den Wert der pobox-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOBOX(String value) {
                this.pobox = value;
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
         *         &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRECOUNTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PREFIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "art",
            "ctype",
            "precountr",
            "prefix",
            "nb"
        })
        public static class COM {

            @XmlElement(name = "ART")
            protected String art;
            @XmlElement(name = "CTYPE")
            protected String ctype;
            @XmlElement(name = "PRECOUNTR")
            protected String precountr;
            @XmlElement(name = "PREFIX")
            protected String prefix;
            @XmlElement(name = "NB")
            protected String nb;

            /**
             * Ruft den Wert der art-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getART() {
                return art;
            }

            /**
             * Legt den Wert der art-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setART(String value) {
                this.art = value;
            }

            /**
             * Ruft den Wert der ctype-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCTYPE() {
                return ctype;
            }

            /**
             * Legt den Wert der ctype-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCTYPE(String value) {
                this.ctype = value;
            }

            /**
             * Ruft den Wert der precountr-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRECOUNTR() {
                return precountr;
            }

            /**
             * Legt den Wert der precountr-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRECOUNTR(String value) {
                this.precountr = value;
            }

            /**
             * Ruft den Wert der prefix-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPREFIX() {
                return prefix;
            }

            /**
             * Legt den Wert der prefix-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPREFIX(String value) {
                this.prefix = value;
            }

            /**
             * Ruft den Wert der nb-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNB() {
                return nb;
            }

            /**
             * Legt den Wert der nb-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNB(String value) {
                this.nb = value;
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
         *         &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "art",
            "type",
            "value"
        })
        public static class ECOM {

            @XmlElement(name = "ART")
            protected String art;
            @XmlElement(name = "TYPE")
            protected String type;
            @XmlElement(name = "VALUE")
            protected String value;

            /**
             * Ruft den Wert der art-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getART() {
                return art;
            }

            /**
             * Legt den Wert der art-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setART(String value) {
                this.art = value;
            }

            /**
             * Ruft den Wert der type-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPE() {
                return type;
            }

            /**
             * Legt den Wert der type-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPE(String value) {
                this.type = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALUE(String value) {
                this.value = value;
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
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "code",
            "value"
        })
        public static class REFNO {

            @XmlElement(name = "CODE")
            protected String code;
            @XmlElement(name = "VALUE")
            protected String value;

            /**
             * Ruft den Wert der code-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODE() {
                return code;
            }

            /**
             * Legt den Wert der code-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODE(String value) {
                this.code = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALUE(String value) {
                this.value = value;
            }

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
