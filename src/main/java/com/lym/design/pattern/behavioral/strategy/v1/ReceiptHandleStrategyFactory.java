package com.lym.design.pattern.behavioral.strategy.v1;

import java.util.HashMap;
import java.util.Map;

public class ReceiptHandleStrategyFactory {

    private static final Map<String,IReceiptHandleStrategy> map;

    static {
        map= new HashMap<>();
        map.put("MT1101",new Mt1101ReceiptHandleStrategy());
        map.put("MT2101",new Mt1101ReceiptHandleStrategy());
        map.put("MT8104",new Mt8104ReceiptHandleStrategy());
        map.put("MT9999",new Mt9999ReceiptHandleStrategy());
    }

    private ReceiptHandleStrategyFactory(){}

    public static IReceiptHandleStrategy getReceiptHandleStrategy(String receiptType){
        return map.get(receiptType);
    }
}
