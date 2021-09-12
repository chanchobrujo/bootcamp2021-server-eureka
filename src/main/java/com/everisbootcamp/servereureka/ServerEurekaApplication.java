package com.everisbootcamp.servereureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class ServerEurekaApplication { 
	public static void main(String[] args) {
		SpringApplication.run(ServerEurekaApplication.class, args);
		log.info("SERVER EUREKA ENABLED"); 
	}
}
