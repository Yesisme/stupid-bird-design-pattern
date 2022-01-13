package com.lym.design.pattern.factory.abstractFactory.v2.factory;

import com.lym.design.pattern.factory.abstractFactory.v2.Car;
import com.lym.design.pattern.factory.abstractFactory.v2.CommonMask;
import com.lym.design.pattern.factory.abstractFactory.v2.Mask;
import com.lym.design.pattern.factory.abstractFactory.v2.MiniCar;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AudiCarFactory.java
 * @Description
 * @createTime 2022-01-13 21:33
 */
public class MiniCarFactory extends BMCarFactory {


    @Override
    public Car getCar() {
        return new MiniCar();
    }

    @Override
    public Mask getMask() {
        return new CommonMask();
    }
}
