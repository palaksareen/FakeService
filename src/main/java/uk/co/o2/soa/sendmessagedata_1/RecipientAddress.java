
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The recipient address structure
 * 			
 * 
 * <p>Java class for recipientAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recipientAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="friendlyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://soa.o2.co.uk/sendmessagedata_1}emailAddressType"/>
 *         &lt;element name="recipientType" type="{http://soa.o2.co.uk/sendmessagedata_1}recipientType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recipientAddress", propOrder = {
    "friendlyName",
    "emailAddress",
    "recipientType"
})
public class RecipientAddress {

    protected String friendlyName;
    @XmlElement(required = true)
    protected String emailAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RecipientType recipientType;

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the recipientType property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientType }
     *     
     */
    public RecipientType getRecipientType() {
        return recipientType;
    }

    /**
     * Sets the value of the recipientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientType }
     *     
     */
    public void setRecipientType(RecipientType value) {
        this.recipientType = value;
    }

}
