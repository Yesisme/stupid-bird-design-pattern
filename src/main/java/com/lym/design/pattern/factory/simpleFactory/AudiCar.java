package com.lym.design.pattern.factory.simpleFactory;

public class AudiCar implements Car{
    @Override
    public void produce() {
        System.out.println("生产奥迪汽车");
    }
}
