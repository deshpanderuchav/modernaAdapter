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
 * <p>Java-Klasse f�r STXUnit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitFW" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitDoubleDeck" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitActivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitBCR" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitPPSensor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitPShovelSensor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitPXfer1Sensor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitPXfer2Sensor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitCOMPort" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="UnitBCRCOMPort" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="UnitBCRInit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitReady" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitDoorOpened" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitErrorCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="UnitPlates" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="UnitCO2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitO2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitN2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitTemperature" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitHumidity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitDoors" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="UnitIO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitCassette" type="{}STXCassette" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitPartition" type="{}STXPartition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitTransferStation" type="{}STXTransferStation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitSTT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UnitSTTType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnitSTTPos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UnitStorage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXUnit", propOrder = {
    "id",
    "name",
    "unitFW",
    "unitSN",
    "unitDoubleDeck",
    "unitActivated",
    "unitError",
    "unitBCR",
    "unitPPSensor",
    "unitPShovelSensor",
    "unitPXfer1Sensor",
    "unitPXfer2Sensor",
    "unitCOMPort",
    "unitBCRCOMPort",
    "unitBCRInit",
    "unitReady",
    "unitDoorOpened",
    "unitErrorCode",
    "unitPlates",
    "unitCO2",
    "unitO2",
    "unitN2",
    "unitTemperature",
    "unitHumidity",
    "unitDoors",
    "unitIO",
    "unitCassette",
    "unitPartition",
    "unitTransferStation",
    "unitOwner",
    "unitSTT",
    "unitSTTType",
    "unitSTTPos",
    "unitStorage"
})
public class STXUnit {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "UnitFW", required = true)
    protected String unitFW;
    @XmlElement(name = "UnitSN", required = true)
    protected String unitSN;
    @XmlElement(name = "UnitDoubleDeck")
    protected boolean unitDoubleDeck;
    @XmlElement(name = "UnitActivated")
    protected boolean unitActivated;
    @XmlElement(name = "UnitError")
    protected boolean unitError;
    @XmlElement(name = "UnitBCR")
    protected boolean unitBCR;
    @XmlElement(name = "UnitPPSensor")
    protected boolean unitPPSensor;
    @XmlElement(name = "UnitPShovelSensor")
    protected boolean unitPShovelSensor;
    @XmlElement(name = "UnitPXfer1Sensor")
    protected boolean unitPXfer1Sensor;
    @XmlElement(name = "UnitPXfer2Sensor")
    protected boolean unitPXfer2Sensor;
    @XmlElement(name = "UnitCOMPort", required = true)
    protected BigInteger unitCOMPort;
    @XmlElement(name = "UnitBCRCOMPort", required = true)
    protected BigInteger unitBCRCOMPort;
    @XmlElement(name = "UnitBCRInit")
    protected boolean unitBCRInit;
    @XmlElement(name = "UnitReady")
    protected boolean unitReady;
    @XmlElement(name = "UnitDoorOpened")
    protected boolean unitDoorOpened;
    @XmlElement(name = "UnitErrorCode", required = true)
    protected BigInteger unitErrorCode;
    @XmlElement(name = "UnitPlates", required = true)
    protected BigInteger unitPlates;
    @XmlElement(name = "UnitCO2")
    protected boolean unitCO2;
    @XmlElement(name = "UnitO2")
    protected boolean unitO2;
    @XmlElement(name = "UnitN2")
    protected boolean unitN2;
    @XmlElement(name = "UnitTemperature")
    protected boolean unitTemperature;
    @XmlElement(name = "UnitHumidity")
    protected boolean unitHumidity;
    @XmlElement(name = "UnitDoors", required = true)
    protected BigInteger unitDoors;
    @XmlElement(name = "UnitIO")
    protected boolean unitIO;
    @XmlElement(name = "UnitCassette")
    protected List<STXCassette> unitCassette;
    @XmlElement(name = "UnitPartition", nillable = true)
    protected List<STXPartition> unitPartition;
    @XmlElement(name = "UnitTransferStation", nillable = true)
    protected List<STXTransferStation> unitTransferStation;
    @XmlElement(name = "UnitOwner")
    protected String unitOwner;
    @XmlElement(name = "UnitSTT")
    protected boolean unitSTT;
    @XmlElement(name = "UnitSTTType")
    protected Integer unitSTTType;
    @XmlElement(name = "UnitSTTPos")
    protected Integer unitSTTPos;
    @XmlElement(name = "UnitStorage")
    protected boolean unitStorage;

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
     * Ruft den Wert der unitFW-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFW() {
        return unitFW;
    }

    /**
     * Legt den Wert der unitFW-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFW(String value) {
        this.unitFW = value;
    }

    /**
     * Ruft den Wert der unitSN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSN() {
        return unitSN;
    }

    /**
     * Legt den Wert der unitSN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSN(String value) {
        this.unitSN = value;
    }

    /**
     * Ruft den Wert der unitDoubleDeck-Eigenschaft ab.
     * 
     */
    public boolean isUnitDoubleDeck() {
        return unitDoubleDeck;
    }

    /**
     * Legt den Wert der unitDoubleDeck-Eigenschaft fest.
     * 
     */
    public void setUnitDoubleDeck(boolean value) {
        this.unitDoubleDeck = value;
    }

    /**
     * Ruft den Wert der unitActivated-Eigenschaft ab.
     * 
     */
    public boolean isUnitActivated() {
        return unitActivated;
    }

    /**
     * Legt den Wert der unitActivated-Eigenschaft fest.
     * 
     */
    public void setUnitActivated(boolean value) {
        this.unitActivated = value;
    }

    /**
     * Ruft den Wert der unitError-Eigenschaft ab.
     * 
     */
    public boolean isUnitError() {
        return unitError;
    }

    /**
     * Legt den Wert der unitError-Eigenschaft fest.
     * 
     */
    public void setUnitError(boolean value) {
        this.unitError = value;
    }

    /**
     * Ruft den Wert der unitBCR-Eigenschaft ab.
     * 
     */
    public boolean isUnitBCR() {
        return unitBCR;
    }

    /**
     * Legt den Wert der unitBCR-Eigenschaft fest.
     * 
     */
    public void setUnitBCR(boolean value) {
        this.unitBCR = value;
    }

    /**
     * Ruft den Wert der unitPPSensor-Eigenschaft ab.
     * 
     */
    public boolean isUnitPPSensor() {
        return unitPPSensor;
    }

    /**
     * Legt den Wert der unitPPSensor-Eigenschaft fest.
     * 
     */
    public void setUnitPPSensor(boolean value) {
        this.unitPPSensor = value;
    }

    /**
     * Ruft den Wert der unitPShovelSensor-Eigenschaft ab.
     * 
     */
    public boolean isUnitPShovelSensor() {
        return unitPShovelSensor;
    }

    /**
     * Legt den Wert der unitPShovelSensor-Eigenschaft fest.
     * 
     */
    public void setUnitPShovelSensor(boolean value) {
        this.unitPShovelSensor = value;
    }

    /**
     * Ruft den Wert der unitPXfer1Sensor-Eigenschaft ab.
     * 
     */
    public boolean isUnitPXfer1Sensor() {
        return unitPXfer1Sensor;
    }

    /**
     * Legt den Wert der unitPXfer1Sensor-Eigenschaft fest.
     * 
     */
    public void setUnitPXfer1Sensor(boolean value) {
        this.unitPXfer1Sensor = value;
    }

    /**
     * Ruft den Wert der unitPXfer2Sensor-Eigenschaft ab.
     * 
     */
    public boolean isUnitPXfer2Sensor() {
        return unitPXfer2Sensor;
    }

    /**
     * Legt den Wert der unitPXfer2Sensor-Eigenschaft fest.
     * 
     */
    public void setUnitPXfer2Sensor(boolean value) {
        this.unitPXfer2Sensor = value;
    }

    /**
     * Ruft den Wert der unitCOMPort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitCOMPort() {
        return unitCOMPort;
    }

    /**
     * Legt den Wert der unitCOMPort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitCOMPort(BigInteger value) {
        this.unitCOMPort = value;
    }

    /**
     * Ruft den Wert der unitBCRCOMPort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitBCRCOMPort() {
        return unitBCRCOMPort;
    }

    /**
     * Legt den Wert der unitBCRCOMPort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitBCRCOMPort(BigInteger value) {
        this.unitBCRCOMPort = value;
    }

    /**
     * Ruft den Wert der unitBCRInit-Eigenschaft ab.
     * 
     */
    public boolean isUnitBCRInit() {
        return unitBCRInit;
    }

    /**
     * Legt den Wert der unitBCRInit-Eigenschaft fest.
     * 
     */
    public void setUnitBCRInit(boolean value) {
        this.unitBCRInit = value;
    }

    /**
     * Ruft den Wert der unitReady-Eigenschaft ab.
     * 
     */
    public boolean isUnitReady() {
        return unitReady;
    }

    /**
     * Legt den Wert der unitReady-Eigenschaft fest.
     * 
     */
    public void setUnitReady(boolean value) {
        this.unitReady = value;
    }

    /**
     * Ruft den Wert der unitDoorOpened-Eigenschaft ab.
     * 
     */
    public boolean isUnitDoorOpened() {
        return unitDoorOpened;
    }

    /**
     * Legt den Wert der unitDoorOpened-Eigenschaft fest.
     * 
     */
    public void setUnitDoorOpened(boolean value) {
        this.unitDoorOpened = value;
    }

    /**
     * Ruft den Wert der unitErrorCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitErrorCode() {
        return unitErrorCode;
    }

    /**
     * Legt den Wert der unitErrorCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitErrorCode(BigInteger value) {
        this.unitErrorCode = value;
    }

    /**
     * Ruft den Wert der unitPlates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitPlates() {
        return unitPlates;
    }

    /**
     * Legt den Wert der unitPlates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitPlates(BigInteger value) {
        this.unitPlates = value;
    }

    /**
     * Ruft den Wert der unitCO2-Eigenschaft ab.
     * 
     */
    public boolean isUnitCO2() {
        return unitCO2;
    }

    /**
     * Legt den Wert der unitCO2-Eigenschaft fest.
     * 
     */
    public void setUnitCO2(boolean value) {
        this.unitCO2 = value;
    }

    /**
     * Ruft den Wert der unitO2-Eigenschaft ab.
     * 
     */
    public boolean isUnitO2() {
        return unitO2;
    }

    /**
     * Legt den Wert der unitO2-Eigenschaft fest.
     * 
     */
    public void setUnitO2(boolean value) {
        this.unitO2 = value;
    }

    /**
     * Ruft den Wert der unitN2-Eigenschaft ab.
     * 
     */
    public boolean isUnitN2() {
        return unitN2;
    }

    /**
     * Legt den Wert der unitN2-Eigenschaft fest.
     * 
     */
    public void setUnitN2(boolean value) {
        this.unitN2 = value;
    }

    /**
     * Ruft den Wert der unitTemperature-Eigenschaft ab.
     * 
     */
    public boolean isUnitTemperature() {
        return unitTemperature;
    }

    /**
     * Legt den Wert der unitTemperature-Eigenschaft fest.
     * 
     */
    public void setUnitTemperature(boolean value) {
        this.unitTemperature = value;
    }

    /**
     * Ruft den Wert der unitHumidity-Eigenschaft ab.
     * 
     */
    public boolean isUnitHumidity() {
        return unitHumidity;
    }

    /**
     * Legt den Wert der unitHumidity-Eigenschaft fest.
     * 
     */
    public void setUnitHumidity(boolean value) {
        this.unitHumidity = value;
    }

    /**
     * Ruft den Wert der unitDoors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitDoors() {
        return unitDoors;
    }

    /**
     * Legt den Wert der unitDoors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitDoors(BigInteger value) {
        this.unitDoors = value;
    }

    /**
     * Ruft den Wert der unitIO-Eigenschaft ab.
     * 
     */
    public boolean isUnitIO() {
        return unitIO;
    }

    /**
     * Legt den Wert der unitIO-Eigenschaft fest.
     * 
     */
    public void setUnitIO(boolean value) {
        this.unitIO = value;
    }

    /**
     * Gets the value of the unitCassette property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitCassette property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitCassette().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXCassette }
     * 
     * 
     */
    public List<STXCassette> getUnitCassette() {
        if (unitCassette == null) {
            unitCassette = new ArrayList<STXCassette>();
        }
        return this.unitCassette;
    }

    /**
     * Gets the value of the unitPartition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitPartition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitPartition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXPartition }
     * 
     * 
     */
    public List<STXPartition> getUnitPartition() {
        if (unitPartition == null) {
            unitPartition = new ArrayList<STXPartition>();
        }
        return this.unitPartition;
    }

    /**
     * Gets the value of the unitTransferStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitTransferStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitTransferStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXTransferStation }
     * 
     * 
     */
    public List<STXTransferStation> getUnitTransferStation() {
        if (unitTransferStation == null) {
            unitTransferStation = new ArrayList<STXTransferStation>();
        }
        return this.unitTransferStation;
    }

    /**
     * Ruft den Wert der unitOwner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOwner() {
        return unitOwner;
    }

    /**
     * Legt den Wert der unitOwner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOwner(String value) {
        this.unitOwner = value;
    }

    /**
     * Ruft den Wert der unitSTT-Eigenschaft ab.
     * 
     */
    public boolean isUnitSTT() {
        return unitSTT;
    }

    /**
     * Legt den Wert der unitSTT-Eigenschaft fest.
     * 
     */
    public void setUnitSTT(boolean value) {
        this.unitSTT = value;
    }

    /**
     * Ruft den Wert der unitSTTType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitSTTType() {
        return unitSTTType;
    }

    /**
     * Legt den Wert der unitSTTType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitSTTType(Integer value) {
        this.unitSTTType = value;
    }

    /**
     * Ruft den Wert der unitSTTPos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitSTTPos() {
        return unitSTTPos;
    }

    /**
     * Legt den Wert der unitSTTPos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitSTTPos(Integer value) {
        this.unitSTTPos = value;
    }

    /**
     * Ruft den Wert der unitStorage-Eigenschaft ab.
     * 
     */
    public boolean isUnitStorage() {
        return unitStorage;
    }

    /**
     * Legt den Wert der unitStorage-Eigenschaft fest.
     * 
     */
    public void setUnitStorage(boolean value) {
        this.unitStorage = value;
    }

}
