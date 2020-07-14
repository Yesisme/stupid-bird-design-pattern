package com.lym.design.pattern.singleton.container;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {

    public static final Map<Object,Object> map = new HashMap<>();
    private ContainerSingleton() {}

    public static void putInstance(Object key,Object value){
        if(!map.containsKey(key)){
            map.put(key,value);
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
    }
}