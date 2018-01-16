package com.ljh.springcloud.userserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Userserver2Application {

	public static void main(String[] args) {
		SpringApplication.run(Userserver2Application.class, args);
	}
}
