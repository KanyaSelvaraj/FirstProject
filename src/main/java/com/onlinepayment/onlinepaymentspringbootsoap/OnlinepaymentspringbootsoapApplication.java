package com.onlinepayment.onlinepaymentspringbootsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.DependsOn;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@DependsOn
public class OnlinePaymentSpringBootSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePaymentSpringBootSoapApplication.class, args);
	}

}


