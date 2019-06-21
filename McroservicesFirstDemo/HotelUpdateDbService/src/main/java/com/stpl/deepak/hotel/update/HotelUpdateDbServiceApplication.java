package com.stpl.deepak.hotel.update;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelUpdateDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelUpdateDbServiceApplication.class, args);
	}
}
