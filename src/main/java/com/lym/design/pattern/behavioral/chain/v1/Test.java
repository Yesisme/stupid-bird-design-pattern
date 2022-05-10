package com.lym.design.pattern.behavioral.chain.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 简单责任链
 * @createTime 2022-05-10 22:33
 */
public class Test {

    public static void main(String[] args) {

        AbstractReviewer directorReview = new DirectorReviewer("主管");
        AbstractReviewer hrReview = new DirectorReviewer("hr");
        AbstractReviewer boosReview = new DirectorReviewer("boss");

        directorReview.setNext(hrReview);
        hrReview.setNext(boosReview);

        directorReview.handler();

    }
}
