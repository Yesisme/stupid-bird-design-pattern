package com.lym.design.pattern.structural.bridge.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BusCar.java
 * @Description
 * @createTime 2022-01-16 14:17
 */
public class BusCar extends AbstractCar {
    @Override
    void run() {
        super.run();
        System.out.println("公共汽车");
    }
}
