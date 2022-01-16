package com.lym.design.pattern.structural.adapter.v2;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName MysqlJdbcConnect.java
 * @Description
 * @createTime 2022-01-15 21:46
 */
public class DefaultJdbcConnect implements JdbcConnect {

    public DefaultJdbcConnect() {
    }

    @Override
    public void connect(String langu) {
        System.out.println(langu + "开始连接");
    }
}
