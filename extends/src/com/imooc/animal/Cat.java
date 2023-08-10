package com.imooc.animal;

import com.imooc.animal.Animal;

public class Cat extends Animal {
    private double weight; // 体重
    // public int temp = 300;
    public static int st3 = 44;

    static  {
        System.out.println("我是子类的静态代码块");
    }

    {
        System.out.println("我是子类的构造代码块");
    }

    public Cat() {
//        Animal temp = new Animal();
//        temp.name();
//        this.temp = 12;
//        this.month = 23;
//        this.species = "";
        System.out.println("我是子类的无参构造方法");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 跑动的方法
    public void run() {
        eat();
//        Animal();
        System.out.println(this.getName() + "是一只" + this.getSpecies() + ",它在快乐的奔跑");
    }
}
