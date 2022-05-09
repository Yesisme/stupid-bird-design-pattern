package com.lym.design.pattern.behavioral.command;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName OnBusinessTripReceiveComman.java
 * @Description
 * @createTime 2022-05-09 21:22
 */
public class OnBusinessTripReceiveCommand implements Command{

    private PersonReceive receive = new PersonReceive();

    @Override
    public void executor() {
        receive.onBusinessTrip();
    }
}
