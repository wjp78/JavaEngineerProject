package com.imooc.inter;

import com.imooc.inter.IOuterInterface.InnerClass;

// 测试类：普通成员内部类
public class Test {

    public static void main(String[] args) {
        /* 第一种实例化对象方式：
         * 通过 接口名.类名 进行实例化
         */
        IOuterInterface.InnerClass inner = new IOuterInterface.InnerClass();
        inner.show();

        /* 第二种实例化对象方式：
         * 通过在实现类中创建接口中内部类获取方式
         * 用实现类对象调用获取方法
         */
        ClassDemo demo = new ClassDemo();
        demo.getInner().show();

        /* 第三种实例化对象方式：
         * 将内部类导入后，直接实例化
         */
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }
}
