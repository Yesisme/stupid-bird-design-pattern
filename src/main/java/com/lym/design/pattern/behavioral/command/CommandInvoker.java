package com.lym.design.pattern.behavioral.command;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName CommandInvoker.java
 * @Description
 * @createTime 2022-05-09 21:24
 */
public class CommandInvoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void call(){
        //执行命令
        command.executor();
    }
}
