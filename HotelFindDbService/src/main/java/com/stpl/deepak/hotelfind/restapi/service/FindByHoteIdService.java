package com.stpl.deepak.hotelfind.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stpl.deepak.hotelfind.restapi.model.HotelModel;
import com.stpl.deepak.hotelfind.restapi.repository.HotelFindRepository;

@Service
public class FindByHoteIdService {

	@Autowired
	private HotelFindRepository hotelFindRepository;
		
	public HotelModel findByHotelId(String hotelId) {
		return hotelFindRepository.findByHotelId(hotelId);
	} 
}
