package com.stpl.deepak.hotelfind.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.stpl.deepak.hotelfind.restapi.model.HotelModel;
import com.stpl.deepak.hotelfind.restapi.repository.HotelFindRepository;

@Service
public class FindHotelService {

	@Autowired
	private HotelFindRepository hotelFindRepository;
	
	public List<HotelModel> findAllHotel(){
		Sort sortByCreatedAtDesc = new Sort(Sort.Direction.ASC, "hotelId");
		return hotelFindRepository.findAll(sortByCreatedAtDesc);
	}
}
