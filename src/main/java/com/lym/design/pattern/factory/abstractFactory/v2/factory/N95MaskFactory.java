package com.lym.design.pattern.factory.abstractFactory.v2.factory;

import com.lym.design.pattern.factory.abstractFactory.v2.N95Mask;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AudiMaskFactory.java
 * @Description
 * @createTime 2022-01-13 21:35
 */
public abstract class N95MaskFactory extends BMCarFactory {

    abstract N95Mask getN95Mask();
}
