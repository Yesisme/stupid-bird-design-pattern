package com.lym.design.pattern.behavioral.strategy.v1;

public class RecepitStrategyContext {

    private IReceiptHandleStrategy iReceiptHandleStrategy;

    public void setiReceiptHandleStrategy(IReceiptHandleStrategy iReceiptHandleStrategy) {
        this.iReceiptHandleStrategy = iReceiptHandleStrategy;
    }

    public RecepitStrategyContext(){}

    public Object handleReceipt(Receipt receipt){
        return iReceiptHandleStrategy.handReceipt(receipt);
    }
}
