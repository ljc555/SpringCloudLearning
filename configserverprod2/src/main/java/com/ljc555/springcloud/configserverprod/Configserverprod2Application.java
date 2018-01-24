package com.ljc555.springcloud.configserverprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Configserverprod2Application {

	public static void main(String[] args) {
		SpringApplication.run(Configserverprod2Application.class, args);
	}
}
