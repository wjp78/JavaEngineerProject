package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.setName("花花");
        one.setSpecies("中华田园猫");
        one.eat();
        one.run();
        System.out.println(one.temp);
        System.out.println("===========================");
        Dog two = new Dog();
        two.setName("妞妞");
        two.setMonth(1);
        two.eat();
        two.sleep();
        System.out.println("===========================");
        two.eat("凡凡");
        // System.out.println("===========================");
        // Animal three = new Animal();
        // three.run();
        // three.sleep();
    }
}
