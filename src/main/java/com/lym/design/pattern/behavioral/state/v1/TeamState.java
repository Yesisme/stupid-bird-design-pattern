package com.lym.design.pattern.behavioral.state.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName TeamState.java
 * @Description
 * @createTime 2022-04-06 22:45
 */
public interface TeamState {

    void playGame();

    TeamState next();
}
