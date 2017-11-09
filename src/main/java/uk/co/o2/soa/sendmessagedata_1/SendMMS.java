
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Request to send MMS to MSISDN mentioned in
 * 				addresses
 * 
 * <p>Java class for sendMMS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMMS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdnList" type="{http://soa.o2.co.uk/sendmessagedata_1}msisdnUnlimitedList"/>
 *         &lt;element name="senderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://soa.o2.co.uk/sendmessagedata_1}messagePriority" minOccurs="0"/>
 *         &lt;element name="charging" type="{http://soa.o2.co.uk/sendmessagedata_1}chargingInformation" minOccurs="0"/>
 *         &lt;element name="receiptRequest" type="{http://soa.o2.co.uk/sendmessagedata_1}simpleReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMMS", propOrder = {
    "msisdnList",
    "senderAddress",
    "subject",
    "priority",
    "charging",
    "receiptRequest"
})
public class SendMMS {

    @XmlElement(required = true)
    protected MsisdnUnlimitedList msisdnList;
    protected String senderAddress;
    protected String subject;
    @XmlSchemaType(name = "string")
    protected MessagePriority priority;
    protected ChargingInformation charging;
    protected SimpleReference receiptRequest;

    /**
     * Gets the value of the msisdnList property.
     * 
     * @return
     *     possible object is
     *     {@link MsisdnUnlimitedList }
     *     
     */
    public MsisdnUnlimitedList getMsisdnList() {
        return msisdnList;
    }

    /**
     * Sets the value of the msisdnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsisdnUnlimitedList }
     *     
     */
    public void setMsisdnList(MsisdnUnlimitedList value) {
        this.msisdnList = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link MessagePriority }
     *     
     */
    public MessagePriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagePriority }
     *     
     */
    public void setPriority(MessagePriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the charging property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingInformation }
     *     
     */
    public ChargingInformation getCharging() {
        return charging;
    }

    /**
     * Sets the value of the charging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingInformation }
     *     
     */
    public void setCharging(ChargingInformation value) {
        this.charging = value;
    }

    /**
     * Gets the value of the receiptRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleReference }
     *     
     */
    public SimpleReference getReceiptRequest() {
        return receiptRequest;
    }

    /**
     * Sets the value of the receiptRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleReference }
     *     
     */
    public void setReceiptRequest(SimpleReference value) {
        this.receiptRequest = value;
    }

}
