package com.lym.design.pattern.creational.build.v3;

public class Test {

    public static void main(String[] args) {
        Home homeBuild = new Home.HomeBuild().build1("b1").build2("b2").build3("b3").build4("b4").build();
        System.out.println(homeBuild.toString());
    }
}
