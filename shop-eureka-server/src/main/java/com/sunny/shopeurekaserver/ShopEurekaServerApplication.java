package com.sunny.shopeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: tec_feng
 * @Date: 2020/04/07
 * @Email: tec_feng@hotmail.com
 */
@EnableEurekaServer
@SpringBootApplication
public class ShopEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopEurekaServerApplication.class, args);
	}

}
