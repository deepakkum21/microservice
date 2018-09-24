package com.stpl.deepak.hotelfind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelFindDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelFindDbServiceApplication.class, args);
	}
}
