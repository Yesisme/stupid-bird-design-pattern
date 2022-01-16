package com.lym.design.pattern.creational.factory.abstractFactory.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName CommonMask.java
 * @Description
 * @createTime 2022-01-13 21:28
 */
public class CommonMask extends Mask {
    @Override
    void productFacialMask() {
        System.out.println("生产普通口罩!");
    }

    @Override
    void price() {
        System.out.println("普通口罩2元钱!");
    }
}
