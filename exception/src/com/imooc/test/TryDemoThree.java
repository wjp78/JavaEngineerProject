package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {
    public static void main(String[] args) {
        // try {
        //     int result = test();
        //     System.out.println("one 和 two 的商是：" + result);
        // } catch (ArithmeticException e) {
        //     System.out.println("除数不允许为零");
        //     e.printStackTrace();
        // } catch (InputMismatchException e) {
        //     System.out.println("请输入整数");
        //     e.printStackTrace();
        // }

        try {
            int result = test();
            System.out.println("one 和 two 的商是：" + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为零");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println('2');
            e.printStackTrace();
        }
        test();
    }

    /*
     * 通过 throws 抛出异常时，针对可能出现的多种异常情况，解决方案：
     * 1、throws 后面接多个异常类型，中间用逗号分隔
     * 2、throws 后面接 Exception
     * */
    /**
     * 测试接收数据相除结果的方法
     * @return 两个接收数据的商
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("========运算开始=========");
        System.out.print("请输入第一个整数：");
        int one = input.nextInt();
        System.out.print("请输入第二个整数：");
        int two = input.nextInt();
        System.out.println("========运算结束=========");
        return one / two;
    }

    // public static int test() throws Exception {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("========运算开始=========");
    //     System.out.print("请输入第一个整数：");
    //     int one = input.nextInt();
    //     System.out.print("请输入第二个整数：");
    //     int two = input.nextInt();
    //     System.out.println("========运算结束=========");
    //     return one / two;
    // }
}
