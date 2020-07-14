package com.lym.design.pattern.strategy.v1;

import java.util.ArrayList;
import java.util.List;

public class ReceiptBuilder {

    private static List<Receipt> list = new ArrayList<>();

    public static List<Receipt> generateReceiptList(){
        list.add(new Receipt("我是MT2101回执喔","MT2101"));
        list.add(new Receipt("我是MT1101回执喔","MT1101"));
        list.add(new Receipt("我是MT8104回执喔","MT8104"));
        list.add(new Receipt("我是MT9999回执喔","MT9999"));
        return list;
    }
}
