package com.imooc.exercise;

public class CodeBlock {
    // 创建CodeBlock的构造块
    {
        System.out.println("CodeBlock的构造块");
    }

    //创建CodeBlock的静态代码块
    static {
        System.out.println("CodeBlock的静态代码块");
    }

    //创建CodeBlock的构造方法
    public CodeBlock() {
        System.out.println("CodeBlock的构造方法");
    }

    public static void main(String[] args){
        //编写代码测试运行优先顺序，运行结果参见效果图
        System.out.println("CodeBlock的主方法");
        System.out.println("产生Code类实例对象");
        Code code = new Code();
        System.out.println("产生CodeBlock类实例对象");
        CodeBlock cb = new CodeBlock();
    }
}
