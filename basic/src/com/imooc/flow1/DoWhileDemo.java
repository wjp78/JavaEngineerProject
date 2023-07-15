package com.imooc.flow1;

public class DoWhileDemo {
    public static void main(String[] args) {
        // 求1到5的累加和
        int n = 1;
        int sum = 0;
        do {
            sum += n;
            n++;
        } while(n <= 5);
        System.out.println("sum = " + sum);
    }
}
