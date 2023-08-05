package com.imooc.animal;

public class CatTest {
    public static void main(String[] args) {
        // 对象实例化
        Cat one = new Cat();
        // one.setName("凡凡");
        one.setMonth(0);
        // one.weight = 800;
        // one.species = "中华田园猫";
        // System.out.println(one.getName());
        if (one.getMonth() == 0) return;
        System.out.println("年龄: " + one.getMonth());
        // System.out.println("体重: " + one.weight);
        // System.out.println("品种: " + one.species);
    }
}


