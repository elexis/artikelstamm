
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
 *         &lt;element name="ART" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PHAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PHARMACODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="GTIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ARTNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="GRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CDSO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CDSO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SMCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SMNO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="HOSPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CLINCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ARTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="SALECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSLIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LIMPTS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="GRDFR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CDBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="DSCRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SORTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SORTF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="QTYUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="QTYUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IMG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IMG2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DSCRPACKD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRPACKF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCKTYPD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCKTYPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SYN1D" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SYN1F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SLOPLUS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="NOPCS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="HSCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MINI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="DEPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEPOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BAGSL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="BAGSLC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="LOACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OUTSAL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="STTOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NOTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SMDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="SMCDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="SIST" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="ESIST" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="BIOCID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="BAGNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LIGHT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="BAGDOSSIER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="TRADEABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="COLDCHAIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ARTCOMP" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="COMPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ARTNO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ARTNO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ARTNO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ARTBAR" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PHAR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ARTCH" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PHAR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="NOUNITS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ARTPRI" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ARTMIG" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="MIGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MIGPRI" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="VDATPRI" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ARTDAN" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ARTLIM" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LIMCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ARTINS" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="INCD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="NINCD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ARTADR" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ADRVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ENVHAZARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="NETQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="NETQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UNREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADRPACKAGE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SIZE" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DEPTH" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PIC" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SDS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="FR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="IT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="EN" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "art",
    "result"
})
@XmlRootElement(name = "ARTICLE")
public class ARTICLE {

    @XmlElement(name = "ART")
    protected List<ARTICLE.ART> art;
    @XmlElement(name = "RESULT")
    protected ARTICLE.RESULT result;
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
     * Gets the value of the art property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the art property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getART().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARTICLE.ART }
     * 
     * 
     */
    public List<ARTICLE.ART> getART() {
        if (art == null) {
            art = new ArrayList<ARTICLE.ART>();
        }
        return this.art;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ARTICLE.RESULT }
     *     
     */
    public ARTICLE.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ARTICLE.RESULT }
     *     
     */
    public void setRESULT(ARTICLE.RESULT value) {
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
     *         &lt;element name="PHAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PHARMACODE" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="GTIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ARTNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="GRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CDSO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CDSO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="SMCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SMNO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="HOSPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CLINCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ARTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="SALECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSLIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LIMPTS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="GRDFR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CDBG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EXP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="DSCRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SORTD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SORTF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="QTYUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="QTYUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IMG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IMG2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DSCRPACKD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRPACKF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCKTYPD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCKTYPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SYN1D" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SYN1F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SLOPLUS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="NOPCS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="HSCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MINI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="DEPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEPOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BAGSL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="BAGSLC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="LOACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OUTSAL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="STTOX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NOTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SMDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="SMCDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="SIST" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="ESIST" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="BIOCID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="BAGNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LIGHT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="BAGDOSSIER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="TRADEABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="COLDCHAIN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ARTCOMP" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="COMPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ARTNO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ARTNO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ARTNO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ARTBAR" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PHAR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ARTCH" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PHAR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="NOUNITS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ARTPRI" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ARTMIG" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="MIGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MIGPRI" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="VDATPRI" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ARTDAN" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ARTLIM" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LIMCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ARTINS" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="INCD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="NINCD" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ARTADR" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ADRVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ENVHAZARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="NETQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="NETQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UNREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADRPACKAGE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SIZE" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DEPTH" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PIC" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SDS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="FR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="IT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="EN" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "phar",
        "pharmacode",
        "gtin",
        "artno",
        "grpcd",
        "cdso1",
        "cdso2",
        "prdno",
        "smcat",
        "smno",
        "hospcd",
        "clincd",
        "arttyp",
        "vat",
        "salecd",
        "inslim",
        "limpts",
        "grdfr",
        "cool",
        "temp",
        "cdbg",
        "bg",
        "exp",
        "qty",
        "dscrd",
        "dscrf",
        "dscrlongd",
        "dscrlongf",
        "sortd",
        "sortf",
        "qtyud",
        "qtyuf",
        "img",
        "img2",
        "dscrpackd",
        "dscrpackf",
        "pcktypd",
        "pcktypf",
        "mult",
        "syn1D",
        "syn1F",
        "sloplus",
        "nopcs",
        "hscd",
        "mini",
        "depcd",
        "depot",
        "bagsl",
        "bagslc",
        "loacd",
        "outsal",
        "sttox",
        "noti",
        "ggl",
        "ce",
        "smdat",
        "smcdat",
        "sist",
        "esist",
        "biocid",
        "bagno",
        "light",
        "bagdossier",
        "tradeable",
        "weight",
        "coldchain",
        "del",
        "artcomp",
        "artbar",
        "artch",
        "artpri",
        "artmig",
        "artdan",
        "artlim",
        "artins",
        "artadr",
        "size",
        "pic",
        "sds"
    })
    public static class ART {

        @XmlElement(name = "PHAR")
        protected String phar;
        @XmlElement(name = "PHARMACODE")
        protected int pharmacode;
        @XmlElement(name = "GTIN")
        protected String gtin;
        @XmlElement(name = "ARTNO")
        protected int artno;
        @XmlElement(name = "GRPCD")
        protected String grpcd;
        @XmlElement(name = "CDSO1")
        protected String cdso1;
        @XmlElement(name = "CDSO2")
        protected String cdso2;
        @XmlElement(name = "PRDNO")
        protected int prdno;
        @XmlElement(name = "SMCAT")
        protected String smcat;
        @XmlElement(name = "SMNO")
        protected Long smno;
        @XmlElement(name = "HOSPCD")
        protected String hospcd;
        @XmlElement(name = "CLINCD")
        protected String clincd;
        @XmlElement(name = "ARTTYP")
        protected String arttyp;
        @XmlElement(name = "VAT")
        protected Integer vat;
        @XmlElement(name = "SALECD")
        protected String salecd;
        @XmlElement(name = "INSLIM")
        protected String inslim;
        @XmlElement(name = "LIMPTS")
        protected Double limpts;
        @XmlElement(name = "GRDFR")
        protected String grdfr;
        @XmlElement(name = "COOL")
        protected String cool;
        @XmlElement(name = "TEMP")
        protected String temp;
        @XmlElement(name = "CDBG")
        protected String cdbg;
        @XmlElement(name = "BG")
        protected String bg;
        @XmlElement(name = "EXP")
        protected Integer exp;
        @XmlElement(name = "QTY")
        protected Double qty;
        @XmlElement(name = "DSCRD")
        protected String dscrd;
        @XmlElement(name = "DSCRF")
        protected String dscrf;
        @XmlElement(name = "DSCRLONGD")
        protected String dscrlongd;
        @XmlElement(name = "DSCRLONGF")
        protected String dscrlongf;
        @XmlElement(name = "SORTD")
        protected String sortd;
        @XmlElement(name = "SORTF")
        protected String sortf;
        @XmlElement(name = "QTYUD")
        protected String qtyud;
        @XmlElement(name = "QTYUF")
        protected String qtyuf;
        @XmlElement(name = "IMG")
        protected String img;
        @XmlElement(name = "IMG2")
        protected Boolean img2;
        @XmlElement(name = "DSCRPACKD")
        protected String dscrpackd;
        @XmlElement(name = "DSCRPACKF")
        protected String dscrpackf;
        @XmlElement(name = "PCKTYPD")
        protected String pcktypd;
        @XmlElement(name = "PCKTYPF")
        protected String pcktypf;
        @XmlElement(name = "MULT")
        protected String mult;
        @XmlElement(name = "SYN1D")
        protected String syn1D;
        @XmlElement(name = "SYN1F")
        protected String syn1F;
        @XmlElement(name = "SLOPLUS")
        protected Integer sloplus;
        @XmlElement(name = "NOPCS")
        protected Integer nopcs;
        @XmlElement(name = "HSCD")
        protected String hscd;
        @XmlElement(name = "MINI")
        protected Integer mini;
        @XmlElement(name = "DEPCD")
        protected String depcd;
        @XmlElement(name = "DEPOT")
        protected String depot;
        @XmlElement(name = "BAGSL")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar bagsl;
        @XmlElement(name = "BAGSLC")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar bagslc;
        @XmlElement(name = "LOACD")
        protected String loacd;
        @XmlElement(name = "OUTSAL")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar outsal;
        @XmlElement(name = "STTOX")
        protected String sttox;
        @XmlElement(name = "NOTI")
        protected String noti;
        @XmlElement(name = "GGL")
        protected String ggl;
        @XmlElement(name = "CE")
        protected String ce;
        @XmlElement(name = "SMDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar smdat;
        @XmlElement(name = "SMCDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar smcdat;
        @XmlElement(name = "SIST")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar sist;
        @XmlElement(name = "ESIST")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar esist;
        @XmlElement(name = "BIOCID")
        protected Boolean biocid;
        @XmlElement(name = "BAGNO")
        protected String bagno;
        @XmlElement(name = "LIGHT")
        protected Boolean light;
        @XmlElement(name = "BAGDOSSIER")
        protected Integer bagdossier;
        @XmlElement(name = "TRADEABLE")
        protected String tradeable;
        @XmlElement(name = "WEIGHT")
        protected Double weight;
        @XmlElement(name = "COLDCHAIN")
        protected Boolean coldchain;
        @XmlElement(name = "DEL")
        protected boolean del;
        @XmlElement(name = "ARTCOMP")
        protected List<ARTICLE.ART.ARTCOMP> artcomp;
        @XmlElement(name = "ARTBAR")
        protected List<ARTICLE.ART.ARTBAR> artbar;
        @XmlElement(name = "ARTCH")
        protected List<ARTICLE.ART.ARTCH> artch;
        @XmlElement(name = "ARTPRI")
        protected List<ARTICLE.ART.ARTPRI> artpri;
        @XmlElement(name = "ARTMIG")
        protected List<ARTICLE.ART.ARTMIG> artmig;
        @XmlElement(name = "ARTDAN")
        protected List<ARTICLE.ART.ARTDAN> artdan;
        @XmlElement(name = "ARTLIM")
        protected List<ARTICLE.ART.ARTLIM> artlim;
        @XmlElement(name = "ARTINS")
        protected List<ARTICLE.ART.ARTINS> artins;
        @XmlElement(name = "ARTADR")
        protected List<ARTICLE.ART.ARTADR> artadr;
        @XmlElement(name = "SIZE")
        protected ARTICLE.ART.SIZE size;
        @XmlElement(name = "PIC")
        protected List<ARTICLE.ART.PIC> pic;
        @XmlElement(name = "SDS")
        protected ARTICLE.ART.SDS sds;
        @XmlAttribute(name = "DT", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dt;

        /**
         * Ruft den Wert der phar-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPHAR() {
            return phar;
        }

        /**
         * Legt den Wert der phar-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPHAR(String value) {
            this.phar = value;
        }

        /**
         * Ruft den Wert der pharmacode-Eigenschaft ab.
         * 
         */
        public int getPHARMACODE() {
            return pharmacode;
        }

        /**
         * Legt den Wert der pharmacode-Eigenschaft fest.
         * 
         */
        public void setPHARMACODE(int value) {
            this.pharmacode = value;
        }

        /**
         * Ruft den Wert der gtin-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGTIN() {
            return gtin;
        }

        /**
         * Legt den Wert der gtin-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGTIN(String value) {
            this.gtin = value;
        }

        /**
         * Ruft den Wert der artno-Eigenschaft ab.
         * 
         */
        public int getARTNO() {
            return artno;
        }

        /**
         * Legt den Wert der artno-Eigenschaft fest.
         * 
         */
        public void setARTNO(int value) {
            this.artno = value;
        }

        /**
         * Ruft den Wert der grpcd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGRPCD() {
            return grpcd;
        }

        /**
         * Legt den Wert der grpcd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGRPCD(String value) {
            this.grpcd = value;
        }

        /**
         * Ruft den Wert der cdso1-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDSO1() {
            return cdso1;
        }

        /**
         * Legt den Wert der cdso1-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDSO1(String value) {
            this.cdso1 = value;
        }

        /**
         * Ruft den Wert der cdso2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDSO2() {
            return cdso2;
        }

        /**
         * Legt den Wert der cdso2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDSO2(String value) {
            this.cdso2 = value;
        }

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
         * Ruft den Wert der smcat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSMCAT() {
            return smcat;
        }

        /**
         * Legt den Wert der smcat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSMCAT(String value) {
            this.smcat = value;
        }

        /**
         * Ruft den Wert der smno-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSMNO() {
            return smno;
        }

        /**
         * Legt den Wert der smno-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSMNO(Long value) {
            this.smno = value;
        }

        /**
         * Ruft den Wert der hospcd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHOSPCD() {
            return hospcd;
        }

        /**
         * Legt den Wert der hospcd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHOSPCD(String value) {
            this.hospcd = value;
        }

        /**
         * Ruft den Wert der clincd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLINCD() {
            return clincd;
        }

        /**
         * Legt den Wert der clincd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLINCD(String value) {
            this.clincd = value;
        }

        /**
         * Ruft den Wert der arttyp-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARTTYP() {
            return arttyp;
        }

        /**
         * Legt den Wert der arttyp-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARTTYP(String value) {
            this.arttyp = value;
        }

        /**
         * Ruft den Wert der vat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getVAT() {
            return vat;
        }

        /**
         * Legt den Wert der vat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setVAT(Integer value) {
            this.vat = value;
        }

        /**
         * Ruft den Wert der salecd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSALECD() {
            return salecd;
        }

        /**
         * Legt den Wert der salecd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSALECD(String value) {
            this.salecd = value;
        }

        /**
         * Ruft den Wert der inslim-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSLIM() {
            return inslim;
        }

        /**
         * Legt den Wert der inslim-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSLIM(String value) {
            this.inslim = value;
        }

        /**
         * Ruft den Wert der limpts-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getLIMPTS() {
            return limpts;
        }

        /**
         * Legt den Wert der limpts-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLIMPTS(Double value) {
            this.limpts = value;
        }

        /**
         * Ruft den Wert der grdfr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGRDFR() {
            return grdfr;
        }

        /**
         * Legt den Wert der grdfr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGRDFR(String value) {
            this.grdfr = value;
        }

        /**
         * Ruft den Wert der cool-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOOL() {
            return cool;
        }

        /**
         * Legt den Wert der cool-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOOL(String value) {
            this.cool = value;
        }

        /**
         * Ruft den Wert der temp-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTEMP() {
            return temp;
        }

        /**
         * Legt den Wert der temp-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTEMP(String value) {
            this.temp = value;
        }

        /**
         * Ruft den Wert der cdbg-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDBG() {
            return cdbg;
        }

        /**
         * Legt den Wert der cdbg-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDBG(String value) {
            this.cdbg = value;
        }

        /**
         * Ruft den Wert der bg-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBG() {
            return bg;
        }

        /**
         * Legt den Wert der bg-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBG(String value) {
            this.bg = value;
        }

        /**
         * Ruft den Wert der exp-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getEXP() {
            return exp;
        }

        /**
         * Legt den Wert der exp-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setEXP(Integer value) {
            this.exp = value;
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
         * Ruft den Wert der dscrd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDSCRD() {
            return dscrd;
        }

        /**
         * Legt den Wert der dscrd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDSCRD(String value) {
            this.dscrd = value;
        }

        /**
         * Ruft den Wert der dscrf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDSCRF() {
            return dscrf;
        }

        /**
         * Legt den Wert der dscrf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDSCRF(String value) {
            this.dscrf = value;
        }

        /**
         * Ruft den Wert der dscrlongd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDSCRLONGD() {
            return dscrlongd;
        }

        /**
         * Legt den Wert der dscrlongd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDSCRLONGD(String value) {
            this.dscrlongd = value;
        }

        /**
         * Ruft den Wert der dscrlongf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDSCRLONGF() {
            return dscrlongf;
        }

        /**
         * Legt den Wert der dscrlongf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDSCRLONGF(String value) {
            this.dscrlongf = value;
        }

        /**
         * Ruft den Wert der sortd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSORTD() {
            return sortd;
        }

        /**
         * Legt den Wert der sortd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSORTD(String value) {
            this.sortd = value;
        }

        /**
         * Ruft den Wert der sortf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSORTF() {
            return sortf;
        }

        /**
         * Legt den Wert der sortf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSORTF(String value) {
            this.sortf = value;
        }

        /**
         * Ruft den Wert der qtyud-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQTYUD() {
            return qtyud;
        }

        /**
         * Legt den Wert der qtyud-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQTYUD(String value) {
            this.qtyud = value;
        }

        /**
         * Ruft den Wert der qtyuf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQTYUF() {
            return qtyuf;
        }

        /**
         * Legt den Wert der qtyuf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQTYUF(String value) {
            this.qtyuf = value;
        }

        /**
         * Ruft den Wert der img-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMG() {
            return img;
        }

        /**
         * Legt den Wert der img-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMG(String value) {
            this.img = value;
        }

        /**
         * Ruft den Wert der img2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIMG2() {
            return img2;
        }

        /**
         * Legt den Wert der img2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIMG2(Boolean value) {
            this.img2 = value;
        }

        /**
         * Ruft den Wert der dscrpackd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDSCRPACKD() {
            return dscrpackd;
        }

        /**
         * Legt den Wert der dscrpackd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDSCRPACKD(String value) {
            this.dscrpackd = value;
        }

        /**
         * Ruft den Wert der dscrpackf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDSCRPACKF() {
            return dscrpackf;
        }

        /**
         * Legt den Wert der dscrpackf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDSCRPACKF(String value) {
            this.dscrpackf = value;
        }

        /**
         * Ruft den Wert der pcktypd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCKTYPD() {
            return pcktypd;
        }

        /**
         * Legt den Wert der pcktypd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCKTYPD(String value) {
            this.pcktypd = value;
        }

        /**
         * Ruft den Wert der pcktypf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCKTYPF() {
            return pcktypf;
        }

        /**
         * Legt den Wert der pcktypf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCKTYPF(String value) {
            this.pcktypf = value;
        }

        /**
         * Ruft den Wert der mult-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMULT() {
            return mult;
        }

        /**
         * Legt den Wert der mult-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMULT(String value) {
            this.mult = value;
        }

        /**
         * Ruft den Wert der syn1D-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSYN1D() {
            return syn1D;
        }

        /**
         * Legt den Wert der syn1D-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSYN1D(String value) {
            this.syn1D = value;
        }

        /**
         * Ruft den Wert der syn1F-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSYN1F() {
            return syn1F;
        }

        /**
         * Legt den Wert der syn1F-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSYN1F(String value) {
            this.syn1F = value;
        }

        /**
         * Ruft den Wert der sloplus-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSLOPLUS() {
            return sloplus;
        }

        /**
         * Legt den Wert der sloplus-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSLOPLUS(Integer value) {
            this.sloplus = value;
        }

        /**
         * Ruft den Wert der nopcs-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNOPCS() {
            return nopcs;
        }

        /**
         * Legt den Wert der nopcs-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNOPCS(Integer value) {
            this.nopcs = value;
        }

        /**
         * Ruft den Wert der hscd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHSCD() {
            return hscd;
        }

        /**
         * Legt den Wert der hscd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHSCD(String value) {
            this.hscd = value;
        }

        /**
         * Ruft den Wert der mini-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMINI() {
            return mini;
        }

        /**
         * Legt den Wert der mini-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMINI(Integer value) {
            this.mini = value;
        }

        /**
         * Ruft den Wert der depcd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPCD() {
            return depcd;
        }

        /**
         * Legt den Wert der depcd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPCD(String value) {
            this.depcd = value;
        }

        /**
         * Ruft den Wert der depot-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEPOT() {
            return depot;
        }

        /**
         * Legt den Wert der depot-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEPOT(String value) {
            this.depot = value;
        }

        /**
         * Ruft den Wert der bagsl-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBAGSL() {
            return bagsl;
        }

        /**
         * Legt den Wert der bagsl-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBAGSL(XMLGregorianCalendar value) {
            this.bagsl = value;
        }

        /**
         * Ruft den Wert der bagslc-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBAGSLC() {
            return bagslc;
        }

        /**
         * Legt den Wert der bagslc-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBAGSLC(XMLGregorianCalendar value) {
            this.bagslc = value;
        }

        /**
         * Ruft den Wert der loacd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOACD() {
            return loacd;
        }

        /**
         * Legt den Wert der loacd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOACD(String value) {
            this.loacd = value;
        }

        /**
         * Ruft den Wert der outsal-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOUTSAL() {
            return outsal;
        }

        /**
         * Legt den Wert der outsal-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOUTSAL(XMLGregorianCalendar value) {
            this.outsal = value;
        }

        /**
         * Ruft den Wert der sttox-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTTOX() {
            return sttox;
        }

        /**
         * Legt den Wert der sttox-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTTOX(String value) {
            this.sttox = value;
        }

        /**
         * Ruft den Wert der noti-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOTI() {
            return noti;
        }

        /**
         * Legt den Wert der noti-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOTI(String value) {
            this.noti = value;
        }

        /**
         * Ruft den Wert der ggl-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGGL() {
            return ggl;
        }

        /**
         * Legt den Wert der ggl-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGGL(String value) {
            this.ggl = value;
        }

        /**
         * Ruft den Wert der ce-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCE() {
            return ce;
        }

        /**
         * Legt den Wert der ce-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCE(String value) {
            this.ce = value;
        }

        /**
         * Ruft den Wert der smdat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSMDAT() {
            return smdat;
        }

        /**
         * Legt den Wert der smdat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSMDAT(XMLGregorianCalendar value) {
            this.smdat = value;
        }

        /**
         * Ruft den Wert der smcdat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSMCDAT() {
            return smcdat;
        }

        /**
         * Legt den Wert der smcdat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSMCDAT(XMLGregorianCalendar value) {
            this.smcdat = value;
        }

        /**
         * Ruft den Wert der sist-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSIST() {
            return sist;
        }

        /**
         * Legt den Wert der sist-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSIST(XMLGregorianCalendar value) {
            this.sist = value;
        }

        /**
         * Ruft den Wert der esist-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getESIST() {
            return esist;
        }

        /**
         * Legt den Wert der esist-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setESIST(XMLGregorianCalendar value) {
            this.esist = value;
        }

        /**
         * Ruft den Wert der biocid-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBIOCID() {
            return biocid;
        }

        /**
         * Legt den Wert der biocid-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBIOCID(Boolean value) {
            this.biocid = value;
        }

        /**
         * Ruft den Wert der bagno-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBAGNO() {
            return bagno;
        }

        /**
         * Legt den Wert der bagno-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBAGNO(String value) {
            this.bagno = value;
        }

        /**
         * Ruft den Wert der light-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLIGHT() {
            return light;
        }

        /**
         * Legt den Wert der light-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLIGHT(Boolean value) {
            this.light = value;
        }

        /**
         * Ruft den Wert der bagdossier-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBAGDOSSIER() {
            return bagdossier;
        }

        /**
         * Legt den Wert der bagdossier-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBAGDOSSIER(Integer value) {
            this.bagdossier = value;
        }

        /**
         * Ruft den Wert der tradeable-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRADEABLE() {
            return tradeable;
        }

        /**
         * Legt den Wert der tradeable-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRADEABLE(String value) {
            this.tradeable = value;
        }

        /**
         * Ruft den Wert der weight-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getWEIGHT() {
            return weight;
        }

        /**
         * Legt den Wert der weight-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setWEIGHT(Double value) {
            this.weight = value;
        }

        /**
         * Ruft den Wert der coldchain-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCOLDCHAIN() {
            return coldchain;
        }

        /**
         * Legt den Wert der coldchain-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCOLDCHAIN(Boolean value) {
            this.coldchain = value;
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
         * Gets the value of the artcomp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artcomp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTCOMP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTCOMP }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTCOMP> getARTCOMP() {
            if (artcomp == null) {
                artcomp = new ArrayList<ARTICLE.ART.ARTCOMP>();
            }
            return this.artcomp;
        }

        /**
         * Gets the value of the artbar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artbar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTBAR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTBAR }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTBAR> getARTBAR() {
            if (artbar == null) {
                artbar = new ArrayList<ARTICLE.ART.ARTBAR>();
            }
            return this.artbar;
        }

        /**
         * Gets the value of the artch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTCH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTCH }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTCH> getARTCH() {
            if (artch == null) {
                artch = new ArrayList<ARTICLE.ART.ARTCH>();
            }
            return this.artch;
        }

        /**
         * Gets the value of the artpri property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artpri property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTPRI().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTPRI }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTPRI> getARTPRI() {
            if (artpri == null) {
                artpri = new ArrayList<ARTICLE.ART.ARTPRI>();
            }
            return this.artpri;
        }

        /**
         * Gets the value of the artmig property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artmig property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTMIG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTMIG }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTMIG> getARTMIG() {
            if (artmig == null) {
                artmig = new ArrayList<ARTICLE.ART.ARTMIG>();
            }
            return this.artmig;
        }

        /**
         * Gets the value of the artdan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artdan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTDAN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTDAN }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTDAN> getARTDAN() {
            if (artdan == null) {
                artdan = new ArrayList<ARTICLE.ART.ARTDAN>();
            }
            return this.artdan;
        }

        /**
         * Gets the value of the artlim property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artlim property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTLIM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTLIM }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTLIM> getARTLIM() {
            if (artlim == null) {
                artlim = new ArrayList<ARTICLE.ART.ARTLIM>();
            }
            return this.artlim;
        }

        /**
         * Gets the value of the artins property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artins property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTINS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTINS }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTINS> getARTINS() {
            if (artins == null) {
                artins = new ArrayList<ARTICLE.ART.ARTINS>();
            }
            return this.artins;
        }

        /**
         * Gets the value of the artadr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artadr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getARTADR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.ARTADR }
         * 
         * 
         */
        public List<ARTICLE.ART.ARTADR> getARTADR() {
            if (artadr == null) {
                artadr = new ArrayList<ARTICLE.ART.ARTADR>();
            }
            return this.artadr;
        }

        /**
         * Ruft den Wert der size-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ARTICLE.ART.SIZE }
         *     
         */
        public ARTICLE.ART.SIZE getSIZE() {
            return size;
        }

        /**
         * Legt den Wert der size-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ARTICLE.ART.SIZE }
         *     
         */
        public void setSIZE(ARTICLE.ART.SIZE value) {
            this.size = value;
        }

        /**
         * Gets the value of the pic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPIC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ARTICLE.ART.PIC }
         * 
         * 
         */
        public List<ARTICLE.ART.PIC> getPIC() {
            if (pic == null) {
                pic = new ArrayList<ARTICLE.ART.PIC>();
            }
            return this.pic;
        }

        /**
         * Ruft den Wert der sds-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ARTICLE.ART.SDS }
         *     
         */
        public ARTICLE.ART.SDS getSDS() {
            return sds;
        }

        /**
         * Legt den Wert der sds-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ARTICLE.ART.SDS }
         *     
         */
        public void setSDS(ARTICLE.ART.SDS value) {
            this.sds = value;
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
         *         &lt;element name="ADRVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ENVHAZARD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="NETQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="NETQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UNREC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADRPACKAGE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "adrval",
            "envhazard",
            "netqty",
            "netqtyu",
            "unrec",
            "adrpackage"
        })
        public static class ARTADR {

            @XmlElement(name = "ADRVAL")
            protected String adrval;
            @XmlElement(name = "ENVHAZARD")
            protected Boolean envhazard;
            @XmlElement(name = "NETQTY")
            protected Double netqty;
            @XmlElement(name = "NETQTYU")
            protected String netqtyu;
            @XmlElement(name = "UNREC")
            protected String unrec;
            @XmlElement(name = "ADRPACKAGE")
            protected Integer adrpackage;

            /**
             * Ruft den Wert der adrval-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADRVAL() {
                return adrval;
            }

            /**
             * Legt den Wert der adrval-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADRVAL(String value) {
                this.adrval = value;
            }

            /**
             * Ruft den Wert der envhazard-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isENVHAZARD() {
                return envhazard;
            }

            /**
             * Legt den Wert der envhazard-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setENVHAZARD(Boolean value) {
                this.envhazard = value;
            }

            /**
             * Ruft den Wert der netqty-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getNETQTY() {
                return netqty;
            }

            /**
             * Legt den Wert der netqty-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setNETQTY(Double value) {
                this.netqty = value;
            }

            /**
             * Ruft den Wert der netqtyu-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNETQTYU() {
                return netqtyu;
            }

            /**
             * Legt den Wert der netqtyu-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNETQTYU(String value) {
                this.netqtyu = value;
            }

            /**
             * Ruft den Wert der unrec-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUNREC() {
                return unrec;
            }

            /**
             * Legt den Wert der unrec-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUNREC(String value) {
                this.unrec = value;
            }

            /**
             * Ruft den Wert der adrpackage-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getADRPACKAGE() {
                return adrpackage;
            }

            /**
             * Legt den Wert der adrpackage-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setADRPACKAGE(Integer value) {
                this.adrpackage = value;
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
         *         &lt;element name="CDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BCSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PHAR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "cdtyp",
            "bc",
            "bcstat",
            "phar2"
        })
        public static class ARTBAR {

            @XmlElement(name = "CDTYP")
            protected String cdtyp;
            @XmlElement(name = "BC")
            protected String bc;
            @XmlElement(name = "BCSTAT")
            protected String bcstat;
            @XmlElement(name = "PHAR2")
            protected String phar2;

            /**
             * Ruft den Wert der cdtyp-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCDTYP() {
                return cdtyp;
            }

            /**
             * Legt den Wert der cdtyp-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCDTYP(String value) {
                this.cdtyp = value;
            }

            /**
             * Ruft den Wert der bc-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBC() {
                return bc;
            }

            /**
             * Legt den Wert der bc-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBC(String value) {
                this.bc = value;
            }

            /**
             * Ruft den Wert der bcstat-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBCSTAT() {
                return bcstat;
            }

            /**
             * Legt den Wert der bcstat-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBCSTAT(String value) {
                this.bcstat = value;
            }

            /**
             * Ruft den Wert der phar2-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPHAR2() {
                return phar2;
            }

            /**
             * Legt den Wert der phar2-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPHAR2(String value) {
                this.phar2 = value;
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
         *         &lt;element name="PHAR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="NOUNITS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
            "phar2",
            "chtype",
            "lineno",
            "nounits"
        })
        public static class ARTCH {

            @XmlElement(name = "PHAR2")
            protected String phar2;
            @XmlElement(name = "CHTYPE")
            protected String chtype;
            @XmlElement(name = "LINENO")
            protected int lineno;
            @XmlElement(name = "NOUNITS")
            protected Double nounits;

            /**
             * Ruft den Wert der phar2-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPHAR2() {
                return phar2;
            }

            /**
             * Legt den Wert der phar2-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPHAR2(String value) {
                this.phar2 = value;
            }

            /**
             * Ruft den Wert der chtype-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHTYPE() {
                return chtype;
            }

            /**
             * Legt den Wert der chtype-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHTYPE(String value) {
                this.chtype = value;
            }

            /**
             * Ruft den Wert der lineno-Eigenschaft ab.
             * 
             */
            public int getLINENO() {
                return lineno;
            }

            /**
             * Legt den Wert der lineno-Eigenschaft fest.
             * 
             */
            public void setLINENO(int value) {
                this.lineno = value;
            }

            /**
             * Ruft den Wert der nounits-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getNOUNITS() {
                return nounits;
            }

            /**
             * Legt den Wert der nounits-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setNOUNITS(Double value) {
                this.nounits = value;
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
         *         &lt;element name="COMPNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ARTNO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ARTNO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ARTNO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "compno",
            "role",
            "artno1",
            "artno2",
            "artno3"
        })
        public static class ARTCOMP {

            @XmlElement(name = "COMPNO")
            protected int compno;
            @XmlElement(name = "ROLE")
            protected String role;
            @XmlElement(name = "ARTNO1")
            protected String artno1;
            @XmlElement(name = "ARTNO2")
            protected String artno2;
            @XmlElement(name = "ARTNO3")
            protected String artno3;

            /**
             * Ruft den Wert der compno-Eigenschaft ab.
             * 
             */
            public int getCOMPNO() {
                return compno;
            }

            /**
             * Legt den Wert der compno-Eigenschaft fest.
             * 
             */
            public void setCOMPNO(int value) {
                this.compno = value;
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
             * Ruft den Wert der artno1-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getARTNO1() {
                return artno1;
            }

            /**
             * Legt den Wert der artno1-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setARTNO1(String value) {
                this.artno1 = value;
            }

            /**
             * Ruft den Wert der artno2-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getARTNO2() {
                return artno2;
            }

            /**
             * Legt den Wert der artno2-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setARTNO2(String value) {
                this.artno2 = value;
            }

            /**
             * Ruft den Wert der artno3-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getARTNO3() {
                return artno3;
            }

            /**
             * Legt den Wert der artno3-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setARTNO3(String value) {
                this.artno3 = value;
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
         *         &lt;element name="CDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "cdtyp",
            "lineno",
            "cdval"
        })
        public static class ARTDAN {

            @XmlElement(name = "CDTYP")
            protected String cdtyp;
            @XmlElement(name = "LINENO")
            protected int lineno;
            @XmlElement(name = "CDVAL")
            protected String cdval;

            /**
             * Ruft den Wert der cdtyp-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCDTYP() {
                return cdtyp;
            }

            /**
             * Legt den Wert der cdtyp-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCDTYP(String value) {
                this.cdtyp = value;
            }

            /**
             * Ruft den Wert der lineno-Eigenschaft ab.
             * 
             */
            public int getLINENO() {
                return lineno;
            }

            /**
             * Legt den Wert der lineno-Eigenschaft fest.
             * 
             */
            public void setLINENO(int value) {
                this.lineno = value;
            }

            /**
             * Ruft den Wert der cdval-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCDVAL() {
                return cdval;
            }

            /**
             * Legt den Wert der cdval-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCDVAL(String value) {
                this.cdval = value;
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
         *         &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="INCD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="NINCD" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "vdat",
            "incd",
            "nincd"
        })
        public static class ARTINS {

            @XmlElement(name = "VDAT", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar vdat;
            @XmlElement(name = "INCD")
            protected Integer incd;
            @XmlElement(name = "NINCD")
            protected int nincd;

            /**
             * Ruft den Wert der vdat-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVDAT() {
                return vdat;
            }

            /**
             * Legt den Wert der vdat-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVDAT(XMLGregorianCalendar value) {
                this.vdat = value;
            }

            /**
             * Ruft den Wert der incd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getINCD() {
                return incd;
            }

            /**
             * Legt den Wert der incd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setINCD(Integer value) {
                this.incd = value;
            }

            /**
             * Ruft den Wert der nincd-Eigenschaft ab.
             * 
             */
            public int getNINCD() {
                return nincd;
            }

            /**
             * Legt den Wert der nincd-Eigenschaft fest.
             * 
             */
            public void setNINCD(int value) {
                this.nincd = value;
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
         *         &lt;element name="LIMCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "limcd"
        })
        public static class ARTLIM {

            @XmlElement(name = "LIMCD")
            protected String limcd;

            /**
             * Ruft den Wert der limcd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIMCD() {
                return limcd;
            }

            /**
             * Legt den Wert der limcd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIMCD(String value) {
                this.limcd = value;
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
         *         &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="MIGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LINENO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MIGPRI" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="VDATPRI" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "vdat",
            "migcd",
            "lineno",
            "ptyp",
            "migpri",
            "vdatpri"
        })
        public static class ARTMIG {

            @XmlElement(name = "VDAT", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar vdat;
            @XmlElement(name = "MIGCD")
            protected String migcd;
            @XmlElement(name = "LINENO")
            protected int lineno;
            @XmlElement(name = "PTYP")
            protected String ptyp;
            @XmlElement(name = "MIGPRI")
            protected Double migpri;
            @XmlElement(name = "VDATPRI")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar vdatpri;

            /**
             * Ruft den Wert der vdat-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVDAT() {
                return vdat;
            }

            /**
             * Legt den Wert der vdat-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVDAT(XMLGregorianCalendar value) {
                this.vdat = value;
            }

            /**
             * Ruft den Wert der migcd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMIGCD() {
                return migcd;
            }

            /**
             * Legt den Wert der migcd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMIGCD(String value) {
                this.migcd = value;
            }

            /**
             * Ruft den Wert der lineno-Eigenschaft ab.
             * 
             */
            public int getLINENO() {
                return lineno;
            }

            /**
             * Legt den Wert der lineno-Eigenschaft fest.
             * 
             */
            public void setLINENO(int value) {
                this.lineno = value;
            }

            /**
             * Ruft den Wert der ptyp-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPTYP() {
                return ptyp;
            }

            /**
             * Legt den Wert der ptyp-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPTYP(String value) {
                this.ptyp = value;
            }

            /**
             * Ruft den Wert der migpri-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMIGPRI() {
                return migpri;
            }

            /**
             * Legt den Wert der migpri-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMIGPRI(Double value) {
                this.migpri = value;
            }

            /**
             * Ruft den Wert der vdatpri-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVDATPRI() {
                return vdatpri;
            }

            /**
             * Legt den Wert der vdatpri-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVDATPRI(XMLGregorianCalendar value) {
                this.vdatpri = value;
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
         *         &lt;element name="VDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
            "vdat",
            "ptyp",
            "price"
        })
        public static class ARTPRI {

            @XmlElement(name = "VDAT", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar vdat;
            @XmlElement(name = "PTYP")
            protected String ptyp;
            @XmlElement(name = "PRICE")
            protected double price;

            /**
             * Ruft den Wert der vdat-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVDAT() {
                return vdat;
            }

            /**
             * Legt den Wert der vdat-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVDAT(XMLGregorianCalendar value) {
                this.vdat = value;
            }

            /**
             * Ruft den Wert der ptyp-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPTYP() {
                return ptyp;
            }

            /**
             * Legt den Wert der ptyp-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPTYP(String value) {
                this.ptyp = value;
            }

            /**
             * Ruft den Wert der price-Eigenschaft ab.
             * 
             */
            public double getPRICE() {
                return price;
            }

            /**
             * Legt den Wert der price-Eigenschaft fest.
             * 
             */
            public void setPRICE(double value) {
                this.price = value;
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
         *         &lt;element name="PTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "ptyp",
            "pdat"
        })
        public static class PIC {

            @XmlElement(name = "PTYP")
            protected String ptyp;
            @XmlElement(name = "PDAT")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar pdat;

            /**
             * Ruft den Wert der ptyp-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPTYP() {
                return ptyp;
            }

            /**
             * Legt den Wert der ptyp-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPTYP(String value) {
                this.ptyp = value;
            }

            /**
             * Ruft den Wert der pdat-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPDAT() {
                return pdat;
            }

            /**
             * Legt den Wert der pdat-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPDAT(XMLGregorianCalendar value) {
                this.pdat = value;
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
         *         &lt;element name="DE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="FR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="IT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="EN" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "de",
            "fr",
            "it",
            "en"
        })
        public static class SDS {

            @XmlElement(name = "DE")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar de;
            @XmlElement(name = "FR")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar fr;
            @XmlElement(name = "IT")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar it;
            @XmlElement(name = "EN")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar en;

            /**
             * Ruft den Wert der de-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDE() {
                return de;
            }

            /**
             * Legt den Wert der de-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDE(XMLGregorianCalendar value) {
                this.de = value;
            }

            /**
             * Ruft den Wert der fr-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFR() {
                return fr;
            }

            /**
             * Legt den Wert der fr-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFR(XMLGregorianCalendar value) {
                this.fr = value;
            }

            /**
             * Ruft den Wert der it-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getIT() {
                return it;
            }

            /**
             * Legt den Wert der it-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setIT(XMLGregorianCalendar value) {
                this.it = value;
            }

            /**
             * Ruft den Wert der en-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEN() {
                return en;
            }

            /**
             * Legt den Wert der en-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEN(XMLGregorianCalendar value) {
                this.en = value;
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
         *         &lt;element name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DEPTH" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
            "width",
            "height",
            "depth"
        })
        public static class SIZE {

            @XmlElement(name = "WIDTH")
            protected Double width;
            @XmlElement(name = "HEIGHT")
            protected Double height;
            @XmlElement(name = "DEPTH")
            protected Double depth;

            /**
             * Ruft den Wert der width-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWIDTH() {
                return width;
            }

            /**
             * Legt den Wert der width-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setWIDTH(Double value) {
                this.width = value;
            }

            /**
             * Ruft den Wert der height-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getHEIGHT() {
                return height;
            }

            /**
             * Legt den Wert der height-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setHEIGHT(Double value) {
                this.height = value;
            }

            /**
             * Ruft den Wert der depth-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getDEPTH() {
                return depth;
            }

            /**
             * Legt den Wert der depth-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setDEPTH(Double value) {
                this.depth = value;
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
