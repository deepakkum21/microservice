package com.deepak.cloud.MongoDbSpringMultiTenant.repository;

import java.util.List;

import com.deepak.cloud.MongoDbSpringMultiTenant.model.Car;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {

	List<Car> findAllByModelNo(String modelNo);

}