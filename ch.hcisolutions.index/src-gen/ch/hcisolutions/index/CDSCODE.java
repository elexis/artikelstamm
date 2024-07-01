
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
 *         &lt;element name="CCH" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CCHKEY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CCHTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ISCODE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="TITD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TITF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="CHECKS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CHECKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CCHCCH" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CCHKEY2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="RTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cch",
    "result"
})
@XmlRootElement(name = "CDSCODE")
public class CDSCODE {

    @XmlElement(name = "CCH")
    protected List<CDSCODE.CCH> cch;
    @XmlElement(name = "RESULT")
    protected CDSCODE.RESULT result;
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
     * Gets the value of the cch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDSCODE.CCH }
     * 
     * 
     */
    public List<CDSCODE.CCH> getCCH() {
        if (cch == null) {
            cch = new ArrayList<CDSCODE.CCH>();
        }
        return this.cch;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CDSCODE.RESULT }
     *     
     */
    public CDSCODE.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CDSCODE.RESULT }
     *     
     */
    public void setRESULT(CDSCODE.RESULT value) {
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
     *         &lt;element name="CCHKEY" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="CCHTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ISCODE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="TITD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TITF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="CHECKS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CHECKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CCHCCH" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CCHKEY2" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="RTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cchkey",
        "cchtyp",
        "iscode",
        "titd",
        "titf",
        "remd",
        "remf",
        "state",
        "sex",
        "del",
        "checks",
        "cchcch"
    })
    public static class CCH {

        @XmlElement(name = "CCHKEY")
        protected int cchkey;
        @XmlElement(name = "CCHTYP")
        protected String cchtyp;
        @XmlElement(name = "ISCODE")
        protected boolean iscode;
        @XmlElement(name = "TITD")
        protected String titd;
        @XmlElement(name = "TITF")
        protected String titf;
        @XmlElement(name = "REMD")
        protected String remd;
        @XmlElement(name = "REMF")
        protected String remf;
        @XmlElement(name = "STATE")
        protected Integer state;
        @XmlElement(name = "SEX")
        protected int sex;
        @XmlElement(name = "DEL")
        protected boolean del;
        @XmlElement(name = "CHECKS")
        protected CDSCODE.CCH.CHECKS checks;
        @XmlElement(name = "CCHCCH")
        protected List<CDSCODE.CCH.CCHCCH> cchcch;
        @XmlAttribute(name = "DT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dt;

        /**
         * Ruft den Wert der cchkey-Eigenschaft ab.
         * 
         */
        public int getCCHKEY() {
            return cchkey;
        }

        /**
         * Legt den Wert der cchkey-Eigenschaft fest.
         * 
         */
        public void setCCHKEY(int value) {
            this.cchkey = value;
        }

        /**
         * Ruft den Wert der cchtyp-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCHTYP() {
            return cchtyp;
        }

        /**
         * Legt den Wert der cchtyp-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCHTYP(String value) {
            this.cchtyp = value;
        }

        /**
         * Ruft den Wert der iscode-Eigenschaft ab.
         * 
         */
        public boolean isISCODE() {
            return iscode;
        }

        /**
         * Legt den Wert der iscode-Eigenschaft fest.
         * 
         */
        public void setISCODE(boolean value) {
            this.iscode = value;
        }

        /**
         * Ruft den Wert der titd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTITD() {
            return titd;
        }

        /**
         * Legt den Wert der titd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTITD(String value) {
            this.titd = value;
        }

        /**
         * Ruft den Wert der titf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTITF() {
            return titf;
        }

        /**
         * Legt den Wert der titf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTITF(String value) {
            this.titf = value;
        }

        /**
         * Ruft den Wert der remd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMD() {
            return remd;
        }

        /**
         * Legt den Wert der remd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMD(String value) {
            this.remd = value;
        }

        /**
         * Ruft den Wert der remf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMF() {
            return remf;
        }

        /**
         * Legt den Wert der remf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMF(String value) {
            this.remf = value;
        }

        /**
         * Ruft den Wert der state-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSTATE() {
            return state;
        }

        /**
         * Legt den Wert der state-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSTATE(Integer value) {
            this.state = value;
        }

        /**
         * Ruft den Wert der sex-Eigenschaft ab.
         * 
         */
        public int getSEX() {
            return sex;
        }

        /**
         * Legt den Wert der sex-Eigenschaft fest.
         * 
         */
        public void setSEX(int value) {
            this.sex = value;
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
         * Ruft den Wert der checks-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CDSCODE.CCH.CHECKS }
         *     
         */
        public CDSCODE.CCH.CHECKS getCHECKS() {
            return checks;
        }

        /**
         * Legt den Wert der checks-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CDSCODE.CCH.CHECKS }
         *     
         */
        public void setCHECKS(CDSCODE.CCH.CHECKS value) {
            this.checks = value;
        }

        /**
         * Gets the value of the cchcch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cchcch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCCHCCH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CDSCODE.CCH.CCHCCH }
         * 
         * 
         */
        public List<CDSCODE.CCH.CCHCCH> getCCHCCH() {
            if (cchcch == null) {
                cchcch = new ArrayList<CDSCODE.CCH.CCHCCH>();
            }
            return this.cchcch;
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
         *         &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CCHKEY2" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="RTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "lno",
            "cchkey2",
            "rtyp",
            "remd",
            "remf"
        })
        public static class CCHCCH {

            @XmlElement(name = "LNO")
            protected int lno;
            @XmlElement(name = "CCHKEY2")
            protected int cchkey2;
            @XmlElement(name = "RTYP")
            protected String rtyp;
            @XmlElement(name = "REMD")
            protected String remd;
            @XmlElement(name = "REMF")
            protected String remf;

            /**
             * Ruft den Wert der lno-Eigenschaft ab.
             * 
             */
            public int getLNO() {
                return lno;
            }

            /**
             * Legt den Wert der lno-Eigenschaft fest.
             * 
             */
            public void setLNO(int value) {
                this.lno = value;
            }

            /**
             * Ruft den Wert der cchkey2-Eigenschaft ab.
             * 
             */
            public int getCCHKEY2() {
                return cchkey2;
            }

            /**
             * Legt den Wert der cchkey2-Eigenschaft fest.
             * 
             */
            public void setCCHKEY2(int value) {
                this.cchkey2 = value;
            }

            /**
             * Ruft den Wert der rtyp-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRTYP() {
                return rtyp;
            }

            /**
             * Legt den Wert der rtyp-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRTYP(String value) {
                this.rtyp = value;
            }

            /**
             * Ruft den Wert der remd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMD() {
                return remd;
            }

            /**
             * Legt den Wert der remd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMD(String value) {
                this.remd = value;
            }

            /**
             * Ruft den Wert der remf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREMF() {
                return remf;
            }

            /**
             * Legt den Wert der remf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREMF(String value) {
                this.remf = value;
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
         *         &lt;element name="CHECKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "checktype"
        })
        public static class CHECKS {

            @XmlElement(name = "CHECKTYPE")
            protected String checktype;

            /**
             * Ruft den Wert der checktype-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHECKTYPE() {
                return checktype;
            }

            /**
             * Legt den Wert der checktype-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHECKTYPE(String value) {
                this.checktype = value;
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
