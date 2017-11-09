
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The request structure to send Notification
 * 			
 * 
 * <p>Java class for sendNotification_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendNotification_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msisdn" type="{http://soa.o2.co.uk/coredata_1}msisdnType"/>
 *         &lt;element name="smsTemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailTemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerparameters" type="{http://soa.o2.co.uk/sendmessagedata_1}customerparametersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendNotification_1", propOrder = {
    "userName",
    "password",
    "msisdn",
    "smsTemplateID",
    "emailTemplateID",
    "productType",
    "customerparameters"
})
public class SendNotification1 {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String msisdn;
    protected String smsTemplateID;
    protected String emailTemplateID;
    @XmlElement(required = true)
    protected String productType;
    protected CustomerparametersType customerparameters;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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

    /**
     * Gets the value of the emailTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailTemplateID() {
        return emailTemplateID;
    }

    /**
     * Sets the value of the emailTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailTemplateID(String value) {
        this.emailTemplateID = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the customerparameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerparametersType }
     *     
     */
    public CustomerparametersType getCustomerparameters() {
        return customerparameters;
    }

    /**
     * Sets the value of the customerparameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerparametersType }
     *     
     */
    public void setCustomerparameters(CustomerparametersType value) {
        this.customerparameters = value;
    }

}
