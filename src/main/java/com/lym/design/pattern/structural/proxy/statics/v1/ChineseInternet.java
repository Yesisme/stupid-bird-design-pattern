package com.lym.design.pattern.structural.proxy.statics.v1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName ChineseInternet.java
 * @Description
 * @createTime 2022-01-19 21:30
 */
public class ChineseInternet implements Internet{

    private final Set<String> domainSet;

    public ChineseInternet(){
        domainSet = new HashSet<>();
        domainSet.add("www.google.com");
    }

    @Override
    public String access(String domian) {
        if(domainSet.contains(domian)){
            return "禁止访问"+domian;
        }
        return "恭喜访问成功"+domian;
    }
}
