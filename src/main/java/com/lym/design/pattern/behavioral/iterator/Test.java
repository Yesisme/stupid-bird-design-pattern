package com.lym.design.pattern.behavioral.iterator;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 1:抽象容器
 *              2:抽象迭代器
 *              3:具体容器
 *              4:具体迭代器
 *              5:Client客户端
 * @createTime 2022-05-09 22:47
 */
public class Test {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();

        final Iterator iterator = aggregate.createIterator();
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);

        while (iterator.haseNext()){
            final Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("=========================");
        iterator.remove(0);
        while (iterator.haseNext()){
            final Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("=========================");
        iterator.remove(0);
        while (iterator.haseNext()){
            final Object next = iterator.next();
            System.out.println(next);
        }
    }
}
