package com.imooc.thread.mall;

public class Mall {
    public synchronized void sale() {
        if (Stock.count > 0) {
            try {
                // 模拟商城办理销售业务，用时5毫秒
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 销售成功库存减少
            Stock.count--;
            System.out.println("商品销售成功");
        } else {
            System.out.println("商品库存不足，请下次再来吧");
        }
    }

    public static void main(String[] args) {
        // 实例化唯一到商城对象
        Mall mall = new Mall();
        // 模拟5名顾客同时涌入商城购买商品
        for (int i = 0; i < 5; i++) {
            Consumer consumer = new Consumer();
            consumer.mall = mall;
            Thread thread = new Thread(consumer);
            thread.start();
        }
        try {
            // 模拟下班后判断库存
            Thread.sleep(1000);
            System.out.println("当前商品库存为：" + Stock.count);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
