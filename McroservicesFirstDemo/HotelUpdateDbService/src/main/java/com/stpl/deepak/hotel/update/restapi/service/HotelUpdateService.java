package com.stpl.deepak.hotel.update.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stpl.deepak.hotel.update.restapi.model.HotelModel;
import com.stpl.deepak.hotel.update.restapi.repository.HotelUpdateRepository;

@Service
public class HotelUpdateService {

	@Autowired
	private HotelUpdateRepository hotelUpdateRepository;
	
	public HotelModel updateHotel(HotelModel hotelModel) {
		return hotelUpdateRepository.save(hotelModel);
	}
}
