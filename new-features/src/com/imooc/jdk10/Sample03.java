package com.imooc.jdk10;

import java.util.ArrayList;

// var动态类型推断
public class Sample03 {
    public static void main(String[] args) {
        var str = new String("a");
        var str1 = "a";
        System.out.println(str instanceof String);
        System.out.println(str1 instanceof String);
        var list = new ArrayList<String>();
        list.add("abc");
        // list.add(321);
        // var l = 100l;
        var l = Long.valueOf(100l);
        System.out.println(l instanceof Long);

        var b = Boolean.valueOf(true);
        System.out.println(b instanceof Boolean);
    }
}
