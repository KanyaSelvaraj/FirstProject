package com.onlinepayment.onlinepaymentspringbootsoap.OnlinepaymentSpringbootExample.endpoint;


import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.paymentdetail.PaymentDetail;
import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.request.GetOnlinePaymentRequest;
import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.response.GetOnlinePaymentResponse;
import com.onlinepayment.onlinepaymentspringbootsoap.OnlinepaymentSpringbootExample.repository.OnlinePaymentRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.annotation.XmlElement;
import java.util.logging.Logger;


@Endpoint
public class OnlinePaymentEndPoint {

    //namespace = "http://onlinepayment.com/spring_boot_soap_example",


//
//      @PayloadRoot(localPart = "getOnlinePaymentRequest")
//      @ResponsePayload
//      public GetOnlinePaymentResponse processOnlinePaymentRequest(@RequestPayload GetOnlinePaymentRequest request){
//          GetOnlinePaymentResponse response = new GetOnlinePaymentResponse();
//
//          OnlinePaymentDetail onlinePaymentDetail = new OnlinePaymentDetail();
//          onlinePaymentDetail.setRRN(request.getRRN());
//          onlinePaymentDetail.setCARDNUMBER(123445567);
//          onlinePaymentDetail.setCUSTID(01);
//
//          response .setOnlinePaymentDetail(onlinePaymentDetail);
//
//          return response;
//      }
     @XmlElement(namespace="", required = true)
     private static final String NAMESPACE_URI = "";
    private OnlinePaymentRepository onlinePaymentRepository;


    @Autowired
    public OnlinePaymentEndPoint(OnlinePaymentRepository onlinePaymentRepository) {
        this.onlinePaymentRepository = onlinePaymentRepository;
    }


    @PayloadRoot(namespace = "http://onlinepayment.com/spring_boot_soap_example",localPart = "getOnlinePaymentRequest")
    @ResponsePayload
    public GetOnlinePaymentResponse processOnlinePaymentRequest(@RequestPayload GetOnlinePaymentRequest request){
        GetOnlinePaymentResponse response = new GetOnlinePaymentResponse();

          PaymentDetail paymentDetail = new PaymentDetail();
          paymentDetail.setRRN(request.getRRN());
          paymentDetail.setCARDNUMBER(123445567);
          paymentDetail.setCUSTID(01);
          paymentDetail.setMSGDESCRIPTION("Message ok");
          paymentDetail.setRESPONSECODE("Resonscode");
          paymentDetail.setAVAILLIMIT(200);

        response.setPaymentDetail(paymentDetail);


        return response;
    }


}

