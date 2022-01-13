package com.lym.design.pattern.factory.abstractFactory.v3.factory;

import com.lym.design.pattern.factory.abstractFactory.v3.AbstarctMask;
import com.lym.design.pattern.factory.abstractFactory.v3.N95Mask;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName N95MasKFactory.java
 * @Description
 * @createTime 2022-01-13 22:37
 */
public class N95MasKFactory extends MaskFactory {

    @Override
    public AbstarctMask getMask() {
        return new N95Mask();
    }
}
