package com.imooc.exercise_collection;

public class Employee {
    /*
    * 任务
    * 1、实现员工信息类Employee
    *    成员变量：编号id（int），姓名name（String），薪资salary（double）
    *    方法：构造方法和相关的get和set方法
    * 2、定义三条员工信息添加到ArrayList中
    * 3、将所有员工的姓名和薪资输出，见效果图
    * */
    //根据需求完成Employee类的定义
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int salaryid, String name, double salary) {
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

