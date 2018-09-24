package com.stpl.deepak.hotelfind.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stpl.deepak.hotelfind.restapi.model.HotelModel;

@Repository
public interface HotelFindRepository extends MongoRepository<HotelModel, String>{

	public HotelModel findByHotelId(String hotelId);
}
