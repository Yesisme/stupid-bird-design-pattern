package com.lym.design.pattern.creational.build.v1;

public class CarBuild extends AbstractCarBuild {

    public CarBuild() {
        car = new Car();
    }

    @Override
    AbstractCarBuild buildCarName(String carName) {
        car.setCarName(carName);
        return this;
    }

    @Override
    AbstractCarBuild buildCarTyre(String carTyre) {
        car.setCarTyre(carTyre);
        return this;
    }

    @Override
    AbstractCarBuild buildCarEngine(String carEngine) {
        car.setCarEngine(carEngine);
        return this;
    }

    @Override
    AbstractCarBuild buildCarBasePlate(String basePlate) {
        car.setCarBasePlate(basePlate);
        return this;
    }

}
