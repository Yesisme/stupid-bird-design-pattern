package com.lym.design.pattern.singleton.container;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                ContainerSingleton.putInstance("1","10");
            }).start();
        }
    }
}
