package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn")
public class RestFullWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFullWebServicesApplication.class, args);
	}

}
