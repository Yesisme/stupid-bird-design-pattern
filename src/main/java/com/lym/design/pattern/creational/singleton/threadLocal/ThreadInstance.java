package com.lym.design.pattern.creational.singleton.threadLocal;

public class ThreadInstance {

    private static final ThreadLocal<ThreadInstance> threadLocal =
            new ThreadLocal<ThreadInstance>(){
        @Override
        protected ThreadInstance initialValue() {
            return new ThreadInstance();
        }
    };

    private ThreadInstance(){}

    public static ThreadInstance getInstance(){
        return threadLocal.get();
    }
}
