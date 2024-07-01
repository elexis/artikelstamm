
package ch.hcisolutions.index;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfCDSCDSPRDCHECK complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCDSCDSPRDCHECK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHECK" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CHECKTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ArrayOfCDSCDSPRDCHECK", propOrder = {
    "check"
})
public class ArrayOfCDSCDSPRDCHECK {

    @XmlElement(name = "CHECK")
    protected List<ArrayOfCDSCDSPRDCHECK.CHECK> check;

    /**
     * Gets the value of the check property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the check property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCHECK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCDSCDSPRDCHECK.CHECK }
     * 
     * 
     */
    public List<ArrayOfCDSCDSPRDCHECK.CHECK> getCHECK() {
        if (check == null) {
            check = new ArrayList<ArrayOfCDSCDSPRDCHECK.CHECK>();
        }
        return this.check;
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
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "checktype",
        "status"
    })
    public static class CHECK {

        @XmlElement(name = "CHECKTYPE")
        protected String checktype;
        @XmlElement(name = "STATUS")
        protected int status;

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

        /**
         * Ruft den Wert der status-Eigenschaft ab.
         * 
         */
        public int getSTATUS() {
            return status;
        }

        /**
         * Legt den Wert der status-Eigenschaft fest.
         * 
         */
        public void setSTATUS(int value) {
            this.status = value;
        }

    }

}
