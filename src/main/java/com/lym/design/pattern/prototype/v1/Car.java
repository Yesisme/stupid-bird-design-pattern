package com.lym.design.pattern.prototype.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Car.java
 * @Description
 * @createTime 2022-01-10 21:24
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Car implements Cloneable {

    private String name;

    private String engine;

    private User user;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @ToString
    public static class User {
        private String name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
