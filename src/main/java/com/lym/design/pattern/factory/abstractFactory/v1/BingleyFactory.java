package com.lym.design.pattern.factory.abstractFactory.v1;

public class BingleyFactory extends TrafficFactory {
    @Override
    Car getCar() {
        return new BingleyCar();
    }

    @Override
    Bicycle getBicycle() {
        return new BingleyBicycle();
    }

}
