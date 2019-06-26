package com.deepak.cloud.MongoDbSpringMultiTenant.model;

public class Car {
    private String modelNo;
    private String type;
    private int manufactureYear;
    private int mileage;
    private String engineType;

    public Car(String modelNo, String type, int manufactureYear, int mileage, String engineType) {
        this.modelNo = modelNo;
        this.type = type;
        this.manufactureYear = manufactureYear;
        this.mileage = mileage;
        this.engineType = engineType;
    }

    public Car() {
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}