package com.lym.design.pattern.creational.singleton.enumSingleton;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                EunmSingleton instance1 = EunmSingleton.getInstance();
                EunmSingleton instance2 = EunmSingleton.getInstance();
                System.out.println(instance1 == instance2);
            }).start();
        }
    }
}
