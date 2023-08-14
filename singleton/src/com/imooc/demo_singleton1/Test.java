package com.imooc.demo_singleton1;

public class Test {
    public static void main(String[] args) {
        System.out.println("第一个地球创建中。。。。");
        Earth earth1 = Earth.getInstance();
        System.out.println("第二个地球创建中。。。。");
        Earth earth2 = Earth.getInstance();
        System.out.println("第三个地球创建中。。。。");
        Earth earth3 = Earth.getInstance();
        System.out.println("问：三个地球是同一个么？");
        System.out.println(earth1);
        System.out.println(earth2);
        System.out.println(earth3);
    }
}
