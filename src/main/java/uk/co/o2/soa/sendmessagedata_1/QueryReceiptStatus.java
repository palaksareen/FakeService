
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Query receipt status
 * 
 * <p>Java class for queryReceiptStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryReceiptStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "queryReceiptStatus", propOrder = {
    "queryTransactionId",
    "applicationReference",
    "subMerchantId"
})
public class QueryReceiptStatus {

    @XmlElement(required = true)
    protected String queryTransactionId;
    protected String applicationReference;
    protected String subMerchantId;

    /**
     * Gets the value of the queryTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryTransactionId() {
        return queryTransactionId;
    }

    /**
     * Sets the value of the queryTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryTransactionId(String value) {
        this.queryTransactionId = value;
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
