package com.imooc.test;
// import com.imooc.animal.*; // 加载com.imooc.animal 下的所有类
import com.imooc.animal.Cat; // 加载com.imooc.animal 下指定的 Cat 类

public class Test {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.run("花花");
        // one.setName("花花");
        // one.setMonth(2);
        // one.setSpecies("英国短毛猫");
        // // 静态成员访问方式：1、对象.成员 2、类.成员（推荐）
        // one.price = 2000;
        // Cat.price = 3000;
        // one.run();
    }
}
