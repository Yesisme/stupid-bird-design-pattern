package com.lym.design.pattern.behavioral.strategy.v1;

import java.util.HashMap;
import java.util.Map;

public class Mt1101ReceiptHandleStrategy implements IReceiptHandleStrategy<Map> {

    @Override
    public Map handReceipt(Receipt receipt) {
        Map<String,Object> map = new HashMap();
        map.put("解析报文Mt1101",receipt.getMessage());
        return map;
    }
}
