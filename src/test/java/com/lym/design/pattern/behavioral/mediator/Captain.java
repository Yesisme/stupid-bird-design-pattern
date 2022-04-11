package com.lym.design.pattern.behavioral.mediator;

/**
 * 抽象机长
 */
public abstract class Captain {




    //起飞
    abstract void fly();
    //降落
    abstract void land();
    //完成
    abstract void success();

    public static void main(String[] args) {
        System.out.println(java("14150834@qq.com"));
    }

    /**
     * JAVA自己带的算法
     */
    public static int java(String str) {
        int h = 0;
        int off = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            h = 31 * h + str.charAt(off++);
        }
        return h;
    }
    }
