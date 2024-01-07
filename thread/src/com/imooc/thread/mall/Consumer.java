package com.imooc.thread.mall;

public class Consumer implements Runnable {
    // 所有消费者都来到同一个商城
    public Mall mall;

    @Override
    public void run() {
        // 商城为每一名消费者销售商品
        mall.sale();
    }
}
