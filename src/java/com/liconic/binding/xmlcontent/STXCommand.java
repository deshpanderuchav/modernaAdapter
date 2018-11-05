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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fur STXCommand complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="STXCommand">
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
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Partition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transferstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{}STXParameter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STXCommand", propOrder = {
    "id",
    "cmd",
    "user",
    "partition",
    "transferstation",
    "parameters"
})
public class STXCommand {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Cmd", required = true)
    protected String cmd;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "Partition")
    protected String partition;
    @XmlElement(name = "Transferstation")
    protected String transferstation;
    @XmlElement(name = "Parameters", required = true, nillable = true)
    protected List<STXParameter> parameters;

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
     * Ruft den Wert der partition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartition() {
        return partition;
    }

    /**
     * Legt den Wert der partition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartition(String value) {
        this.partition = value;
    }

    /**
     * Ruft den Wert der transferstation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferstation() {
        return transferstation;
    }

    /**
     * Legt den Wert der transferstation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferstation(String value) {
        this.transferstation = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STXParameter }
     * 
     * 
     */
    public List<STXParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<STXParameter>();
        }
        return this.parameters;
    }

}
