package com.lym.design.pattern.creatation.abstractfactory;


/**
 * 只造口罩
 */
public class WulinHangZhouMaskFactory extends WulinMaskFactory {

    @Override
    AbstractMask newMask() {
        return new CommonMask();
    }
}
