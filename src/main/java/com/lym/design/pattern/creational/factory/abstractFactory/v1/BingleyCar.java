package com.lym.design.pattern.creational.factory.abstractFactory.v1;

public class BingleyCar implements Car {

    @Override
    public void produceCar() {
        System.out.println("生产宾利的汽车");
    }
}
