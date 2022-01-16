package com.lym.design.pattern.structural.adapter.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName MoviePlayer.java
 * @Description 目标对象
 * @createTime 2022-01-15 16:51
 */
public class MoviePlayer implements Player {

    @Override
    public String play() {
        System.out.println("真正播放误杀2的字幕....");
        System.out.println("字幕:不要");
        return "不要";
    }
}
