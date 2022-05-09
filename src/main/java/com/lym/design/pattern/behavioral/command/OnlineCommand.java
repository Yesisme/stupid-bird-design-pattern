package com.lym.design.pattern.behavioral.command;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName OnlineCommand.java
 * @Description
 * @createTime 2022-05-09 21:19
 */
public class OnlineCommand implements Command{

    private PersonReceive receive = new PersonReceive();

    @Override
    public void executor() {
        receive.online();
    }
}
