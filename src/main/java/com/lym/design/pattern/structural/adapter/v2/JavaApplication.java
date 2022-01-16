package com.lym.design.pattern.structural.adapter.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName JavaApplication.java
 * @Description
 * @createTime 2022-01-15 21:45
 */
public class JavaApplication implements Application {

    @Override
    public String develop(String content) {
        System.out.println(content);
        return "java";
    }
}
