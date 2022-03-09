package com.lym.design.pattern.behavioral.template.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName HunanCuisine.java
 * @Description
 * @createTime 2022-03-09 22:08
 */
public class HunanCuisine extends Cooking{


    @Override
    public void stew() {
        System.out.println("湘菜大火收汁!");
    }

    @Override
    public boolean isAddChili(){
        return true;
    }
}
