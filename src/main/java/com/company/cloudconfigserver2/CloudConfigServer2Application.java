package com.company.cloudconfigserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServer2Application.class, args);
	}

}
