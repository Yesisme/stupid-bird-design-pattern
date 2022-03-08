package com.lym.design.pattern.structural.decorator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Dosing.java
 * @Description 抽象装饰角色 配料 装饰器
 * @createTime 2022-01-16 16:05
 */
public abstract class DosingDecorator implements IMilkyTea{

    private IMilkyTea iMilkyTea;

    public DosingDecorator(IMilkyTea iMilkyTea){
        this.iMilkyTea = iMilkyTea;
    }

    @Override
    public void make() {
        this.iMilkyTea.make();
        System.out.println("开始制作....添加调料");
    }

}
