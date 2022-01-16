package com.lym.design.pattern.structural.adapter.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 适配器 不改变原有的类,去实现原来的功能
 * @createTime 2022-01-15 21:06
 */
public class Test {

    public static void main(String[] args) {
        Player player = new MoviePlayer();
        final String play = player.play();
        System.out.println(play);

        Translate translate = new ZhTOJPTranslator();
        System.out.println("翻译成日文:" + translate.translate(play));
    }
}
