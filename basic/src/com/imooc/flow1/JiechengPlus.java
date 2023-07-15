package com.imooc.flow1;

public class JiechengPlus {
    public static void main(String[] args) {
        long s = 1, sum = 0;
        for (int i=1; i<=10; i++) {
            s = 1;
            for (int j=1; j<=i; j++) {
                s*=j; // s存放阶乘计算的结果
            }
            sum += s;
        }
        System.out.println("1!+2!+3!+4!...+10! = " + sum);
    }
}
