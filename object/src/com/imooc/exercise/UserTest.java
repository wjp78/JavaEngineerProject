package com.imooc.exercise;

public class UserTest {
    // 测试方法
    public static void main(String[] args) {
        //实例化对象，调用相关方法实现运行效果
        User userOne = new User("Lucy", "123456");
        User userTwo = new User("Mike", "123456");
        UserManager um = new UserManager();
        System.out.println("==========================");
        System.out.println(um.checkUser(userOne, userTwo));
    }
}
