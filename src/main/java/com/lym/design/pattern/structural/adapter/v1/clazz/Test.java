package com.lym.design.pattern.structural.adapter.v1.clazz;

import com.lym.design.pattern.structural.adapter.v1.MoviePlayer;
import com.lym.design.pattern.structural.adapter.v1.Player;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-01-15 21:35
 */
public class Test {

    public static void main(String[] args) {
        Player jPadapter = new JpClazzAdapter(new MoviePlayer());
        final String play = jPadapter.play();
        System.out.println(play);
    }

}
