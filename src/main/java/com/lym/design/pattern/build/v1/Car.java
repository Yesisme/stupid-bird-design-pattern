package com.lym.design.pattern.build.v1;

public class Car {

    private String carName;

    private String carTyre;

    private String carEngine;

    private String carBasePlate;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarTyre() {
        return carTyre;
    }

    public void setCarTyre(String carTyre) {
        this.carTyre = carTyre;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getCarBasePlate() {
        return carBasePlate;
    }

    public void setCarBasePlate(String carBasePlate) {
        this.carBasePlate = carBasePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carTyre='" + carTyre + '\'' +
                ", carEngine='" + carEngine + '\'' +
                ", carBasePlate='" + carBasePlate + '\'' +
                '}';
    }
}
