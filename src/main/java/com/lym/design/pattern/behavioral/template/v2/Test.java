package com.lym.design.pattern.behavioral.template.v2;

import java.util.Collection;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-03-09 22:15
 */
public class Test {

    public static void main(String[] args) {

        Cooking hunanCuisine = new HunanCuisine();

        System.out.println("-----------------");
        Cooking cooking2 = new Cantonese();
    }
}
