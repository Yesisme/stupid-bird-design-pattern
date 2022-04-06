package com.lym.design.pattern.behavioral.state.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName TeamPrepareState.java
 * @Description
 * @createTime 2022-04-06 22:56
 */
public class TeamPrepareState implements TeamState{
    @Override
    public void playGame() {
        System.out.println("准备就绪。。。。。网络调整完毕");
    }

    @Override
    public TeamState next() {
        return new TeamStartState();
    }
}
