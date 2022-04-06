package com.lym.design.pattern.creational.build.v1;

/**
 *  * <P>
 *  *     抽象建造者（Builder）：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
 *  * </P>
 */
public abstract class AbstractCarBuild {

    protected Car car;

    abstract AbstractCarBuild buildCarName(String carName);

    abstract AbstractCarBuild buildCarTyre(String carTyre);

    abstract AbstractCarBuild buildCarEngine(String carEngine);

    abstract AbstractCarBuild buildCarBasePlate(String basePlate);

    Car build() {
        return car;
    }

}
