//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fur STXTubeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXTubeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TbTHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TbTDiam" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TbTInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TbFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXTubeType", propOrder = {
    "id",
    "name",
    "tbTHeight",
    "tbTDiam",
    "tbTInfo",
    "tbFixed"
})
public class STXTubeType {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "TbTHeight")
    protected int tbTHeight;
    @XmlElement(name = "TbTDiam")
    protected int tbTDiam;
    @XmlElement(name = "TbTInfo", required = true)
    protected String tbTInfo;
    @XmlElement(name = "TbFixed")
    protected Boolean tbFixed;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der tbTHeight-Eigenschaft ab.
     * 
     */
    public int getTbTHeight() {
        return tbTHeight;
    }

    /**
     * Legt den Wert der tbTHeight-Eigenschaft fest.
     * 
     */
    public void setTbTHeight(int value) {
        this.tbTHeight = value;
    }

    /**
     * Ruft den Wert der tbTDiam-Eigenschaft ab.
     * 
     */
    public int getTbTDiam() {
        return tbTDiam;
    }

    /**
     * Legt den Wert der tbTDiam-Eigenschaft fest.
     * 
     */
    public void setTbTDiam(int value) {
        this.tbTDiam = value;
    }

    /**
     * Ruft den Wert der tbTInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbTInfo() {
        return tbTInfo;
    }

    /**
     * Legt den Wert der tbTInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbTInfo(String value) {
        this.tbTInfo = value;
    }

    /**
     * Ruft den Wert der tbFixed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTbFixed() {
        return tbFixed;
    }

    /**
     * Legt den Wert der tbFixed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTbFixed(Boolean value) {
        this.tbFixed = value;
    }

}
