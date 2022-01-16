package com.lym.design.pattern.creational.build.v1;

public class Test {

    public static void main(String[] args) {
        Car car = new CarBuild()
                .buildCarName("奥迪汽车")
                .buildCarBasePlate("奥迪轮胎")
                .buildCarEngine("奥迪引擎")
                .buildCarTyre("奥迪底盘")
                .build();
        System.out.println(car);
    }
}
