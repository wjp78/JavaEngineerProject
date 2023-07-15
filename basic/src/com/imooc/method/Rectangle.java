package com.imooc.method;

public class Rectangle {
    // 求长方形面积的方法
    public int area() {
        int length = 10;
        int width = 5;
        int getArea = length * width; // 注意：变量名可以和方法名相同，但是不建议这样写。
        return getArea; // 返回语句
    }
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        System.out.println("长方形的面积为: " + rc.area());
    }
}
