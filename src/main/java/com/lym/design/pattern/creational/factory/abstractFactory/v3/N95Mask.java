package com.lym.design.pattern.creational.factory.abstractFactory.v3;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName N95Mask.java
 * @Description
 * @createTime 2022-01-13 21:26
 */
public class N95Mask extends AbstarctMask {

    @Override
    void productFacialMask() {
        System.out.println("生产N95口罩!");
    }

    @Override
    void price() {
        System.out.println("价格15元!");
    }
}
