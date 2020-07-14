package com.lym.design.pattern.factory.abstractFactory;

public class BingleyFactory extends TrafficFactory{
    @Override
    Car getCar() {
        return new BingleyCar();
    }

    @Override
    Bicycle getBicycle() {
        return new BingleyBicycle();
    }

}
