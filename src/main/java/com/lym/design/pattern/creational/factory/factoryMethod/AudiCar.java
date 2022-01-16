package com.lym.design.pattern.creational.factory.factoryMethod;

public class AudiCar implements Car {
    @Override
    public void produce() {
        System.out.println("生产奥迪汽车");
    }
}
