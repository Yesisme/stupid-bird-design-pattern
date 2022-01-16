package com.lym.design.pattern.creational.factory.abstractFactory.v2;

import com.lym.design.pattern.creational.factory.abstractFactory.v2.factory.BMCarFactory;
import com.lym.design.pattern.creational.factory.abstractFactory.v2.factory.BusinessFactory;
import com.lym.design.pattern.creational.factory.abstractFactory.v2.factory.MiniCarFactory;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 产品等级 产品族
 * 产品族,手机,汽车,口罩
 * 产品等级,小米手机,华为手机,vivo手机
 * <p>     货车,迷你汽车,轿车
 * N95口罩 普通口罩
 * 产品族里面包含全部的产品等级 比亚迪手机,比亚迪汽车,比亚迪口罩   小米手机,小米汽车,小米口罩
 * @createTime 2022-01-13 21:39
 */
public class Test {

    public static void main(String[] args) {
        BMCarFactory bmCarFactory = new BusinessFactory();
        final Car car = bmCarFactory.getCar();
        car.productEngine();
        car.productTire();
        final Mask mask = bmCarFactory.getMask();
        mask.price();
        mask.productFacialMask();

        final MiniCarFactory miniCarFactory = new MiniCarFactory();
        miniCarFactory.getCar().productEngine();
        miniCarFactory.getCar().productTire();
        miniCarFactory.getMask().productFacialMask();
        miniCarFactory.getMask().price();
    }
}
