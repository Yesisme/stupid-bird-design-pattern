package com.lym.design.pattern.structural.bridge.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-01-16 13:31
 */
public class Test {

    public static void main(String[] args) {
        AbstractPhone phone = new Iphone();
        //phone.setAbstractSale(new OfflineSale("万达广场实体店", "12"));
        phone.setAbstractSale(new OnlineSale("苹果商城", "13"));
        System.out.println(phone.getPhone());
    }
}
