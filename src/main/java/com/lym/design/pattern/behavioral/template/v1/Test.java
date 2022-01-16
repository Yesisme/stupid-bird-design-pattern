package com.lym.design.pattern.behavioral.template.v1;

public class Test {

    public static void main(String[] args) {
        Course jc = new JavaCourese();
        jc.doCouse();

        Course fc = new FECourse(true);
        fc.doCouse();
    }
}
