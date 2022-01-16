package com.lym.design.pattern.structural.bridge.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Car.java
 * @Description
 * @createTime 2022-01-16 14:20
 */
public class Car extends AbstractCar {

    @Override
    void run() {
        super.run();
        System.out.println("小汽车");
    }
}
