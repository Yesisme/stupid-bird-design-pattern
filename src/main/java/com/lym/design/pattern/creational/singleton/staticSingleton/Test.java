package com.lym.design.pattern.creational.singleton.staticSingleton;

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(StaticSingleton.getInstance());
            }).start();
        }
    }
}
