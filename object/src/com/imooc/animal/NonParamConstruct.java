package com.imooc.animal;

public class NonParamConstruct {
    public static void main(String[] args) {
        // 对象实例化
        Cat one = new Cat("kk");
        Cat two = new Cat();
        one.run();
    }
}
