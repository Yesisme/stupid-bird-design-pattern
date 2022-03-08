package com.lym.design.pattern.structural.decorator.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName LeymTikTok.java
 * @Description
 * @createTime 2022-01-16 22:02
 */
public class LeymTikTok implements TikTok{
    @Override
    public void liveStreaming() {
        System.out.println("leym抖音开始直播!");
    }
}
