//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.03 at 02:32:27 PM BST 
//


package com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.objectfactory;

import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.onlinepaymentdetail.OnlinePaymentDetail;
import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.request.GetOnlinePaymentRequest;
import com.onlinepayment.onlinepaymentspringbootsoap.OnlinePaymentSpringBoot_Example.response.GetOnlinePaymentResponse;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.onlinepayment.spring_boot_soap_example package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.onlinepayment.spring_boot_soap_example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOnlinePaymentRequest }
     * 
     */
    public GetOnlinePaymentRequest createGetOnlinePaymentRequest() {
        return new GetOnlinePaymentRequest();
    }

    /**
     * Create an instance of {@link GetOnlinePaymentResponse }
     * 
     */
    public GetOnlinePaymentResponse createGetOnlinePaymentResponse() {
        return new GetOnlinePaymentResponse();
    }

    /**
     * Create an instance of {@link OnlinePaymentDetail }
     * 
     */
    public OnlinePaymentDetail createOnlinePaymentDetail() {
        return new OnlinePaymentDetail();
    }

}
