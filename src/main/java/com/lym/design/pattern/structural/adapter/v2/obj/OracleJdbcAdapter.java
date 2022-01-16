package com.lym.design.pattern.structural.adapter.v2.obj;

import com.lym.design.pattern.structural.adapter.v2.Application;
import com.lym.design.pattern.structural.adapter.v2.DefaultJdbcConnect;
import com.lym.design.pattern.structural.adapter.v2.JdbcConnect;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName OracleJdbcAdapter.java
 * @Description
 * @createTime 2022-01-15 22:25
 */
public class OracleJdbcAdapter implements Application {

    private Application application;
    private JdbcConnect jdbcConnect = new DefaultJdbcConnect();

    public OracleJdbcAdapter(Application application) {
        this.application = application;
    }

    @Override
    public String develop(String content) {
        final String develop = application.develop("java");
        System.out.println("使用" + develop + "开发应用");
        System.out.println("使用oracle驱动连接");
        jdbcConnect.connect(develop);
        return "启动完成";
    }
}
