//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.06.06 um 08:00:07 AM CEST 
//


package com.liconic.binding.xmlcontent;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.liconic.binding.xmlcontent package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _STXAnswerValue_QNAME = new QName("", "Value");
    private final static QName _STXTubePosPUDt_QNAME = new QName("", "PUDt");
    private final static QName _STXTubePosPLDt_QNAME = new QName("", "PLDt");
    private final static QName _STXTubePosPIDt_QNAME = new QName("", "PIDt");
    private final static QName _STXTubePosPTb_QNAME = new QName("", "PTb");
    private final static QName _STXLevelLvlLoadDate_QNAME = new QName("", "LvlLoadDate");
    private final static QName _STXLevelLvlPlt_QNAME = new QName("", "LvlPlt");
    private final static QName _STXLevelLvlInvDate_QNAME = new QName("", "LvlInvDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.liconic.binding.xmlcontent
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link STXRequest }
     * 
     */
    public STXRequest createSTXRequest() {
        return new STXRequest();
    }

    /**
     * Create an instance of {@link STXCommand }
     * 
     */
    public STXCommand createSTXCommand() {
        return new STXCommand();
    }

    /**
     * Create an instance of {@link STXAnswer }
     * 
     */
    public STXAnswer createSTXAnswer() {
        return new STXAnswer();
    }

    /**
     * Create an instance of {@link STXPlate }
     * 
     */
    public STXPlate createSTXPlate() {
        return new STXPlate();
    }

    /**
     * Create an instance of {@link STXRequest.Tubes }
     * 
     */
    public STXRequest.Tubes createSTXRequestTubes() {
        return new STXRequest.Tubes();
    }

    /**
     * Create an instance of {@link STXUnit }
     * 
     */
    public STXUnit createSTXUnit() {
        return new STXUnit();
    }

    /**
     * Create an instance of {@link STXCmdStatus }
     * 
     */
    public STXCmdStatus createSTXCmdStatus() {
        return new STXCmdStatus();
    }

    /**
     * Create an instance of {@link STXDevice }
     * 
     */
    public STXDevice createSTXDevice() {
        return new STXDevice();
    }

    /**
     * Create an instance of {@link STXDeviceError }
     * 
     */
    public STXDeviceError createSTXDeviceError() {
        return new STXDeviceError();
    }

    /**
     * Create an instance of {@link STXParameter }
     * 
     */
    public STXParameter createSTXParameter() {
        return new STXParameter();
    }

    /**
     * Create an instance of {@link STXCassette }
     * 
     */
    public STXCassette createSTXCassette() {
        return new STXCassette();
    }

    /**
     * Create an instance of {@link STXTransferStation }
     * 
     */
    public STXTransferStation createSTXTransferStation() {
        return new STXTransferStation();
    }

    /**
     * Create an instance of {@link STXTubeType }
     * 
     */
    public STXTubeType createSTXTubeType() {
        return new STXTubeType();
    }

    /**
     * Create an instance of {@link STXTube }
     * 
     */
    public STXTube createSTXTube() {
        return new STXTube();
    }

    /**
     * Create an instance of {@link STXTubePosType }
     * 
     */
    public STXTubePosType createSTXTubePosType() {
        return new STXTubePosType();
    }

    /**
     * Create an instance of {@link STXTubePos }
     * 
     */
    public STXTubePos createSTXTubePos() {
        return new STXTubePos();
    }

    /**
     * Create an instance of {@link STXPlateType }
     * 
     */
    public STXPlateType createSTXPlateType() {
        return new STXPlateType();
    }

    /**
     * Create an instance of {@link STXPlateLocation }
     * 
     */
    public STXPlateLocation createSTXPlateLocation() {
        return new STXPlateLocation();
    }

    /**
     * Create an instance of {@link STXLevel }
     * 
     */
    public STXLevel createSTXLevel() {
        return new STXLevel();
    }

    /**
     * Create an instance of {@link STXFolder }
     * 
     */
    public STXFolder createSTXFolder() {
        return new STXFolder();
    }

    /**
     * Create an instance of {@link STXPartition }
     * 
     */
    public STXPartition createSTXPartition() {
        return new STXPartition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Value", scope = STXAnswer.class)
    public JAXBElement<String> createSTXAnswerValue(String value) {
        return new JAXBElement<String>(_STXAnswerValue_QNAME, String.class, STXAnswer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PUDt", scope = STXTubePos.class)
    public JAXBElement<XMLGregorianCalendar> createSTXTubePosPUDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_STXTubePosPUDt_QNAME, XMLGregorianCalendar.class, STXTubePos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PLDt", scope = STXTubePos.class)
    public JAXBElement<XMLGregorianCalendar> createSTXTubePosPLDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_STXTubePosPLDt_QNAME, XMLGregorianCalendar.class, STXTubePos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PIDt", scope = STXTubePos.class)
    public JAXBElement<XMLGregorianCalendar> createSTXTubePosPIDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_STXTubePosPIDt_QNAME, XMLGregorianCalendar.class, STXTubePos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STXTube }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PTb", scope = STXTubePos.class)
    public JAXBElement<STXTube> createSTXTubePosPTb(STXTube value) {
        return new JAXBElement<STXTube>(_STXTubePosPTb_QNAME, STXTube.class, STXTubePos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LvlLoadDate", scope = STXLevel.class)
    public JAXBElement<XMLGregorianCalendar> createSTXLevelLvlLoadDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_STXLevelLvlLoadDate_QNAME, XMLGregorianCalendar.class, STXLevel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STXPlate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LvlPlt", scope = STXLevel.class)
    public JAXBElement<STXPlate> createSTXLevelLvlPlt(STXPlate value) {
        return new JAXBElement<STXPlate>(_STXLevelLvlPlt_QNAME, STXPlate.class, STXLevel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LvlInvDate", scope = STXLevel.class)
    public JAXBElement<XMLGregorianCalendar> createSTXLevelLvlInvDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_STXLevelLvlInvDate_QNAME, XMLGregorianCalendar.class, STXLevel.class, value);
    }

}
