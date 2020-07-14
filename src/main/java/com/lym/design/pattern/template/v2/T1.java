package com.lym.design.pattern.template.v2;

public class T1 {
    static {
        System.err.println("2");
    }

    private static int t1Int = intMethod();

    private String t2 = tMethod();

    public T1() {
        System.err.println("5");
    }

    public T1(String name) {
        System.out.println("t2 is name" + name);
    }

    {
        System.err.println("4");
    }

    private static int intMethod() {
        System.out.println("9");
        return 9;
    }

    private static String tMethod() {
        System.out.println("10");
        return "10";
    }
}

class T2 extends T1 {
    private static int t2Int = int1Method();

    private String t1 = sMethod();

    public T2(String name) {
        System.out.println("t2 is name" + name);
    }

    static {
        System.err.println("1");
    }

    {
        System.err.println("3");
    }

    public T2() {
        System.err.println("7");
    }

    private static int int1Method() {
        System.out.println("8");
        return 9;
    }

    private static String sMethod() {
        System.out.println("6");
        return "6";
    }

    public static void main(String[] args) {
        System.out.println(11);
        new T2("bob");
        //2,9,8,1,11,10,4,5,6,3,t2 is namebob
    }
}
