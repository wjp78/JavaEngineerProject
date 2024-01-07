package com.imooc.thread;

public class RunnableSampleTest {
    public static void main(String[] args) {
        RunnableSample.Cat cat = new RunnableSample.Cat();
        RunnableSample.Dog dog = new RunnableSample.Dog();

        Thread threadCat = new Thread(cat);
        Thread threadDog = new Thread(dog);

        threadCat.start();
        threadDog.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("main thread");
        }
    }
}
