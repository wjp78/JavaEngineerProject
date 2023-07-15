package com.imooc.flow1;

public class ForDemo {
    public static void main(String[] args) {
        // 求1到5到和
        int sum = 0;
        for(int n=1; n<=5; n++) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
