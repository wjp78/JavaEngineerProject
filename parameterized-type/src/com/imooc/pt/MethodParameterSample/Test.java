package com.imooc.pt.MethodParameterSample;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //定义List并添加Dog类对象
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("巴迪"));
        animals.add(new Dog("豆豆"));

        //定义List并添加Cat类对象
        animals.add(new Cat("花花"));
        animals.add(new Cat("凡凡"));

        //使用AnimalPlay类的方法，按照演示效果输出内容
        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.play(animals);
    }
}
