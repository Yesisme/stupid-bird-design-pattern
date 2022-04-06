package com.lym.design.pattern.behavioral.state.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName TeamStartState.java
 * @Description
 * @createTime 2022-04-06 22:48
 */
public class TeamStartState implements TeamState{

    @Override
    public void playGame() {
        System.out.println("比赛开始了.......全军出击!");
    }

    @Override
    public TeamState next() {
        return new TeamInProgressState();
    }
}
