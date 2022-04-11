package com.lym.design.pattern.behavioral.mediator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Tenant.java
 * @Description 具体组件类 → 继承抽象组件类，实现相关方法，不了解其他组件的状况，但都认识中介对象
 * @createTime 2022-04-07 22:52
 */
public class Tenant extends People{

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String msg) {
        System.out.println("【租客】" + name + "给中介发送消息: " + msg);
        mediator.contact(this,msg);
    }

    @Override
    void receiveMessage(String msg) {
        System.out.println("【租客】" + name + "收到消息: " + msg);
    }
}
