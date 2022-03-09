package com.lym.design.pattern.structural.flyweight.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName AbstartTeachician.java
 * @Description
 * @createTime 2022-03-08 22:14
 */
public abstract class AbstaractTechician {

    boolean status = true;

    //享元的不可共享属性留给外部进行改变的接口
    public abstract void service();

    //享元的不可共享属性留给外部进行改变的接口
    public abstract void end();

   public boolean canServer(){
       return this.status;
   }

}
