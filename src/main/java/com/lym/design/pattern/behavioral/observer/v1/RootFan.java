package com.lym.design.pattern.behavioral.observer.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName RootFan.java
 * @Description
 * @createTime 2022-05-05 23:33
 */
public class RootFan extends AbstractFans{
    @Override
    public void accept(String msg) {
        System.out.println("RootFan 收到消息:"+"呸呸呸");
    }
}
