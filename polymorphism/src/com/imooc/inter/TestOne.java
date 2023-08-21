package com.imooc.inter;

public class TestOne {

    public static void main(String[] args) {
        /* 第一种实例化对象方式：
         * 通过接口名.类名 进行实例化
         * 但是对于抽象类而言，不能直接实例化，所以这里可使用匿名内部类的方式
         */
        IOuterInterface.AbInnerClass abInner = new IOuterInterface.AbInnerClass() {
            @Override
            public void abInfo() {
                System.out.println("重写抽象类中的抽象方法");
            }
        };
        abInner.abInfo();
        abInner.info();
        System.out.println("===========================");

        /* 第二种实例化方法：
         * 在实现类中定义内部类继承接口中的抽象内部类
         */
        IOuterInterface.AbInnerClass abInnerOne = new AbClassDemo().new AbDemo();
        abInnerOne.abInfo();
        abInnerOne.info();
    }
}
