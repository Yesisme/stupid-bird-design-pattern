package com.lym.design.pattern.factory.abstractFactory.v3.factory;

import com.lym.design.pattern.factory.abstractFactory.v3.AbstarctMask;
import com.lym.design.pattern.factory.abstractFactory.v3.AbstractCar;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BYDMaskFactory.java
 * @Description
 * @createTime 2022-01-13 22:25
 */
public abstract class BYDMaskFactory extends BYDFactory {
    @Override
    public AbstractCar getCar() {
        return null;
    }

    @Override
    public abstract AbstarctMask getMask();
}
