package com.lym.design.pattern.structural.adapter.v1.obj;

import com.lym.design.pattern.structural.adapter.v1.Player;
import com.lym.design.pattern.structural.adapter.v1.ZhTOJPTranslator;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName JpObjAdapter.java
 * @Description 对象型
 * @createTime 2022-01-15 22:07
 */
public class JpObjAdapter implements Player {

    private ZhTOJPTranslator zhTOJPTranslator = new ZhTOJPTranslator(); //组合对象
    private Player target;

    public JpObjAdapter(Player target) {
        this.target = target;
    }

    @Override
    public String play() {
        final String content = target.play();
        return zhTOJPTranslator.translate(content);
    }
}
