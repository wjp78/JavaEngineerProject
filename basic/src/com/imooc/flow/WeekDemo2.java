package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入表示星期的英文单词：");
        String week = sc.next();
        week = week.toUpperCase();
        switch (week) {
            case "MONDAY" -> System.out.println("星期一");
            case "TUESDAY" -> System.out.println("星期二");
            case "WEDNESDAY" -> System.out.println("星期三");
            case "THURSDAY" -> System.out.println("星期四");
            case "FRIDAY" -> System.out.println("星期五");
            case "SATURDAY" -> System.out.println("星期六");
            case "SUNDAY" -> System.out.println("星期日");
            default -> System.out.println("单词输入错误！");
        }
    }
}
