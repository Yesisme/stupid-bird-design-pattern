package com.lym.design.pattern.creational.factory.abstractFactory.v3.factory;

import com.lym.design.pattern.creational.factory.abstractFactory.v3.AbstractCar;
import com.lym.design.pattern.creational.factory.abstractFactory.v3.MiniCar;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName MiniBYDCarFactory.java
 * @Description
 * @createTime 2022-01-13 22:19
 */
public class MiniBYDCarFactory extends BYDCarFactory {

    @Override
    public AbstractCar getCar() {
        return new MiniCar();
    }

}
