package com.imooc.tel;

public class Camera implements IPhoto {
    @Override
    public void photo() {
        System.out.println("相机可以拍照");
    }
    // public void photo() {
    //     System.out.println("相机可以拍照");
    // }
}
