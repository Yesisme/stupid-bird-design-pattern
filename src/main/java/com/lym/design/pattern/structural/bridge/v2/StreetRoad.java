package com.lym.design.pattern.structural.bridge.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName StreetRoad.java
 * @Description
 * @createTime 2022-01-16 14:16
 */
public class StreetRoad extends AbstractRoad {
    @Override
    void run() {
        super.run();
        car.run();
        System.out.println("在市区街道上行驶!");
    }
}
