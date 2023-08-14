package com.imooc.demo_singleton2;

public class Test {
    public static void main(String[] args) {
        System.out.println("创建1号皇帝对象");
        Emperor one = Emperor.getInstance();
        System.out.println("创建2号皇帝对象");
        Emperor two = Emperor.getInstance();
        System.out.println("创建3号皇帝对象");
        Emperor three = Emperor.getInstance();
        System.out.println("三个皇帝对象依次是：");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
