package com.lym.design.pattern.creational.build.v1;

public abstract class AbstractCarBuild {

    protected Car car;

    abstract AbstractCarBuild buildCarName(String carName);

    abstract AbstractCarBuild buildCarTyre(String carTyre);

    abstract AbstractCarBuild buildCarEngine(String carEngine);

    abstract AbstractCarBuild buildCarBasePlate(String basePlate);

    Car build() {
        return car;
    }

}
