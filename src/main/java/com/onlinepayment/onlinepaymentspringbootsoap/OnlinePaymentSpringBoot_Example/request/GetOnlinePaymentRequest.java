package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.request;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {
        "RRN"
})
@XmlRootElement(name = "GetOnlinePaymentRequest")
public class GetOnlinePaymentRequest {

    @XmlElement(required = true)
    protected String RRN;

    public String getRRN(){
        return RRN;
    }




}


