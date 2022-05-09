package com.lym.design.pattern.behavioral.iterator;

import java.util.Objects;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Aggregate.java
 * @Description 抽象容器
 * @createTime 2022-05-09 22:49
 */
public abstract class Aggregate {

    public abstract void add(Object objects);

    public abstract void remove(Object objects);

    abstract Iterator createIterator();
}
