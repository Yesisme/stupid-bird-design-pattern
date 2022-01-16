package com.lym.design.pattern.structural.decorator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName NataDeCoCo.java
 * @Description
 * @createTime 2022-01-16 16:07
 */
public class NataDeCoCo extends Dosing{

    public NataDeCoCo(IMilkyTea iMilkyTea) {
        super(iMilkyTea);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("加椰果!");
    }
}
