package com.lym.design.pattern.creational.build.v2;

public class Car {

    private String carName;

    private String carTyre;

    private String carEngine;

    private String carBasePlate;


    public Car(CarBuild carBuild) {
        this.carName = carBuild.carName;
        this.carTyre = carBuild.carTyre;
        this.carEngine = carBuild.carEngine;
        this.carBasePlate = carBuild.carBasePlate;
    }

    public static class CarBuild {
        private String carName;
        private String carTyre;
        private String carEngine;
        private String carBasePlate;

        public CarBuild buildCarName(String carName) {
            this.carName = carName;
            return this;
        }

        public CarBuild buildCarTyre(String carTyre) {
            this.carTyre = carTyre;
            return this;
        }

        public CarBuild buildCarEngine(String carEngine) {
            this.carEngine = carEngine;
            return this;
        }

        public CarBuild buildCarBasePlate(String carBasePlate) {
            this.carBasePlate = carBasePlate;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
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
