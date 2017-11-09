
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.coredata_1.TypeYesOrNo;


/**
 * Send Notification Message request structure
 * 			
 * 
 * <p>Java class for sendNotificationMessage_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendNotificationMessage_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType"/>
 *         &lt;element name="customMsgParameters" type="{http://soa.o2.co.uk/sendmessagedata_1}customMsgParametersType" minOccurs="0"/>
 *         &lt;element name="sendSMS" type="{http://soa.o2.co.uk/coredata_1}typeYesOrNo" minOccurs="0"/>
 *         &lt;element name="sendSMSDetails" type="{http://soa.o2.co.uk/sendmessagedata_1}sendSMSDetailsType" minOccurs="0"/>
 *         &lt;element name="sendEmail" type="{http://soa.o2.co.uk/coredata_1}typeYesOrNo" minOccurs="0"/>
 *         &lt;element name="sendEmailDetails" type="{http://soa.o2.co.uk/sendmessagedata_1}sendEmailDetailsType" minOccurs="0"/>
 *         &lt;element name="autoRouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendNotificationMessage_1", propOrder = {
    "eventId",
    "msisdn",
    "customMsgParameters",
    "sendSMS",
    "sendSMSDetails",
    "sendEmail",
    "sendEmailDetails",
    "autoRouting"
})
public class SendNotificationMessage1 {

    @XmlElement(required = true)
    protected String eventId;
    @XmlElement(required = true)
    protected String msisdn;
    protected CustomMsgParametersType customMsgParameters;
    @XmlElement(defaultValue = "N")
    @XmlSchemaType(name = "string")
    protected TypeYesOrNo sendSMS;
    protected SendSMSDetailsType sendSMSDetails;
    @XmlElement(defaultValue = "N")
    @XmlSchemaType(name = "string")
    protected TypeYesOrNo sendEmail;
    protected SendEmailDetailsType sendEmailDetails;
    protected String autoRouting;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the customMsgParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomMsgParametersType }
     *     
     */
    public CustomMsgParametersType getCustomMsgParameters() {
        return customMsgParameters;
    }

    /**
     * Sets the value of the customMsgParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomMsgParametersType }
     *     
     */
    public void setCustomMsgParameters(CustomMsgParametersType value) {
        this.customMsgParameters = value;
    }

    /**
     * Gets the value of the sendSMS property.
     * 
     * @return
     *     possible object is
     *     {@link TypeYesOrNo }
     *     
     */
    public TypeYesOrNo getSendSMS() {
        return sendSMS;
    }

    /**
     * Sets the value of the sendSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeYesOrNo }
     *     
     */
    public void setSendSMS(TypeYesOrNo value) {
        this.sendSMS = value;
    }

    /**
     * Gets the value of the sendSMSDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SendSMSDetailsType }
     *     
     */
    public SendSMSDetailsType getSendSMSDetails() {
        return sendSMSDetails;
    }

    /**
     * Sets the value of the sendSMSDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendSMSDetailsType }
     *     
     */
    public void setSendSMSDetails(SendSMSDetailsType value) {
        this.sendSMSDetails = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link TypeYesOrNo }
     *     
     */
    public TypeYesOrNo getSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeYesOrNo }
     *     
     */
    public void setSendEmail(TypeYesOrNo value) {
        this.sendEmail = value;
    }

    /**
     * Gets the value of the sendEmailDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SendEmailDetailsType }
     *     
     */
    public SendEmailDetailsType getSendEmailDetails() {
        return sendEmailDetails;
    }

    /**
     * Sets the value of the sendEmailDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendEmailDetailsType }
     *     
     */
    public void setSendEmailDetails(SendEmailDetailsType value) {
        this.sendEmailDetails = value;
    }

    /**
     * Gets the value of the autoRouting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoRouting() {
        return autoRouting;
    }

    /**
     * Sets the value of the autoRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoRouting(String value) {
        this.autoRouting = value;
    }

}
