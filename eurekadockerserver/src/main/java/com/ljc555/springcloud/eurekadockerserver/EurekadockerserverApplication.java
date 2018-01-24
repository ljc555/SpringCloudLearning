package com.ljc555.springcloud.eurekadockerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekadockerserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekadockerserverApplication.class, args);
	}
}
