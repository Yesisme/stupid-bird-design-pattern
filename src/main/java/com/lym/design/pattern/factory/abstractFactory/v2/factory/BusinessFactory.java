package com.lym.design.pattern.factory.abstractFactory.v2.factory;

import com.lym.design.pattern.factory.abstractFactory.v2.BusinessCar;
import com.lym.design.pattern.factory.abstractFactory.v2.Car;
import com.lym.design.pattern.factory.abstractFactory.v2.Mask;
import com.lym.design.pattern.factory.abstractFactory.v2.N95Mask;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BingleyFactory.java
 * @Description
 * @createTime 2022-01-13 21:34
 */
public class BusinessFactory extends BMCarFactory {

    @Override
    public Car getCar() {
        return new BusinessCar();
    }

    @Override
    public Mask getMask() {
        return new N95Mask();
    }
}
