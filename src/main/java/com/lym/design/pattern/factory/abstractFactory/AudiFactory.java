package com.lym.design.pattern.factory.abstractFactory;

public class AudiFactory extends TrafficFactory{
    @Override
    Car getCar() {
        return new AudiCar();
    }

    @Override
    Bicycle getBicycle() {
        return new AudiBicycle();
    }
}
