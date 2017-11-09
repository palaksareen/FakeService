
package uk.co.o2.soa.sendmessagedata_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The customer parameters of the subscriber
 * 			
 * 
 * <p>Java class for customerparametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerparametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerparameter" type="{http://soa.o2.co.uk/sendmessagedata_1}customerparameterType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerparametersType", propOrder = {
    "customerparameter"
})
public class CustomerparametersType {

    @XmlElement(required = true)
    protected List<CustomerparameterType> customerparameter;

    /**
     * Gets the value of the customerparameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerparameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerparameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerparameterType }
     * 
     * 
     */
    public List<CustomerparameterType> getCustomerparameter() {
        if (customerparameter == null) {
            customerparameter = new ArrayList<CustomerparameterType>();
        }
        return this.customerparameter;
    }

}
