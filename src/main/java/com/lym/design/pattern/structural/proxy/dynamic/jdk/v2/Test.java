package com.lym.design.pattern.structural.proxy.dynamic.jdk.v2;

import java.util.Arrays;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-02-22 21:10
 */
public class Test {

    public static void main(String[] args) {
        ManTikTok manTikTok = new LymTikTok();
        final ManTikTok proxy = JdkTikTokProxy.getProxy(manTikTok);
        proxy.tiktok();
        final SellTikTok sellTikTok = (SellTikTok) proxy;
        sellTikTok.sell();
        //((LymTikTok)sellTikTok).send();

        System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));
    }
}
