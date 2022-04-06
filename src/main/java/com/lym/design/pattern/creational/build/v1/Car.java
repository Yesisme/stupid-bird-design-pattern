package com.lym.design.pattern.creational.build.v1;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 *     产品角色（Product）：它是包含多个组成部件的复杂对象，由具体建造者来创建其各个零部件
 * </p>
 */
@Data
@NoArgsConstructor
@ToString
public class Car {

    private String carName;

    private String carTyre;

    private String carEngine;

    private String carBasePlate;

}
