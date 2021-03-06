
package uk.co.o2.soa.subscriberservice_2;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SubscriberService", targetNamespace = "http://soa.o2.co.uk/subscriberservice_2", wsdlLocation = "subscriberservice_2_0.wsdl")
public class SubscriberService
    extends Service
{

    private final static URL SUBSCRIBERSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUBSCRIBERSERVICE_EXCEPTION;
    private final static QName SUBSCRIBERSERVICE_QNAME = new QName("http://soa.o2.co.uk/subscriberservice_2", "SubscriberService");

    static {
        SUBSCRIBERSERVICE_WSDL_LOCATION = uk.co.o2.soa.subscriberservice_2.SubscriberService.class.getResource("subscriberservice_2_0.wsdl");
        WebServiceException e = null;
        if (SUBSCRIBERSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'subscriberservice_2_0.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SUBSCRIBERSERVICE_EXCEPTION = e;
    }

    public SubscriberService() {
        super(__getWsdlLocation(), SUBSCRIBERSERVICE_QNAME);
    }

    public SubscriberService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUBSCRIBERSERVICE_QNAME, features);
    }

    public SubscriberService(URL wsdlLocation) {
        super(wsdlLocation, SUBSCRIBERSERVICE_QNAME);
    }

    public SubscriberService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUBSCRIBERSERVICE_QNAME, features);
    }

    public SubscriberService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SubscriberService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SubscriberPort
     */
    @WebEndpoint(name = "SubscriberPort")
    public SubscriberPort getSubscriberPort() {
        return super.getPort(new QName("http://soa.o2.co.uk/subscriberservice_2", "SubscriberPort"), SubscriberPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SubscriberPort
     */
    @WebEndpoint(name = "SubscriberPort")
    public SubscriberPort getSubscriberPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soa.o2.co.uk/subscriberservice_2", "SubscriberPort"), SubscriberPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUBSCRIBERSERVICE_EXCEPTION!= null) {
            throw SUBSCRIBERSERVICE_EXCEPTION;
        }
        return SUBSCRIBERSERVICE_WSDL_LOCATION;
    }

}
