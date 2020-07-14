package com.lym.design.pattern.build.v1;

public class CarRealBuild extends CarBuild{

    private Car car = new Car();

    @Override
    void buildCarName(String carName) {
        car.setCarName(carName);
    }

    @Override
    void buildCarTyre(String carTyre) {
        car.setCarTyre(carTyre);
    }

    @Override
    void buildCarEngine(String carEngine) {
        car.setCarEngine(carEngine);
    }

    @Override
    void buildCarBasePlate(String basePlate) {
        car.setCarBasePlate(basePlate);
    }

    @Override
    Car makeCar() {
        return car;
    }
}
