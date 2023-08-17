package com.imooc.test;

import com.imooc.tel.Camera;
import com.imooc.tel.FourthPhone;
import com.imooc.tel.IPhoto;

public class PhoneTest {
    public static void main(String[] args) {
        FourthPhone phone = new FourthPhone();
        phone.call();
        phone.message();
        phone.vidio();
        phone.music();
        phone.photo();
        phone.network();
        System.out.println("=======================");

        IPhoto ip = new FourthPhone();
        ip.photo();
        ip = new Camera();
        ip.photo();
    }
}
