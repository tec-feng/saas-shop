package com.sunny.demo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class ShopMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopMonitorApplication.class, args);
	}

}
