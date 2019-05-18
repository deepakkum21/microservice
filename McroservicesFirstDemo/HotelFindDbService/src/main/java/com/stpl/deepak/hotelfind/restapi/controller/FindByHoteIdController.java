package com.stpl.deepak.hotelfind.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stpl.deepak.hotelfind.restapi.model.HotelModel;
import com.stpl.deepak.hotelfind.restapi.service.FindByHoteIdService;

@EnableMongoRepositories(basePackages="com.stpl.deepak.hotelfind.restapi.repository")
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/hotel")
public class FindByHoteIdController {

	@Autowired
	private FindByHoteIdService findByHoteIdService;
	
	@GetMapping( value = "/findHotel/{hotelId}")
	public ResponseEntity<HotelModel> findHotelById(@PathVariable("hotelId") String hotelId) {
		HotelModel reponseHotelModel = findByHoteIdService.findByHotelId(hotelId);
		if(reponseHotelModel!= null) {
			
			return ResponseEntity.ok().body(reponseHotelModel);
		}
		return ResponseEntity.notFound().build();
	}
}
