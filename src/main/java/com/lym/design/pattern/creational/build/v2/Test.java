package com.lym.design.pattern.creational.build.v2;

public class Test {
    public static void main(String[] args) {
        Car car = new Car.CarBuild().
                buildCarName("奥迪汽车").
                buildCarTyre("奥迪轮胎").
                buildCarEngine("奥迪引擎").
                buildCarBasePlate("奥迪底盘").
                build();

        System.out.println(car);
    }
}
