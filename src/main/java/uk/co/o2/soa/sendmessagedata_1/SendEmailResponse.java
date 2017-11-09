
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.co.o2.soa.coredata_1.ServiceResultType;


/**
 * The response structure to hold the response after
 * 				dispatch of Email
 * 
 * <p>Java class for sendEmailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendEmailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://soa.o2.co.uk/coredata_1}ServiceResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendEmailResponse", propOrder = {
    "status"
})
public class SendEmailResponse {

    @XmlElement(required = true)
    protected ServiceResultType status;

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

}
