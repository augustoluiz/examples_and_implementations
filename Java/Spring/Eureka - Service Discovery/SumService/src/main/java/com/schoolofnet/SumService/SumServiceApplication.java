package com.schoolofnet.SumService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SumServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumServiceApplication.class, args);
	}

}
