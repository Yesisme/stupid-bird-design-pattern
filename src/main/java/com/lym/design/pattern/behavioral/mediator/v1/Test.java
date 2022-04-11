package com.lym.design.pattern.behavioral.mediator.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-04-07 22:58
 */
public class Test {

    public static void main(String[] args) {
        // 实例化中介实例
        HouseMediator mediator = new HouseMediator();

        Landlord landlord1 = new Landlord("包租婆", mediator, "两室一厅");
        Landlord landlord2 = new Landlord("包租公", mediator, "三室一厅");

        mediator.putLandlord(landlord1);
        mediator.putLandlord(landlord2);

        final Tenant tenant1 = new Tenant("杰哥", mediator);
        Tenant tenant2 = new Tenant("阿伟", mediator);
        Tenant tenant3 = new Tenant("彬彬", mediator);

        mediator.putTenant(tenant1);
        mediator.putTenant(tenant2);
        mediator.putTenant(tenant3);

        // 与中介实例交互
        landlord1.sendMessage("想出租下两室一厅，帮我找些租客");
        tenant1.sendMessage("我想租下两室一厅，有房源推荐吗？");

    }
}
