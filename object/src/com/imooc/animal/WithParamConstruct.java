package com.imooc.animal;

public class WithParamConstruct {
    public static void main(String[] args) {
        // 对象实例化
        Cat one = new Cat("花花", 2, 1000, "英国短毛猫");
        System.out.println("昵称: " + one.name);
        System.out.println("年龄: " + one.month);
        System.out.println("体重: " + one.weight);
        System.out.println("品种: " + one.species);
        one.run();

    }
}
