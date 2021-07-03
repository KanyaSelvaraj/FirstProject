package com.onlinepayment.onlinepaymentspringbootsoap.OnlinepaymentSpringbootExample.repository;

import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.onlinepaymentdetail.OnlinePaymentDetail;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;


import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class OnlinePaymentRepository {

    private static final Map<String, OnlinePaymentDetail> onlinePaymentDetail = new HashMap<>();
    @PostConstruct
    public void intialize() {
        OnlinePaymentDetail detail = new OnlinePaymentDetail();
        detail.setRRN("RollNumber");
        onlinePaymentDetail.put(detail.getRRN(), detail);
        detail.setBANKCODE("BankDetail");
        onlinePaymentDetail.put(detail.getBANKCODE(), detail);
        detail.setCARDNUMBER(1234567);
        detail.setLANACCOUNT("Accountdetail");
        onlinePaymentDetail.put(detail.getLANACCOUNT(), detail);
        detail.setCUSTID(01);
        detail.setACTIVITYFLAG("Active");
        onlinePaymentDetail.put(detail.getACTIVITYFLAG(), detail);
        detail.setSTATUSRRN("Status");
        onlinePaymentDetail.put(detail.getSTATUSRRN(), detail);
        detail.setAMOUNT(2000);
        detail.setLASTPAYDATE(500);
        detail.setTRANSNUMBER("Transfer");
        onlinePaymentDetail.put(detail.getTRANSNUMBER(), detail);
        detail.setREINSTATED("Reinstated");
        onlinePaymentDetail.put(detail.getREINSTATED(), detail);
    }

    public OnlinePaymentDetail findOnlinePaymentDetail(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return onlinePaymentDetail.get(name);
    }
}
