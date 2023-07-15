package com.imooc.flow1;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        // 循环输入数字1-10并输出, 如果输入0则跳出循环
        // 从键盘接收数据
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            n = sc.nextInt();
            if (n == 0) break;
            System.out.println(n);
        }
    }
}
