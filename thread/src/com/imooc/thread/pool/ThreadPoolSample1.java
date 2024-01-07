package com.imooc.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolSample1 {
    public static void main(String[] args) {
        // 创建一个可创建一个定长线程池
        // 定长线程池的特点是固定线程总数，空闲线程用于执行任务，如果线程都在使用，后续任务则处于等待状态
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 1000; i++) {
            final int index = i;
            // 不需要返回值，使用execute方法执行Runnable对象
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ": " + index);
                }
            });
        }
        /*
        需要返回值，使用submit方法执行Callable对象，利用Future对象接收返回值
        Future<Object> ret = threadPool.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        });
        */
        // 处理完毕关闭线程池
        threadPool.shutdown();
    }
}