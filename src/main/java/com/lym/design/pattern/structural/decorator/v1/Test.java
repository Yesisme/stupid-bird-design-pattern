package com.lym.design.pattern.structural.decorator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 *   四个角色 奶茶,   波霸奶茶,    配料,      珍珠,椰果
 *    定义   抽象构件  具体构件    装饰角色   具体的装饰者角色
 * @createTime 2022-01-16 15:51
 */
public class Test {

    public static void main(String[] args) {
        IMilkyTea iMilkyTea = new BoBaMilkyTea();
        DosingDecorator nataDeCoCo = new NataDeCoCoDecorator(iMilkyTea);
        DosingDecorator pearl = new PearlDecorator(nataDeCoCo);
        pearl.make();
    }
}
