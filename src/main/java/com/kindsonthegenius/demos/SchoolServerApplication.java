package com.kindsonthegenius.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SchoolServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolServerApplication.class, args);
	}

}
