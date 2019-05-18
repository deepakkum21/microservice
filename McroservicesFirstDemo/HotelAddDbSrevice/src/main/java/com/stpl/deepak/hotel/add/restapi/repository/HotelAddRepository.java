package com.stpl.deepak.hotel.add.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stpl.deepak.hotel.add.restapi.model.HotelModel;

@Repository
public interface HotelAddRepository extends MongoRepository<HotelModel, String>{

}
