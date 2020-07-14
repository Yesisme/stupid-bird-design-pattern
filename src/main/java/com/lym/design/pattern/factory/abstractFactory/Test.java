package com.lym.design.pattern.factory.abstractFactory;

public class Test {
    public static void main(String[] args) {
        TrafficFactory audi = new AudiFactory();
        audi.getBicycle().produceBicycle();
        audi.getCar().produceCar();

        TrafficFactory bingley = new BingleyFactory();
        bingley.getCar().produceCar();
        bingley.getBicycle().produceBicycle();
    }
}
