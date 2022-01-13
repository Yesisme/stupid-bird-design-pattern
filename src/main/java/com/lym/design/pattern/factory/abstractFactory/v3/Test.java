package com.lym.design.pattern.factory.abstractFactory.v3;

import com.lym.design.pattern.factory.abstractFactory.v3.factory.BYDFactory;
import com.lym.design.pattern.factory.abstractFactory.v3.factory.BusinessBYDCarFactory;
import com.lym.design.pattern.factory.abstractFactory.v3.factory.CommonMasKFactory;
import com.lym.design.pattern.factory.abstractFactory.v3.factory.MiniBYDCarFactory;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-01-13 22:37
 */
public class Test {

    public static void main(String[] args) {
        BYDFactory bydFactory = new MiniBYDCarFactory();
        bydFactory.getCar().productEngine();
        bydFactory.getCar().productTire();
        //bydFactory.getMask().price();

        BYDFactory bydFactory1 = new BusinessBYDCarFactory();
        final AbstractCar car1 = bydFactory1.getCar();
        car1.productTire();
        car1.productEngine();

        BYDFactory bydFactory3 = new CommonMasKFactory();
        final AbstarctMask mask = bydFactory3.getMask();
        mask.price();
        mask.productFacialMask();
    }
}
