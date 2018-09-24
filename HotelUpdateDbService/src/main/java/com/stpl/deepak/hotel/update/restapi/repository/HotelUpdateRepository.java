package com.stpl.deepak.hotel.update.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stpl.deepak.hotel.update.restapi.model.HotelModel;


@Repository
public interface HotelUpdateRepository extends MongoRepository<HotelModel, String>{

	public HotelModel findByHotelId(String hotelId);
}
