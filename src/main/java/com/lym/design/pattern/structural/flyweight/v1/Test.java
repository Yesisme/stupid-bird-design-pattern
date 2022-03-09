package com.lym.design.pattern.structural.flyweight.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-03-08 22:32
 */
public class Test {

    public static void main(String[] args) {
        final BeautifulTechnician server1 = FootBathFactory.getServer("");
        server1.service();
        System.out.println(server1);

        final BeautifulTechnician server2 = FootBathFactory.getServer("");
        server2.service();
        System.out.println(server2);

        server1.end();

        final BeautifulTechnician server3 = FootBathFactory.getServer("");
        server3.service();
        System.out.println(server3);
    }
}
