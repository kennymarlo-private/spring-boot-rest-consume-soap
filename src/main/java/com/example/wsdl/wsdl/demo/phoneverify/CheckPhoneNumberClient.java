package com.example.wsdl.wsdl.demo.phoneverify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import phoneverify.wsdl.ArrayOfPhoneReturn;
import phoneverify.wsdl.CheckPhoneNumber;
import phoneverify.wsdl.CheckPhoneNumberResponse;
import phoneverify.wsdl.PhoneReturn;

import java.util.List;

/**
 * Mapped to SOAP Web service CheckPhoneNumber
 *
 * @author Kenny Marlo Cid
 */
public class CheckPhoneNumberClient extends WebServiceGatewaySupport {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Accepts string phone number and string licensekey and
     * returns phone number response in XML format
     * @param phoneNumber
     * @param licenseKey
     * @return {@link com.example.wsdl.wsdl.demo.phoneverify.CheckPhoneNumberClient}
     */
    public CheckPhoneNumberResponse checkPhoneNumber(String phoneNumber, String licenseKey){
        CheckPhoneNumber request = new CheckPhoneNumber();
        request.setPhoneNumber(phoneNumber);
        request.setLicenseKey(licenseKey);
        logger.info(String.format("Requesting check of Phone Number for %s with license key %s", phoneNumber, licenseKey));

        CheckPhoneNumberResponse response = (CheckPhoneNumberResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://ws.cdyne.com/phoneverify/phoneverify.asmx",
                        request,
                        new SoapActionCallback("http://ws.cdyne.com/PhoneVerify/query/CheckPhoneNumber"));

        return response;
    }
}
