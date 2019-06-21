package com.stpl.deepak.hotel.delete.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stpl.deepak.hotel.delete.restapi.model.HotelModel;

@Repository
public interface HotelDeleteRepository extends MongoRepository<HotelModel, String>{

	public HotelModel findByHotelId(String hotelId);
	
	public String deleteHotelByHotelId(String hotelId);
}
