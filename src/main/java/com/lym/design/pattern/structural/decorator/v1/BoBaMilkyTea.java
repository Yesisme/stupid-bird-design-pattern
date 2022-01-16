package com.lym.design.pattern.structural.decorator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BoBaMilkyTea.java
 * @Description 具体构件角色
 * @createTime 2022-01-16 15:54
 */
public class BoBaMilkyTea implements IMilkyTea{

    @Override
    public void make() {
        System.out.println("波霸奶茶!");
    }
}
