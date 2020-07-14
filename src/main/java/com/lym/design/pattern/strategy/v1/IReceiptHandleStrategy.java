package com.lym.design.pattern.strategy.v1;

public interface IReceiptHandleStrategy<T> {

    T handReceipt(Receipt receipt);
}
