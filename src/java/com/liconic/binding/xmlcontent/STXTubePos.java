//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// anderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse fur STXTubePos complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXTubePos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PX" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PY" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="PYA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTV" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="PTb" type="{}STXTube" minOccurs="0"/>
 *         &lt;element name="PIDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PLDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PUDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXTubePos", propOrder = {
    "id",
    "px",
    "py",
    "pya",
    "ptv",
    "pTb",
    "piDt",
    "plDt",
    "puDt"
})
public class STXTubePos {

    @XmlElement(name = "Id", required = true)
    protected BigInteger id;
    @XmlElement(name = "PX")
    protected byte px;
    @XmlElement(name = "PY")
    protected byte py;
    @XmlElement(name = "PYA")
    protected String pya;
    @XmlElement(name = "PTV", required = true)
    protected BigInteger ptv;
    @XmlElementRef(name = "PTb", type = JAXBElement.class, required = false)
    protected JAXBElement<STXTube> pTb;
    @XmlElementRef(name = "PIDt", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> piDt;
    @XmlElementRef(name = "PLDt", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plDt;
    @XmlElementRef(name = "PUDt", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> puDt;

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
     * Ruft den Wert der px-Eigenschaft ab.
     * 
     */
    public byte getPX() {
        return px;
    }

    /**
     * Legt den Wert der px-Eigenschaft fest.
     * 
     */
    public void setPX(byte value) {
        this.px = value;
    }

    /**
     * Ruft den Wert der py-Eigenschaft ab.
     * 
     */
    public byte getPY() {
        return py;
    }

    /**
     * Legt den Wert der py-Eigenschaft fest.
     * 
     */
    public void setPY(byte value) {
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
     * Ruft den Wert der ptv-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPTV() {
        return ptv;
    }

    /**
     * Legt den Wert der ptv-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPTV(BigInteger value) {
        this.ptv = value;
    }

    /**
     * Ruft den Wert der pTb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link STXTube }{@code >}
     *     
     */
    public JAXBElement<STXTube> getPTb() {
        return pTb;
    }

    /**
     * Legt den Wert der pTb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link STXTube }{@code >}
     *     
     */
    public void setPTb(JAXBElement<STXTube> value) {
        this.pTb = value;
    }

    /**
     * Ruft den Wert der piDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPIDt() {
        return piDt;
    }

    /**
     * Legt den Wert der piDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPIDt(JAXBElement<XMLGregorianCalendar> value) {
        this.piDt = value;
    }

    /**
     * Ruft den Wert der plDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPLDt() {
        return plDt;
    }

    /**
     * Legt den Wert der plDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPLDt(JAXBElement<XMLGregorianCalendar> value) {
        this.plDt = value;
    }

    /**
     * Ruft den Wert der puDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPUDt() {
        return puDt;
    }

    /**
     * Legt den Wert der puDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPUDt(JAXBElement<XMLGregorianCalendar> value) {
        this.puDt = value;
    }

}
