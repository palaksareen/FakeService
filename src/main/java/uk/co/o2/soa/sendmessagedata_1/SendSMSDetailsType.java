
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Send SMS details
 * 
 * <p>Java class for sendSMSDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendSMSDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mtProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receiptURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="messageType" type="{http://soa.o2.co.uk/sendmessagedata_1}messageType"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="smsTemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSMSDetailsType", propOrder = {
    "mtProfile",
    "receiptURL",
    "message",
    "messageType",
    "ttl",
    "smsTemplateID"
})
public class SendSMSDetailsType {

    @XmlElement(required = true)
    protected String mtProfile;
    protected String receiptURL;
    @XmlElement(required = true)
    protected Object message;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MessageType messageType;
    protected int ttl;
    protected String smsTemplateID;

    /**
     * Gets the value of the mtProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtProfile() {
        return mtProfile;
    }

    /**
     * Sets the value of the mtProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtProfile(String value) {
        this.mtProfile = value;
    }

    /**
     * Gets the value of the receiptURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptURL() {
        return receiptURL;
    }

    /**
     * Sets the value of the receiptURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptURL(String value) {
        this.receiptURL = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMessage(Object value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessageType(MessageType value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     */
    public int getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     */
    public void setTtl(int value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the smsTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsTemplateID() {
        return smsTemplateID;
    }

    /**
     * Sets the value of the smsTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsTemplateID(String value) {
        this.smsTemplateID = value;
    }

}
