package com.lym.design.pattern.factory.abstractFactory.v3;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AudiCar.java
 * @Description
 * @createTime 2022-01-13 21:22
 */
public class MiniCar extends AbstractCar {

    @Override
    void productTire() {
        System.out.println("生产迷你汽车轮胎!");
    }

    @Override
    void productEngine() {
        System.out.println("生产迷你汽车引擎!");
    }
}
