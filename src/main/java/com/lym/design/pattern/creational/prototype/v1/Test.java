package com.lym.design.pattern.creational.prototype.v1;

/**
 * @author yiming.le
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 序列化属于深拷贝属于深拷贝
 * @createTime 2022-01-10 21:32
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car();
        car.setEngine("宝马引擎");
        car.setName("宝马");
        Car.User user = new Car.User();
        user.setName("张三");
        car.setUser(user);

        final Car newCar = (Car) car.clone();
        System.out.println("car------>" + car);
        System.out.println(car == newCar);
        System.out.println("newCar------>" + newCar);

        car.setName("奔驰"); //基本数据类型不受影响
        car.getUser().setName("李四"); //浅拷贝 user对象的引用地址都是同一个(引用类型)

        System.out.println("car------>" + car);
        System.out.println("newCar------>" + newCar);
    }
}
