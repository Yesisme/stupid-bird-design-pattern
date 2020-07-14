package com.lym.design.pattern.factory.factoryMethod;

public class Test {

    public static void main(String[] args) {
        CarFactory audiCarFactory = new AudiCarFactory();
        audiCarFactory.getCar().produce();

        BingleyCarFactory bingleyCarFactory = new BingleyCarFactory();
        bingleyCarFactory.getCar().produce();
    }
}
