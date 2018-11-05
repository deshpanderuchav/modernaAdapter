//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// anderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fur STXPlateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXPlateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumCavities" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TubeRack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXPlateType", propOrder = {
    "id",
    "name",
    "numCavities",
    "tubeRack",
    "height"
})
public class STXPlateType {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "NumCavities", required = true)
    protected BigInteger numCavities;
    @XmlElement(name = "TubeRack")
    protected boolean tubeRack;
    @XmlElement(name = "Height")
    protected float height;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
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
    public void setID(BigInteger value) {
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
     * Ruft den Wert der numCavities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumCavities() {
        return numCavities;
    }

    /**
     * Legt den Wert der numCavities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumCavities(BigInteger value) {
        this.numCavities = value;
    }

    /**
     * Ruft den Wert der tubeRack-Eigenschaft ab.
     * 
     */
    public boolean isTubeRack() {
        return tubeRack;
    }

    /**
     * Legt den Wert der tubeRack-Eigenschaft fest.
     * 
     */
    public void setTubeRack(boolean value) {
        this.tubeRack = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

}
