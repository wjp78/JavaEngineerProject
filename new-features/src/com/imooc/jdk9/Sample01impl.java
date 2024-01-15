package com.imooc.jdk9;

public class Sample01impl implements Sample01 {
    @Override
    public void showDetail() {
        System.out.println("详细信息");
        System.out.println("网址: www.imooc.com");
    }

    public static void main(String[] args) {
        Sample01 sample01 = new Sample01impl();
        sample01.showInfo();
        sample01.showDetail();
    }
}
