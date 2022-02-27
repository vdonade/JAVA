package com.ssh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ssh")
public class SshkeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SshkeyApplication.class, args);
	}

}
