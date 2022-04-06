package com.lym.design.pattern.behavioral.state.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-04-06 22:44
 */
public class Test {

    public static void main(String[] args) {

        TeamContext teamContext = new TeamContext(new TeamPrepareState());

        teamContext.play();

        teamContext.next();

        teamContext.play();

        teamContext.next();

        teamContext.play();

        teamContext.next();

        teamContext.play();

        teamContext.next();

        teamContext.play();
    }
}
