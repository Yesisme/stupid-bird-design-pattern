package com.lym.design.pattern.factory.abstractFactory.v3.factory;


import com.lym.design.pattern.factory.abstractFactory.v3.AbstarctMask;
import com.lym.design.pattern.factory.abstractFactory.v3.AbstractCar;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BYDCarFactory.java
 * @Description 对v2的继续抽象
 * @createTime 2022-01-13 22:16
 */
public abstract class BYDFactory {

    public abstract AbstractCar getCar();

    public abstract AbstarctMask getMask();

}
