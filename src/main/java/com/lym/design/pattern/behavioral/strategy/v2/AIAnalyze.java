package com.lym.design.pattern.behavioral.strategy.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AIAnalyze.java
 * @Description
 * @createTime 2022-03-09 22:59
 */
public class AIAnalyze{

    private final Algorithm algorithm;

    public AIAnalyze(Algorithm algorithm){
        this.algorithm = algorithm;
    }

    public void analyze(){
        System.out.println("开发分析");
        algorithm.parse();
        System.out.println("分析结束");
    }
}
