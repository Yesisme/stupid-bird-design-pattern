package com.lym.design.pattern.creational.build.v1;

/**
 * <P>
 *     具体建造者(Concrete Builder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 * </P>
 */
public class CarBuild extends AbstractCarBuild {

    public CarBuild() {
        car = new Car();
    }

    @Override
    AbstractCarBuild buildCarName(String carName) {
        car.setCarName(carName);
        return this;
    }

    @Override
    AbstractCarBuild buildCarTyre(String carTyre) {
        car.setCarTyre(carTyre);
        return this;
    }

    @Override
    AbstractCarBuild buildCarEngine(String carEngine) {
        car.setCarEngine(carEngine);
        return this;
    }

    @Override
    AbstractCarBuild buildCarBasePlate(String basePlate) {
        car.setCarBasePlate(basePlate);
        return this;
    }

}
