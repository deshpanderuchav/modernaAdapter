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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse fur STXLevel complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LvlCassId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="LvlDevId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="LvlPlt" type="{}STXPlate" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="LvlInvDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LvlLoadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LvlUnloadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXLevel", propOrder = {
    "lvlCassId",
    "lvlDevId",
    "lvlPlt",
    "id",
    "lvlInvDate",
    "lvlLoadDate",
    "lvlUnloadDate"
})
public class STXLevel {

    @XmlElement(name = "LvlCassId", required = true)
    protected BigInteger lvlCassId;
    @XmlElement(name = "LvlDevId", required = true)
    protected BigInteger lvlDevId;
    @XmlElementRef(name = "LvlPlt", type = JAXBElement.class, required = false)
    protected JAXBElement<STXPlate> lvlPlt;
    @XmlElement(name = "Id", required = true)
    protected BigInteger id;
    @XmlElementRef(name = "LvlInvDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lvlInvDate;
    @XmlElementRef(name = "LvlLoadDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lvlLoadDate;
    @XmlElement(name = "LvlUnloadDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lvlUnloadDate;

    /**
     * Ruft den Wert der lvlCassId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLvlCassId() {
        return lvlCassId;
    }

    /**
     * Legt den Wert der lvlCassId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLvlCassId(BigInteger value) {
        this.lvlCassId = value;
    }

    /**
     * Ruft den Wert der lvlDevId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLvlDevId() {
        return lvlDevId;
    }

    /**
     * Legt den Wert der lvlDevId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLvlDevId(BigInteger value) {
        this.lvlDevId = value;
    }

    /**
     * Ruft den Wert der lvlPlt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link STXPlate }{@code >}
     *     
     */
    public JAXBElement<STXPlate> getLvlPlt() {
        return lvlPlt;
    }

    /**
     * Legt den Wert der lvlPlt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link STXPlate }{@code >}
     *     
     */
    public void setLvlPlt(JAXBElement<STXPlate> value) {
        this.lvlPlt = value;
    }

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
     * Ruft den Wert der lvlInvDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLvlInvDate() {
        return lvlInvDate;
    }

    /**
     * Legt den Wert der lvlInvDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLvlInvDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lvlInvDate = value;
    }

    /**
     * Ruft den Wert der lvlLoadDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLvlLoadDate() {
        return lvlLoadDate;
    }

    /**
     * Legt den Wert der lvlLoadDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLvlLoadDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lvlLoadDate = value;
    }

    /**
     * Ruft den Wert der lvlUnloadDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLvlUnloadDate() {
        return lvlUnloadDate;
    }

    /**
     * Legt den Wert der lvlUnloadDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLvlUnloadDate(XMLGregorianCalendar value) {
        this.lvlUnloadDate = value;
    }

}
