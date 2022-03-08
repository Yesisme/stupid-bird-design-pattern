package com.lym.design.pattern.structural.decorator.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName ZymTiTok.java
 * @Description
 * @createTime 2022-01-16 22:03
 */
public class ZymTiTok implements TikTok{
    @Override
    public void liveStreaming() {
        System.out.println("张一鸣的抖音开始直播！");
    }
}
