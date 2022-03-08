package com.lym.design.pattern.structural.decorator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Pearl.java
 * @Description 具体装饰角色 珍珠
 * @createTime 2022-01-16 16:09
 */
public class PearlDecorator extends DosingDecorator {

    public PearlDecorator(IMilkyTea iMilkyTea) {
        super(iMilkyTea);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("加珍珠");
    }
}
