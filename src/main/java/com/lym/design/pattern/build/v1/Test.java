package com.lym.design.pattern.build.v1;

public class Test {

    public static void main(String[] args) {
        CarBuild carBuild = new CarRealBuild();
        Coach coach = new Coach();
        coach.setCarBuild(carBuild);

        Car car = coach.makeCar("奥迪汽车", "奥迪轮胎", "奥迪引擎", "奥迪底盘");
        System.out.println(car);
    }
}
