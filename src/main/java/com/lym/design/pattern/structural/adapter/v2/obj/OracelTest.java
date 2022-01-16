package com.lym.design.pattern.structural.adapter.v2.obj;

import com.lym.design.pattern.structural.adapter.v2.Application;
import com.lym.design.pattern.structural.adapter.v2.JavaApplication;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName OracelTest.java
 * @Description
 * @createTime 2022-01-15 22:29
 */
public class OracelTest {

    public static void main(String[] args) {
        Application application = new OracleJdbcAdapter(new JavaApplication());
        application.develop("java");
    }
}
