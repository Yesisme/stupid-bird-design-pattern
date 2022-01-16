package com.lym.design.pattern.structural.bridge.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName SpeedWay.java
 * @Description
 * @createTime 2022-01-16 14:16
 */
public class SpeedWay extends AbstractRoad {
    @Override
    void run() {
        super.run();
        car.run();
        System.out.println("再高速路上行驶!");
    }
}
