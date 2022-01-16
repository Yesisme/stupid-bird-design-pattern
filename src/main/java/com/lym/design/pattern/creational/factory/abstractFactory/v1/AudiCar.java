package com.lym.design.pattern.creational.factory.abstractFactory.v1;

public class AudiCar implements Car {


    @Override
    public void produceCar() {
        System.out.println("生产奥迪汽车");
    }
}
