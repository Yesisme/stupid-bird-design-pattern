package com.lym.design.pattern.behavioral.observer.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AbstractFan.java
 * @Description
 * @createTime 2022-05-05 23:28
 */
public abstract class AbstractFans {


    void follow(AbstractTikTok abstractTikTok){
        abstractTikTok.addFan(this);
    }

    public abstract void accept(String msg);
}
