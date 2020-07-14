package com.lym.design.pattern.factory.abstractFactory;

public class AudiBicycle implements Bicycle{
    @Override
    public void produceBicycle() {
        System.out.println("生产奥迪自行车");
    }
}
