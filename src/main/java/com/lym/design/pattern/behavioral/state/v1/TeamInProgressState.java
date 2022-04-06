package com.lym.design.pattern.behavioral.state.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName TeamInProgressState.java
 * @Description
 * @createTime 2022-04-06 22:51
 */
public class TeamInProgressState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("比赛进行中........ing");
    }

    @Override
    public TeamState next() {
        return new TeamEndState();
    }
}
