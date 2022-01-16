package com.lym.design.pattern.creational.factory.abstractFactory.v3.factory;

import com.lym.design.pattern.creational.factory.abstractFactory.v3.AbstarctMask;
import com.lym.design.pattern.creational.factory.abstractFactory.v3.AbstractCar;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName MaskFactory.java
 * @Description
 * @createTime 2022-01-13 22:30
 */
public abstract class MaskFactory extends BYDFactory {

    @Override
    public AbstractCar getCar() {
        System.out.println("目前不支持造汽车!");
        return null;
    }

    @Override
    public abstract AbstarctMask getMask();
}
