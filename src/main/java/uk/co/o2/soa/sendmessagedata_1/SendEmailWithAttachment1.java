
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The request structure to send email
 * 			
 * 
 * <p>Java class for sendEmailWithAttachment_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendEmailWithAttachment_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="senderAddress" type="{http://soa.o2.co.uk/sendmessagedata_1}senderAddress_1"/>
 *         &lt;element name="toAddress" type="{http://soa.o2.co.uk/sendmessagedata_1}recipientAddress_1"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="format" type="{http://soa.o2.co.uk/sendmessagedata_1}format"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="disclaimerMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendEmailWithAttachment_1", propOrder = {
    "senderAddress",
    "toAddress",
    "subject",
    "format",
    "message",
    "disclaimerMessage"
})
public class SendEmailWithAttachment1 {

    @XmlElement(required = true)
    protected SenderAddress1 senderAddress;
    @XmlElement(required = true)
    protected RecipientAddress1 toAddress;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Format format;
    @XmlElement(required = true)
    protected String message;
    protected String disclaimerMessage;

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SenderAddress1 }
     *     
     */
    public SenderAddress1 getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderAddress1 }
     *     
     */
    public void setSenderAddress(SenderAddress1 value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the toAddress property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientAddress1 }
     *     
     */
    public RecipientAddress1 getToAddress() {
        return toAddress;
    }

    /**
     * Sets the value of the toAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientAddress1 }
     *     
     */
    public void setToAddress(RecipientAddress1 value) {
        this.toAddress = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link Format }
     *     
     */
    public Format getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link Format }
     *     
     */
    public void setFormat(Format value) {
        this.format = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the disclaimerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimerMessage() {
        return disclaimerMessage;
    }

    /**
     * Sets the value of the disclaimerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimerMessage(String value) {
        this.disclaimerMessage = value;
    }

}
