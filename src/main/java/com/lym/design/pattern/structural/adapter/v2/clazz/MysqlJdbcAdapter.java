package com.lym.design.pattern.structural.adapter.v2.clazz;

import com.lym.design.pattern.structural.adapter.v2.Application;
import com.lym.design.pattern.structural.adapter.v2.DefaultJdbcConnect;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName MysqlJdbcAdapter.java
 * @Description
 * @createTime 2022-01-15 21:51
 */
public class MysqlJdbcAdapter extends DefaultJdbcConnect implements Application {

    private Application application;

    public MysqlJdbcAdapter(Application application) {
        this.application = application;
    }

    @Override
    public String develop(String content) {
        final String develop = application.develop(content);
        System.out.println("使用" + develop + "开发应用");
        System.out.println("使用mysql驱动");
        this.connect(develop);
        return "启动完成";
    }
}
