package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        // 要求猜一个介于1到10之间的数字。然后将猜测的值与实际值进行比较，并给出提示，以便能更接近实际值，直到猜中为止。
        /*
        * 程序分析：
        *   1.给定要猜测的数字
        *   2.使用循环结构
        *   3.循环进行的条件：猜测的数据和实际值不相等
        *   4.循环体的内容：输入实际值，及进行判断
        *   5.输出猜到的值
        * */

        // 设置要猜的数
        int number = (int)(Math.random() * 10 + 1); // Math.random() 返回 [0,1) 之间的数 (0 <= x < 1)
        System.out.println("number = " + number);
        int guess;
        System.out.println("猜一个介于1到10之间的数");
        do {
            System.out.println("请输入您猜测的数:");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("太大!");
            } else if (guess < number) {
                System.out.println("太小!");
            }
        } while(number != guess);
        System.out.println("您猜中了! 答案为 " + guess);
    }
}
