package com.onlinepayment.onlinepaymentspringbootsoap.OnlinepaymentSpringbootExample.Endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class OnlinePaymentEndPoint {



      @PayloadRoot(namespace = "http://onlinepayment.com/spring_boot_soap_example", localPart = "GetOnlinPaymentRequest")
      @ResponsePayload
      public GetOnlinePaymentResponse processOnlinePaymentRequest(@RequestPayload GetOnlinePaymentRequest request){
          GetOnlinePaymentResponse response = new GetOnlinePaymentResponse();

          OnlinePaymentDetail onlinePaymentDetail = new OnlinePaymentDetail();
          onlinePaymentDetail.setRRN(request.getRRN());
          onlinePaymentDetail.setCARDNUMBER(123445567);
          onlinePaymentDetail.setCUSTID(01);

          response .setOnlinePaymentDetail(onlinePaymentDetail);

          return response;
      }

}



