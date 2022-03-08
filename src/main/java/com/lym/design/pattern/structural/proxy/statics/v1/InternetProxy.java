package com.lym.design.pattern.structural.proxy.statics.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName InternetProxy.java
 * @Description
 * @createTime 2022-01-19 21:37
 */
public class InternetProxy implements Internet{

    private Internet internet;
    public InternetProxy(Internet internet){
        this.internet = internet;
    }

    @Override
    public String access(String domian) {
        return internet.access(domian);
    }
}
