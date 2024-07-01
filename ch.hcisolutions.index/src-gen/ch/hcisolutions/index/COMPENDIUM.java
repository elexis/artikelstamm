
package ch.hcisolutions.index;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element name="CSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MONIDLANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NAME" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OWNER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MONID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CONTENT" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PARAGRAPHS" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TITLE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;any/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MONSUBTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="HASPI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SAFETYRELEVANT" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "css",
    "cp",
    "result"
})
@XmlRootElement(name = "COMPENDIUM")
public class COMPENDIUM {

    @XmlElement(name = "CSS")
    protected String css;
    @XmlElement(name = "CP")
    protected List<COMPENDIUM.CP> cp;
    @XmlElement(name = "RESULT")
    protected COMPENDIUM.RESULT result;
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
     * Ruft den Wert der css-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSS() {
        return css;
    }

    /**
     * Legt den Wert der css-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSS(String value) {
        this.css = value;
    }

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
     * {@link COMPENDIUM.CP }
     * 
     * 
     */
    public List<COMPENDIUM.CP> getCP() {
        if (cp == null) {
            cp = new ArrayList<COMPENDIUM.CP>();
        }
        return this.cp;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link COMPENDIUM.RESULT }
     *     
     */
    public COMPENDIUM.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPENDIUM.RESULT }
     *     
     */
    public void setRESULT(COMPENDIUM.RESULT value) {
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
     *         &lt;element name="MONIDLANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NAME" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OWNER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MONID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CONTENT" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PARAGRAPHS" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TITLE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;any/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MONSUBTYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="HASPI" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SAFETYRELEVANT" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "monidlang",
        "name",
        "owner",
        "monid",
        "version",
        "content",
        "paragraphs",
        "del"
    })
    public static class CP {

        @XmlElement(name = "MONIDLANG")
        protected String monidlang;
        @XmlElement(name = "NAME")
        protected COMPENDIUM.CP.NAME name;
        @XmlElement(name = "OWNER")
        protected String owner;
        @XmlElement(name = "MONID")
        protected int monid;
        @XmlElement(name = "VERSION")
        protected Integer version;
        @XmlElement(name = "CONTENT")
        protected COMPENDIUM.CP.CONTENT content;
        @XmlElement(name = "PARAGRAPHS")
        protected List<COMPENDIUM.CP.PARAGRAPHS> paragraphs;
        @XmlElement(name = "DEL")
        protected boolean del;
        @XmlAttribute(name = "MONTYPE")
        protected String montype;
        @XmlAttribute(name = "MONSUBTYPE")
        protected String monsubtype;
        @XmlAttribute(name = "LANG")
        protected String lang;
        @XmlAttribute(name = "HASPI")
        protected Boolean haspi;
        @XmlAttribute(name = "SAFETYRELEVANT")
        protected Boolean safetyrelevant;
        @XmlAttribute(name = "DT", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dt;

        /**
         * Ruft den Wert der monidlang-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMONIDLANG() {
            return monidlang;
        }

        /**
         * Legt den Wert der monidlang-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMONIDLANG(String value) {
            this.monidlang = value;
        }

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link COMPENDIUM.CP.NAME }
         *     
         */
        public COMPENDIUM.CP.NAME getNAME() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link COMPENDIUM.CP.NAME }
         *     
         */
        public void setNAME(COMPENDIUM.CP.NAME value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der owner-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOWNER() {
            return owner;
        }

        /**
         * Legt den Wert der owner-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOWNER(String value) {
            this.owner = value;
        }

        /**
         * Ruft den Wert der monid-Eigenschaft ab.
         * 
         */
        public int getMONID() {
            return monid;
        }

        /**
         * Legt den Wert der monid-Eigenschaft fest.
         * 
         */
        public void setMONID(int value) {
            this.monid = value;
        }

        /**
         * Ruft den Wert der version-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getVERSION() {
            return version;
        }

        /**
         * Legt den Wert der version-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setVERSION(Integer value) {
            this.version = value;
        }

        /**
         * Ruft den Wert der content-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link COMPENDIUM.CP.CONTENT }
         *     
         */
        public COMPENDIUM.CP.CONTENT getCONTENT() {
            return content;
        }

        /**
         * Legt den Wert der content-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link COMPENDIUM.CP.CONTENT }
         *     
         */
        public void setCONTENT(COMPENDIUM.CP.CONTENT value) {
            this.content = value;
        }

        /**
         * Gets the value of the paragraphs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paragraphs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARAGRAPHS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link COMPENDIUM.CP.PARAGRAPHS }
         * 
         * 
         */
        public List<COMPENDIUM.CP.PARAGRAPHS> getPARAGRAPHS() {
            if (paragraphs == null) {
                paragraphs = new ArrayList<COMPENDIUM.CP.PARAGRAPHS>();
            }
            return this.paragraphs;
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
         * Ruft den Wert der montype-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMONTYPE() {
            return montype;
        }

        /**
         * Legt den Wert der montype-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMONTYPE(String value) {
            this.montype = value;
        }

        /**
         * Ruft den Wert der monsubtype-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMONSUBTYPE() {
            return monsubtype;
        }

        /**
         * Legt den Wert der monsubtype-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMONSUBTYPE(String value) {
            this.monsubtype = value;
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
         * Ruft den Wert der haspi-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHASPI() {
            return haspi;
        }

        /**
         * Legt den Wert der haspi-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHASPI(Boolean value) {
            this.haspi = value;
        }

        /**
         * Ruft den Wert der safetyrelevant-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSAFETYRELEVANT() {
            return safetyrelevant;
        }

        /**
         * Legt den Wert der safetyrelevant-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSAFETYRELEVANT(Boolean value) {
            this.safetyrelevant = value;
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
         *         &lt;any/>
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
            "content"
        })
        public static class CONTENT {

            @XmlMixed
            @XmlAnyElement(lax = true)
            protected List<Object> content;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * {@link String }
             * 
             * 
             */
            public List<Object> getContent() {
                if (content == null) {
                    content = new ArrayList<Object>();
                }
                return this.content;
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
         *         &lt;any/>
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
            "content"
        })
        public static class NAME {

            @XmlMixed
            @XmlAnyElement(lax = true)
            protected List<Object> content;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * {@link String }
             * 
             * 
             */
            public List<Object> getContent() {
                if (content == null) {
                    content = new ArrayList<Object>();
                }
                return this.content;
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
         *         &lt;element name="TITLE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;any/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title"
        })
        public static class PARAGRAPHS {

            @XmlElement(name = "TITLE")
            protected COMPENDIUM.CP.PARAGRAPHS.TITLE title;
            @XmlAttribute(name = "ID", required = true)
            protected int id;

            /**
             * Ruft den Wert der title-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link COMPENDIUM.CP.PARAGRAPHS.TITLE }
             *     
             */
            public COMPENDIUM.CP.PARAGRAPHS.TITLE getTITLE() {
                return title;
            }

            /**
             * Legt den Wert der title-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link COMPENDIUM.CP.PARAGRAPHS.TITLE }
             *     
             */
            public void setTITLE(COMPENDIUM.CP.PARAGRAPHS.TITLE value) {
                this.title = value;
            }

            /**
             * Ruft den Wert der id-Eigenschaft ab.
             * 
             */
            public int getID() {
                return id;
            }

            /**
             * Legt den Wert der id-Eigenschaft fest.
             * 
             */
            public void setID(int value) {
                this.id = value;
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
             *         &lt;any/>
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
                "content"
            })
            public static class TITLE {

                @XmlMixed
                @XmlAnyElement(lax = true)
                protected List<Object> content;

                /**
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * {@link String }
                 * 
                 * 
                 */
                public List<Object> getContent() {
                    if (content == null) {
                        content = new ArrayList<Object>();
                    }
                    return this.content;
                }

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
