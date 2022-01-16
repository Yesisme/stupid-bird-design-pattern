package com.lym.design.pattern.creatation.abstractfactory;

/**
 * 分厂：VanCar
 */
public class WulinVanCarFactory extends WulinCarFactory{
    @Override
    AbstractCar newCar() {
        return new VanCar();
    }

}
