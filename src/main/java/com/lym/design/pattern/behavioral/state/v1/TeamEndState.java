package com.lym.design.pattern.behavioral.state.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName TeamEndState.java
 * @Description
 * @createTime 2022-04-06 22:52
 */
public class TeamEndState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("比赛结束.........end");
    }

    //最后一步返回当前对象
    @Override
    public TeamState next() {
        return this;
    }
}
