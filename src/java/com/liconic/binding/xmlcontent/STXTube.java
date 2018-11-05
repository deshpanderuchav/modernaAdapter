//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// underungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fur STXTube complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXTube">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TbBCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TbUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TbM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TbC" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TbF" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TbT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="INFO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXTube", propOrder = {
    "id",
    "tbBCR",
    "tbUID",
    "tbM",
    "tbC",
    "tbF",
    "tbT",
    "info",
    "subGroup",
    "mainGroup"
})
public class STXTube {

    @XmlElement(name = "Id", required = true)
    protected BigInteger id;
    @XmlElement(name = "TbBCR", required = true)
    protected String tbBCR;
    @XmlElement(name = "TbUID", required = true)
    protected String tbUID;
    @XmlElement(name = "TbM", required = true)
    protected String tbM;
    @XmlElement(name = "TbC", required = true)
    protected BigDecimal tbC;
    @XmlElement(name = "TbF", required = true)
    protected BigDecimal tbF;
    @XmlElement(name = "TbT")
    protected int tbT;
    @XmlElement(name = "INFO", required = true)
    protected String info;
    @XmlElement(name = "SubGroup")
    protected String subGroup;
    @XmlElement(name = "MainGroup")
    protected String mainGroup;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der tbBCR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbBCR() {
        return tbBCR;
    }

    /**
     * Legt den Wert der tbBCR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbBCR(String value) {
        this.tbBCR = value;
    }

    /**
     * Ruft den Wert der tbUID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbUID() {
        return tbUID;
    }

    /**
     * Legt den Wert der tbUID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbUID(String value) {
        this.tbUID = value;
    }

    /**
     * Ruft den Wert der tbM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbM() {
        return tbM;
    }

    /**
     * Legt den Wert der tbM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbM(String value) {
        this.tbM = value;
    }

    /**
     * Ruft den Wert der tbC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTbC() {
        return tbC;
    }

    /**
     * Legt den Wert der tbC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTbC(BigDecimal value) {
        this.tbC = value;
    }

    /**
     * Ruft den Wert der tbF-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTbF() {
        return tbF;
    }

    /**
     * Legt den Wert der tbF-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTbF(BigDecimal value) {
        this.tbF = value;
    }

    /**
     * Ruft den Wert der tbT-Eigenschaft ab.
     * 
     */
    public int getTbT() {
        return tbT;
    }

    /**
     * Legt den Wert der tbT-Eigenschaft fest.
     * 
     */
    public void setTbT(int value) {
        this.tbT = value;
    }

    /**
     * Ruft den Wert der info-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFO() {
        return info;
    }

    /**
     * Legt den Wert der info-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFO(String value) {
        this.info = value;
    }

    /**
     * Ruft den Wert der subGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroup() {
        return subGroup;
    }

    /**
     * Legt den Wert der subGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroup(String value) {
        this.subGroup = value;
    }

    /**
     * Ruft den Wert der mainGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainGroup() {
        return mainGroup;
    }

    /**
     * Legt den Wert der mainGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainGroup(String value) {
        this.mainGroup = value;
    }

}
