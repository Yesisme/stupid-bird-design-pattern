package com.lym.design.pattern.structural.adapter.v2.clazz;

import com.lym.design.pattern.structural.adapter.v2.Application;
import com.lym.design.pattern.structural.adapter.v2.JavaApplication;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-01-15 22:16
 */
public class Test {

    public static void main(String[] args) {
        Application application = new MysqlJdbcAdapter(new JavaApplication());
        application.develop("java");
    }
}
