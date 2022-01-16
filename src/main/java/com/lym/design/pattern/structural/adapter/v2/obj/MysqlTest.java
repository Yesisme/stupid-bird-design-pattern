package com.lym.design.pattern.structural.adapter.v2.obj;

import com.lym.design.pattern.structural.adapter.v2.Application;
import com.lym.design.pattern.structural.adapter.v2.JavaApplication;
import com.lym.design.pattern.structural.adapter.v2.clazz.MysqlJdbcAdapter;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description
 * @createTime 2022-01-15 22:15
 */
public class MysqlTest {

    public static void main(String[] args) {
        Application application = new MysqlJdbcAdapter(new JavaApplication());
        application.develop("java");
    }
}
