package com.imooc.thread;

/**
 * 死锁的演示
 */
public class DeadLock {
    private static String fileA = "A文件";
    private static String fileB = "B文件";
    class Runner1 implements Runnable{
        @Override
        public void run() {
            while(true) {
                synchronized (fileA) {//打开文件A，线程独占
                    System.out.println(Thread.currentThread().getName() + ":文件A写入");
                    synchronized (fileB) {
                        System.out.println(Thread.currentThread().getName() + ":文件B写入");
                    }
                    System.out.println(Thread.currentThread().getName() + ":所有文件保存");
                }
            }
        }
    }
    class Runner2 implements Runnable{
        @Override
        public void run() {
            while(true) {
                synchronized (fileB) {//打开文件B，线程独占
                    System.out.println(Thread.currentThread().getName() + ":文件B写入");
                    synchronized (fileA) {
                        System.out.println(Thread.currentThread().getName() + ":文件A写入");
                    }
                    System.out.println(Thread.currentThread().getName() + ":所有文件保存");
                }
            }
        }
    }

    public void start(){
        new Thread(new Runner1()).start();
        new Thread(new Runner2()).start();
    }
    public static void main(String[] args) {
        new DeadLock().start();
    }
}
