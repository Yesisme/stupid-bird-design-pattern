package com.lym.design.pattern.creational.singleton.staticSingleton;

public class StaticSingleton {

    private static class inner {
        public static final StaticSingleton instance = new StaticSingleton();
    }

    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return inner.instance;
    }
}
