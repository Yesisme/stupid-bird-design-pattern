package com.lym.design.pattern.behavioral.command;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 命令者模式
 * @createTime 2022-05-09 21:16
 */
public class Test {

    public static void main(String[] args) {

        Command command = new OnlineCommand();

        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.setCommand(command);
        commandInvoker.call();

        Command onlineCommand = new OnBusinessTripReceiveCommand();
        commandInvoker.setCommand(onlineCommand);
        commandInvoker.call();


    }

}
