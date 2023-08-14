package com.imooc.demo_singleton1;

public class Earth {
    //定义私有构造方法，并在构造方法中打印输出“地球诞生”
    private Earth() {
        System.out.println("地球诞生");
    }
    //定义私有静态类对象并完成实例化
    private static Earth instance = new Earth();
    //定义公有静态方法返回类内的私有静态对象
    public static Earth getInstance() {
        return instance;
    }
}
