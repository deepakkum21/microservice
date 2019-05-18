package com.stpl.deepak.hotel.update.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stpl.deepak.hotel.update.restapi.model.HotelModel;
import com.stpl.deepak.hotel.update.restapi.service.FindByHoteIdService;
import com.stpl.deepak.hotel.update.restapi.service.HotelUpdateService;

@EnableMongoRepositories(basePackages = "com.stpl.deepak.hotel.update.restapi.repository")
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "/hotel")
public class HotelUpdateController {

	@Autowired
	private HotelUpdateService hotelUpdateService;

	@Autowired
	FindByHoteIdService findByHoteIdService;

	@PutMapping(value = "/updateHotel/{hotelId}")
	public ResponseEntity<HotelModel> updateHotel(@PathVariable("hotelId") String hotelId,@RequestBody HotelModel hotelModel) {
		HotelModel resultHotelModel=findByHoteIdService.findByHotelId(hotelId);
		if (resultHotelModel != null) {
			hotelModel.setHotelId(hotelId);
			hotelModel.setId(resultHotelModel.getId());
			return ResponseEntity.ok().body(hotelUpdateService.updateHotel(hotelModel));
		}
		return ResponseEntity.notFound().build();
	}
}
