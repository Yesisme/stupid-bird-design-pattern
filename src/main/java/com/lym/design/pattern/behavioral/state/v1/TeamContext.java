package com.lym.design.pattern.behavioral.state.v1;

import java.util.Optional;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName TeamContext.java
 * @Description
 * @createTime 2022-04-06 22:55
 */
public class TeamContext {

    private TeamState teamState;

    public TeamContext(TeamState teamState){
        this.teamState = teamState;
    }

    public void play(){
        teamState.playGame();
    }

    void next(){
       this.teamState = teamState.next();
    }


}
