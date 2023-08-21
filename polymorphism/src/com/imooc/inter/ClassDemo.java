package com.imooc.inter;

public class ClassDemo implements IOuterInterface {

    @Override
    public void abMethod() {
        System.out.println("实现类");
    }

    // 获取接口中内部类方法
    public InnerClass getInner() {
        return new InnerClass();
    }
}
