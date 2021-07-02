package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {
        "CARDNUMBER"
})
@XmlRootElement(name = "GetOnlinePaymentRequest")
public class GetOnlinePaymentRequest {

    protected int OnlinePayment;

    public int getOnlinePayment(){

        return OnlinePayment;
    }

    public void setOnlinePayment(int OnlinePayment) {

        this.OnlinePayment = OnlinePayment;
    }

    public String getRRN() {
        return  getRRN();
    }
}


