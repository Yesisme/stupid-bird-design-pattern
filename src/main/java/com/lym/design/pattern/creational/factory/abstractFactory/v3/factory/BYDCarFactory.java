package com.lym.design.pattern.creational.factory.abstractFactory.v3.factory;

import com.lym.design.pattern.creational.factory.abstractFactory.v3.AbstarctMask;
import com.lym.design.pattern.creational.factory.abstractFactory.v3.AbstractCar;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BYDCarFactory.java
 * @Description
 * @createTime 2022-01-13 22:24
 */
public abstract class BYDCarFactory extends BYDFactory {

    @Override
    public abstract AbstractCar getCar();

    @Override
    public AbstarctMask getMask() {
        System.out.println("暂时不造口罩");
        return null;
    }
}
