//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.03 at 02:32:27 PM BST 
//


package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.paymentdetail;


import javax.xml.bind.annotation.*;


/**
 * <p>Java class for paymentDetail.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentDetail"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RRN"/&gt;
 *     &lt;enumeration value="CUSTID"/&gt;
 *     &lt;enumeration value="CARDNUMBER"/&gt;
 *     &lt;enumeration value="MSGDESCRIPTION"/&gt;
 *     &lt;enumeration value="RESPONSECODE"/&gt;
 *     &lt;enumeration value="AVAILLIMIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentDetail")
//        "rrn",
//        "custid",
//        "cardnumber",
//        "MSGDESCRIPTION",
//        "RESPONSECODE",
//        "AVAILLIMIT",
//
//})
@XmlRootElement(name = "paymentDetail", namespace = "http://onlinepayment.com/spring_boot_soap_example")
public class PaymentDetail {

    @XmlAttribute
    protected String rrn;
    @XmlAttribute
    protected int custid;
    @XmlAttribute
    protected int cardnumber;
    @XmlAttribute
    protected String msgdescripition;
    @XmlAttribute
    protected String resoncode;
    @XmlAttribute
    protected int availlimit;


    public String getRRN() {

        return rrn;
    }

    public void setRRN(String rrn) {

        this.rrn = rrn;
    }

    public int getCUSTID() {

        return custid;
    }

    public void setCUSTID(int value) {

        this.custid = value;
    }

    public int getCARDNYMBER() {

        return cardnumber;
    }

    public void setCARDNUMBER(int cardnumber) {

        this.cardnumber = cardnumber;
    }

    public String getMSGDESCRIPTION() {

        return msgdescripition;
    }

    public void setMSGDESCRIPTION(String msgdescripition) {

        this.msgdescripition = msgdescripition;
    }

    public String getRESPONSECODE() {

        return resoncode;
    }

    public void setRESPONSECODE(String resoncode) {

        this.resoncode = resoncode;
    }

    public int getAVAILLIMIT() {

        return availlimit;
    }

    public void setAVAILLIMIT(int availlimit) {

        this.availlimit = availlimit;
    }

}
