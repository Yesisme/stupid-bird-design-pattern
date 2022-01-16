package com.lym.design.pattern.creational.factory.abstractFactory.v1;

public class AudiBicycle implements Bicycle {
    @Override
    public void produceBicycle() {
        System.out.println("生产奥迪自行车");
    }
}
