package com.lym.design.pattern.factory.abstractFactory.v2.factory;

import com.lym.design.pattern.factory.abstractFactory.v2.CommonMask;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName CommonMaskFactory.java
 * @Description
 * @createTime 2022-01-13 21:38
 */
public abstract class CommonMaskFactory extends BMCarFactory {

    abstract CommonMask getCommonMask();
}
