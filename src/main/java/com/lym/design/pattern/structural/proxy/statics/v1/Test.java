package com.lym.design.pattern.structural.proxy.statics.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-01-19 21:33
 */
public class Test {

    public static void main(String[] args) {
        InternetProxy internetProxy = new InternetProxy(new ChineseInternet());
        System.out.println(internetProxy.access("www.google.com"));
    }
}
