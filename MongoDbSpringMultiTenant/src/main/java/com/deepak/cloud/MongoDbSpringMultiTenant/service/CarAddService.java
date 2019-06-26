package com.deepak.cloud.MongoDbSpringMultiTenant.service;

import com.deepak.cloud.MongoDbSpringMultiTenant.model.Car;
import com.deepak.cloud.MongoDbSpringMultiTenant.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarAddService {
    @Autowired
    private CarRepository addRepository;

    public void addCar(Car car) {
        addRepository.save(car);
    }
}