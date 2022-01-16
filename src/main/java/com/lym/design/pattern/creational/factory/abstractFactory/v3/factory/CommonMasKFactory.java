package com.lym.design.pattern.creational.factory.abstractFactory.v3.factory;

import com.lym.design.pattern.creational.factory.abstractFactory.v3.AbstarctMask;
import com.lym.design.pattern.creational.factory.abstractFactory.v3.CommonMask;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName CommonMasKFactory.java
 * @Description
 * @createTime 2022-01-13 22:37
 */
public class CommonMasKFactory extends MaskFactory {

    @Override
    public AbstarctMask getMask() {
        return new CommonMask();
    }
}
