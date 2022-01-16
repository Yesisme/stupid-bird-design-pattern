package com.lym.design.pattern.behavioral.strategy.v1;

public class Mt9999ReceiptHandleStrategy implements IReceiptHandleStrategy<String> {
    @Override
    public String handReceipt(Receipt receipt) {
        return "解析报文MT9999:" + receipt.getMessage();
    }
}
