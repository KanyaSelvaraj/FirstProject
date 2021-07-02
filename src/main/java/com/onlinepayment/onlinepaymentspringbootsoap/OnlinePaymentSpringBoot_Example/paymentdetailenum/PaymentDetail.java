package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.paymentdetailenum;


import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Payment")
@XmlEnum
public enum PaymentDetail {

    RRN,
    CUSTID,
    CARDNUMBER,
    MSGDESCRIPTION,
    RESPONSECODE,
    AVAILLIMIT;

    public String value() {
        return name();
    }
    public static PaymentDetail fromValue(String v){
        return valueOf(v);
    }
}
