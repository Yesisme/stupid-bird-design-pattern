package com.lym.design.pattern.behavioral.observer.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName test.java
 * @Description
 * @createTime 2022-05-05 23:28
 */
public class Test {

    public static void main(String[] args) {
        ManAbstractTikTok manAbstractTikTok = new ManAbstractTikTok();

        //关注主播
        AbstractFans person1 = new PersonFan();
        person1.follow(manAbstractTikTok);
        AbstractFans person2 = new PersonFan();
        person2.follow(manAbstractTikTok);

        AbstractFans rootFan = new RootFan();
        rootFan.follow(manAbstractTikTok);

        //主播开始带货
        manAbstractTikTok.bringGoods();

    }
}
