package com.lym.design.pattern.strategy.v1;

import com.alibaba.fastjson.JSONObject;

public class Mt2101ReceiptHandleStrategy implements IReceiptHandleStrategy<String> {

    @Override
    public String handReceipt(Receipt receipt) {
        JSONObject result = new JSONObject();
        result.put("解析报文Mt2101",receipt.getMessage());
        return result.toString();
    }
}
