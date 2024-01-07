package com.imooc.thread.BarberExercise;

// Barber（理发师）类
public class Barber {
    // 洗头发
    public void wash() {
        synchronized(this) {
            System.out.println("打湿头发");
            System.out.println("洗头水");
            System.out.println("冲洗");
        }
    }
    // 剪头发
    public synchronized void cut() {
        System.out.println("剪短");
        System.out.println("烫发");
    }
}



