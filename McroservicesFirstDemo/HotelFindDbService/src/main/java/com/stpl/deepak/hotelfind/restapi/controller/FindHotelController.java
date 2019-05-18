package com.stpl.deepak.hotelfind.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stpl.deepak.hotelfind.restapi.model.HotelModel;
import com.stpl.deepak.hotelfind.restapi.service.FindHotelService;

@EnableMongoRepositories(basePackages="com.stpl.deepak.hotelfind.restapi.repository")
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/hotel")
public class FindHotelController {
	
	@Autowired
	private FindHotelService findHotelService;
	
	@GetMapping( value = "/findAllHotels")
	public List<HotelModel> getAllHotels() {
		return findHotelService.findAllHotel();
	}

}
