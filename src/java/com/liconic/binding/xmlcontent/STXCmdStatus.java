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
 * Contains an information about pending or active command.
 * All tags taken from STXCommand and STXAnswer.
 * 
 * <p>Java-Klasse fur STXCmdStatus complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXCmdStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cmd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GetCmdStatus"/>
 *               &lt;enumeration value="GetSTXInfo"/>
 *               &lt;enumeration value="GetPlateInfo"/>
 *               &lt;enumeration value="GetTubeInfo"/>
 *               &lt;enumeration value="StorePlate"/>
 *               &lt;enumeration value="RetrievePlate"/>
 *               &lt;enumeration value="PickTubes"/>
 *               &lt;enumeration value="Inventory"/>
 *               &lt;enumeration value="ReadyForStorePlate"/>
 *               &lt;enumeration value="ReadyForRetrievePlate"/>
 *               &lt;enumeration value="AbortCmd"/>
 *               &lt;enumeration value="Activate"/>
 *               &lt;enumeration value="Deactivate"/>
 *               &lt;enumeration value="GetDeviceStatus"/>
 *               &lt;enumeration value="GetSystemStatus"/>
 *               &lt;enumeration value="GetCommandsInfo"/>
 *               &lt;enumeration value="GetPartitionPlatesList"/>
 *               &lt;enumeration value="GetPartitionTubesList"/>
 *               &lt;enumeration value="Consolidate"/>
 *               &lt;enumeration value="MoveTubes"/>
 *               &lt;enumeration value="GetUpdateMessage"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="OK"/>
 *               &lt;enumeration value="DONE"/>
 *               &lt;enumeration value="RUN"/>
 *               &lt;enumeration value="ERR"/>
 *               &lt;enumeration value="ABORTED"/>
 *               &lt;enumeration value="WAIT"/>
 *               &lt;enumeration value="BREAK"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ErrCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Progress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXCmdStatus", propOrder = {
    "id",
    "cmd",
    "user",
    "status",
    "errCode",
    "errMsg",
    "progress"
})
public class STXCmdStatus {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Cmd", required = true)
    protected String cmd;
    @XmlElement(name = "User", required = true)
    protected String user;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ErrCode")
    protected int errCode;
    @XmlElement(name = "ErrMsg", required = true)
    protected String errMsg;
    @XmlElement(name = "Progress")
    protected Integer progress;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der cmd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmd() {
        return cmd;
    }

    /**
     * Legt den Wert der cmd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmd(String value) {
        this.cmd = value;
    }

    /**
     * Ruft den Wert der user-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Legt den Wert der user-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der errCode-Eigenschaft ab.
     * 
     */
    public int getErrCode() {
        return errCode;
    }

    /**
     * Legt den Wert der errCode-Eigenschaft fest.
     * 
     */
    public void setErrCode(int value) {
        this.errCode = value;
    }

    /**
     * Ruft den Wert der errMsg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Legt den Wert der errMsg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }

    /**
     * Ruft den Wert der progress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * Legt den Wert der progress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgress(Integer value) {
        this.progress = value;
    }

}
