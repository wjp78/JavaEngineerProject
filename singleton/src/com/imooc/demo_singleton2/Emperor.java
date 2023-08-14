package com.imooc.demo_singleton2;

public class Emperor {
    //定义私有构造方法
    private Emperor() { }
    //定义私有静态类对象
    private static Emperor instance = null;
    //定义公有静态方法返回类内的私有静态对象
    public static Emperor getInstance() {
        if (instance == null) instance = new Emperor();
        return instance;
    }
}
