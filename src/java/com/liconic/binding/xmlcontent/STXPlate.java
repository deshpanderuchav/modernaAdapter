//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// anderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fur STXPlate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXPlate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PltBCR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PltUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PltMat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PltConc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PltF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PltTPos" type="{}STXTubePos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PltType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="INFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{}STXPlateLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXPlate", propOrder = {
    "id",
    "pltBCR",
    "pltUID",
    "pltMat",
    "pltConc",
    "pltF",
    "pltTPos",
    "pltType",
    "info",
    "location"
})
public class STXPlate {

    @XmlElement(name = "Id", required = true)
    protected BigInteger id;
    @XmlElement(name = "PltBCR", required = true)
    protected String pltBCR;
    @XmlElement(name = "PltUID", required = true)
    protected String pltUID;
    @XmlElement(name = "PltMat")
    protected String pltMat;
    @XmlElement(name = "PltConc")
    protected BigDecimal pltConc;
    @XmlElement(name = "PltF")
    protected BigDecimal pltF;
    @XmlElement(name = "PltTPos", nillable = true)
    protected List<STXTubePos> pltTPos;
    @XmlElement(name = "PltType")
    protected int pltType;
    @XmlElement(name = "INFO")
    protected String info;
    @XmlElement(name = "Location")
    protected STXPlateLocation location;

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
     * Ruft den Wert der pltBCR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPltBCR() {
        return pltBCR;
    }

    /**
     * Legt den Wert der pltBCR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPltBCR(String value) {
        this.pltBCR = value;
    }

    /**
     * Ruft den Wert der pltUID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPltUID() {
        return pltUID;
    }

    /**
     * Legt den Wert der pltUID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPltUID(String value) {
        this.pltUID = value;
    }

    /**
     * Ruft den Wert der pltMat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPltMat() {
        return pltMat;
    }

    /**
     * Legt den Wert der pltMat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPltMat(String value) {
        this.pltMat = value;
    }

    /**
     * Ruft den Wert der pltConc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPltConc() {
        return pltConc;
    }

    /**
     * Legt den Wert der pltConc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPltConc(BigDecimal value) {
        this.pltConc = value;
    }

    /**
     * Ruft den Wert der pltF-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPltF() {
        return pltF;
    }

    /**
     * Legt den Wert der pltF-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPltF(BigDecimal value) {
        this.pltF = value;
    }

    /**
     * Gets the value of the pltTPos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pltTPos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPltTPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXTubePos }
     * 
     * 
     */
    public List<STXTubePos> getPltTPos() {
        if (pltTPos == null) {
            pltTPos = new ArrayList<STXTubePos>();
        }
        return this.pltTPos;
    }

    /**
     * Ruft den Wert der pltType-Eigenschaft ab.
     * 
     */
    public int getPltType() {
        return pltType;
    }

    /**
     * Legt den Wert der pltType-Eigenschaft fest.
     * 
     */
    public void setPltType(int value) {
        this.pltType = value;
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
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link STXPlateLocation }
     *     
     */
    public STXPlateLocation getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link STXPlateLocation }
     *     
     */
    public void setLocation(STXPlateLocation value) {
        this.location = value;
    }

}
