package com.deepak.cloud.MongoDbSpringMultiTenant.service;

import java.util.List;

import com.deepak.cloud.MongoDbSpringMultiTenant.model.Car;
import com.deepak.cloud.MongoDbSpringMultiTenant.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarFindService {

    @Autowired
    private CarRepository findRepository;

    public List<Car> findCars(String modelNo) {
        return findRepository.findAllByModelNo(modelNo);
    }
}