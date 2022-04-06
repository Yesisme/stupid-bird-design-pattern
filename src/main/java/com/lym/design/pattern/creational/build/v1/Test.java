package com.lym.design.pattern.creational.build.v1;

/**
 * 挥者（Director）：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息
 */
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
