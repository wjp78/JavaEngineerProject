package com.imooc.method;

public class MathDemo {
    //求两个int类型数的和
    public int plus(int m, int n) {
        return m + n;
    }
    //求两个double类型数的和
    public double plus(double m, double n) {
        return m + n;
    }
    //求数组元素的累加和
    public int plus(int[] arr) {
        int sum = 0;
        for(int item:arr) {
            sum+=item;
        }
        return sum;
    }

    public static void main(String[] args) {
        int m=5,n=10;
        int[] arr = {1,2,3,4,5,6};
        MathDemo mathDemo = new MathDemo();
        System.out.println("int类型的和: " + mathDemo.plus(m,n));
        System.out.println("doubel类型的和: " + mathDemo.plus(5.6,7.8));
        System.out.println("数组元素的和: " + mathDemo.plus(arr));
    }
}
