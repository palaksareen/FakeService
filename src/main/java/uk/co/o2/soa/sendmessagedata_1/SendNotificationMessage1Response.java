
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.coredata_1.ServiceResultType;


/**
 * Send Notification Message response structure
 * 			
 * 
 * <p>Java class for sendNotificationMessage_1Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendNotificationMessage_1Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://soa.o2.co.uk/coredata_1}ServiceResultType"/>
 *         &lt;element name="pushNotificationTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendNotificationMessage_1Response", propOrder = {
    "status",
    "pushNotificationTransactionId"
})
public class SendNotificationMessage1Response {

    @XmlElement(required = true)
    protected ServiceResultType status;
    @XmlElement(required = true)
    protected String pushNotificationTransactionId;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResultType }
     *     
     */
    public ServiceResultType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResultType }
     *     
     */
    public void setStatus(ServiceResultType value) {
        this.status = value;
    }

    /**
     * Gets the value of the pushNotificationTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPushNotificationTransactionId() {
        return pushNotificationTransactionId;
    }

    /**
     * Sets the value of the pushNotificationTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPushNotificationTransactionId(String value) {
        this.pushNotificationTransactionId = value;
    }

}
