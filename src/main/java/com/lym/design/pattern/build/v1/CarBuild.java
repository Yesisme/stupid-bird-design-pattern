package com.lym.design.pattern.build.v1;

public abstract class CarBuild {

    abstract void buildCarName(String carName);
    abstract void buildCarTyre(String carTyre);
    abstract void buildCarEngine(String carEngine);
    abstract void buildCarBasePlate(String basePlate);

    abstract Car makeCar();

}
