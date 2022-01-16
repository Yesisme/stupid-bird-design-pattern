package com.lym.design.pattern.structural.bridge.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Iphone.java
 * @Description
 * @createTime 2022-01-15 23:36
 */
public class Iphone extends AbstractPhone {

    @Override
    String getPhone() {
        return "iphone" + sale.getSaleInfo();
    }
}
