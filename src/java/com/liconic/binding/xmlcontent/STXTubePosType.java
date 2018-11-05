//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// anderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fur STXTubePosType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXTubePosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PYA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PTTV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXTubePosType", propOrder = {
    "id",
    "px",
    "py",
    "pya",
    "pttv"
})
public class STXTubePosType {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "PX")
    protected int px;
    @XmlElement(name = "PY")
    protected int py;
    @XmlElement(name = "PYA", required = true)
    protected String pya;
    @XmlElement(name = "PTTV")
    protected int pttv;

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
     * Ruft den Wert der px-Eigenschaft ab.
     * 
     */
    public int getPX() {
        return px;
    }

    /**
     * Legt den Wert der px-Eigenschaft fest.
     * 
     */
    public void setPX(int value) {
        this.px = value;
    }

    /**
     * Ruft den Wert der py-Eigenschaft ab.
     * 
     */
    public int getPY() {
        return py;
    }

    /**
     * Legt den Wert der py-Eigenschaft fest.
     * 
     */
    public void setPY(int value) {
        this.py = value;
    }

    /**
     * Ruft den Wert der pya-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPYA() {
        return pya;
    }

    /**
     * Legt den Wert der pya-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPYA(String value) {
        this.pya = value;
    }

    /**
     * Ruft den Wert der pttv-Eigenschaft ab.
     * 
     */
    public int getPTTV() {
        return pttv;
    }

    /**
     * Legt den Wert der pttv-Eigenschaft fest.
     * 
     */
    public void setPTTV(int value) {
        this.pttv = value;
    }

}
