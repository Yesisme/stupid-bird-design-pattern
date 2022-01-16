package com.lym.design.pattern.structural.bridge.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AbstractPhone.java
 * @Description
 * @createTime 2022-01-15 23:29
 */
public abstract class AbstractPhone {

    public AbstractSale sale;

    abstract String getPhone();

    public void setAbstractSale(AbstractSale sale) {
        this.sale = sale;
    }

}
