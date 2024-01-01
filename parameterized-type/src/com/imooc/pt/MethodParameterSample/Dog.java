package com.imooc.pt.MethodParameterSample;

public class Dog extends Animal {
    public Dog(String name) {
        this.setName(name);
    }

    @Override
    public void play() {
        System.out.println("小狗" + this.getName() + "在做游戏！");
    }
}
