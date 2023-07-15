package com.imooc.method;

public class MaxDemo {
    // 求最大值的方法
    public void max(float a, float b) {
        float max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("两个数" + a + "和" + b + "的最大值为：" + max);
    }
    public static void main(String[] args) {
         MaxDemo maxDemo = new MaxDemo();
         int a=5,b=3;
         maxDemo.max(a,b); // int类型会自动转换成float类型
         float m=5.6f,n=8.9f;
         maxDemo.max(m,n);
         maxDemo.max(9.8f,12.8f);
         // maxDemo.max(1.2,3.4); // 报错: double类型参数无法转换成float类型
    }
}
