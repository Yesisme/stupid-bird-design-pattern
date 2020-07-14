package com.lym.design.pattern.factory.simpleFactory;

public class CarFactory {

    public Car proxy(String type){
        if("Audi".equals(type)){
            return new AudiCar();
        }else if("Bingley".equals(type)){
            return new BingleyCar();
        }else {
            return null;
        }
    }
}
