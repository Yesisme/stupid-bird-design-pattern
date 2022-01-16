package com.lym.design.pattern.creational.factory.factoryMethod;

public class BingleyCarFactory extends CarFactory {

    @Override
    Car getCar() {
        return new BingleyCar();
    }
}
