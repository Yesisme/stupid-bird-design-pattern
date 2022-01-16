package com.lym.design.pattern.behavioral.strategy.v1;

public interface IReceiptHandleStrategy<T> {

    T handReceipt(Receipt receipt);
}
