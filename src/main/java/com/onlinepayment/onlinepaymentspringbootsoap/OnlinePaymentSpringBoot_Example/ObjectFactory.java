package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example;

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

