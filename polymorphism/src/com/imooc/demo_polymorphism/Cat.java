package com.imooc.demo_polymorphism;

public class Cat extends Animal {
    //重写父类cry()方法，输出信息为“小猫的叫声：喵喵喵~~~”
    @Override
    public void cry() {
        System.out.println("小猫的叫声：喵喵喵~~~");
    }
}

