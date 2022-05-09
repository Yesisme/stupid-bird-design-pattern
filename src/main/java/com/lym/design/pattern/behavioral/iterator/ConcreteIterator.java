package com.lym.design.pattern.behavioral.iterator;

import java.util.Vector;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName ConcreteIterator.java
 * @Description
 * @createTime 2022-05-09 22:55
 */
public class ConcreteIterator implements Iterator{

    private Vector vector;

    public int cursor = 0;    //定义当前游标

    public ConcreteIterator(Vector vector){
        this.vector = vector;
    }


    @Override
    public Object next() {
        Object result;
        if(haseNext()){
            result = this.vector.get(cursor++);
        }else {
            result = null;
        }
        return result;

    }

    @Override
    public boolean haseNext() {
        final boolean b = this.cursor < this.vector.size();
        if(!b){
            this.cursor=0;
        }
        return b;
    }

    @Override
    public Object remove(int index) {
        if(index>=this.vector.size()){
            return null;
        }

        return this.vector.remove(index);

    }
}
