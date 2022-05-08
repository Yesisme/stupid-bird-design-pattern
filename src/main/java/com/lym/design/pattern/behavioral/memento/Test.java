package com.lym.design.pattern.behavioral.memento;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description  三个角色: 备忘录
 *
 * @createTime 2022-05-08 18:33
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Player player = new Player();
        int i = 1;
        player.playGame();

        player.exitGame();

        player.getFormMemento(i);

        player.playGame();
        i++;
        player.exitGame();

        player.getFormMemento(i);


    }
}
