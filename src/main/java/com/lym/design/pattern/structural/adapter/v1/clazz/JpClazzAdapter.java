package com.lym.design.pattern.structural.adapter.v1.clazz;

import com.lym.design.pattern.structural.adapter.v1.Player;
import com.lym.design.pattern.structural.adapter.v1.ZhTOJPTranslator;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName JPAdapter.java
 * @Description 类结构型
 * @createTime 2022-01-15 21:54
 */
public class JpClazzAdapter extends ZhTOJPTranslator implements Player {

    private Player player; //被适配对象

    public JpClazzAdapter(Player player) {
        this.player = player;
    }

    @Override
    public String play() {
        final String play = player.play();
        return this.translate(play);
    }
}
