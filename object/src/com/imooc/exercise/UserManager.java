package com.imooc.exercise;

public class UserManager {
    // 用户信息验证的方法
    public String checkUser(User one, User two) {
        // 判断用户名和密码是否为空，是否一致
        if (one.getUserName().equals("") || one.getPassword().equals("") || two.getUserName().equals("") || two.getPassword().equals("")) {
            return "用户名或密码不能为空";
        }
        if (one.getUserName().equals(two.getUserName()) && one.getPassword().equals(two.getPassword())) {
            return "用户名和密码一致";
        } else {
            return "用户名和密码不一致";
        }
    }
}
