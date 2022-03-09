package com.lym.design.pattern.structural.flyweight.v1;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName FootBathFactory.java
 * @Description 足浴工厂 负责添加技师和获取技师
 * @createTime 2022-03-08 22:09
 */
public class FootBathFactory {


    private static final Map<String,BeautifulTechnician> pool = new HashMap<>();

    static {

        final BeautifulTechnician waiter1 = new BeautifulTechnician(1, "王美", 18);
        final BeautifulTechnician waiter2 = new BeautifulTechnician(2, "张美", 20);
        pool.put(waiter1.getId().toString(),waiter1);
        pool.put(waiter2.getId().toString(),waiter2);
    }

    public void add(BeautifulTechnician beautifulTechnician){
        pool.put(UUID.randomUUID().toString(),beautifulTechnician);
    }

    public static BeautifulTechnician getServer(String name){
        final BeautifulTechnician beautifulTechnician = pool.get(name);
        if(beautifulTechnician==null){
            for (BeautifulTechnician value : pool.values()) {
                if(value.canServer()){
                    return value;
                }
            }
        }
        return beautifulTechnician;

    }

}
