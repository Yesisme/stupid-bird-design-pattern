package com.lym.design.pattern.creational.factory.abstractFactory.v1;

public class AudiFactory extends TrafficFactory {
    @Override
    Car getCar() {
        return new AudiCar();
    }

    @Override
    Bicycle getBicycle() {
        return new AudiBicycle();
    }
}
