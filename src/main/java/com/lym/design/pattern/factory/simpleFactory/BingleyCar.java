package com.lym.design.pattern.factory.simpleFactory;

public class BingleyCar implements Car{
    @Override
    public void produce() {
        System.out.println("生产宾利汽车");
    }
}
