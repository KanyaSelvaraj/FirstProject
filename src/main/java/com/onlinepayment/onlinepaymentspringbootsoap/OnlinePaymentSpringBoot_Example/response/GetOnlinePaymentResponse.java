//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.03 at 02:32:27 PM BST 
//


package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.response;

import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.onlinepaymentdetail.OnlinePaymentDetail;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="onlinePaymentDetail" type="{http://onlinepayment.com/spring_boot_soap_example}onlinePaymentDetail"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "onlinePaymentDetail"
})
@XmlRootElement(name = "getOnlinePaymentResponse")
public class GetOnlinePaymentResponse {

    @XmlElement(required = true)
    protected OnlinePaymentDetail onlinePaymentDetail;

    /**
     * Gets the value of the onlinePaymentDetail property.
     *
     * @return
     *     possible object is
     *     {@link OnlinePaymentDetail }
     *
     */
    public OnlinePaymentDetail getOnlinePaymentDetail() {
        return onlinePaymentDetail;
    }

    /**
     * Sets the value of the onlinePaymentDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link OnlinePaymentDetail }
     *     
     */
    public void setOnlinePaymentDetail(OnlinePaymentDetail value) {
        this.onlinePaymentDetail = value;
    }

}
