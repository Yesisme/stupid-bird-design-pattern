package com.lym.design.pattern.structural.decorator.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName LymProxy.java
 * @Description
 * @createTime 2022-01-16 22:03
 */
public class LymProxy implements TikTok{

    private TikTok tikTok;
    public LymProxy(TikTok tikTok){
        this.tikTok = tikTok;
    }

    @Override
    public void liveStreaming() {
        tikTok.liveStreaming();
    }
}
