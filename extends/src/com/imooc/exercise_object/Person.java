package com.imooc.exercise_object;

public class Person {
    //私有属性：name（姓名）、age(年龄)、sex（性别）
    private String name;
    private int age;
    private String sex;

    //带参构造方法（name、age、sex为参数）
    public Person(String name, int age, String sex) {
       this.setName(name);
       this.setAge(age);
       this.setSex(sex);
    }

    //通过封装实现对属性的get/set方法设定
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //重写toString方法，表示形式为：姓名：+**+  年龄：+**+  性别：+**
    public String toString() {
        return "姓名：" + this.getName() + " 年龄：" + this.getAge() + " 性别：" + this.getSex();
    }
}
