package com.lym.design.pattern.structural.proxy.cglib;

public class PayServiceImpl implements BaseService {

    @Override
    public String handle() {
        return "支付处理接口";
    }
}
