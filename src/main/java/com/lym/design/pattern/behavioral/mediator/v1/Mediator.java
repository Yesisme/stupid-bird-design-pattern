package com.lym.design.pattern.behavioral.mediator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Mediator.java
 * @Description  抽象中介类 → 定义中介要执行的方法操作
 * @createTime 2022-04-07 22:44
 */
public interface Mediator {

    void contact(People from,String message);
}
