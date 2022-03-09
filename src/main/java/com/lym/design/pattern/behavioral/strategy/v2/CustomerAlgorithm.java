package com.lym.design.pattern.behavioral.strategy.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName CustomerAlgorithm.java
 * @Description
 * @createTime 2022-03-09 22:57
 */
public class CustomerAlgorithm implements Algorithm{
    @Override
    public void parse() {
        System.out.println("自定义算法分析");
    }
}
