package com.lym.design.pattern.behavioral.mediator.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName HouseMediator.java
 * @Description 具体中介类 → 实现相关方法，需要知道所有具体组件，并从具体组件接收消息，并向具体组件发送消
 * @createTime 2022-04-07 22:53
 */
public class HouseMediator implements Mediator{

    //中介知道所有的组件
    private final Map<String, Landlord> landlords = new HashMap<>();
    private final Map<String, Tenant> tenants = new HashMap<>();

    public void putLandlord(Landlord landlord) { landlords.put(landlord.name, landlord); }

    public void putTenant(Tenant tenant) { tenants.put(tenant.name, tenant); }

    //注释
    @Override
    public void contact(People from, String message) {
        if(from instanceof Landlord){
            tenants.values().forEach(tenant -> tenant.receiveMessage("有房东发布了新房源：" +
                    ((Landlord)from).getDemand()));
        }else {
            landlords.values().stream().filter(x->message.contains(x.getDemand()))
                    .forEach(landlord -> {
                        System.out.println("租客" + from.name + "对" + landlord.getDemand() + "的房源感兴趣，通知下房东~");
                        landlord.receiveMessage("有人对您发布的房源感兴趣");
                    });
        }
    }
}
