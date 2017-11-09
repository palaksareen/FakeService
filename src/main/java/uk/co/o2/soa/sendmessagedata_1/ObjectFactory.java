
package uk.co.o2.soa.sendmessagedata_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import uk.co.o2.soa.coredata_1.SOAFaultType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.o2.soa.sendmessagedata_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendDynamicSMSFault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendDynamicSMSFault");
    private final static QName _SendMMS_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendMMS");
    private final static QName _SendMMSResponse_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendMMSResponse");
    private final static QName _SendNotification1Response_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendNotification_1Response");
    private final static QName _SendMultiSMS_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendMultiSMS");
    private final static QName _SendEmailWithAttachment1Response_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendEmailWithAttachment_1Response");
    private final static QName _SendClientFilteredSMS1Response_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendClientFilteredSMS_1Response");
    private final static QName _SendEmailWithAttachment1_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendEmailWithAttachment_1");
    private final static QName _SendMultiSMSFault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendMultiSMSFault");
    private final static QName _SendEmailResponse_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendEmailResponse");
    private final static QName _SendNotificationMessage1Fault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendNotificationMessage_1Fault");
    private final static QName _QueryReceiptStatusFault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "queryReceiptStatusFault");
    private final static QName _SendSMS_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendSMS");
    private final static QName _SendNotification1_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendNotification_1");
    private final static QName _QueryReceiptStatusResponse_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "queryReceiptStatusResponse");
    private final static QName _SendNotification1Fault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendNotification_1Fault");
    private final static QName _SendEmailFault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendEmailFault");
    private final static QName _SendDynamicSMS_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendDynamicSMS");
    private final static QName _SendClientFilteredSMS1Fault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendClientFilteredSMS_1Fault");
    private final static QName _SendSMSFault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendSMSFault");
    private final static QName _SendNotificationMessage1_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendNotificationMessage_1");
    private final static QName _SendMMSFault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendMMSFault");
    private final static QName _SendMultiSMSResponse_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendMultiSMSResponse");
    private final static QName _SendClientFilteredSMS1_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendClientFilteredSMS_1");
    private final static QName _SendNotificationMessage1Response_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendNotificationMessage_1Response");
    private final static QName _SendEmailWithAttachment1Fault_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendEmailWithAttachment_1Fault");
    private final static QName _SendDynamicSMSResponse_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendDynamicSMSResponse");
    private final static QName _SendSMSResponse_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendSMSResponse");
    private final static QName _QueryReceiptStatus_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "queryReceiptStatus");
    private final static QName _SendEmail_QNAME = new QName("http://soa.o2.co.uk/sendmessagedata_1", "sendEmail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.o2.soa.sendmessagedata_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMultiSMSResponse }
     * 
     */
    public SendMultiSMSResponse createSendMultiSMSResponse() {
        return new SendMultiSMSResponse();
    }

    /**
     * Create an instance of {@link SendNotificationMessage1 }
     * 
     */
    public SendNotificationMessage1 createSendNotificationMessage1() {
        return new SendNotificationMessage1();
    }

    /**
     * Create an instance of {@link SendClientFilteredSMS1 }
     * 
     */
    public SendClientFilteredSMS1 createSendClientFilteredSMS1() {
        return new SendClientFilteredSMS1();
    }

    /**
     * Create an instance of {@link SendDynamicSMS }
     * 
     */
    public SendDynamicSMS createSendDynamicSMS() {
        return new SendDynamicSMS();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendSMSResponse }
     * 
     */
    public SendSMSResponse createSendSMSResponse() {
        return new SendSMSResponse();
    }

    /**
     * Create an instance of {@link QueryReceiptStatus }
     * 
     */
    public QueryReceiptStatus createQueryReceiptStatus() {
        return new QueryReceiptStatus();
    }

    /**
     * Create an instance of {@link SendNotificationMessage1Response }
     * 
     */
    public SendNotificationMessage1Response createSendNotificationMessage1Response() {
        return new SendNotificationMessage1Response();
    }

    /**
     * Create an instance of {@link SendDynamicSMSResponse }
     * 
     */
    public SendDynamicSMSResponse createSendDynamicSMSResponse() {
        return new SendDynamicSMSResponse();
    }

    /**
     * Create an instance of {@link SendClientFilteredSMS1Response }
     * 
     */
    public SendClientFilteredSMS1Response createSendClientFilteredSMS1Response() {
        return new SendClientFilteredSMS1Response();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmailWithAttachment1 }
     * 
     */
    public SendEmailWithAttachment1 createSendEmailWithAttachment1() {
        return new SendEmailWithAttachment1();
    }

    /**
     * Create an instance of {@link SendMMSResponse }
     * 
     */
    public SendMMSResponse createSendMMSResponse() {
        return new SendMMSResponse();
    }

    /**
     * Create an instance of {@link SendNotification1Response }
     * 
     */
    public SendNotification1Response createSendNotification1Response() {
        return new SendNotification1Response();
    }

    /**
     * Create an instance of {@link SendMMS }
     * 
     */
    public SendMMS createSendMMS() {
        return new SendMMS();
    }

    /**
     * Create an instance of {@link SendMultiSMS }
     * 
     */
    public SendMultiSMS createSendMultiSMS() {
        return new SendMultiSMS();
    }

    /**
     * Create an instance of {@link SendEmailWithAttachment1Response }
     * 
     */
    public SendEmailWithAttachment1Response createSendEmailWithAttachment1Response() {
        return new SendEmailWithAttachment1Response();
    }

    /**
     * Create an instance of {@link SendSMS }
     * 
     */
    public SendSMS createSendSMS() {
        return new SendSMS();
    }

    /**
     * Create an instance of {@link QueryReceiptStatusResponse }
     * 
     */
    public QueryReceiptStatusResponse createQueryReceiptStatusResponse() {
        return new QueryReceiptStatusResponse();
    }

    /**
     * Create an instance of {@link SendNotification1 }
     * 
     */
    public SendNotification1 createSendNotification1() {
        return new SendNotification1();
    }

    /**
     * Create an instance of {@link SenderAddress }
     * 
     */
    public SenderAddress createSenderAddress() {
        return new SenderAddress();
    }

    /**
     * Create an instance of {@link ChargingInformation }
     * 
     */
    public ChargingInformation createChargingInformation() {
        return new ChargingInformation();
    }

    /**
     * Create an instance of {@link RecipientAddress1 }
     * 
     */
    public RecipientAddress1 createRecipientAddress1() {
        return new RecipientAddress1();
    }

    /**
     * Create an instance of {@link CustomerparametersType }
     * 
     */
    public CustomerparametersType createCustomerparametersType() {
        return new CustomerparametersType();
    }

    /**
     * Create an instance of {@link MessageRecipient }
     * 
     */
    public MessageRecipient createMessageRecipient() {
        return new MessageRecipient();
    }

    /**
     * Create an instance of {@link CustomerparameterType }
     * 
     */
    public CustomerparameterType createCustomerparameterType() {
        return new CustomerparameterType();
    }

    /**
     * Create an instance of {@link RecipientAddress }
     * 
     */
    public RecipientAddress createRecipientAddress() {
        return new RecipientAddress();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link SendEmailDetailsType }
     * 
     */
    public SendEmailDetailsType createSendEmailDetailsType() {
        return new SendEmailDetailsType();
    }

    /**
     * Create an instance of {@link MessageReceipt }
     * 
     */
    public MessageReceipt createMessageReceipt() {
        return new MessageReceipt();
    }

    /**
     * Create an instance of {@link MsisdnUnlimitedList }
     * 
     */
    public MsisdnUnlimitedList createMsisdnUnlimitedList() {
        return new MsisdnUnlimitedList();
    }

    /**
     * Create an instance of {@link CustomMsgParametersType }
     * 
     */
    public CustomMsgParametersType createCustomMsgParametersType() {
        return new CustomMsgParametersType();
    }

    /**
     * Create an instance of {@link SimpleReference }
     * 
     */
    public SimpleReference createSimpleReference() {
        return new SimpleReference();
    }

    /**
     * Create an instance of {@link SenderAddress1 }
     * 
     */
    public SenderAddress1 createSenderAddress1() {
        return new SenderAddress1();
    }

    /**
     * Create an instance of {@link SendSMSDetailsType }
     * 
     */
    public SendSMSDetailsType createSendSMSDetailsType() {
        return new SendSMSDetailsType();
    }

    /**
     * Create an instance of {@link MsisdnList }
     * 
     */
    public MsisdnList createMsisdnList() {
        return new MsisdnList();
    }

    /**
     * Create an instance of {@link MsisdnStatus }
     * 
     */
    public MsisdnStatus createMsisdnStatus() {
        return new MsisdnStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendDynamicSMSFault")
    public JAXBElement<SOAFaultType> createSendDynamicSMSFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendDynamicSMSFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendMMS")
    public JAXBElement<SendMMS> createSendMMS(SendMMS value) {
        return new JAXBElement<SendMMS>(_SendMMS_QNAME, SendMMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendMMSResponse")
    public JAXBElement<SendMMSResponse> createSendMMSResponse(SendMMSResponse value) {
        return new JAXBElement<SendMMSResponse>(_SendMMSResponse_QNAME, SendMMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotification1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendNotification_1Response")
    public JAXBElement<SendNotification1Response> createSendNotification1Response(SendNotification1Response value) {
        return new JAXBElement<SendNotification1Response>(_SendNotification1Response_QNAME, SendNotification1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMultiSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendMultiSMS")
    public JAXBElement<SendMultiSMS> createSendMultiSMS(SendMultiSMS value) {
        return new JAXBElement<SendMultiSMS>(_SendMultiSMS_QNAME, SendMultiSMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailWithAttachment1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendEmailWithAttachment_1Response")
    public JAXBElement<SendEmailWithAttachment1Response> createSendEmailWithAttachment1Response(SendEmailWithAttachment1Response value) {
        return new JAXBElement<SendEmailWithAttachment1Response>(_SendEmailWithAttachment1Response_QNAME, SendEmailWithAttachment1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendClientFilteredSMS1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendClientFilteredSMS_1Response")
    public JAXBElement<SendClientFilteredSMS1Response> createSendClientFilteredSMS1Response(SendClientFilteredSMS1Response value) {
        return new JAXBElement<SendClientFilteredSMS1Response>(_SendClientFilteredSMS1Response_QNAME, SendClientFilteredSMS1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailWithAttachment1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendEmailWithAttachment_1")
    public JAXBElement<SendEmailWithAttachment1> createSendEmailWithAttachment1(SendEmailWithAttachment1 value) {
        return new JAXBElement<SendEmailWithAttachment1>(_SendEmailWithAttachment1_QNAME, SendEmailWithAttachment1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendMultiSMSFault")
    public JAXBElement<SOAFaultType> createSendMultiSMSFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendMultiSMSFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendNotificationMessage_1Fault")
    public JAXBElement<SOAFaultType> createSendNotificationMessage1Fault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendNotificationMessage1Fault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "queryReceiptStatusFault")
    public JAXBElement<SOAFaultType> createQueryReceiptStatusFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_QueryReceiptStatusFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendSMS")
    public JAXBElement<SendSMS> createSendSMS(SendSMS value) {
        return new JAXBElement<SendSMS>(_SendSMS_QNAME, SendSMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotification1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendNotification_1")
    public JAXBElement<SendNotification1> createSendNotification1(SendNotification1 value) {
        return new JAXBElement<SendNotification1>(_SendNotification1_QNAME, SendNotification1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryReceiptStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "queryReceiptStatusResponse")
    public JAXBElement<QueryReceiptStatusResponse> createQueryReceiptStatusResponse(QueryReceiptStatusResponse value) {
        return new JAXBElement<QueryReceiptStatusResponse>(_QueryReceiptStatusResponse_QNAME, QueryReceiptStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendNotification_1Fault")
    public JAXBElement<SOAFaultType> createSendNotification1Fault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendNotification1Fault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendEmailFault")
    public JAXBElement<SOAFaultType> createSendEmailFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendEmailFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDynamicSMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendDynamicSMS")
    public JAXBElement<SendDynamicSMS> createSendDynamicSMS(SendDynamicSMS value) {
        return new JAXBElement<SendDynamicSMS>(_SendDynamicSMS_QNAME, SendDynamicSMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendClientFilteredSMS_1Fault")
    public JAXBElement<SOAFaultType> createSendClientFilteredSMS1Fault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendClientFilteredSMS1Fault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendSMSFault")
    public JAXBElement<SOAFaultType> createSendSMSFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendSMSFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationMessage1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendNotificationMessage_1")
    public JAXBElement<SendNotificationMessage1> createSendNotificationMessage1(SendNotificationMessage1 value) {
        return new JAXBElement<SendNotificationMessage1>(_SendNotificationMessage1_QNAME, SendNotificationMessage1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendMMSFault")
    public JAXBElement<SOAFaultType> createSendMMSFault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendMMSFault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMultiSMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendMultiSMSResponse")
    public JAXBElement<SendMultiSMSResponse> createSendMultiSMSResponse(SendMultiSMSResponse value) {
        return new JAXBElement<SendMultiSMSResponse>(_SendMultiSMSResponse_QNAME, SendMultiSMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendClientFilteredSMS1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendClientFilteredSMS_1")
    public JAXBElement<SendClientFilteredSMS1> createSendClientFilteredSMS1(SendClientFilteredSMS1 value) {
        return new JAXBElement<SendClientFilteredSMS1>(_SendClientFilteredSMS1_QNAME, SendClientFilteredSMS1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationMessage1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendNotificationMessage_1Response")
    public JAXBElement<SendNotificationMessage1Response> createSendNotificationMessage1Response(SendNotificationMessage1Response value) {
        return new JAXBElement<SendNotificationMessage1Response>(_SendNotificationMessage1Response_QNAME, SendNotificationMessage1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendEmailWithAttachment_1Fault")
    public JAXBElement<SOAFaultType> createSendEmailWithAttachment1Fault(SOAFaultType value) {
        return new JAXBElement<SOAFaultType>(_SendEmailWithAttachment1Fault_QNAME, SOAFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDynamicSMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendDynamicSMSResponse")
    public JAXBElement<SendDynamicSMSResponse> createSendDynamicSMSResponse(SendDynamicSMSResponse value) {
        return new JAXBElement<SendDynamicSMSResponse>(_SendDynamicSMSResponse_QNAME, SendDynamicSMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendSMSResponse")
    public JAXBElement<SendSMSResponse> createSendSMSResponse(SendSMSResponse value) {
        return new JAXBElement<SendSMSResponse>(_SendSMSResponse_QNAME, SendSMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryReceiptStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "queryReceiptStatus")
    public JAXBElement<QueryReceiptStatus> createQueryReceiptStatus(QueryReceiptStatus value) {
        return new JAXBElement<QueryReceiptStatus>(_QueryReceiptStatus_QNAME, QueryReceiptStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.o2.co.uk/sendmessagedata_1", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

}
