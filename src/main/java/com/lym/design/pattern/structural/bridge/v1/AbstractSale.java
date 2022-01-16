package com.lym.design.pattern.structural.bridge.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AbstarctSale.java
 * @Description
 * @createTime 2022-01-15 23:30
 */
public class AbstractSale {

    private String channel;

    private String price;

    public AbstractSale(String channel, String price) {
        this.channel = channel;
        this.price = price;
    }

    public String getSaleInfo() {
        return "渠道" + channel + "价格" + price;
    }

}
