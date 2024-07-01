
package ch.hcisolutions.index;

import java.math.BigDecimal;
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
 *         &lt;element name="PRD" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="DSCRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BNAMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BNAMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BNAMLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BNAMLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADNAMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADNAMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADNAMLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADNAMLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADINFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADINFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADINFLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ADINFLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRSWISSMEDICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DSCRSWISSMEDICF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GENCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GENGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ATC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ITBAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="KONO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="TRADE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CDBRAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CDBRANDSUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRTNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="PRTNO2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="MONO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CDGALD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CDGALF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FORMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FORMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DOSE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="DOSEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DRGFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DRGFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ORPH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="BIOPHA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="BIOSIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BFS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="BLOOD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="MSCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRDIXREL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CDS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="SYND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SYNF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="KP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BFSDATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DRGPRICEY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="QAP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="BFSDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="BFSCDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="DRGPRICEYDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="DRGPRICEYCDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="MDCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MDNB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CDSMODULES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SMNR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="SMSTRENGTHNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SMCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STREHA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="STREHADAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="STREHACDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="STREHAPRICEY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="STREHAPRICEYDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="STREHAPRICEYCDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="EXPORTONLY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="LTC_ASC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="TRE" type="{http://www.hcisolutions.ch/index}ArrayOfString1" minOccurs="0"/>
 *                   &lt;element name="SMNAS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="KIDO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="AAP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="GMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MDATTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PPLUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="CPT" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CNAMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CNAMEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GENGRPCPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IDXIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DDDD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="DDDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IDXIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IXREL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="GALF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EDQMPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DRGGRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRDGRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRBSUIT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="CSOLV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="SOLVQ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="SOLVQU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PHVAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="LSPNSOL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="APDURSOL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="EXCIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EXCIPQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EXCIPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EXCIPCF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="PQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STDPRESCU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SIZEMM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="LOOKD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LOOKF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IMG2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="CPTCMP" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="QTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="WHK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREFIX_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREFIX_FR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SUFFIX_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SUFFIX_FR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CPTIX" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IXNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="GRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="RLV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CPTROA" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SYSLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ROA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EDQMROAS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="EDQMROA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="EDQMMOA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="PRDICD" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RSIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GSASA" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ISCRUSHABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="CRUSHABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CRUSHABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ISSUSPENDABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="SUSPENDABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SUSPENDABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ALTERNATIVESD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ALTERNATIVESF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EVIDENCELEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="REFERENCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CAPSISOPENABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="CAPSOPENABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CAPSOPENABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CAPSOPENABLEREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CAPSOPENABLEEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="LIQDURABILITYD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LIQDURABILITYF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LIQDURABILITYREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LIQDURABILITYEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DIVGSASA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="DIVGSASAREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DIVGSASAEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DIETARYADVICE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DIETTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "prd",
    "result"
})
@XmlRootElement(name = "PRODUCT")
public class PRODUCT {

    @XmlElement(name = "PRD")
    protected List<PRODUCT.PRD> prd;
    @XmlElement(name = "RESULT")
    protected PRODUCT.RESULT result;
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
     * Gets the value of the prd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRODUCT.PRD }
     * 
     * 
     */
    public List<PRODUCT.PRD> getPRD() {
        if (prd == null) {
            prd = new ArrayList<PRODUCT.PRD>();
        }
        return this.prd;
    }

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCT.RESULT }
     *     
     */
    public PRODUCT.RESULT getRESULT() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCT.RESULT }
     *     
     */
    public void setRESULT(PRODUCT.RESULT value) {
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
     *         &lt;element name="PRDNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="DSCRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BNAMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BNAMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BNAMLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BNAMLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADNAMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADNAMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADNAMLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADNAMLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADINFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADINFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADINFLONGD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ADINFLONGF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRSWISSMEDICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DSCRSWISSMEDICF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GENCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GENGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ATC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ITBAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="KONO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="TRADE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CDBRAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CDBRANDSUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRTNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="PRTNO2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="MONO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CDGALD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CDGALF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FORMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FORMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DOSE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="DOSEU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DRGFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DRGFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ORPH" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="BIOPHA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="BIOSIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BFS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="BLOOD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="MSCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRDIXREL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CDS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="SYND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SYNF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="KP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BFSDATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DRGPRICEY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="QAP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="BFSDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="BFSCDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="DRGPRICEYDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="DRGPRICEYCDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="MDCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MDNB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CDSMODULES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SMNR" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="SMSTRENGTHNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SMCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STREHA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="STREHADAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="STREHACDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="STREHAPRICEY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="STREHAPRICEYDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="STREHAPRICEYCDAT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="EXPORTONLY" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="LTC_ASC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="TRE" type="{http://www.hcisolutions.ch/index}ArrayOfString1" minOccurs="0"/>
     *         &lt;element name="SMNAS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="KIDO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="AAP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="GMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MDATTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PPLUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DEL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="CPT" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CNAMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CNAMEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GENGRPCPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IDXIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DDDD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="DDDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IDXIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IXREL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="GALF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EDQMPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DRGGRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRDGRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRBSUIT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="CSOLV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="SOLVQ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="SOLVQU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PHVAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="LSPNSOL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="APDURSOL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="EXCIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EXCIPQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EXCIPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EXCIPCF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="PQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STDPRESCU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SIZEMM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="LOOKD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LOOKF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IMG2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="CPTCMP" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="QTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WHK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREFIX_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREFIX_FR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SUFFIX_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SUFFIX_FR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CPTIX" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IXNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="GRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="RLV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CPTROA" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SYSLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ROA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="EDQMROAS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="EDQMROA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EDQMMOA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="PRDICD" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RSIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GSASA" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ISCRUSHABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="CRUSHABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CRUSHABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ISSUSPENDABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="SUSPENDABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SUSPENDABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ALTERNATIVESD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ALTERNATIVESF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EVIDENCELEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="REFERENCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CAPSISOPENABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="CAPSOPENABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CAPSOPENABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CAPSOPENABLEREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CAPSOPENABLEEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="LIQDURABILITYD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LIQDURABILITYF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LIQDURABILITYREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LIQDURABILITYEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DIVGSASA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="DIVGSASAREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DIVGSASAEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DIETARYADVICE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DIETTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "prdno",
        "dscrd",
        "dscrf",
        "dscrlongd",
        "dscrlongf",
        "bnamd",
        "bnamf",
        "bnamlongd",
        "bnamlongf",
        "adnamd",
        "adnamf",
        "adnamlongd",
        "adnamlongf",
        "size",
        "adinfd",
        "adinff",
        "adinflongd",
        "adinflongf",
        "dscrswissmedicd",
        "dscrswissmedicf",
        "gencd",
        "gengrp",
        "atc",
        "it",
        "itbag",
        "kono",
        "trade",
        "cdbrand",
        "cdbrandsub",
        "prtno",
        "prtno2",
        "mono",
        "cdgald",
        "cdgalf",
        "formd",
        "formf",
        "dose",
        "doseu",
        "drgfd",
        "drgff",
        "orph",
        "biopha",
        "biosim",
        "bfs",
        "blood",
        "mscd",
        "prdixrel",
        "cds",
        "synd",
        "synf",
        "kp",
        "bfsdata",
        "drgpricey",
        "qap",
        "bfsdat",
        "bfscdat",
        "drgpriceydat",
        "drgpriceycdat",
        "mdclass",
        "mdnb",
        "cdsmodules",
        "smnr",
        "smstrengthnr",
        "smcat",
        "streha",
        "strehadat",
        "strehacdat",
        "strehapricey",
        "strehapriceydat",
        "strehapriceycdat",
        "exportonly",
        "ltcasc",
        "tre",
        "smnas",
        "kido",
        "aap",
        "gmn",
        "mdattr",
        "pplus",
        "ufi",
        "del",
        "cpt",
        "prdicd",
        "gsasa",
        "dietaryadvice"
    })
    public static class PRD {

        @XmlElement(name = "PRDNO")
        protected int prdno;
        @XmlElement(name = "DSCRD")
        protected String dscrd;
        @XmlElement(name = "DSCRF")
        protected String dscrf;
        @XmlElement(name = "DSCRLONGD")
        protected String dscrlongd;
        @XmlElement(name = "DSCRLONGF")
        protected String dscrlongf;
        @XmlElement(name = "BNAMD")
        protected String bnamd;
        @XmlElement(name = "BNAMF")
        protected String bnamf;
        @XmlElement(name = "BNAMLONGD")
        protected String bnamlongd;
        @XmlElement(name = "BNAMLONGF")
        protected String bnamlongf;
        @XmlElement(name = "ADNAMD")
        protected String adnamd;
        @XmlElement(name = "ADNAMF")
        protected String adnamf;
        @XmlElement(name = "ADNAMLONGD")
        protected String adnamlongd;
        @XmlElement(name = "ADNAMLONGF")
        protected String adnamlongf;
        @XmlElement(name = "SIZE")
        protected String size;
        @XmlElement(name = "ADINFD")
        protected String adinfd;
        @XmlElement(name = "ADINFF")
        protected String adinff;
        @XmlElement(name = "ADINFLONGD")
        protected String adinflongd;
        @XmlElement(name = "ADINFLONGF")
        protected String adinflongf;
        @XmlElement(name = "DSCRSWISSMEDICD")
        protected String dscrswissmedicd;
        @XmlElement(name = "DSCRSWISSMEDICF")
        protected String dscrswissmedicf;
        @XmlElement(name = "GENCD")
        protected String gencd;
        @XmlElement(name = "GENGRP", defaultValue = "")
        protected String gengrp;
        @XmlElement(name = "ATC")
        protected String atc;
        @XmlElement(name = "IT")
        protected String it;
        @XmlElement(name = "ITBAG")
        protected String itbag;
        @XmlElement(name = "KONO")
        protected Integer kono;
        @XmlElement(name = "TRADE")
        protected String trade;
        @XmlElement(name = "CDBRAND")
        protected String cdbrand;
        @XmlElement(name = "CDBRANDSUB")
        protected String cdbrandsub;
        @XmlElement(name = "PRTNO")
        protected Integer prtno;
        @XmlElement(name = "PRTNO2")
        protected Integer prtno2;
        @XmlElement(name = "MONO")
        protected Integer mono;
        @XmlElement(name = "CDGALD")
        protected String cdgald;
        @XmlElement(name = "CDGALF")
        protected String cdgalf;
        @XmlElement(name = "FORMD")
        protected String formd;
        @XmlElement(name = "FORMF")
        protected String formf;
        @XmlElement(name = "DOSE")
        protected Double dose;
        @XmlElement(name = "DOSEU")
        protected String doseu;
        @XmlElement(name = "DRGFD")
        protected String drgfd;
        @XmlElement(name = "DRGFF")
        protected String drgff;
        @XmlElement(name = "ORPH")
        protected Boolean orph;
        @XmlElement(name = "BIOPHA")
        protected Boolean biopha;
        @XmlElement(name = "BIOSIM")
        protected String biosim;
        @XmlElement(name = "BFS")
        protected Boolean bfs;
        @XmlElement(name = "BLOOD")
        protected Boolean blood;
        @XmlElement(name = "MSCD", defaultValue = "")
        protected String mscd;
        @XmlElement(name = "PRDIXREL")
        protected Integer prdixrel;
        @XmlElement(name = "CDS")
        protected Integer cds;
        @XmlElement(name = "SYND")
        protected String synd;
        @XmlElement(name = "SYNF")
        protected String synf;
        @XmlElement(name = "KP")
        protected String kp;
        @XmlElement(name = "BFSDATA")
        protected String bfsdata;
        @XmlElement(name = "DRGPRICEY")
        protected Boolean drgpricey;
        @XmlElement(name = "QAP")
        protected Integer qap;
        @XmlElement(name = "BFSDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar bfsdat;
        @XmlElement(name = "BFSCDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar bfscdat;
        @XmlElement(name = "DRGPRICEYDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar drgpriceydat;
        @XmlElement(name = "DRGPRICEYCDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar drgpriceycdat;
        @XmlElement(name = "MDCLASS")
        protected String mdclass;
        @XmlElement(name = "MDNB")
        protected String mdnb;
        @XmlElement(name = "CDSMODULES")
        protected String cdsmodules;
        @XmlElement(name = "SMNR")
        protected BigInteger smnr;
        @XmlElement(name = "SMSTRENGTHNR")
        protected String smstrengthnr;
        @XmlElement(name = "SMCAT")
        protected String smcat;
        @XmlElement(name = "STREHA")
        protected Boolean streha;
        @XmlElement(name = "STREHADAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar strehadat;
        @XmlElement(name = "STREHACDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar strehacdat;
        @XmlElement(name = "STREHAPRICEY")
        protected Boolean strehapricey;
        @XmlElement(name = "STREHAPRICEYDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar strehapriceydat;
        @XmlElement(name = "STREHAPRICEYCDAT")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar strehapriceycdat;
        @XmlElement(name = "EXPORTONLY")
        protected Boolean exportonly;
        @XmlElement(name = "LTC_ASC")
        protected Integer ltcasc;
        @XmlElement(name = "TRE")
        protected ArrayOfString1 tre;
        @XmlElement(name = "SMNAS")
        protected Boolean smnas;
        @XmlElement(name = "KIDO")
        protected Boolean kido;
        @XmlElement(name = "AAP")
        protected Boolean aap;
        @XmlElement(name = "GMN")
        protected String gmn;
        @XmlElement(name = "MDATTR")
        protected String mdattr;
        @XmlElement(name = "PPLUS")
        protected String pplus;
        @XmlElement(name = "UFI")
        protected String ufi;
        @XmlElement(name = "DEL")
        protected boolean del;
        @XmlElement(name = "CPT")
        protected List<PRODUCT.PRD.CPT> cpt;
        @XmlElement(name = "PRDICD")
        protected List<PRODUCT.PRD.PRDICD> prdicd;
        @XmlElement(name = "GSASA")
        protected PRODUCT.PRD.GSASA gsasa;
        @XmlElement(name = "DIETARYADVICE")
        protected List<PRODUCT.PRD.DIETARYADVICE> dietaryadvice;
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
         * Ruft den Wert der bnamd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBNAMD() {
            return bnamd;
        }

        /**
         * Legt den Wert der bnamd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBNAMD(String value) {
            this.bnamd = value;
        }

        /**
         * Ruft den Wert der bnamf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBNAMF() {
            return bnamf;
        }

        /**
         * Legt den Wert der bnamf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBNAMF(String value) {
            this.bnamf = value;
        }

        /**
         * Ruft den Wert der bnamlongd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBNAMLONGD() {
            return bnamlongd;
        }

        /**
         * Legt den Wert der bnamlongd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBNAMLONGD(String value) {
            this.bnamlongd = value;
        }

        /**
         * Ruft den Wert der bnamlongf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBNAMLONGF() {
            return bnamlongf;
        }

        /**
         * Legt den Wert der bnamlongf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBNAMLONGF(String value) {
            this.bnamlongf = value;
        }

        /**
         * Ruft den Wert der adnamd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADNAMD() {
            return adnamd;
        }

        /**
         * Legt den Wert der adnamd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADNAMD(String value) {
            this.adnamd = value;
        }

        /**
         * Ruft den Wert der adnamf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADNAMF() {
            return adnamf;
        }

        /**
         * Legt den Wert der adnamf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADNAMF(String value) {
            this.adnamf = value;
        }

        /**
         * Ruft den Wert der adnamlongd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADNAMLONGD() {
            return adnamlongd;
        }

        /**
         * Legt den Wert der adnamlongd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADNAMLONGD(String value) {
            this.adnamlongd = value;
        }

        /**
         * Ruft den Wert der adnamlongf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADNAMLONGF() {
            return adnamlongf;
        }

        /**
         * Legt den Wert der adnamlongf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADNAMLONGF(String value) {
            this.adnamlongf = value;
        }

        /**
         * Ruft den Wert der size-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIZE() {
            return size;
        }

        /**
         * Legt den Wert der size-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIZE(String value) {
            this.size = value;
        }

        /**
         * Ruft den Wert der adinfd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADINFD() {
            return adinfd;
        }

        /**
         * Legt den Wert der adinfd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADINFD(String value) {
            this.adinfd = value;
        }

        /**
         * Ruft den Wert der adinff-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADINFF() {
            return adinff;
        }

        /**
         * Legt den Wert der adinff-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADINFF(String value) {
            this.adinff = value;
        }

        /**
         * Ruft den Wert der adinflongd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADINFLONGD() {
            return adinflongd;
        }

        /**
         * Legt den Wert der adinflongd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADINFLONGD(String value) {
            this.adinflongd = value;
        }

        /**
         * Ruft den Wert der adinflongf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADINFLONGF() {
            return adinflongf;
        }

        /**
         * Legt den Wert der adinflongf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADINFLONGF(String value) {
            this.adinflongf = value;
        }

        /**
         * Ruft den Wert der dscrswissmedicd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDSCRSWISSMEDICD() {
            return dscrswissmedicd;
        }

        /**
         * Legt den Wert der dscrswissmedicd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDSCRSWISSMEDICD(String value) {
            this.dscrswissmedicd = value;
        }

        /**
         * Ruft den Wert der dscrswissmedicf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDSCRSWISSMEDICF() {
            return dscrswissmedicf;
        }

        /**
         * Legt den Wert der dscrswissmedicf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDSCRSWISSMEDICF(String value) {
            this.dscrswissmedicf = value;
        }

        /**
         * Ruft den Wert der gencd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENCD() {
            return gencd;
        }

        /**
         * Legt den Wert der gencd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENCD(String value) {
            this.gencd = value;
        }

        /**
         * Ruft den Wert der gengrp-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENGRP() {
            return gengrp;
        }

        /**
         * Legt den Wert der gengrp-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENGRP(String value) {
            this.gengrp = value;
        }

        /**
         * Ruft den Wert der atc-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getATC() {
            return atc;
        }

        /**
         * Legt den Wert der atc-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setATC(String value) {
            this.atc = value;
        }

        /**
         * Ruft den Wert der it-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIT() {
            return it;
        }

        /**
         * Legt den Wert der it-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIT(String value) {
            this.it = value;
        }

        /**
         * Ruft den Wert der itbag-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getITBAG() {
            return itbag;
        }

        /**
         * Legt den Wert der itbag-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setITBAG(String value) {
            this.itbag = value;
        }

        /**
         * Ruft den Wert der kono-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKONO() {
            return kono;
        }

        /**
         * Legt den Wert der kono-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKONO(Integer value) {
            this.kono = value;
        }

        /**
         * Ruft den Wert der trade-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRADE() {
            return trade;
        }

        /**
         * Legt den Wert der trade-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRADE(String value) {
            this.trade = value;
        }

        /**
         * Ruft den Wert der cdbrand-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDBRAND() {
            return cdbrand;
        }

        /**
         * Legt den Wert der cdbrand-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDBRAND(String value) {
            this.cdbrand = value;
        }

        /**
         * Ruft den Wert der cdbrandsub-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDBRANDSUB() {
            return cdbrandsub;
        }

        /**
         * Legt den Wert der cdbrandsub-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDBRANDSUB(String value) {
            this.cdbrandsub = value;
        }

        /**
         * Ruft den Wert der prtno-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPRTNO() {
            return prtno;
        }

        /**
         * Legt den Wert der prtno-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPRTNO(Integer value) {
            this.prtno = value;
        }

        /**
         * Ruft den Wert der prtno2-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPRTNO2() {
            return prtno2;
        }

        /**
         * Legt den Wert der prtno2-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPRTNO2(Integer value) {
            this.prtno2 = value;
        }

        /**
         * Ruft den Wert der mono-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMONO() {
            return mono;
        }

        /**
         * Legt den Wert der mono-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMONO(Integer value) {
            this.mono = value;
        }

        /**
         * Ruft den Wert der cdgald-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDGALD() {
            return cdgald;
        }

        /**
         * Legt den Wert der cdgald-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDGALD(String value) {
            this.cdgald = value;
        }

        /**
         * Ruft den Wert der cdgalf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDGALF() {
            return cdgalf;
        }

        /**
         * Legt den Wert der cdgalf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDGALF(String value) {
            this.cdgalf = value;
        }

        /**
         * Ruft den Wert der formd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFORMD() {
            return formd;
        }

        /**
         * Legt den Wert der formd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFORMD(String value) {
            this.formd = value;
        }

        /**
         * Ruft den Wert der formf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFORMF() {
            return formf;
        }

        /**
         * Legt den Wert der formf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFORMF(String value) {
            this.formf = value;
        }

        /**
         * Ruft den Wert der dose-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getDOSE() {
            return dose;
        }

        /**
         * Legt den Wert der dose-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setDOSE(Double value) {
            this.dose = value;
        }

        /**
         * Ruft den Wert der doseu-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOSEU() {
            return doseu;
        }

        /**
         * Legt den Wert der doseu-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOSEU(String value) {
            this.doseu = value;
        }

        /**
         * Ruft den Wert der drgfd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRGFD() {
            return drgfd;
        }

        /**
         * Legt den Wert der drgfd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRGFD(String value) {
            this.drgfd = value;
        }

        /**
         * Ruft den Wert der drgff-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRGFF() {
            return drgff;
        }

        /**
         * Legt den Wert der drgff-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRGFF(String value) {
            this.drgff = value;
        }

        /**
         * Ruft den Wert der orph-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isORPH() {
            return orph;
        }

        /**
         * Legt den Wert der orph-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setORPH(Boolean value) {
            this.orph = value;
        }

        /**
         * Ruft den Wert der biopha-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBIOPHA() {
            return biopha;
        }

        /**
         * Legt den Wert der biopha-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBIOPHA(Boolean value) {
            this.biopha = value;
        }

        /**
         * Ruft den Wert der biosim-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBIOSIM() {
            return biosim;
        }

        /**
         * Legt den Wert der biosim-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBIOSIM(String value) {
            this.biosim = value;
        }

        /**
         * Ruft den Wert der bfs-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBFS() {
            return bfs;
        }

        /**
         * Legt den Wert der bfs-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBFS(Boolean value) {
            this.bfs = value;
        }

        /**
         * Ruft den Wert der blood-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBLOOD() {
            return blood;
        }

        /**
         * Legt den Wert der blood-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBLOOD(Boolean value) {
            this.blood = value;
        }

        /**
         * Ruft den Wert der mscd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMSCD() {
            return mscd;
        }

        /**
         * Legt den Wert der mscd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMSCD(String value) {
            this.mscd = value;
        }

        /**
         * Ruft den Wert der prdixrel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPRDIXREL() {
            return prdixrel;
        }

        /**
         * Legt den Wert der prdixrel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPRDIXREL(Integer value) {
            this.prdixrel = value;
        }

        /**
         * Ruft den Wert der cds-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCDS() {
            return cds;
        }

        /**
         * Legt den Wert der cds-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCDS(Integer value) {
            this.cds = value;
        }

        /**
         * Ruft den Wert der synd-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSYND() {
            return synd;
        }

        /**
         * Legt den Wert der synd-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSYND(String value) {
            this.synd = value;
        }

        /**
         * Ruft den Wert der synf-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSYNF() {
            return synf;
        }

        /**
         * Legt den Wert der synf-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSYNF(String value) {
            this.synf = value;
        }

        /**
         * Ruft den Wert der kp-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKP() {
            return kp;
        }

        /**
         * Legt den Wert der kp-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKP(String value) {
            this.kp = value;
        }

        /**
         * Ruft den Wert der bfsdata-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBFSDATA() {
            return bfsdata;
        }

        /**
         * Legt den Wert der bfsdata-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBFSDATA(String value) {
            this.bfsdata = value;
        }

        /**
         * Ruft den Wert der drgpricey-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDRGPRICEY() {
            return drgpricey;
        }

        /**
         * Legt den Wert der drgpricey-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDRGPRICEY(Boolean value) {
            this.drgpricey = value;
        }

        /**
         * Ruft den Wert der qap-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQAP() {
            return qap;
        }

        /**
         * Legt den Wert der qap-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQAP(Integer value) {
            this.qap = value;
        }

        /**
         * Ruft den Wert der bfsdat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBFSDAT() {
            return bfsdat;
        }

        /**
         * Legt den Wert der bfsdat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBFSDAT(XMLGregorianCalendar value) {
            this.bfsdat = value;
        }

        /**
         * Ruft den Wert der bfscdat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBFSCDAT() {
            return bfscdat;
        }

        /**
         * Legt den Wert der bfscdat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBFSCDAT(XMLGregorianCalendar value) {
            this.bfscdat = value;
        }

        /**
         * Ruft den Wert der drgpriceydat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDRGPRICEYDAT() {
            return drgpriceydat;
        }

        /**
         * Legt den Wert der drgpriceydat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDRGPRICEYDAT(XMLGregorianCalendar value) {
            this.drgpriceydat = value;
        }

        /**
         * Ruft den Wert der drgpriceycdat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDRGPRICEYCDAT() {
            return drgpriceycdat;
        }

        /**
         * Legt den Wert der drgpriceycdat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDRGPRICEYCDAT(XMLGregorianCalendar value) {
            this.drgpriceycdat = value;
        }

        /**
         * Ruft den Wert der mdclass-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDCLASS() {
            return mdclass;
        }

        /**
         * Legt den Wert der mdclass-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDCLASS(String value) {
            this.mdclass = value;
        }

        /**
         * Ruft den Wert der mdnb-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDNB() {
            return mdnb;
        }

        /**
         * Legt den Wert der mdnb-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDNB(String value) {
            this.mdnb = value;
        }

        /**
         * Ruft den Wert der cdsmodules-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDSMODULES() {
            return cdsmodules;
        }

        /**
         * Legt den Wert der cdsmodules-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDSMODULES(String value) {
            this.cdsmodules = value;
        }

        /**
         * Ruft den Wert der smnr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSMNR() {
            return smnr;
        }

        /**
         * Legt den Wert der smnr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSMNR(BigInteger value) {
            this.smnr = value;
        }

        /**
         * Ruft den Wert der smstrengthnr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSMSTRENGTHNR() {
            return smstrengthnr;
        }

        /**
         * Legt den Wert der smstrengthnr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSMSTRENGTHNR(String value) {
            this.smstrengthnr = value;
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
         * Ruft den Wert der streha-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSTREHA() {
            return streha;
        }

        /**
         * Legt den Wert der streha-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSTREHA(Boolean value) {
            this.streha = value;
        }

        /**
         * Ruft den Wert der strehadat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTREHADAT() {
            return strehadat;
        }

        /**
         * Legt den Wert der strehadat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTREHADAT(XMLGregorianCalendar value) {
            this.strehadat = value;
        }

        /**
         * Ruft den Wert der strehacdat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTREHACDAT() {
            return strehacdat;
        }

        /**
         * Legt den Wert der strehacdat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTREHACDAT(XMLGregorianCalendar value) {
            this.strehacdat = value;
        }

        /**
         * Ruft den Wert der strehapricey-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSTREHAPRICEY() {
            return strehapricey;
        }

        /**
         * Legt den Wert der strehapricey-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSTREHAPRICEY(Boolean value) {
            this.strehapricey = value;
        }

        /**
         * Ruft den Wert der strehapriceydat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTREHAPRICEYDAT() {
            return strehapriceydat;
        }

        /**
         * Legt den Wert der strehapriceydat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTREHAPRICEYDAT(XMLGregorianCalendar value) {
            this.strehapriceydat = value;
        }

        /**
         * Ruft den Wert der strehapriceycdat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTREHAPRICEYCDAT() {
            return strehapriceycdat;
        }

        /**
         * Legt den Wert der strehapriceycdat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTREHAPRICEYCDAT(XMLGregorianCalendar value) {
            this.strehapriceycdat = value;
        }

        /**
         * Ruft den Wert der exportonly-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEXPORTONLY() {
            return exportonly;
        }

        /**
         * Legt den Wert der exportonly-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEXPORTONLY(Boolean value) {
            this.exportonly = value;
        }

        /**
         * Ruft den Wert der ltcasc-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLTCASC() {
            return ltcasc;
        }

        /**
         * Legt den Wert der ltcasc-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLTCASC(Integer value) {
            this.ltcasc = value;
        }

        /**
         * Ruft den Wert der tre-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfString1 }
         *     
         */
        public ArrayOfString1 getTRE() {
            return tre;
        }

        /**
         * Legt den Wert der tre-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfString1 }
         *     
         */
        public void setTRE(ArrayOfString1 value) {
            this.tre = value;
        }

        /**
         * Ruft den Wert der smnas-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSMNAS() {
            return smnas;
        }

        /**
         * Legt den Wert der smnas-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSMNAS(Boolean value) {
            this.smnas = value;
        }

        /**
         * Ruft den Wert der kido-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isKIDO() {
            return kido;
        }

        /**
         * Legt den Wert der kido-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setKIDO(Boolean value) {
            this.kido = value;
        }

        /**
         * Ruft den Wert der aap-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAAP() {
            return aap;
        }

        /**
         * Legt den Wert der aap-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAAP(Boolean value) {
            this.aap = value;
        }

        /**
         * Ruft den Wert der gmn-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGMN() {
            return gmn;
        }

        /**
         * Legt den Wert der gmn-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGMN(String value) {
            this.gmn = value;
        }

        /**
         * Ruft den Wert der mdattr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDATTR() {
            return mdattr;
        }

        /**
         * Legt den Wert der mdattr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDATTR(String value) {
            this.mdattr = value;
        }

        /**
         * Ruft den Wert der pplus-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPPLUS() {
            return pplus;
        }

        /**
         * Legt den Wert der pplus-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPPLUS(String value) {
            this.pplus = value;
        }

        /**
         * Ruft den Wert der ufi-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUFI() {
            return ufi;
        }

        /**
         * Legt den Wert der ufi-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUFI(String value) {
            this.ufi = value;
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
         * Gets the value of the cpt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cpt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCPT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PRODUCT.PRD.CPT }
         * 
         * 
         */
        public List<PRODUCT.PRD.CPT> getCPT() {
            if (cpt == null) {
                cpt = new ArrayList<PRODUCT.PRD.CPT>();
            }
            return this.cpt;
        }

        /**
         * Gets the value of the prdicd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prdicd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRDICD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PRODUCT.PRD.PRDICD }
         * 
         * 
         */
        public List<PRODUCT.PRD.PRDICD> getPRDICD() {
            if (prdicd == null) {
                prdicd = new ArrayList<PRODUCT.PRD.PRDICD>();
            }
            return this.prdicd;
        }

        /**
         * Ruft den Wert der gsasa-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PRODUCT.PRD.GSASA }
         *     
         */
        public PRODUCT.PRD.GSASA getGSASA() {
            return gsasa;
        }

        /**
         * Legt den Wert der gsasa-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PRODUCT.PRD.GSASA }
         *     
         */
        public void setGSASA(PRODUCT.PRD.GSASA value) {
            this.gsasa = value;
        }

        /**
         * Gets the value of the dietaryadvice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dietaryadvice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDIETARYADVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PRODUCT.PRD.DIETARYADVICE }
         * 
         * 
         */
        public List<PRODUCT.PRD.DIETARYADVICE> getDIETARYADVICE() {
            if (dietaryadvice == null) {
                dietaryadvice = new ArrayList<PRODUCT.PRD.DIETARYADVICE>();
            }
            return this.dietaryadvice;
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
         *         &lt;element name="CPTLNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CNAMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CNAMEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GENGRPCPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IDXIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DDDD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="DDDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IDXIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IXREL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="GALF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EDQMPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DRGGRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRDGRPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRBSUIT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="CSOLV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="SOLVQ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="SOLVQU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PHVAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="LSPNSOL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="APDURSOL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="EXCIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EXCIPQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EXCIPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EXCIPCF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PQTY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="PQTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STDPRESCU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SIZEMM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="LOOKD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LOOKF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IMG2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="CPTCMP" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="QTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WHK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREFIX_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREFIX_FR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SUFFIX_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SUFFIX_FR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CPTIX" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IXNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="GRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="RLV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CPTROA" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SYSLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ROA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="EDQMROAS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="EDQMROA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="EDQMMOA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "cnamed",
            "cnamef",
            "gengrpcpt",
            "idxind",
            "dddd",
            "dddu",
            "ddda",
            "idxia",
            "ixrel",
            "galf",
            "edqmpdf",
            "drggrpcd",
            "prdgrpcd",
            "prbsuit",
            "csolv",
            "solvq",
            "solvqu",
            "phval",
            "lspnsol",
            "apdursol",
            "excip",
            "excipq",
            "excipcd",
            "excipcf",
            "pqty",
            "pqtyu",
            "stdprescu",
            "sizemm",
            "weight",
            "lookd",
            "lookf",
            "img2",
            "cptcmp",
            "cptix",
            "cptroa",
            "edqmroas"
        })
        public static class CPT {

            @XmlElement(name = "CPTLNO")
            protected int cptlno;
            @XmlElement(name = "CNAMED")
            protected String cnamed;
            @XmlElement(name = "CNAMEF")
            protected String cnamef;
            @XmlElement(name = "GENGRPCPT", defaultValue = "")
            protected String gengrpcpt;
            @XmlElement(name = "IDXIND")
            protected String idxind;
            @XmlElement(name = "DDDD")
            protected Double dddd;
            @XmlElement(name = "DDDU")
            protected String dddu;
            @XmlElement(name = "DDDA")
            protected String ddda;
            @XmlElement(name = "IDXIA")
            protected String idxia;
            @XmlElement(name = "IXREL")
            protected Integer ixrel;
            @XmlElement(name = "GALF")
            protected String galf;
            @XmlElement(name = "EDQMPDF")
            protected String edqmpdf;
            @XmlElement(name = "DRGGRPCD")
            protected String drggrpcd;
            @XmlElement(name = "PRDGRPCD")
            protected String prdgrpcd;
            @XmlElement(name = "PRBSUIT")
            protected Boolean prbsuit;
            @XmlElement(name = "CSOLV")
            protected Boolean csolv;
            @XmlElement(name = "SOLVQ")
            protected Double solvq;
            @XmlElement(name = "SOLVQU")
            protected String solvqu;
            @XmlElement(name = "PHVAL")
            protected Double phval;
            @XmlElement(name = "LSPNSOL")
            protected Double lspnsol;
            @XmlElement(name = "APDURSOL")
            protected Double apdursol;
            @XmlElement(name = "EXCIP")
            protected String excip;
            @XmlElement(name = "EXCIPQ")
            protected String excipq;
            @XmlElement(name = "EXCIPCD")
            protected String excipcd;
            @XmlElement(name = "EXCIPCF")
            protected String excipcf;
            @XmlElement(name = "PQTY")
            protected Double pqty;
            @XmlElement(name = "PQTYU")
            protected String pqtyu;
            @XmlElement(name = "STDPRESCU")
            protected String stdprescu;
            @XmlElement(name = "SIZEMM")
            protected BigDecimal sizemm;
            @XmlElement(name = "WEIGHT")
            protected BigDecimal weight;
            @XmlElement(name = "LOOKD")
            protected String lookd;
            @XmlElement(name = "LOOKF")
            protected String lookf;
            @XmlElement(name = "IMG2")
            protected Boolean img2;
            @XmlElement(name = "CPTCMP")
            protected List<PRODUCT.PRD.CPT.CPTCMP> cptcmp;
            @XmlElement(name = "CPTIX")
            protected List<PRODUCT.PRD.CPT.CPTIX> cptix;
            @XmlElement(name = "CPTROA")
            protected List<PRODUCT.PRD.CPT.CPTROA> cptroa;
            @XmlElement(name = "EDQMROAS")
            protected List<PRODUCT.PRD.CPT.EDQMROAS> edqmroas;

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
             * Ruft den Wert der cnamed-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNAMED() {
                return cnamed;
            }

            /**
             * Legt den Wert der cnamed-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNAMED(String value) {
                this.cnamed = value;
            }

            /**
             * Ruft den Wert der cnamef-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNAMEF() {
                return cnamef;
            }

            /**
             * Legt den Wert der cnamef-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNAMEF(String value) {
                this.cnamef = value;
            }

            /**
             * Ruft den Wert der gengrpcpt-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGENGRPCPT() {
                return gengrpcpt;
            }

            /**
             * Legt den Wert der gengrpcpt-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGENGRPCPT(String value) {
                this.gengrpcpt = value;
            }

            /**
             * Ruft den Wert der idxind-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDXIND() {
                return idxind;
            }

            /**
             * Legt den Wert der idxind-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDXIND(String value) {
                this.idxind = value;
            }

            /**
             * Ruft den Wert der dddd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getDDDD() {
                return dddd;
            }

            /**
             * Legt den Wert der dddd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setDDDD(Double value) {
                this.dddd = value;
            }

            /**
             * Ruft den Wert der dddu-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDDDU() {
                return dddu;
            }

            /**
             * Legt den Wert der dddu-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDDDU(String value) {
                this.dddu = value;
            }

            /**
             * Ruft den Wert der ddda-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDDDA() {
                return ddda;
            }

            /**
             * Legt den Wert der ddda-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDDDA(String value) {
                this.ddda = value;
            }

            /**
             * Ruft den Wert der idxia-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDXIA() {
                return idxia;
            }

            /**
             * Legt den Wert der idxia-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDXIA(String value) {
                this.idxia = value;
            }

            /**
             * Ruft den Wert der ixrel-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getIXREL() {
                return ixrel;
            }

            /**
             * Legt den Wert der ixrel-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setIXREL(Integer value) {
                this.ixrel = value;
            }

            /**
             * Ruft den Wert der galf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGALF() {
                return galf;
            }

            /**
             * Legt den Wert der galf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGALF(String value) {
                this.galf = value;
            }

            /**
             * Ruft den Wert der edqmpdf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEDQMPDF() {
                return edqmpdf;
            }

            /**
             * Legt den Wert der edqmpdf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEDQMPDF(String value) {
                this.edqmpdf = value;
            }

            /**
             * Ruft den Wert der drggrpcd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRGGRPCD() {
                return drggrpcd;
            }

            /**
             * Legt den Wert der drggrpcd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRGGRPCD(String value) {
                this.drggrpcd = value;
            }

            /**
             * Ruft den Wert der prdgrpcd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRDGRPCD() {
                return prdgrpcd;
            }

            /**
             * Legt den Wert der prdgrpcd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRDGRPCD(String value) {
                this.prdgrpcd = value;
            }

            /**
             * Ruft den Wert der prbsuit-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPRBSUIT() {
                return prbsuit;
            }

            /**
             * Legt den Wert der prbsuit-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPRBSUIT(Boolean value) {
                this.prbsuit = value;
            }

            /**
             * Ruft den Wert der csolv-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCSOLV() {
                return csolv;
            }

            /**
             * Legt den Wert der csolv-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCSOLV(Boolean value) {
                this.csolv = value;
            }

            /**
             * Ruft den Wert der solvq-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getSOLVQ() {
                return solvq;
            }

            /**
             * Legt den Wert der solvq-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setSOLVQ(Double value) {
                this.solvq = value;
            }

            /**
             * Ruft den Wert der solvqu-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSOLVQU() {
                return solvqu;
            }

            /**
             * Legt den Wert der solvqu-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSOLVQU(String value) {
                this.solvqu = value;
            }

            /**
             * Ruft den Wert der phval-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getPHVAL() {
                return phval;
            }

            /**
             * Legt den Wert der phval-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setPHVAL(Double value) {
                this.phval = value;
            }

            /**
             * Ruft den Wert der lspnsol-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLSPNSOL() {
                return lspnsol;
            }

            /**
             * Legt den Wert der lspnsol-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLSPNSOL(Double value) {
                this.lspnsol = value;
            }

            /**
             * Ruft den Wert der apdursol-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getAPDURSOL() {
                return apdursol;
            }

            /**
             * Legt den Wert der apdursol-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setAPDURSOL(Double value) {
                this.apdursol = value;
            }

            /**
             * Ruft den Wert der excip-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXCIP() {
                return excip;
            }

            /**
             * Legt den Wert der excip-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXCIP(String value) {
                this.excip = value;
            }

            /**
             * Ruft den Wert der excipq-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXCIPQ() {
                return excipq;
            }

            /**
             * Legt den Wert der excipq-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXCIPQ(String value) {
                this.excipq = value;
            }

            /**
             * Ruft den Wert der excipcd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXCIPCD() {
                return excipcd;
            }

            /**
             * Legt den Wert der excipcd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXCIPCD(String value) {
                this.excipcd = value;
            }

            /**
             * Ruft den Wert der excipcf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXCIPCF() {
                return excipcf;
            }

            /**
             * Legt den Wert der excipcf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXCIPCF(String value) {
                this.excipcf = value;
            }

            /**
             * Ruft den Wert der pqty-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getPQTY() {
                return pqty;
            }

            /**
             * Legt den Wert der pqty-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setPQTY(Double value) {
                this.pqty = value;
            }

            /**
             * Ruft den Wert der pqtyu-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPQTYU() {
                return pqtyu;
            }

            /**
             * Legt den Wert der pqtyu-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPQTYU(String value) {
                this.pqtyu = value;
            }

            /**
             * Ruft den Wert der stdprescu-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTDPRESCU() {
                return stdprescu;
            }

            /**
             * Legt den Wert der stdprescu-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTDPRESCU(String value) {
                this.stdprescu = value;
            }

            /**
             * Ruft den Wert der sizemm-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSIZEMM() {
                return sizemm;
            }

            /**
             * Legt den Wert der sizemm-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSIZEMM(BigDecimal value) {
                this.sizemm = value;
            }

            /**
             * Ruft den Wert der weight-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWEIGHT() {
                return weight;
            }

            /**
             * Legt den Wert der weight-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWEIGHT(BigDecimal value) {
                this.weight = value;
            }

            /**
             * Ruft den Wert der lookd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOOKD() {
                return lookd;
            }

            /**
             * Legt den Wert der lookd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOOKD(String value) {
                this.lookd = value;
            }

            /**
             * Ruft den Wert der lookf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLOOKF() {
                return lookf;
            }

            /**
             * Legt den Wert der lookf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLOOKF(String value) {
                this.lookf = value;
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
             * Gets the value of the cptcmp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cptcmp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCPTCMP().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PRODUCT.PRD.CPT.CPTCMP }
             * 
             * 
             */
            public List<PRODUCT.PRD.CPT.CPTCMP> getCPTCMP() {
                if (cptcmp == null) {
                    cptcmp = new ArrayList<PRODUCT.PRD.CPT.CPTCMP>();
                }
                return this.cptcmp;
            }

            /**
             * Gets the value of the cptix property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cptix property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCPTIX().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PRODUCT.PRD.CPT.CPTIX }
             * 
             * 
             */
            public List<PRODUCT.PRD.CPT.CPTIX> getCPTIX() {
                if (cptix == null) {
                    cptix = new ArrayList<PRODUCT.PRD.CPT.CPTIX>();
                }
                return this.cptix;
            }

            /**
             * Gets the value of the cptroa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cptroa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCPTROA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PRODUCT.PRD.CPT.CPTROA }
             * 
             * 
             */
            public List<PRODUCT.PRD.CPT.CPTROA> getCPTROA() {
                if (cptroa == null) {
                    cptroa = new ArrayList<PRODUCT.PRD.CPT.CPTROA>();
                }
                return this.cptroa;
            }

            /**
             * Gets the value of the edqmroas property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the edqmroas property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEDQMROAS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PRODUCT.PRD.CPT.EDQMROAS }
             * 
             * 
             */
            public List<PRODUCT.PRD.CPT.EDQMROAS> getEDQMROAS() {
                if (edqmroas == null) {
                    edqmroas = new ArrayList<PRODUCT.PRD.CPT.EDQMROAS>();
                }
                return this.edqmroas;
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
             *         &lt;element name="LINE" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="SUBNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="QTYU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WHK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREFIX_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREFIX_FR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SUFFIX_DE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SUFFIX_FR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "line",
                "subno",
                "qty",
                "qtyu",
                "whk",
                "prefixde",
                "prefixfr",
                "suffixde",
                "suffixfr"
            })
            public static class CPTCMP {

                @XmlElement(name = "LINE")
                protected int line;
                @XmlElement(name = "SUBNO")
                protected int subno;
                @XmlElement(name = "QTY")
                protected String qty;
                @XmlElement(name = "QTYU")
                protected String qtyu;
                @XmlElement(name = "WHK")
                protected String whk;
                @XmlElement(name = "PREFIX_DE")
                protected String prefixde;
                @XmlElement(name = "PREFIX_FR")
                protected String prefixfr;
                @XmlElement(name = "SUFFIX_DE")
                protected String suffixde;
                @XmlElement(name = "SUFFIX_FR")
                protected String suffixfr;

                /**
                 * Ruft den Wert der line-Eigenschaft ab.
                 * 
                 */
                public int getLINE() {
                    return line;
                }

                /**
                 * Legt den Wert der line-Eigenschaft fest.
                 * 
                 */
                public void setLINE(int value) {
                    this.line = value;
                }

                /**
                 * Ruft den Wert der subno-Eigenschaft ab.
                 * 
                 */
                public int getSUBNO() {
                    return subno;
                }

                /**
                 * Legt den Wert der subno-Eigenschaft fest.
                 * 
                 */
                public void setSUBNO(int value) {
                    this.subno = value;
                }

                /**
                 * Ruft den Wert der qty-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQTY() {
                    return qty;
                }

                /**
                 * Legt den Wert der qty-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQTY(String value) {
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
                 * Ruft den Wert der whk-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWHK() {
                    return whk;
                }

                /**
                 * Legt den Wert der whk-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWHK(String value) {
                    this.whk = value;
                }

                /**
                 * Ruft den Wert der prefixde-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPREFIXDE() {
                    return prefixde;
                }

                /**
                 * Legt den Wert der prefixde-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPREFIXDE(String value) {
                    this.prefixde = value;
                }

                /**
                 * Ruft den Wert der prefixfr-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPREFIXFR() {
                    return prefixfr;
                }

                /**
                 * Legt den Wert der prefixfr-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPREFIXFR(String value) {
                    this.prefixfr = value;
                }

                /**
                 * Ruft den Wert der suffixde-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSUFFIXDE() {
                    return suffixde;
                }

                /**
                 * Legt den Wert der suffixde-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSUFFIXDE(String value) {
                    this.suffixde = value;
                }

                /**
                 * Ruft den Wert der suffixfr-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSUFFIXFR() {
                    return suffixfr;
                }

                /**
                 * Legt den Wert der suffixfr-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSUFFIXFR(String value) {
                    this.suffixfr = value;
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
             *         &lt;element name="IXNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="GRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="RLV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
                "ixno",
                "grp",
                "rlv"
            })
            public static class CPTIX {

                @XmlElement(name = "IXNO")
                protected int ixno;
                @XmlElement(name = "GRP")
                protected int grp;
                @XmlElement(name = "RLV")
                protected Integer rlv;

                /**
                 * Ruft den Wert der ixno-Eigenschaft ab.
                 * 
                 */
                public int getIXNO() {
                    return ixno;
                }

                /**
                 * Legt den Wert der ixno-Eigenschaft fest.
                 * 
                 */
                public void setIXNO(int value) {
                    this.ixno = value;
                }

                /**
                 * Ruft den Wert der grp-Eigenschaft ab.
                 * 
                 */
                public int getGRP() {
                    return grp;
                }

                /**
                 * Legt den Wert der grp-Eigenschaft fest.
                 * 
                 */
                public void setGRP(int value) {
                    this.grp = value;
                }

                /**
                 * Ruft den Wert der rlv-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getRLV() {
                    return rlv;
                }

                /**
                 * Legt den Wert der rlv-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setRLV(Integer value) {
                    this.rlv = value;
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
             *         &lt;element name="SYSLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ROA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "sysloc",
                "roa"
            })
            public static class CPTROA {

                @XmlElement(name = "SYSLOC")
                protected String sysloc;
                @XmlElement(name = "ROA")
                protected String roa;

                /**
                 * Ruft den Wert der sysloc-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSYSLOC() {
                    return sysloc;
                }

                /**
                 * Legt den Wert der sysloc-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSYSLOC(String value) {
                    this.sysloc = value;
                }

                /**
                 * Ruft den Wert der roa-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getROA() {
                    return roa;
                }

                /**
                 * Legt den Wert der roa-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setROA(String value) {
                    this.roa = value;
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
             *         &lt;element name="EDQMROA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="EDQMMOA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "edqmroa",
                "edqmmoa"
            })
            public static class EDQMROAS {

                @XmlElement(name = "EDQMROA")
                protected String edqmroa;
                @XmlElement(name = "EDQMMOA")
                protected String edqmmoa;

                /**
                 * Ruft den Wert der edqmroa-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEDQMROA() {
                    return edqmroa;
                }

                /**
                 * Legt den Wert der edqmroa-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEDQMROA(String value) {
                    this.edqmroa = value;
                }

                /**
                 * Ruft den Wert der edqmmoa-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEDQMMOA() {
                    return edqmmoa;
                }

                /**
                 * Legt den Wert der edqmmoa-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEDQMMOA(String value) {
                    this.edqmmoa = value;
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
         *         &lt;element name="DIETTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "diettype"
        })
        public static class DIETARYADVICE {

            @XmlElement(name = "DIETTYPE")
            protected String diettype;

            /**
             * Ruft den Wert der diettype-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDIETTYPE() {
                return diettype;
            }

            /**
             * Legt den Wert der diettype-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDIETTYPE(String value) {
                this.diettype = value;
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
         *         &lt;element name="ISCRUSHABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="CRUSHABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CRUSHABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ISSUSPENDABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="SUSPENDABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SUSPENDABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ALTERNATIVESD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ALTERNATIVESF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EVIDENCELEVEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="REFERENCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CAPSISOPENABLE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="CAPSOPENABLEREMD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CAPSOPENABLEREMF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CAPSOPENABLEREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CAPSOPENABLEEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="LIQDURABILITYD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LIQDURABILITYF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LIQDURABILITYREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LIQDURABILITYEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DIVGSASA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="DIVGSASAREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DIVGSASAEL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "iscrushable",
            "crushableremd",
            "crushableremf",
            "issuspendable",
            "suspendableremd",
            "suspendableremf",
            "alternativesd",
            "alternativesf",
            "evidencelevel",
            "references",
            "capsisopenable",
            "capsopenableremd",
            "capsopenableremf",
            "capsopenableref",
            "capsopenableel",
            "liqdurabilityd",
            "liqdurabilityf",
            "liqdurabilityref",
            "liqdurabilityel",
            "divgsasa",
            "divgsasaref",
            "divgsasael"
        })
        public static class GSASA {

            @XmlElement(name = "ISCRUSHABLE")
            protected Boolean iscrushable;
            @XmlElement(name = "CRUSHABLEREMD")
            protected String crushableremd;
            @XmlElement(name = "CRUSHABLEREMF")
            protected String crushableremf;
            @XmlElement(name = "ISSUSPENDABLE")
            protected Boolean issuspendable;
            @XmlElement(name = "SUSPENDABLEREMD")
            protected String suspendableremd;
            @XmlElement(name = "SUSPENDABLEREMF")
            protected String suspendableremf;
            @XmlElement(name = "ALTERNATIVESD")
            protected String alternativesd;
            @XmlElement(name = "ALTERNATIVESF")
            protected String alternativesf;
            @XmlElement(name = "EVIDENCELEVEL")
            protected Integer evidencelevel;
            @XmlElement(name = "REFERENCES")
            protected String references;
            @XmlElement(name = "CAPSISOPENABLE")
            protected Boolean capsisopenable;
            @XmlElement(name = "CAPSOPENABLEREMD")
            protected String capsopenableremd;
            @XmlElement(name = "CAPSOPENABLEREMF")
            protected String capsopenableremf;
            @XmlElement(name = "CAPSOPENABLEREF")
            protected String capsopenableref;
            @XmlElement(name = "CAPSOPENABLEEL")
            protected Integer capsopenableel;
            @XmlElement(name = "LIQDURABILITYD")
            protected String liqdurabilityd;
            @XmlElement(name = "LIQDURABILITYF")
            protected String liqdurabilityf;
            @XmlElement(name = "LIQDURABILITYREF")
            protected String liqdurabilityref;
            @XmlElement(name = "LIQDURABILITYEL")
            protected Integer liqdurabilityel;
            @XmlElement(name = "DIVGSASA")
            protected Integer divgsasa;
            @XmlElement(name = "DIVGSASAREF")
            protected String divgsasaref;
            @XmlElement(name = "DIVGSASAEL")
            protected Integer divgsasael;

            /**
             * Ruft den Wert der iscrushable-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISCRUSHABLE() {
                return iscrushable;
            }

            /**
             * Legt den Wert der iscrushable-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISCRUSHABLE(Boolean value) {
                this.iscrushable = value;
            }

            /**
             * Ruft den Wert der crushableremd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRUSHABLEREMD() {
                return crushableremd;
            }

            /**
             * Legt den Wert der crushableremd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRUSHABLEREMD(String value) {
                this.crushableremd = value;
            }

            /**
             * Ruft den Wert der crushableremf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRUSHABLEREMF() {
                return crushableremf;
            }

            /**
             * Legt den Wert der crushableremf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRUSHABLEREMF(String value) {
                this.crushableremf = value;
            }

            /**
             * Ruft den Wert der issuspendable-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isISSUSPENDABLE() {
                return issuspendable;
            }

            /**
             * Legt den Wert der issuspendable-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setISSUSPENDABLE(Boolean value) {
                this.issuspendable = value;
            }

            /**
             * Ruft den Wert der suspendableremd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUSPENDABLEREMD() {
                return suspendableremd;
            }

            /**
             * Legt den Wert der suspendableremd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUSPENDABLEREMD(String value) {
                this.suspendableremd = value;
            }

            /**
             * Ruft den Wert der suspendableremf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUSPENDABLEREMF() {
                return suspendableremf;
            }

            /**
             * Legt den Wert der suspendableremf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUSPENDABLEREMF(String value) {
                this.suspendableremf = value;
            }

            /**
             * Ruft den Wert der alternativesd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getALTERNATIVESD() {
                return alternativesd;
            }

            /**
             * Legt den Wert der alternativesd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setALTERNATIVESD(String value) {
                this.alternativesd = value;
            }

            /**
             * Ruft den Wert der alternativesf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getALTERNATIVESF() {
                return alternativesf;
            }

            /**
             * Legt den Wert der alternativesf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setALTERNATIVESF(String value) {
                this.alternativesf = value;
            }

            /**
             * Ruft den Wert der evidencelevel-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getEVIDENCELEVEL() {
                return evidencelevel;
            }

            /**
             * Legt den Wert der evidencelevel-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setEVIDENCELEVEL(Integer value) {
                this.evidencelevel = value;
            }

            /**
             * Ruft den Wert der references-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFERENCES() {
                return references;
            }

            /**
             * Legt den Wert der references-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFERENCES(String value) {
                this.references = value;
            }

            /**
             * Ruft den Wert der capsisopenable-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCAPSISOPENABLE() {
                return capsisopenable;
            }

            /**
             * Legt den Wert der capsisopenable-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCAPSISOPENABLE(Boolean value) {
                this.capsisopenable = value;
            }

            /**
             * Ruft den Wert der capsopenableremd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPSOPENABLEREMD() {
                return capsopenableremd;
            }

            /**
             * Legt den Wert der capsopenableremd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPSOPENABLEREMD(String value) {
                this.capsopenableremd = value;
            }

            /**
             * Ruft den Wert der capsopenableremf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPSOPENABLEREMF() {
                return capsopenableremf;
            }

            /**
             * Legt den Wert der capsopenableremf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPSOPENABLEREMF(String value) {
                this.capsopenableremf = value;
            }

            /**
             * Ruft den Wert der capsopenableref-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAPSOPENABLEREF() {
                return capsopenableref;
            }

            /**
             * Legt den Wert der capsopenableref-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAPSOPENABLEREF(String value) {
                this.capsopenableref = value;
            }

            /**
             * Ruft den Wert der capsopenableel-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCAPSOPENABLEEL() {
                return capsopenableel;
            }

            /**
             * Legt den Wert der capsopenableel-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCAPSOPENABLEEL(Integer value) {
                this.capsopenableel = value;
            }

            /**
             * Ruft den Wert der liqdurabilityd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIQDURABILITYD() {
                return liqdurabilityd;
            }

            /**
             * Legt den Wert der liqdurabilityd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIQDURABILITYD(String value) {
                this.liqdurabilityd = value;
            }

            /**
             * Ruft den Wert der liqdurabilityf-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIQDURABILITYF() {
                return liqdurabilityf;
            }

            /**
             * Legt den Wert der liqdurabilityf-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIQDURABILITYF(String value) {
                this.liqdurabilityf = value;
            }

            /**
             * Ruft den Wert der liqdurabilityref-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIQDURABILITYREF() {
                return liqdurabilityref;
            }

            /**
             * Legt den Wert der liqdurabilityref-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIQDURABILITYREF(String value) {
                this.liqdurabilityref = value;
            }

            /**
             * Ruft den Wert der liqdurabilityel-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLIQDURABILITYEL() {
                return liqdurabilityel;
            }

            /**
             * Legt den Wert der liqdurabilityel-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLIQDURABILITYEL(Integer value) {
                this.liqdurabilityel = value;
            }

            /**
             * Ruft den Wert der divgsasa-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDIVGSASA() {
                return divgsasa;
            }

            /**
             * Legt den Wert der divgsasa-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDIVGSASA(Integer value) {
                this.divgsasa = value;
            }

            /**
             * Ruft den Wert der divgsasaref-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDIVGSASAREF() {
                return divgsasaref;
            }

            /**
             * Legt den Wert der divgsasaref-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDIVGSASAREF(String value) {
                this.divgsasaref = value;
            }

            /**
             * Ruft den Wert der divgsasael-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDIVGSASAEL() {
                return divgsasael;
            }

            /**
             * Legt den Wert der divgsasael-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDIVGSASAEL(Integer value) {
                this.divgsasael = value;
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
         *         &lt;element name="ICD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RSIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "icd",
            "rtyp",
            "rsig",
            "remd",
            "remf"
        })
        public static class PRDICD {

            @XmlElement(name = "ICD")
            protected String icd;
            @XmlElement(name = "RTYP")
            protected String rtyp;
            @XmlElement(name = "RSIG")
            protected String rsig;
            @XmlElement(name = "REMD")
            protected String remd;
            @XmlElement(name = "REMF")
            protected String remf;

            /**
             * Ruft den Wert der icd-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getICD() {
                return icd;
            }

            /**
             * Legt den Wert der icd-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setICD(String value) {
                this.icd = value;
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
             * Ruft den Wert der rsig-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRSIG() {
                return rsig;
            }

            /**
             * Legt den Wert der rsig-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRSIG(String value) {
                this.rsig = value;
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
