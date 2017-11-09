
package uk.co.o2.soa.sendmessageservice_1_1;

import java.util.List;

import javax.xml.ws.Holder;

import uk.co.o2.soa.coredata_1.ServiceResultType;
import uk.co.o2.soa.coredata_1.TypeYesOrNo;
import uk.co.o2.soa.sendmessagedata_1.ChargingInformation;
import uk.co.o2.soa.sendmessagedata_1.CustomMsgParametersType;
import uk.co.o2.soa.sendmessagedata_1.CustomerparametersType;
import uk.co.o2.soa.sendmessagedata_1.Format;
import uk.co.o2.soa.sendmessagedata_1.MessagePriority;
import uk.co.o2.soa.sendmessagedata_1.MessageRecipient;
import uk.co.o2.soa.sendmessagedata_1.MessageType;
import uk.co.o2.soa.sendmessagedata_1.MsisdnList;
import uk.co.o2.soa.sendmessagedata_1.MsisdnUnlimitedList;
import uk.co.o2.soa.sendmessagedata_1.RecipientAddress;
import uk.co.o2.soa.sendmessagedata_1.RecipientAddress1;
import uk.co.o2.soa.sendmessagedata_1.ResultType;
import uk.co.o2.soa.sendmessagedata_1.SendEmailDetailsType;
import uk.co.o2.soa.sendmessagedata_1.SendSMSDetailsType;
import uk.co.o2.soa.sendmessagedata_1.SenderAddress;
import uk.co.o2.soa.sendmessagedata_1.SenderAddress1;
import uk.co.o2.soa.sendmessagedata_1.SimpleReference;




@javax.jws.WebService(
        serviceName = "SendMessage",
        portName = "SendMessagePortType",
        targetNamespace = "http://soa.o2.co.uk/sendmessageservice_1_1",
        wsdlLocation = "sendmessageservice_1_1.wsdl",
        endpointInterface = "uk.co.o2.soa.sendmessageservice_1_1.SendMessagePortType")
public class SendMessagePortTypeImpl implements SendMessagePortType {

	@Override
	public ResultType sendSMS(String mtProfile, MsisdnList msisdnList, String receiptURL, String message,
			MessageType messageType, int ttl, String applicationReference, String subMerchantId) throws SendSMSFault {
		ResultType resultType = new ResultType();
		resultType.setStatusDescription("success");
		return resultType;
	}

	@Override
	public String sendMMS(MsisdnUnlimitedList msisdnList, String senderAddress, String subject,
			MessagePriority priority, ChargingInformation charging, SimpleReference receiptRequest)
			throws SendMMSFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResultType sendEmail(SenderAddress senderAddress, RecipientAddress toAddress, String subject,
			Format format, String message, String disclaimerMessage) throws SendEmailFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultType queryReceiptStatus(String queryTransactionId, String applicationReference, String subMerchantId)
			throws QueryReceiptStatusFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultType sendDynamicSMS(MsisdnList msisdnList, String originator, String receiptURL, Object message,
			MessageType messageType, int ttl, String mtprofile, String applicationReference, String subMerchantId)
			throws SendDynamicSMSFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultType sendMultiSMS(String receiptURL, MessageType messageType, int ttl, String mtprofile,
			List<MessageRecipient> messageRecipient, String applicationReference, String subMerchantId)
			throws SendMultiSMSFault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResultType sendEmailWithAttachment1(SenderAddress1 senderAddress, RecipientAddress1 toAddress,
			String subject, Format format, String message, String disclaimerMessage)
			throws SendEmailWithAttachment1Fault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResultType sendNotification1(String userName, String password, String msisdn, String smsTemplateID,
			String emailTemplateID, String productType, CustomerparametersType customerparameters)
			throws SendNotification1Fault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultType sendClientFilteredSMS1(String msisdn, String originator, String receiptURL, Object message,
			MessageType messageType, int ttl, String mtprofile) throws SendClientFilteredSMS1Fault {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendNotificationMessage1(String eventId, String msisdn, CustomMsgParametersType customMsgParameters,
			TypeYesOrNo sendSMS, SendSMSDetailsType sendSMSDetails, TypeYesOrNo sendEmail,
			SendEmailDetailsType sendEmailDetails, String autoRouting, Holder<ServiceResultType> status,
			Holder<String> pushNotificationTransactionId) throws SendNotificationMessage1Fault {
		// TODO Auto-generated method stub
		
	}



}
