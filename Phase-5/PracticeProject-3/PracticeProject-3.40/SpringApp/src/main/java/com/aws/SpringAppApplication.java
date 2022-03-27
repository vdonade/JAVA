package com.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan({"com.aws"})
@SpringBootApplication
@RestController
public class SpringAppApplication {
	
	@GetMapping("/")
	public String hello() {
		return "Hello from AWS";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
