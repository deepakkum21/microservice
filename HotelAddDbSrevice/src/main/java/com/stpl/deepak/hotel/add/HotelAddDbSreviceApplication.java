package com.stpl.deepak.hotel.add;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelAddDbSreviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelAddDbSreviceApplication.class, args);
	}
}
