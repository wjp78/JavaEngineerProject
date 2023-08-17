package com.imooc.demo_abstract;

import java.text.DecimalFormat;

//测试类
public class Test {
    public static void main(String[] args) {
        //创建类的实例，并分别对圆的半径和矩形的长宽进行赋值
        Shape circle = new Circle(3.5);
        Shape rectangle = new Rectangle(6,5);
        //调用area（）方法，输出结果

        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        System.out.println("圆的面积为 " + decimalFormat.format(circle.area()));
        System.out.println("矩形的面积为 " + rectangle.area());
    }
}
