package com.lym.design.pattern.creatation.abstractfactory;

/**
 * 分厂：否则口罩
 */
public class WulinWuHanMaskFactory  extends WulinMaskFactory{

    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }
}
