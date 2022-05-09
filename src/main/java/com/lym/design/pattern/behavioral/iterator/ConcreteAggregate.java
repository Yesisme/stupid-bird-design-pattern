package com.lym.design.pattern.behavioral.iterator;

import java.util.Objects;
import java.util.Vector;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName ConcreteAggregate.java
 * @Description
 * @createTime 2022-05-09 22:53
 */
public class ConcreteAggregate extends Aggregate{

    private Vector vector = new Vector();

    @Override
    public void add(Object objects) {
        this.vector.add(objects);
    }

    @Override
    public void remove(Object objects) {
        this.vector.remove(objects);
    }

    @Override
    Iterator createIterator() {
        return new ConcreteIterator(this.vector);
    }
}
