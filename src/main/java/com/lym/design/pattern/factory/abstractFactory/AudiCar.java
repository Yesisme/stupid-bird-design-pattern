package com.lym.design.pattern.factory.abstractFactory;

public class AudiCar implements Car{


    @Override
    public void produceCar() {
        System.out.println("生产奥迪汽车");
    }
}
