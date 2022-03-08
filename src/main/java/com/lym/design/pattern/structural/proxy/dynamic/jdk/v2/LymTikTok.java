package com.lym.design.pattern.structural.proxy.dynamic.jdk.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName LymTikTok.java
 * @Description
 * @createTime 2022-02-22 21:10
 */
public class LymTikTok implements ManTikTok,SellTikTok{

    @Override
    public void tiktok() {
        System.out.println("lym抖音注册了....");
    }

    @Override
    public void sell() {
        System.out.println("lym开始卖货了....");
    }

    public void send(){
        System.out.println("发送消息.....");
    }
}
