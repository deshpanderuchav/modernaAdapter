//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fur STXCassette complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXCassette">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CassDevId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CassType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CassLevels" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CassPltType" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CassLvl" type="{}STXLevel" maxOccurs="unbounded"/>
 *         &lt;element name="CassSafe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CassBuff" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXCassette", propOrder = {
    "cassDevId",
    "cassType",
    "cassLevels",
    "cassPltType",
    "id",
    "cassLvl",
    "cassSafe",
    "cassBuff"
})
public class STXCassette {

    @XmlElement(name = "CassDevId", required = true)
    protected BigInteger cassDevId;
    @XmlElement(name = "CassType", required = true)
    protected BigInteger cassType;
    @XmlElement(name = "CassLevels", required = true)
    protected BigInteger cassLevels;
    @XmlElement(name = "CassPltType", required = true)
    protected BigInteger cassPltType;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "CassLvl", required = true)
    protected List<STXLevel> cassLvl;
    @XmlElement(name = "CassSafe")
    protected boolean cassSafe;
    @XmlElement(name = "CassBuff")
    protected boolean cassBuff;

    /**
     * Ruft den Wert der cassDevId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCassDevId() {
        return cassDevId;
    }

    /**
     * Legt den Wert der cassDevId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCassDevId(BigInteger value) {
        this.cassDevId = value;
    }

    /**
     * Ruft den Wert der cassType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCassType() {
        return cassType;
    }

    /**
     * Legt den Wert der cassType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCassType(BigInteger value) {
        this.cassType = value;
    }

    /**
     * Ruft den Wert der cassLevels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCassLevels() {
        return cassLevels;
    }

    /**
     * Legt den Wert der cassLevels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCassLevels(BigInteger value) {
        this.cassLevels = value;
    }

    /**
     * Ruft den Wert der cassPltType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCassPltType() {
        return cassPltType;
    }

    /**
     * Legt den Wert der cassPltType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCassPltType(BigInteger value) {
        this.cassPltType = value;
    }

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
     * Gets the value of the cassLvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cassLvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCassLvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXLevel }
     * 
     * 
     */
    public List<STXLevel> getCassLvl() {
        if (cassLvl == null) {
            cassLvl = new ArrayList<STXLevel>();
        }
        return this.cassLvl;
    }

    /**
     * Ruft den Wert der cassSafe-Eigenschaft ab.
     * 
     */
    public boolean isCassSafe() {
        return cassSafe;
    }

    /**
     * Legt den Wert der cassSafe-Eigenschaft fest.
     * 
     */
    public void setCassSafe(boolean value) {
        this.cassSafe = value;
    }

    /**
     * Ruft den Wert der cassBuff-Eigenschaft ab.
     * 
     */
    public boolean isCassBuff() {
        return cassBuff;
    }

    /**
     * Legt den Wert der cassBuff-Eigenschaft fest.
     * 
     */
    public void setCassBuff(boolean value) {
        this.cassBuff = value;
    }

}
