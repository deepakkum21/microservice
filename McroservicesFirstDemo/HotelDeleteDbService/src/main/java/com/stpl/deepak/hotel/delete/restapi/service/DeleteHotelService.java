package com.stpl.deepak.hotel.delete.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stpl.deepak.hotel.delete.restapi.repository.HotelDeleteRepository;

@Service
public class DeleteHotelService {

	@Autowired
	private HotelDeleteRepository hotelDeleteRepository;
	
	public String deleteHotel(String hotelId) {
		System.out.println("deletecalled");
		return hotelDeleteRepository.deleteHotelByHotelId(hotelId);
	}
}
