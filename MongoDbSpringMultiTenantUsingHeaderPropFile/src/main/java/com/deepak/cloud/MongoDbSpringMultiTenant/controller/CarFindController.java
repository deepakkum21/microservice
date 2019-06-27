package com.deepak.cloud.MongoDbSpringMultiTenant.controller;

import java.util.List;

import com.deepak.cloud.MongoDbSpringMultiTenant.model.Car;
import com.deepak.cloud.MongoDbSpringMultiTenant.service.CarFindService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarFindController {
    @Autowired
    private CarFindService findService;

    @GetMapping("/findcars/{modelNo}")
    public List<Car> findCars(@RequestParam(required = false) String dbSchemaName,@PathVariable("modelNo") String modelNo){
        // Inject tenantId in the request
        // already set in MultiTenantFilter class
        //RequestContextHolder.getRequestAttributes().setAttribute("tenantId", dbSchemaName, RequestAttributes.SCOPE_REQUEST);
        return findService.findCars(modelNo);
    }
}