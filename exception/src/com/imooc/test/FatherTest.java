package com.imooc.test;

public class FatherTest {
    public void test() throws HotelAgeException {
        throw new HotelAgeException();
    }
}

class SubException extends HotelAgeException {

}
