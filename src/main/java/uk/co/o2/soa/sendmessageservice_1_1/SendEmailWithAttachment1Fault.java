
package uk.co.o2.soa.sendmessageservice_1_1;

import javax.xml.ws.WebFault;
import uk.co.o2.soa.coredata_1.SOAFaultType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "sendEmailWithAttachment_1Fault", targetNamespace = "http://soa.o2.co.uk/sendmessagedata_1")
public class SendEmailWithAttachment1Fault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SOAFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SendEmailWithAttachment1Fault(String message, SOAFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SendEmailWithAttachment1Fault(String message, SOAFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: uk.co.o2.soa.coredata_1.SOAFaultType
     */
    public SOAFaultType getFaultInfo() {
        return faultInfo;
    }

}
