package com.lym.design.pattern.factory.abstractFactory.v3.factory;

import com.lym.design.pattern.factory.abstractFactory.v3.AbstractCar;
import com.lym.design.pattern.factory.abstractFactory.v3.BusinessCar;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BusinessBYDCarFactory.java
 * @Description
 * @createTime 2022-01-13 22:23
 */
public class BusinessBYDCarFactory extends BYDCarFactory {

    @Override
    public AbstractCar getCar() {
        return new BusinessCar();
    }
}
