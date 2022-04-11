package com.lym.design.pattern.behavioral.mediator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Landlord.java
 * @Description 房东,具体组件类 → 继承抽象组件类，实现相关方法，不了解其他组件的状况，但都认识中介对象
 * @createTime 2022-04-07 22:48
 */
public class Landlord extends People{

    private String demand;
    public Landlord(String name,Mediator mediator,String demand){
        super(name,mediator);
        this.demand = demand;
    }

    public String getDemand(){
        return demand;
    }

    @Override
    void sendMessage(String msg) {
        System.out.println("【房东】" + name + "给中介发送消息: " + msg);
        mediator.contact(this,msg);
    }

    @Override
    void receiveMessage(String msg) {
        System.out.println("【房东】" + name + "收到消息: " + msg);
    }
}
