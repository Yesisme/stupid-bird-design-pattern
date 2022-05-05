package com.lym.design.pattern.behavioral.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName ManTikTok.java
 * @Description
 * @createTime 2022-05-05 23:41
 */
public class ManAbstractTikTok extends AbstractTikTok {

    List<AbstractFans> fans = new ArrayList<>();

    public void bringGoods(){
        System.out.println("ManAbstractTikTok 开始抖音带货！！！");
        notify("一件大衣只需要999,走过路过千万不要错过。");
    }

    @Override
    void addFan(AbstractFans abstractFans) {
        fans.add(abstractFans);
    }

    @Override
    void notify(String msg) {
        for (AbstractFans fan : fans) {
            fan.accept(msg);
        }
    }
}
