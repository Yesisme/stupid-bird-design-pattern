package com.lym.design.pattern.behavioral.chain.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AbstractReviewer.java
 * @Description
 * @createTime 2022-05-10 22:34
 */
public abstract class AbstractReviewer {

    public String name;

    private AbstractReviewer next;

    public AbstractReviewer(String name){
        this.name = name;
    }

    public void handler(){
        System.out.println(this.name+"开始审核....");
        final AbstractReviewer next = this.getNext();
        if(next!=null){
            next.handler();
        }
        return;
    }

    public void setNext(AbstractReviewer next) {
        this.next = next;
    }

    public AbstractReviewer getNext() {
        return next;
    }

}
