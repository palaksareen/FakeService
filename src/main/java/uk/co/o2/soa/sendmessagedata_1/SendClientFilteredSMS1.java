
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Send SMS only for moj customers
 * 			
 * 
 * <p>Java class for sendClientFilteredSMS_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendClientFilteredSMS_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType"/>
 *         &lt;element name="originator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receiptURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="messageType" type="{http://soa.o2.co.uk/sendmessagedata_1}messageType"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mtprofile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendClientFilteredSMS_1", propOrder = {
    "msisdn",
    "originator",
    "receiptURL",
    "message",
    "messageType",
    "ttl",
    "mtprofile"
})
public class SendClientFilteredSMS1 {

    @XmlElement(required = true)
    protected String msisdn;
    @XmlElement(required = true)
    protected String originator;
    protected String receiptURL;
    @XmlElement(required = true)
    protected Object message;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MessageType messageType;
    protected int ttl;
    @XmlElement(required = true)
    protected String mtprofile;

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
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
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
     * Gets the value of the mtprofile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtprofile() {
        return mtprofile;
    }

    /**
     * Sets the value of the mtprofile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtprofile(String value) {
        this.mtprofile = value;
    }

}
