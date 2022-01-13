package com.lym.design.pattern.factory.abstractFactory.v2.factory;

import com.lym.design.pattern.factory.abstractFactory.v2.Car;
import com.lym.design.pattern.factory.abstractFactory.v2.Mask;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName LymCarFactory.java
 * @Description 产品族
 * @createTime 2022-01-13 21:32
 */
public abstract class BMCarFactory {

    public abstract Car getCar();

    public abstract Mask getMask();

}
