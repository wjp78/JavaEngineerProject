package com.imooc.thread.BarberExercise;

// Wash
public class Wash extends Thread {
    Barber b;
    public Wash(Barber b) {
        this.b = b;
    }
    @Override
    public void run() {
        b.wash();
    }
}



