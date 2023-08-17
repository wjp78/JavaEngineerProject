package com.imooc.tel;

/**
 * 原始手机
 * @author hugh
 */
public class Telphone {
    private String brard;
    private int price;

    public Telphone() {
    }

    public String getBrard() {
        return brard;
    }

    public void setBrard(String brard) {
        this.brard = brard;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 打电话
    public void call() {
        System.out.println("手机可以打电话");
    }
}
