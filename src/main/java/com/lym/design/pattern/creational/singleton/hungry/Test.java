package com.lym.design.pattern.creational.singleton.hungry;

public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(HungrySingleton.getInstance());
            }, Thread.currentThread().getName()).start();
        }
    }
}
