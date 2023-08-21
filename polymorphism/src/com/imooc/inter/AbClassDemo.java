package com.imooc.inter;

public class AbClassDemo implements IOuterInterface {
    @Override
    public void abMethod() {

    }

    // 继承抽象类AbInnerClass
    public class AbDemo extends AbInnerClass {
        @Override
        public void abInfo() {
            System.out.println("重写接口中抽象类中的抽象方法");
        }
    }
}
