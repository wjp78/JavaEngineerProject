package com.imooc.thread;

public class SyncSample {
    class Printer {
        // 锁对象
        Object lock = new Object();
        // synchronized代码块演示，对自定义对象lock上锁
        public void print1() {
            synchronized (lock) {
                try {
                    Thread.sleep(200);
                    System.out.print("魑");
                    Thread.sleep(200);
                    System.out.print("魅");
                    Thread.sleep(200);
                    System.out.print("魍");
                    Thread.sleep(200);
                    System.out.print("魉");
                    System.out.println();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // synchronized方法 - 对this当前对象上锁
        public synchronized void print2() {
            try {
                // this
                Thread.sleep(200);
                System.out.print("魑");
                Thread.sleep(200);
                System.out.print("魅");
                Thread.sleep(200);
                System.out.print("魍");
                Thread.sleep(200);
                System.out.print("魉");
                System.out.println();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // synchronized静态方法 - 该类的字节码对象Printer.class
        /*
        public static synchronized void print3() {
            try {
                // Printer.class
                Thread.sleep(200);
                System.out.print("魑");
                Thread.sleep(200);
                System.out.print("魅");
                Thread.sleep(200);
                System.out.print("魍");
                Thread.sleep(200);
                System.out.print("魉");
                System.out.println();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        */
    }

    class PrintTask implements Runnable {
        public Printer printer;
        @Override
        public void run() {
            printer.print2();
        }
    }

    public void start() {
        Printer printer = new Printer();
        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask();
            task.printer = printer;
            Thread thread = new Thread(task);
            thread.start();
        }
    }

    public static void main(String[] args) {
        SyncSample syncSample = new SyncSample();
        syncSample.start();
    }
}
