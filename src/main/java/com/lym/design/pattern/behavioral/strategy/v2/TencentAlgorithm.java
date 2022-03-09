package com.lym.design.pattern.behavioral.strategy.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName TencentAlgorithm.java
 * @Description
 * @createTime 2022-03-09 22:56
 */
public class TencentAlgorithm implements Algorithm{

    @Override
    public void parse() {
        System.out.println("腾讯算法开始解析!");
    }
}
