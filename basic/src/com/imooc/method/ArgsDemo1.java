package com.imooc.method;

public class ArgsDemo1 {
    // 查找
    public void search(int n, int... a) {
        boolean flag = false;
        for (int a1:a) {
            if (a1 == n) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("找到了!" + n);
        } else {
            System.out.println("没找到!" + n);
        }
    }
    // public void search(int n, int[] a) { // 报错
    //    在方法定义中，认为当前的两个search方法重复定义,而不是重载！
    // }
    public static void main(String[] args) {
        ArgsDemo1 ad1 = new ArgsDemo1();
        ad1.search(3,1,2,3,4,5);
        int[] a = {1,2,3,4,5};
        ad1.search(3,a); // 可以将数组传递给可变参数列表
    }
}
