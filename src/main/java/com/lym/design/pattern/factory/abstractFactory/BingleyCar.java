package com.lym.design.pattern.factory.abstractFactory;

public class BingleyCar implements Car {

    @Override
    public void produceCar() {
        System.out.println("生产宾利的汽车");
    }
}
