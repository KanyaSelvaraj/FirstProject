package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "OnlinePaymentDetail"
})
@XmlRootElement(name = "GetOnlinePaymentResponse")
public class GetOnlinePaymentResponse {

    @XmlElement(name = "OnlinePaymentDetail", required = true)
    protected OnlinePaymentDetail onlinePaymentDetail;

    public OnlinePaymentDetail getOnlinePaymentDetail() {

        return onlinePaymentDetail;
    }
    public void setOnlinePaymentDetail(OnlinePaymentDetail value) {

        this.onlinePaymentDetail = value;
    }

}




