package com.onlinepayment.onlinepaymentspringbootsoap.OnlinepaymentSpringbootExample.endpoint;


import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.onlinepaymentdetail.OnlinePaymentDetail;
import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.request.GetOnlinePaymentRequest;
import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.response.GetOnlinePaymentResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class OnlinePaymentEndPoint {

    //namespace = "http://onlinepayment.com/spring_boot_soap_example",



      @PayloadRoot(localPart = "getOnlinePaymentRequest")
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



