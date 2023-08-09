package com.imooc.exercise_extends;

public class User{
    //定义属性用户名、密码
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.setUserName(userName);
        this.setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println("用户名: " + this.userName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("密码: " + this.password);

    }
}