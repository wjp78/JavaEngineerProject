package com.imooc.demo_interface;

// 创建类Balloon并实现接口IFly
public class Balloon implements IFly {
    // 重写方法fly()
    @Override
    public void fly() {
        System.out.println("气球飞上天空");
    }
}
