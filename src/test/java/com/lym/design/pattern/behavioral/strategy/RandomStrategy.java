package com.lym.design.pattern.behavioral.strategy;

public class RandomStrategy implements GameStrategy{

    @Override
    public void warStrategy() {
        System.out.println("大乱斗...");
    }

}