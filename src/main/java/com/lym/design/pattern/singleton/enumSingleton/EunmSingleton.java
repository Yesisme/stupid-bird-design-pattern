package com.lym.design.pattern.singleton.enumSingleton;

public enum EunmSingleton {
    INSTANCE;

    private Object data;

    public static EunmSingleton getInstance(){
        return INSTANCE;
    }
}
