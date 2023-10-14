package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

    public static void main(String[] args) {
        /* // 要求：定义两个整数，输出两数之商
            int one = 12;
            int two = 2;
            System.out.println("one 和 two 的商是：" + (one/two));
        */

        // 要求：定义两个整数，接收用户的键盘输入，输出两数之商
        Scanner input = new Scanner(System.in);
        System.out.println("========运算开始=========");
        try {
            System.out.print("请输入第一个整数：");
            int one = input.nextInt();
            System.out.print("请输入第二个整数：");
            int two = input.nextInt();
            System.out.println("one 和 two 的商是：" + (one / two));
        } catch(ArithmeticException e) {
            System.exit(1); // 终止程序运行
            System.out.println("除数不允许为零");
            e.printStackTrace();
        } catch(InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("出错啦～～");
            e.printStackTrace();
        } finally {
            System.out.println("========运算结束=========");
        }
    }
}
