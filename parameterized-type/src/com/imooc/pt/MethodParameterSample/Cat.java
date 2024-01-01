package com.imooc.pt.MethodParameterSample;

public class Cat extends Animal {
    public Cat(String name) {
        this.setName(name);
    }

    @Override
    public void play() {
        System.out.println("小猫" + this.getName() + "在做游戏！");
    }
}
