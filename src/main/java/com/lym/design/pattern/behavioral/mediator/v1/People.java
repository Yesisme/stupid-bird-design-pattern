package com.lym.design.pattern.behavioral.mediator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName People.java
 * @Description 抽象组件类 → 定义组件需要执行的方法操作
 * @createTime 2022-04-07 22:45
 */
public abstract class People {

    protected String name;
    protected Mediator mediator;

    public People(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    abstract void sendMessage(String msg);
    abstract void receiveMessage(String msg);
}
