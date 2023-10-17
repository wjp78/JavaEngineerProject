package com.imooc.string;

public class StringDemo5 {
    public static void main(String[] args) {
        // == 和 equals 方法的区别
        // 定义三个字符串，内容都是 imooc
        String str1 = "imooc";
        String str2 = "imooc";
        String str3 = new String("imooc");
        System.out.println("str1 和 str2 的内容相同？" + (str1.equals(str2))); // true
        System.out.println("str1 和 str3 的内容相同？" + (str1.equals(str3))); // true

        System.out.println("str1 和 str2 的地址相同？" + (str1 == str2)); // true
        System.out.println("str1 和 str3 的地址相同？" + (str1 == str3)); // false
    }
}
