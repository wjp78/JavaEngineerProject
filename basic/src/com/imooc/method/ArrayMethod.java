package com.imooc.method;

public class ArrayMethod {
    // 打印输出数组元素的值
    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "   ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        ArrayMethod am = new ArrayMethod();
        am.printArray(arr);
    }
}
