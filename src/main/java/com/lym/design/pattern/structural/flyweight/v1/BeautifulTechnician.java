package com.lym.design.pattern.structural.flyweight.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName BeautifulTechnician.java
 * @Description
 * @createTime 2022-03-08 22:10
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
@ToString
public class BeautifulTechnician extends AbstaractTechician{

    //不变的属性
    private Integer id;
    private String name;
    private Integer age;

    @Override
    public void service() {
        System.out.println("工号"+this.id+"姓名"+this.name+"年龄"+this.age+"正在为您服务");
        //改变外部状态
        this.status = false;
    }

    @Override
    public void end() {
        System.out.println("工号"+this.id+"姓名"+this.name+"年龄"+this.age+"服务结束");
        this.status = true;
    }
}
