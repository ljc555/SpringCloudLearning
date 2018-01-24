package com.ljc555.springcloud.configserverdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Configserverprod1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configserverprod1Application.class, args);
	}
}
