package com.lym.design.pattern.behavioral.template.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Cooking.java
 * @Description
 * @createTime 2022-03-09 22:04
 */
public abstract class Cooking {

    public Cooking(){
        this.openFire();
        if(this.isAddChili()){
            this.addChili();
        }
        this.addSeasoning();
        this.stew();
        this.closeTheFire();
    }

    final void openFire(){
        System.out.println("开火!");
    }

    final void addChili(){
        System.out.println("加入灵魂小辣椒!");
    }

    public void addSeasoning(){
        System.out.println("加入佐料!");
    }

    public abstract void stew();

    final void closeTheFire(){
        System.out.println("关火");
    }

    abstract boolean isAddChili();

}
