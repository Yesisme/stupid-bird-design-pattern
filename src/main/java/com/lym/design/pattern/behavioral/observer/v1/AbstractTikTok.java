package com.lym.design.pattern.behavioral.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Tiktoker.java
 * @Description 抽象目标
 * @createTime 2022-05-05 23:36
 */
public abstract class AbstractTikTok {


    abstract void addFan(AbstractFans abstractFans);


    abstract void notify(String msg);

}
