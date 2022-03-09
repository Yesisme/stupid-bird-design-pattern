package com.lym.design.pattern.behavioral.template.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Cantonese.java
 * @Description
 * @createTime 2022-03-09 22:11
 */
public class Cantonese extends Cooking{


    @Override
    public void stew() {
        System.out.println("粤菜小火慢炖!");
    }

    @Override
    boolean isAddChili() {
        return false;
    }


}
