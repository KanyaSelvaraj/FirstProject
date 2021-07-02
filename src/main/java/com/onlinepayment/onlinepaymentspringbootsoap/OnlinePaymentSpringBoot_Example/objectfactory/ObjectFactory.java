package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.objectfactory;

import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.request.GetOnlinePaymentRequest;
import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.response.GetOnlinePaymentResponse;
import com.onlinepayment.spring_boot_soap_example.OnlinePaymentDetail;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory(){
    }
    public GetOnlinePaymentResponse createGetOnlinePaymentResponse() {

        return new GetOnlinePaymentResponse();
    }
    public OnlinePaymentDetail createOnlinePaymentDetail() {

        return new OnlinePaymentDetail();
    }
    public GetOnlinePaymentRequest createGetOnlinePaymentRequest() {

        return new GetOnlinePaymentRequest() ;
    }


}

