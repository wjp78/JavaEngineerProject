package com.imooc.thread.BarberExercise;

// Cut类
public class Cut extends Thread {
    Barber b;
    public Cut(Barber b) {
        this.b = b;
    }
    @Override
    public void run() {
        b.cut();
    }
}


