package com.lym.design.pattern.behavioral.iterator;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Iterator.java
 * @Description 抽象迭代器
 * @createTime 2022-05-09 22:49
 */
public interface Iterator {

     Object next();    //遍历到下一个元素

     boolean haseNext(); //是否有下一个袁术

    Object remove(int index); // 删除当前指向元素
}
