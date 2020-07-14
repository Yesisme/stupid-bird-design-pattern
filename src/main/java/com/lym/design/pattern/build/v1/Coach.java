package com.lym.design.pattern.build.v1;

public class Coach {
    private CarBuild carBuild;

    public void setCarBuild(CarBuild carBuild) {
        this.carBuild = carBuild;
    }

    public Car makeCar(String carName,String carTyre,String carEngine,String carBasePlate){
        this.carBuild.buildCarName(carName);
        this.carBuild.buildCarTyre(carTyre);
        this.carBuild.buildCarEngine(carEngine);
        this.carBuild.buildCarBasePlate(carBasePlate);
        return this.carBuild.makeCar();
    }
}
