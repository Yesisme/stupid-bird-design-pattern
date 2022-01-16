package com.lym.design.pattern.creational.singleton.enumSingleton;

public enum EunmSingleton {
    INSTANCE;

    private Object data;

    public static EunmSingleton getInstance(){
        return INSTANCE;
    }
}
