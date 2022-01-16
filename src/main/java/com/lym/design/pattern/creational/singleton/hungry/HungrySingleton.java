package com.lym.design.pattern.creational.singleton.hungry;

public class HungrySingleton {

    private static final HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}
