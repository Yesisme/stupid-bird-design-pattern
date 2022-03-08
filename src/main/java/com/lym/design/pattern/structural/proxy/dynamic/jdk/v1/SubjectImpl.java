package com.lym.design.pattern.structural.proxy.dynamic.jdk.v1;

public class SubjectImpl implements Subject {

    @Override
    public void studyEnglish() {
        System.out.println("开始学英语");
    }

    @Override
    public void studyMath() {
        System.out.println("开始学数学！");
    }

}
