package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7之间的数字：");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            case 4 -> System.out.println("星期四");
            case 5 -> System.out.println("星期五");
            case 6 -> System.out.println("星期六");
            case 7 -> System.out.println("星期日");
            default -> System.out.println("该数字超出了1-7的范围!");
        }
    }
}
