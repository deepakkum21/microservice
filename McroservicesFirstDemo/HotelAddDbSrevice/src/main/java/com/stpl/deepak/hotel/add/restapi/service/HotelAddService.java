package com.stpl.deepak.hotel.add.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stpl.deepak.hotel.add.restapi.model.HotelModel;
import com.stpl.deepak.hotel.add.restapi.repository.HotelAddRepository;

@Service
public class HotelAddService {
	
	@Autowired
	private HotelAddRepository hotelAddRepository;
	
	public HotelModel addHotel(HotelModel hotelModel) {
		
		return hotelAddRepository.insert(hotelModel);
	}

}
