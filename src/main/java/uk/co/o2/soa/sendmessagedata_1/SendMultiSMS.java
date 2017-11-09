
package uk.co.o2.soa.sendmessagedata_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Send multi SMS
 * 
 * <p>Java class for sendMultiSMS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMultiSMS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="receiptURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="messageType" type="{http://soa.o2.co.uk/sendmessagedata_1}messageType"/>
 *           &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="mtprofile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="messageRecipient" type="{http://soa.o2.co.uk/sendmessagedata_1}messageRecipient" maxOccurs="100"/>
 *           &lt;element name="applicationReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="subMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMultiSMS", propOrder = {
    "receiptURL",
    "messageType",
    "ttl",
    "mtprofile",
    "messageRecipient",
    "applicationReference",
    "subMerchantId"
})
public class SendMultiSMS {

    protected String receiptURL;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MessageType messageType;
    protected int ttl;
    @XmlElement(required = true)
    protected String mtprofile;
    @XmlElement(required = true)
    protected List<MessageRecipient> messageRecipient;
    protected String applicationReference;
    protected String subMerchantId;

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
     * Gets the value of the messageRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageRecipient }
     * 
     * 
     */
    public List<MessageRecipient> getMessageRecipient() {
        if (messageRecipient == null) {
            messageRecipient = new ArrayList<MessageRecipient>();
        }
        return this.messageRecipient;
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
