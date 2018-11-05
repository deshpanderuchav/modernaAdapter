//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// anderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fur anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{}STXCommand"/>
 *         &lt;element name="Answer" type="{}STXAnswer" minOccurs="0"/>
 *         &lt;element name="Plates" type="{}STXPlate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tubes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tube" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Plate" type="{}STXPlate" minOccurs="0"/>
 *                   &lt;element name="PltTPos" type="{}STXTubePos" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STXInfo" type="{}STXUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PendingCommand" type="{}STXCmdStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Device" type="{}STXDevice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "command",
    "answer",
    "plates",
    "tubes",
    "stxInfo",
    "pendingCommand",
    "device"
})
@XmlRootElement(name = "STXRequest")
public class STXRequest {

    @XmlElement(name = "Command", required = true)
    protected STXCommand command;
    @XmlElement(name = "Answer")
    protected STXAnswer answer;
    @XmlElement(name = "Plates")
    protected List<STXPlate> plates;
    @XmlElement(name = "Tubes")
    protected List<STXRequest.Tubes> tubes;
    @XmlElement(name = "STXInfo")
    protected List<STXUnit> stxInfo;
    @XmlElement(name = "PendingCommand")
    protected List<STXCmdStatus> pendingCommand;
    @XmlElement(name = "Device")
    protected STXDevice device;

    /**
     * Ruft den Wert der command-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link STXCommand }
     *     
     */
    public STXCommand getCommand() {
        return command;
    }

    /**
     * Legt den Wert der command-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link STXCommand }
     *     
     */
    public void setCommand(STXCommand value) {
        this.command = value;
    }

    /**
     * Ruft den Wert der answer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link STXAnswer }
     *     
     */
    public STXAnswer getAnswer() {
        return answer;
    }

    /**
     * Legt den Wert der answer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link STXAnswer }
     *     
     */
    public void setAnswer(STXAnswer value) {
        this.answer = value;
    }

    /**
     * Gets the value of the plates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXPlate }
     * 
     * 
     */
    public List<STXPlate> getPlates() {
        if (plates == null) {
            plates = new ArrayList<STXPlate>();
        }
        return this.plates;
    }

    /**
     * Gets the value of the tubes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tubes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTubes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXRequest.Tubes }
     * 
     * 
     */
    public List<STXRequest.Tubes> getTubes() {
        if (tubes == null) {
            tubes = new ArrayList<STXRequest.Tubes>();
        }
        return this.tubes;
    }

    /**
     * Gets the value of the stxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTXInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXUnit }
     * 
     * 
     */
    public List<STXUnit> getSTXInfo() {
        if (stxInfo == null) {
            stxInfo = new ArrayList<STXUnit>();
        }
        return this.stxInfo;
    }

    /**
     * Gets the value of the pendingCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXCmdStatus }
     * 
     * 
     */
    public List<STXCmdStatus> getPendingCommand() {
        if (pendingCommand == null) {
            pendingCommand = new ArrayList<STXCmdStatus>();
        }
        return this.pendingCommand;
    }

    /**
     * Ruft den Wert der device-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link STXDevice }
     *     
     */
    public STXDevice getDevice() {
        return device;
    }

    /**
     * Legt den Wert der device-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link STXDevice }
     *     
     */
    public void setDevice(STXDevice value) {
        this.device = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Tube" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Plate" type="{}STXPlate" minOccurs="0"/>
     *         &lt;element name="PltTPos" type="{}STXTubePos" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tube",
        "plate",
        "pltTPos"
    })
    public static class Tubes {

        @XmlElement(name = "Tube", required = true)
        protected String tube;
        @XmlElement(name = "Plate")
        protected STXPlate plate;
        @XmlElement(name = "PltTPos")
        protected STXTubePos pltTPos;

        /**
         * Ruft den Wert der tube-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTube() {
            return tube;
        }

        /**
         * Legt den Wert der tube-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTube(String value) {
            this.tube = value;
        }

        /**
         * Ruft den Wert der plate-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link STXPlate }
         *     
         */
        public STXPlate getPlate() {
            return plate;
        }

        /**
         * Legt den Wert der plate-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link STXPlate }
         *     
         */
        public void setPlate(STXPlate value) {
            this.plate = value;
        }

        /**
         * Ruft den Wert der pltTPos-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link STXTubePos }
         *     
         */
        public STXTubePos getPltTPos() {
            return pltTPos;
        }

        /**
         * Legt den Wert der pltTPos-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link STXTubePos }
         *     
         */
        public void setPltTPos(STXTubePos value) {
            this.pltTPos = value;
        }

    }

}
