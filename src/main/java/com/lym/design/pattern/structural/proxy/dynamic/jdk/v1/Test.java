package com.lym.design.pattern.structural.proxy.dynamic.jdk.v1;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        Subject subject = (Subject) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{Subject.class}, new SubjectProxy(new SubjectImpl()));
        subject.studyMath();
        subject.studyEnglish();
    }
}
