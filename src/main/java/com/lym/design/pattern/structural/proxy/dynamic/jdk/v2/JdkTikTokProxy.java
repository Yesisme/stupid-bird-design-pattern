package com.lym.design.pattern.structural.proxy.dynamic.jdk.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName JdkProxy.java
 * @Description
 * @createTime 2022-02-22 21:13
 */
public class JdkTikTokProxy<T> implements InvocationHandler {

    private T target;

    public JdkTikTokProxy(T target){
        this.target = target;
    }

    public static <T> T getProxy(T target){
        final Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new JdkTikTokProxy<T>(target));
        return (T) o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理方法执行了");
        final Object invoke = method.invoke(target, args);
        return invoke;
    }
}
