
package uk.co.o2.soa.sendmessagedata_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates the message receipt for all the msisdns
 * 				mentioned in the request
 * 
 * <p>Java class for messageReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageReceipt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msisdnStatus" type="{http://soa.o2.co.uk/sendmessagedata_1}msisdnStatus" maxOccurs="100"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageReceipt", propOrder = {
    "msisdnStatus"
})
public class MessageReceipt {

    @XmlElement(required = true)
    protected List<MsisdnStatus> msisdnStatus;

    /**
     * Gets the value of the msisdnStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msisdnStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsisdnStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsisdnStatus }
     * 
     * 
     */
    public List<MsisdnStatus> getMsisdnStatus() {
        if (msisdnStatus == null) {
            msisdnStatus = new ArrayList<MsisdnStatus>();
        }
        return this.msisdnStatus;
    }

}
