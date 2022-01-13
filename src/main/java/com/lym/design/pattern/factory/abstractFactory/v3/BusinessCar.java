package com.lym.design.pattern.factory.abstractFactory.v3;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BingleyCar.java
 * @Description
 * @createTime 2022-01-13 21:24
 */
public class BusinessCar extends AbstractCar {

    @Override
    void productTire() {
        System.out.println("生产商务汽车轮胎!");
    }

    @Override
    void productEngine() {
        System.out.println("生产商务汽车引擎!");
    }
}
