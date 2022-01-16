package com.lym.design.pattern.creational.factory.factoryMethod;

public class AudiCarFactory extends CarFactory {
    @Override
    Car getCar() {
        return new AudiCar();
    }
}
