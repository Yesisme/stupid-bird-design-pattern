package com.lym.design.pattern.behavioral.strategy.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-03-09 22:57
 */
public class Test {

    public static void main(String[] args) {
        AIAnalyze aiAnalyze = new AIAnalyze(new AliAlgorithm());
        aiAnalyze.analyze();
    }
}
