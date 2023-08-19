package com.imooc.demo_interface;

//测试类
public class Test {

    public static void main(String[] args) {
        //对象实例化
        Plane plane = new Plane();
        Bird brid = new Bird();
        Balloon balloon = new Balloon();

        //分别调用fly()方法
        plane.fly();
        brid.fly();
        balloon.fly();
    }
}