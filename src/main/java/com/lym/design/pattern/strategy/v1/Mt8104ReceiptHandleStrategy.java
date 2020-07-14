package com.lym.design.pattern.strategy.v1;

public class Mt8104ReceiptHandleStrategy implements IReceiptHandleStrategy<String>{

    @Override
    public String handReceipt(Receipt receipt) {
        return "解析报文MT8104:" + receipt.getMessage();
    }
}
