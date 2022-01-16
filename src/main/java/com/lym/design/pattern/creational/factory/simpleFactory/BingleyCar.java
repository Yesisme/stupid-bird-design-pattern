package com.lym.design.pattern.creational.factory.simpleFactory;

public class BingleyCar implements Car{
    @Override
    public void produce() {
        System.out.println("生产宾利汽车");
    }
}
