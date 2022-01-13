package com.lym.design.pattern.factory.abstractFactory.v1;

public class BingleyBicycle implements Bicycle {
    @Override
    public void produceBicycle() {
        System.out.println("生产宾利的自行车");
    }
}
