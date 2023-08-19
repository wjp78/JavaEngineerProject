package com.imooc.demo_interface;

//创建类Plane并实现接口IFly
public class Plane implements IFly {
    //重写fly方法
    @Override
    public void fly() {
        System.out.println("飞机在天上飞");
    }
}