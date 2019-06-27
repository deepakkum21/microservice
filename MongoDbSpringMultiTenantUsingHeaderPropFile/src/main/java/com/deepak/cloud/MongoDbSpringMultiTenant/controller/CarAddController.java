package com.deepak.cloud.MongoDbSpringMultiTenant.controller;

import com.deepak.cloud.MongoDbSpringMultiTenant.model.Car;
import com.deepak.cloud.MongoDbSpringMultiTenant.service.CarAddService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarAddController {

    @Autowired
    private CarAddService addService;

    @PostMapping("/add")
    public void addCar(@RequestParam(required = false) String dbSchemaName, @RequestBody Car car) {
        // Inject tenantId in the request
        // already set in MultiTenantFilter class
        //RequestContextHolder.getRequestAttributes().setAttribute("tenantId", dbSchemaName,RequestAttributes.SCOPE_REQUEST);

        // Car car = new Car();
        if (car.getManufactureYear() == 0) {
            car.setType("Four Wheeler");
            car.setEngineType("deisel");
            car.setManufactureYear(2015);
            car.setModelNo("BC101");
            car.setMileage(20);
        }

        addService.addCar(car);

        System.out.println("car addded------------");
    }
}