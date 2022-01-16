package com.lym.design.pattern.behavioral.strategy.v1;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Receipt> receiptsList = ReceiptBuilder.generateReceiptList();
        receiptsList.forEach(System.out::println);
        RecepitStrategyContext recepitStrategyContext = new RecepitStrategyContext();
        for (Receipt receipt : receiptsList) {
            IReceiptHandleStrategy receiptHandleStrategy = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());
            recepitStrategyContext.setiReceiptHandleStrategy(receiptHandleStrategy);
            recepitStrategyContext.handleReceipt(receipt);
        }
    }
}
