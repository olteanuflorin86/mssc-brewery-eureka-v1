package com.olteanuflorin86.msscbreweryeurekav1;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsscBreweryEurekaV1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryEurekaV1Application.class, args);
	}

}
