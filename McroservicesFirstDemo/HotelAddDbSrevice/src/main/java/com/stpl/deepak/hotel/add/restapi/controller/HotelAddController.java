package com.stpl.deepak.hotel.add.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stpl.deepak.hotel.add.restapi.model.HotelModel;
import com.stpl.deepak.hotel.add.restapi.service.HotelAddService;

@EnableMongoRepositories(basePackages="com.stpl.deepak.hotel.add.restapi.repository")
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/hotel")
public class HotelAddController {

	@Autowired 
	private HotelAddService hotelAddService;
	
	@PostMapping( value ="/addHotel")
	public HotelModel addHotel(@RequestBody HotelModel hotelModel) {
		return hotelAddService.addHotel(hotelModel);
	}
}
