package com.stpl.deepak.hotel.delete.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stpl.deepak.hotel.delete.restapi.service.DeleteHotelService;

@EnableMongoRepositories(basePackages = "com.stpl.deepak.hotel.delete.restapi.repository")
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/hotel")
public class HotelDeleteController {

	@Autowired
	private DeleteHotelService deleteHotelService;
	
	@DeleteMapping(value="/deleteHotel/{hotelId}")
	public String deleteHotel(@PathVariable("hotelId") String hotelId) {
		System.out.println("deletecalled");
		if(Integer.parseInt(deleteHotelService.deleteHotel(hotelId)) == 0) {
			return "Hotel ID not Preset /n So unbale to delete!!!!!!!!!!!!";
		}
		return "Deleted Successfully";
	}
}
