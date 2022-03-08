package com.lym.design.pattern.structural.proxy.statics.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName WorldInternet.java
 * @Description
 * @createTime 2022-01-19 21:29
 */
public class WorldInternet implements Internet{


    @Override
    public String access(String domian) {
        return "世界网络全部都可以访问!"+domian;
    }
}
