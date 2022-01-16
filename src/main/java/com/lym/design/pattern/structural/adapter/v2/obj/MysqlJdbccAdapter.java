package com.lym.design.pattern.structural.adapter.v2.obj;

import com.lym.design.pattern.structural.adapter.v2.Application;
import com.lym.design.pattern.structural.adapter.v2.DefaultJdbcConnect;
import com.lym.design.pattern.structural.adapter.v2.JdbcConnect;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName MysqlJdbccAdapter.java
 * @Description
 * @createTime 2022-01-15 22:16
 */
public class MysqlJdbccAdapter implements Application {

    private Application application;
    private JdbcConnect jdbcConnect = new DefaultJdbcConnect();

    public MysqlJdbccAdapter(Application application) {
        this.application = application;
    }

    @Override
    public String develop(String content) {
        final String develop = application.develop(content);
        System.out.println("使用" + develop + "开发应用");
        jdbcConnect.connect(develop);
        return "启动完成";
    }
}
