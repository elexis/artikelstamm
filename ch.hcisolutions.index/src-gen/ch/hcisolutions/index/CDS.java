
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
 *         &lt;element name="CDSPRD" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="PRDCCH" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CCHKEY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CCHTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RLV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="MEASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CCHDSP" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PRDDSM" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="AGEFR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AGEFRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AGETO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="AGETOU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WGHFR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WGHFRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WGHTO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="WGHTOU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TITLED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TITLEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TITLEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DSMDOS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DOSLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="DSMTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NOTNAM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="ATFLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DOSUNIT" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="UNITLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="MAXDQ" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="MAXDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DOSDSP" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PRDDSK" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="NAMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NAMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACTMET" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Q0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="HVP" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DOSINT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="PRODRG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DSKDSP" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cdsprd",
    "result"
})
@XmlRootElement(name = "CDS")
public class CDS {

    @XmlElement(name = "CDSPRD")
    protected List<CDS.CDSPRD> cdsprd;
    @XmlElement(name = "RESULT")
    protected CDS.RESULT result;
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
     * Gets the value of the cdsprd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdsprd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDSPRD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDS.CDSPRD }
     * 
     * 
     */
    public List<CDS.CDSPRD> getCDSPRD() {
        if (cdsprd == null) {
            cdsprd = new ArrayList<CDS.CDSPRD>();
        }
        return this.cdsprd;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CDS.RESULT }
     *     
     */
    public CDS.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CDS.RESULT }
     *     
     */
    public void setRESULT(CDS.RESULT value) {
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
     *         &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="PRDCCH" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CCHKEY" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CCHTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RLV" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="MEASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CCHDSP" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PRDDSM" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="AGEFR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AGEFRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AGETO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="AGETOU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WGHFR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WGHFRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WGHTO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="WGHTOU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TITLED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TITLEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TITLEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DSMDOS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DOSLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="DSMTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NOTNAM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="ATFLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DOSUNIT" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="UNITLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="MAXDQ" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="MAXDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DOSDSP" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PRDDSK" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="NAMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NAMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACTMET" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Q0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="HVP" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DOSINT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="PRODRG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DSKDSP" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "prdno",
        "del",
        "prdcch",
        "prddsm",
        "prddsk"
    })
    public static class CDSPRD {

        @XmlElement(name = "PRDNO")
        protected int prdno;
        @XmlElement(name = "DEL")
        protected boolean del;
        @XmlElement(name = "PRDCCH")
        protected List<CDS.CDSPRD.PRDCCH> prdcch;
        @XmlElement(name = "PRDDSM")
        protected List<CDS.CDSPRD.PRDDSM> prddsm;
        @XmlElement(name = "PRDDSK")
        protected List<CDS.CDSPRD.PRDDSK> prddsk;
        @XmlAttribute(name = "DT")
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
         * Gets the value of the prdcch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prdcch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRDCCH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CDS.CDSPRD.PRDCCH }
         * 
         * 
         */
        public List<CDS.CDSPRD.PRDCCH> getPRDCCH() {
            if (prdcch == null) {
                prdcch = new ArrayList<CDS.CDSPRD.PRDCCH>();
            }
            return this.prdcch;
        }

        /**
         * Gets the value of the prddsm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prddsm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRDDSM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CDS.CDSPRD.PRDDSM }
         * 
         * 
         */
        public List<CDS.CDSPRD.PRDDSM> getPRDDSM() {
            if (prddsm == null) {
                prddsm = new ArrayList<CDS.CDSPRD.PRDDSM>();
            }
            return this.prddsm;
        }

        /**
         * Gets the value of the prddsk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prddsk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRDDSK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CDS.CDSPRD.PRDDSK }
         * 
         * 
         */
        public List<CDS.CDSPRD.PRDDSK> getPRDDSK() {
            if (prddsk == null) {
                prddsk = new ArrayList<CDS.CDSPRD.PRDDSK>();
            }
            return this.prddsk;
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
         *         &lt;element name="CCHKEY" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CCHTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RLV" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="MEASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CCHDSP" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "cchkey",
            "cchtyp",
            "rlv",
            "meascd",
            "remd",
            "remf",
            "reme",
            "datasc",
            "cchdsp"
        })
        public static class PRDCCH {

            @XmlElement(name = "LNO")
            protected int lno;
            @XmlElement(name = "CCHKEY")
            protected int cchkey;
            @XmlElement(name = "CCHTYP")
            protected String cchtyp;
            @XmlElement(name = "RLV")
            protected int rlv;
            @XmlElement(name = "MEASCD")
            protected String meascd;
            @XmlElement(name = "REMD")
            protected String remd;
            @XmlElement(name = "REMF")
            protected String remf;
            @XmlElement(name = "REME")
            protected String reme;
            @XmlElement(name = "DATASC")
            protected String datasc;
            @XmlElement(name = "CCHDSP")
            protected List<CDS.CDSPRD.PRDCCH.CCHDSP> cchdsp;

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
             * Ruft den Wert der rlv-Eigenschaft ab.
             * 
             */
            public int getRLV() {
                return rlv;
            }

            /**
             * Legt den Wert der rlv-Eigenschaft fest.
             * 
             */
            public void setRLV(int value) {
                this.rlv = value;
            }

            /**
             * Ruft den Wert der meascd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMEASCD() {
                return meascd;
            }

            /**
             * Legt den Wert der meascd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMEASCD(String value) {
                this.meascd = value;
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
             * Ruft den Wert der reme-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREME() {
                return reme;
            }

            /**
             * Legt den Wert der reme-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREME(String value) {
                this.reme = value;
            }

            /**
             * Ruft den Wert der datasc-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATASC() {
                return datasc;
            }

            /**
             * Legt den Wert der datasc-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATASC(String value) {
                this.datasc = value;
            }

            /**
             * Gets the value of the cchdsp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cchdsp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCCHDSP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CDS.CDSPRD.PRDCCH.CCHDSP }
             * 
             * 
             */
            public List<CDS.CDSPRD.PRDCCH.CCHDSP> getCCHDSP() {
                if (cchdsp == null) {
                    cchdsp = new ArrayList<CDS.CDSPRD.PRDCCH.CCHDSP>();
                }
                return this.cchdsp;
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
             *         &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "dsplno",
                "dspno",
                "dsplg",
                "remd",
                "remf",
                "reme"
            })
            public static class CCHDSP {

                @XmlElement(name = "DSPLNO")
                protected int dsplno;
                @XmlElement(name = "DSPNO")
                protected int dspno;
                @XmlElement(name = "DSPLG")
                protected String dsplg;
                @XmlElement(name = "REMD")
                protected String remd;
                @XmlElement(name = "REMF")
                protected String remf;
                @XmlElement(name = "REME")
                protected String reme;

                /**
                 * Ruft den Wert der dsplno-Eigenschaft ab.
                 * 
                 */
                public int getDSPLNO() {
                    return dsplno;
                }

                /**
                 * Legt den Wert der dsplno-Eigenschaft fest.
                 * 
                 */
                public void setDSPLNO(int value) {
                    this.dsplno = value;
                }

                /**
                 * Ruft den Wert der dspno-Eigenschaft ab.
                 * 
                 */
                public int getDSPNO() {
                    return dspno;
                }

                /**
                 * Legt den Wert der dspno-Eigenschaft fest.
                 * 
                 */
                public void setDSPNO(int value) {
                    this.dspno = value;
                }

                /**
                 * Ruft den Wert der dsplg-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSPLG() {
                    return dsplg;
                }

                /**
                 * Legt den Wert der dsplg-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSPLG(String value) {
                    this.dsplg = value;
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
                 * Ruft den Wert der reme-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREME() {
                    return reme;
                }

                /**
                 * Legt den Wert der reme-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREME(String value) {
                    this.reme = value;
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
         *         &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="NAMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NAMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACTMET" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Q0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="HVP" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DOSINT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="PRODRG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DSKDSP" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "cptlno",
            "lno",
            "namd",
            "namf",
            "actmet",
            "q0",
            "hvp",
            "dosint",
            "prodrg",
            "datasc",
            "dskdsp"
        })
        public static class PRDDSK {

            @XmlElement(name = "CPTLNO")
            protected int cptlno;
            @XmlElement(name = "LNO")
            protected int lno;
            @XmlElement(name = "NAMD")
            protected String namd;
            @XmlElement(name = "NAMF")
            protected String namf;
            @XmlElement(name = "ACTMET")
            protected Integer actmet;
            @XmlElement(name = "Q0")
            protected Double q0;
            @XmlElement(name = "HVP")
            protected Double hvp;
            @XmlElement(name = "DOSINT")
            protected Double dosint;
            @XmlElement(name = "PRODRG")
            protected Integer prodrg;
            @XmlElement(name = "DATASC")
            protected String datasc;
            @XmlElement(name = "DSKDSP")
            protected List<CDS.CDSPRD.PRDDSK.DSKDSP> dskdsp;

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
             * Ruft den Wert der namd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAMD() {
                return namd;
            }

            /**
             * Legt den Wert der namd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAMD(String value) {
                this.namd = value;
            }

            /**
             * Ruft den Wert der namf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAMF() {
                return namf;
            }

            /**
             * Legt den Wert der namf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAMF(String value) {
                this.namf = value;
            }

            /**
             * Ruft den Wert der actmet-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getACTMET() {
                return actmet;
            }

            /**
             * Legt den Wert der actmet-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setACTMET(Integer value) {
                this.actmet = value;
            }

            /**
             * Ruft den Wert der q0-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getQ0() {
                return q0;
            }

            /**
             * Legt den Wert der q0-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setQ0(Double value) {
                this.q0 = value;
            }

            /**
             * Ruft den Wert der hvp-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getHVP() {
                return hvp;
            }

            /**
             * Legt den Wert der hvp-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setHVP(Double value) {
                this.hvp = value;
            }

            /**
             * Ruft den Wert der dosint-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getDOSINT() {
                return dosint;
            }

            /**
             * Legt den Wert der dosint-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setDOSINT(Double value) {
                this.dosint = value;
            }

            /**
             * Ruft den Wert der prodrg-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPRODRG() {
                return prodrg;
            }

            /**
             * Legt den Wert der prodrg-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPRODRG(Integer value) {
                this.prodrg = value;
            }

            /**
             * Ruft den Wert der datasc-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATASC() {
                return datasc;
            }

            /**
             * Legt den Wert der datasc-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATASC(String value) {
                this.datasc = value;
            }

            /**
             * Gets the value of the dskdsp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dskdsp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDSKDSP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CDS.CDSPRD.PRDDSK.DSKDSP }
             * 
             * 
             */
            public List<CDS.CDSPRD.PRDDSK.DSKDSP> getDSKDSP() {
                if (dskdsp == null) {
                    dskdsp = new ArrayList<CDS.CDSPRD.PRDDSK.DSKDSP>();
                }
                return this.dskdsp;
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
             *         &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "dsplno",
                "dspno",
                "dsplg",
                "remd",
                "remf",
                "reme"
            })
            public static class DSKDSP {

                @XmlElement(name = "DSPLNO")
                protected int dsplno;
                @XmlElement(name = "DSPNO")
                protected int dspno;
                @XmlElement(name = "DSPLG")
                protected String dsplg;
                @XmlElement(name = "REMD")
                protected String remd;
                @XmlElement(name = "REMF")
                protected String remf;
                @XmlElement(name = "REME")
                protected String reme;

                /**
                 * Ruft den Wert der dsplno-Eigenschaft ab.
                 * 
                 */
                public int getDSPLNO() {
                    return dsplno;
                }

                /**
                 * Legt den Wert der dsplno-Eigenschaft fest.
                 * 
                 */
                public void setDSPLNO(int value) {
                    this.dsplno = value;
                }

                /**
                 * Ruft den Wert der dspno-Eigenschaft ab.
                 * 
                 */
                public int getDSPNO() {
                    return dspno;
                }

                /**
                 * Legt den Wert der dspno-Eigenschaft fest.
                 * 
                 */
                public void setDSPNO(int value) {
                    this.dspno = value;
                }

                /**
                 * Ruft den Wert der dsplg-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSPLG() {
                    return dsplg;
                }

                /**
                 * Legt den Wert der dsplg-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSPLG(String value) {
                    this.dsplg = value;
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
                 * Ruft den Wert der reme-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREME() {
                    return reme;
                }

                /**
                 * Legt den Wert der reme-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREME(String value) {
                    this.reme = value;
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
         *         &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="LNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="AGEFR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AGEFRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AGETO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="AGETOU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WGHFR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WGHFRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WGHTO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="WGHTOU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TITLED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TITLEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TITLEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATASC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DSMDOS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DOSLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="DSMTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NOTNAM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="ATFLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DOSUNIT" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="UNITLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="MAXDQ" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="MAXDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DOSDSP" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "cptlno",
            "lno",
            "agefr",
            "agefru",
            "ageto",
            "agetou",
            "wghfr",
            "wghfru",
            "wghto",
            "wghtou",
            "titled",
            "titlef",
            "titlee",
            "datasc",
            "dsmdos"
        })
        public static class PRDDSM {

            @XmlElement(name = "CPTLNO")
            protected int cptlno;
            @XmlElement(name = "LNO")
            protected int lno;
            @XmlElement(name = "AGEFR")
            protected Double agefr;
            @XmlElement(name = "AGEFRU")
            protected String agefru;
            @XmlElement(name = "AGETO")
            protected Double ageto;
            @XmlElement(name = "AGETOU")
            protected String agetou;
            @XmlElement(name = "WGHFR")
            protected Double wghfr;
            @XmlElement(name = "WGHFRU")
            protected String wghfru;
            @XmlElement(name = "WGHTO")
            protected Double wghto;
            @XmlElement(name = "WGHTOU")
            protected String wghtou;
            @XmlElement(name = "TITLED")
            protected String titled;
            @XmlElement(name = "TITLEF")
            protected String titlef;
            @XmlElement(name = "TITLEE")
            protected String titlee;
            @XmlElement(name = "DATASC")
            protected String datasc;
            @XmlElement(name = "DSMDOS")
            protected List<CDS.CDSPRD.PRDDSM.DSMDOS> dsmdos;

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
             * Ruft den Wert der agefr-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAGEFR() {
                return agefr;
            }

            /**
             * Legt den Wert der agefr-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAGEFR(Double value) {
                this.agefr = value;
            }

            /**
             * Ruft den Wert der agefru-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAGEFRU() {
                return agefru;
            }

            /**
             * Legt den Wert der agefru-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAGEFRU(String value) {
                this.agefru = value;
            }

            /**
             * Ruft den Wert der ageto-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAGETO() {
                return ageto;
            }

            /**
             * Legt den Wert der ageto-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAGETO(Double value) {
                this.ageto = value;
            }

            /**
             * Ruft den Wert der agetou-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAGETOU() {
                return agetou;
            }

            /**
             * Legt den Wert der agetou-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAGETOU(String value) {
                this.agetou = value;
            }

            /**
             * Ruft den Wert der wghfr-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWGHFR() {
                return wghfr;
            }

            /**
             * Legt den Wert der wghfr-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWGHFR(Double value) {
                this.wghfr = value;
            }

            /**
             * Ruft den Wert der wghfru-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWGHFRU() {
                return wghfru;
            }

            /**
             * Legt den Wert der wghfru-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWGHFRU(String value) {
                this.wghfru = value;
            }

            /**
             * Ruft den Wert der wghto-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWGHTO() {
                return wghto;
            }

            /**
             * Legt den Wert der wghto-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWGHTO(Double value) {
                this.wghto = value;
            }

            /**
             * Ruft den Wert der wghtou-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWGHTOU() {
                return wghtou;
            }

            /**
             * Legt den Wert der wghtou-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWGHTOU(String value) {
                this.wghtou = value;
            }

            /**
             * Ruft den Wert der titled-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTITLED() {
                return titled;
            }

            /**
             * Legt den Wert der titled-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTITLED(String value) {
                this.titled = value;
            }

            /**
             * Ruft den Wert der titlef-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTITLEF() {
                return titlef;
            }

            /**
             * Legt den Wert der titlef-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTITLEF(String value) {
                this.titlef = value;
            }

            /**
             * Ruft den Wert der titlee-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTITLEE() {
                return titlee;
            }

            /**
             * Legt den Wert der titlee-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTITLEE(String value) {
                this.titlee = value;
            }

            /**
             * Ruft den Wert der datasc-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATASC() {
                return datasc;
            }

            /**
             * Legt den Wert der datasc-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATASC(String value) {
                this.datasc = value;
            }

            /**
             * Gets the value of the dsmdos property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dsmdos property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDSMDOS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CDS.CDSPRD.PRDDSM.DSMDOS }
             * 
             * 
             */
            public List<CDS.CDSPRD.PRDDSM.DSMDOS> getDSMDOS() {
                if (dsmdos == null) {
                    dsmdos = new ArrayList<CDS.CDSPRD.PRDDSM.DSMDOS>();
                }
                return this.dsmdos;
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
             *         &lt;element name="DOSLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="DSMTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NOTNAM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="ATFLAG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DOSUNIT" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="UNITLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="MAXDQ" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="MAXDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DOSDSP" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "doslno",
                "dsmtyp",
                "notnam",
                "atflag",
                "subno",
                "remd",
                "remf",
                "reme",
                "dosunit",
                "dosdsp"
            })
            public static class DSMDOS {

                @XmlElement(name = "DOSLNO")
                protected int doslno;
                @XmlElement(name = "DSMTYP")
                protected String dsmtyp;
                @XmlElement(name = "NOTNAM")
                protected Boolean notnam;
                @XmlElement(name = "ATFLAG")
                protected Boolean atflag;
                @XmlElement(name = "SUBNO")
                protected Integer subno;
                @XmlElement(name = "REMD")
                protected String remd;
                @XmlElement(name = "REMF")
                protected String remf;
                @XmlElement(name = "REME")
                protected String reme;
                @XmlElement(name = "DOSUNIT")
                protected List<CDS.CDSPRD.PRDDSM.DSMDOS.DOSUNIT> dosunit;
                @XmlElement(name = "DOSDSP")
                protected List<CDS.CDSPRD.PRDDSM.DSMDOS.DOSDSP> dosdsp;

                /**
                 * Ruft den Wert der doslno-Eigenschaft ab.
                 * 
                 */
                public int getDOSLNO() {
                    return doslno;
                }

                /**
                 * Legt den Wert der doslno-Eigenschaft fest.
                 * 
                 */
                public void setDOSLNO(int value) {
                    this.doslno = value;
                }

                /**
                 * Ruft den Wert der dsmtyp-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDSMTYP() {
                    return dsmtyp;
                }

                /**
                 * Legt den Wert der dsmtyp-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDSMTYP(String value) {
                    this.dsmtyp = value;
                }

                /**
                 * Ruft den Wert der notnam-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNOTNAM() {
                    return notnam;
                }

                /**
                 * Legt den Wert der notnam-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setNOTNAM(Boolean value) {
                    this.notnam = value;
                }

                /**
                 * Ruft den Wert der atflag-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isATFLAG() {
                    return atflag;
                }

                /**
                 * Legt den Wert der atflag-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setATFLAG(Boolean value) {
                    this.atflag = value;
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
                 * Ruft den Wert der reme-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getREME() {
                    return reme;
                }

                /**
                 * Legt den Wert der reme-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setREME(String value) {
                    this.reme = value;
                }

                /**
                 * Gets the value of the dosunit property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dosunit property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDOSUNIT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CDS.CDSPRD.PRDDSM.DSMDOS.DOSUNIT }
                 * 
                 * 
                 */
                public List<CDS.CDSPRD.PRDDSM.DSMDOS.DOSUNIT> getDOSUNIT() {
                    if (dosunit == null) {
                        dosunit = new ArrayList<CDS.CDSPRD.PRDDSM.DSMDOS.DOSUNIT>();
                    }
                    return this.dosunit;
                }

                /**
                 * Gets the value of the dosdsp property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dosdsp property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDOSDSP().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CDS.CDSPRD.PRDDSM.DSMDOS.DOSDSP }
                 * 
                 * 
                 */
                public List<CDS.CDSPRD.PRDDSM.DSMDOS.DOSDSP> getDOSDSP() {
                    if (dosdsp == null) {
                        dosdsp = new ArrayList<CDS.CDSPRD.PRDDSM.DSMDOS.DOSDSP>();
                    }
                    return this.dosdsp;
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
                 *         &lt;element name="DSPLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="DSPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="DSPLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "dsplno",
                    "dspno",
                    "dsplg",
                    "remd",
                    "remf",
                    "reme"
                })
                public static class DOSDSP {

                    @XmlElement(name = "DSPLNO")
                    protected int dsplno;
                    @XmlElement(name = "DSPNO")
                    protected int dspno;
                    @XmlElement(name = "DSPLG")
                    protected String dsplg;
                    @XmlElement(name = "REMD")
                    protected String remd;
                    @XmlElement(name = "REMF")
                    protected String remf;
                    @XmlElement(name = "REME")
                    protected String reme;

                    /**
                     * Ruft den Wert der dsplno-Eigenschaft ab.
                     * 
                     */
                    public int getDSPLNO() {
                        return dsplno;
                    }

                    /**
                     * Legt den Wert der dsplno-Eigenschaft fest.
                     * 
                     */
                    public void setDSPLNO(int value) {
                        this.dsplno = value;
                    }

                    /**
                     * Ruft den Wert der dspno-Eigenschaft ab.
                     * 
                     */
                    public int getDSPNO() {
                        return dspno;
                    }

                    /**
                     * Legt den Wert der dspno-Eigenschaft fest.
                     * 
                     */
                    public void setDSPNO(int value) {
                        this.dspno = value;
                    }

                    /**
                     * Ruft den Wert der dsplg-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDSPLG() {
                        return dsplg;
                    }

                    /**
                     * Legt den Wert der dsplg-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDSPLG(String value) {
                        this.dsplg = value;
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
                     * Ruft den Wert der reme-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREME() {
                        return reme;
                    }

                    /**
                     * Legt den Wert der reme-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREME(String value) {
                        this.reme = value;
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
                 *         &lt;element name="UNITLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="MAXDQ" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="MAXDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "unitlno",
                    "maxdq",
                    "maxdu"
                })
                public static class DOSUNIT {

                    @XmlElement(name = "UNITLNO")
                    protected int unitlno;
                    @XmlElement(name = "MAXDQ")
                    protected double maxdq;
                    @XmlElement(name = "MAXDU")
                    protected String maxdu;

                    /**
                     * Ruft den Wert der unitlno-Eigenschaft ab.
                     * 
                     */
                    public int getUNITLNO() {
                        return unitlno;
                    }

                    /**
                     * Legt den Wert der unitlno-Eigenschaft fest.
                     * 
                     */
                    public void setUNITLNO(int value) {
                        this.unitlno = value;
                    }

                    /**
                     * Ruft den Wert der maxdq-Eigenschaft ab.
                     * 
                     */
                    public double getMAXDQ() {
                        return maxdq;
                    }

                    /**
                     * Legt den Wert der maxdq-Eigenschaft fest.
                     * 
                     */
                    public void setMAXDQ(double value) {
                        this.maxdq = value;
                    }

                    /**
                     * Ruft den Wert der maxdu-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMAXDU() {
                        return maxdu;
                    }

                    /**
                     * Legt den Wert der maxdu-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMAXDU(String value) {
                        this.maxdu = value;
                    }

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
