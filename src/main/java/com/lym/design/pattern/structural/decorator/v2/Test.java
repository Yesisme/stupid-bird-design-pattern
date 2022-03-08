package com.lym.design.pattern.structural.decorator.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-01-16 22:05
 */
public class Test {

    public static void main(String[] args) {
        TikTok tikTok = new LeymTikTok();
        TikTok lym = new LymProxy(tikTok);
        lym.liveStreaming();
    }
}
