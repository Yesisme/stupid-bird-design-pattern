package com.lym.design.pattern.behavioral.command;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName PersonReceive.java
 * @Description
 * @createTime 2022-05-09 21:19
 */
public class PersonReceive {

    public void online(){
        System.out.println("收到上线任务,请开始执行!");
    }

    public void onBusinessTrip(){
        System.out.println("收到出差任务,请开始执行!");
    }
}
