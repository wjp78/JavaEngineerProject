package com.imooc.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 二维数组的初始化
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("num数组第1行第2列的元素为：" + num[0][1]);
        System.out.println("num数组的行数为：" + num.length);
        System.out.println("num数组的列数为：" + num[0].length);
        int[][] num1 = {{78,98},{65,75,63},{98}};
        System.out.println("num1数组的第1行的列数为：" + num1[0].length);
        // 循环输出二维数组的内容
        for (int[] ints : num1) {
            for (int anInt : ints) {
                System.out.println(anInt + "   ");
            }
            System.out.println();
        }
    }
}
