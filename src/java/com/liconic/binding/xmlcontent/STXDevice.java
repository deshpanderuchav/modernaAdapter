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
 * Keep the instance of device for commands: Activate, Deactivate, GetDeviceStatus and replyes for those commands.
 * 
 * <p>Java-Klasse fur STXDevice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SystemReady" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PlateReady" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SystemInitialized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="XferStnStatusChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GateClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserDooreClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PlateSensShovel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PlateSensXferStn1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PlateSensXferStn2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Error" type="{}STXDeviceError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXDevice", propOrder = {
    "name",
    "systemReady",
    "plateReady",
    "systemInitialized",
    "xferStnStatusChange",
    "gateClosed",
    "userDooreClosed",
    "warning",
    "plateSensShovel",
    "plateSensXferStn1",
    "plateSensXferStn2",
    "error"
})
public class STXDevice {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SystemReady")
    protected Boolean systemReady;
    @XmlElement(name = "PlateReady")
    protected Boolean plateReady;
    @XmlElement(name = "SystemInitialized")
    protected Boolean systemInitialized;
    @XmlElement(name = "XferStnStatusChange")
    protected Boolean xferStnStatusChange;
    @XmlElement(name = "GateClosed")
    protected Boolean gateClosed;
    @XmlElement(name = "UserDooreClosed")
    protected Boolean userDooreClosed;
    @XmlElement(name = "Warning")
    protected Boolean warning;
    @XmlElement(name = "PlateSensShovel")
    protected Boolean plateSensShovel;
    @XmlElement(name = "PlateSensXferStn1")
    protected Boolean plateSensXferStn1;
    @XmlElement(name = "PlateSensXferStn2")
    protected Boolean plateSensXferStn2;
    @XmlElement(name = "Error")
    protected STXDeviceError error;

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
     * Ruft den Wert der systemReady-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSystemReady() {
        return systemReady;
    }

    /**
     * Legt den Wert der systemReady-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemReady(Boolean value) {
        this.systemReady = value;
    }

    /**
     * Ruft den Wert der plateReady-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlateReady() {
        return plateReady;
    }

    /**
     * Legt den Wert der plateReady-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlateReady(Boolean value) {
        this.plateReady = value;
    }

    /**
     * Ruft den Wert der systemInitialized-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSystemInitialized() {
        return systemInitialized;
    }

    /**
     * Legt den Wert der systemInitialized-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemInitialized(Boolean value) {
        this.systemInitialized = value;
    }

    /**
     * Ruft den Wert der xferStnStatusChange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXferStnStatusChange() {
        return xferStnStatusChange;
    }

    /**
     * Legt den Wert der xferStnStatusChange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXferStnStatusChange(Boolean value) {
        this.xferStnStatusChange = value;
    }

    /**
     * Ruft den Wert der gateClosed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGateClosed() {
        return gateClosed;
    }

    /**
     * Legt den Wert der gateClosed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGateClosed(Boolean value) {
        this.gateClosed = value;
    }

    /**
     * Ruft den Wert der userDooreClosed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDooreClosed() {
        return userDooreClosed;
    }

    /**
     * Legt den Wert der userDooreClosed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDooreClosed(Boolean value) {
        this.userDooreClosed = value;
    }

    /**
     * Ruft den Wert der warning-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarning() {
        return warning;
    }

    /**
     * Legt den Wert der warning-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarning(Boolean value) {
        this.warning = value;
    }

    /**
     * Ruft den Wert der plateSensShovel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlateSensShovel() {
        return plateSensShovel;
    }

    /**
     * Legt den Wert der plateSensShovel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlateSensShovel(Boolean value) {
        this.plateSensShovel = value;
    }

    /**
     * Ruft den Wert der plateSensXferStn1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlateSensXferStn1() {
        return plateSensXferStn1;
    }

    /**
     * Legt den Wert der plateSensXferStn1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlateSensXferStn1(Boolean value) {
        this.plateSensXferStn1 = value;
    }

    /**
     * Ruft den Wert der plateSensXferStn2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlateSensXferStn2() {
        return plateSensXferStn2;
    }

    /**
     * Legt den Wert der plateSensXferStn2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlateSensXferStn2(Boolean value) {
        this.plateSensXferStn2 = value;
    }

    /**
     * Ruft den Wert der error-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link STXDeviceError }
     *     
     */
    public STXDeviceError getError() {
        return error;
    }

    /**
     * Legt den Wert der error-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link STXDeviceError }
     *     
     */
    public void setError(STXDeviceError value) {
        this.error = value;
    }

}
