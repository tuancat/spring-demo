package com.sam.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayApplication.class, args);
	}

}
