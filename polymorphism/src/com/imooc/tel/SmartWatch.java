package com.imooc.tel;

public class SmartWatch implements INet, IPhoto {
    public static final int TEMP = 30;
    public void call() {
        System.out.println("智能手表可以打电话");
    }

    public void message() {
        System.out.println("智能手表可以发短信");
    }

    @Override
    public void network() {
        System.out.println("智能手表可以上网");
    }

    @Override
    public void photo() {

    }

    public void connection() {
        System.out.println("SmartWatch中的connection");
    }
}
