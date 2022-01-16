package com.lym.design.pattern.creational.factory.simpleFactory;

public class Test2 {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        factory.proxy("Audi").produce();
        factory.proxy("Bingley").produce();
    }
}
