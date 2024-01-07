package com.imooc.thread.BarberExercise;

// 测试类
public class Test {
    public static void main(String[] args) {
        Barber b = new Barber();
        Cut cut = new Cut(b);
        Wash wash = new Wash(b);

        cut.start();
        wash.start();
    }
}



