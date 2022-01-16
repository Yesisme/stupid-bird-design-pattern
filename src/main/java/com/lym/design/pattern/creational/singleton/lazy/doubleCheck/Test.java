package com.lym.design.pattern.creational.singleton.lazy.doubleCheck;

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(DoubleCheckSingleton.getInstance());
            }).start();
        }
    }
}
