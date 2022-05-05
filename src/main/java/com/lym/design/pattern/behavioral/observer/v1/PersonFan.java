package com.lym.design.pattern.behavioral.observer.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName PersonFan.java
 * @Description
 * @createTime 2022-05-05 23:32
 */
public class PersonFan extends AbstractFans{


    @Override
    public void accept(String msg) {
        System.out.println("PersonFan 收到消息"+msg);
    }
}
