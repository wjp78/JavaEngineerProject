package com.imooc.thread;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadSample3 {
    class Runner implements Callable<Integer> {
        public String name;
        @Override
        public Integer call() throws Exception {
            Integer speed = new Random().nextInt(10);
            Integer result = 0;
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                result = i * speed;
                System.out.println("第" + i + "秒: " + this.name + "已跑到" + (i * speed) + "米(" + speed + "米/秒)");
            }
            return result;
        }
    }

    public void start() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runner threadA = new Runner();
        threadA.name = "参赛者A";
        Runner threadB = new Runner();
        threadB.name = "参赛者B";
        Runner threadC = new Runner();
        threadC.name = "参赛者C";
        Future<Integer> r1 = executorService.submit(threadA);
        Future<Integer> r2 = executorService.submit(threadB);
        Future<Integer> r3 = executorService.submit(threadC);
        executorService.shutdown();
        System.out.println(threadA.name + "累计跑了" + r1.get() + "米");
        System.out.println(threadB.name + "累计跑了" + r2.get() + "米");
        System.out.println(threadC.name + "累计跑了" + r3.get() + "米");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new ThreadSample3().start();
    }
}
