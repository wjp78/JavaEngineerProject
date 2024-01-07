package com.imooc.thread;

public class RunnableSample {
    static class Cat implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("A cat");
            }
        }
    }

    static class Dog implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("A dog");
            }
        }
    }
}
