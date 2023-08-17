package com.imooc.demo_abstract;

// 子类圆Circle类
public class Circle extends Shape {
    // 属性：圆的半径r
    private double r;
    // 创建带参构造方法以及无参构造方法

    public Circle() {
    }

    public Circle(double r) {
        this.setR(r);
    }

    // 创建针对半径的赋值和取值方法
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    // 重写父类中area()方法
    @Override
    public double area() {
        return Math.PI * (this.getR() * this.getR());
    }
}
