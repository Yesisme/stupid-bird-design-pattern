package com.lym.design.pattern.structural.bridge.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-01-16 14:20
 */
public class Test {
    public static void main(String[] args) {
        AbstractRoad road = new StreetRoad();
        road.car = new Car();
        road.run();
        road.car = new BusCar();
        road.run();

        AbstractRoad abstractRoad = new SpeedWay();
        abstractRoad.car = new Car();
        abstractRoad.run();

        abstractRoad.car = new BusCar();
        abstractRoad.run();
    }
}
