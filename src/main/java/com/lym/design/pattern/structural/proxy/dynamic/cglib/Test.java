package com.lym.design.pattern.structural.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Test {

    public static void main(String[] args) {
        Enhancer enhance = new Enhancer();
        enhance.setSuperclass(new PayServiceImpl().getClass());
        enhance.setCallback(new BaseServiceProxy());
        BaseService o = (BaseService) enhance.create();
        System.out.println(o.handle());
    }
}
