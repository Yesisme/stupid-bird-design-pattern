package com.lym.design.pattern.singleton.lazy.synchronizedSingleton;

public class LazySynchronizedSingleton {

    private static LazySynchronizedSingleton instance = null;

    private LazySynchronizedSingleton(){}

    //保证原子性，效率不太好，重量级锁
    public synchronized static LazySynchronizedSingleton getInstance(){
        if(instance==null){
            instance = new LazySynchronizedSingleton();
        }
        return instance;
    }
}
