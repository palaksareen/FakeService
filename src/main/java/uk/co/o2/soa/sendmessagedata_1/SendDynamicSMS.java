
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Send dynamic SMS
 * 
 * <p>Java class for sendDynamicSMS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendDynamicSMS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdnList" type="{http://soa.o2.co.uk/sendmessagedata_1}msisdnList"/>
 *         &lt;element name="originator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receiptURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="messageType" type="{http://soa.o2.co.uk/sendmessagedata_1}messageType"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mtprofile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendDynamicSMS", propOrder = {
    "msisdnList",
    "originator",
    "receiptURL",
    "message",
    "messageType",
    "ttl",
    "mtprofile",
    "applicationReference",
    "subMerchantId"
})
public class SendDynamicSMS {

    @XmlElement(required = true)
    protected MsisdnList msisdnList;
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
    protected String applicationReference;
    protected String subMerchantId;

    /**
     * Gets the value of the msisdnList property.
     * 
     * @return
     *     possible object is
     *     {@link MsisdnList }
     *     
     */
    public MsisdnList getMsisdnList() {
        return msisdnList;
    }

    /**
     * Sets the value of the msisdnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsisdnList }
     *     
     */
    public void setMsisdnList(MsisdnList value) {
        this.msisdnList = value;
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

    /**
     * Gets the value of the applicationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationReference() {
        return applicationReference;
    }

    /**
     * Sets the value of the applicationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationReference(String value) {
        this.applicationReference = value;
    }

    /**
     * Gets the value of the subMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubMerchantId() {
        return subMerchantId;
    }

    /**
     * Sets the value of the subMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubMerchantId(String value) {
        this.subMerchantId = value;
    }

}
