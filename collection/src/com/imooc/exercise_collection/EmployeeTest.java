package com.imooc.exercise_collection;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        //定义ArrayList对象
        ArrayList<Employee> employees = new ArrayList<Employee>();
        //创建三个Employee类的对象
        Employee zhangsan = new Employee(1, "张三", 5000);
        Employee lisi = new Employee(2, "李四", 5500);
        Employee zhaoliu = new Employee(3, "赵六", 4000);
        //添加员工信息到ArrayList中
        employees.add(zhangsan);
        employees.add(lisi);
        employees.add(zhaoliu);
        //显示员工的姓名和薪资
        System.out.println("员工姓名" + "   " + "员工薪资");
        for (int i = 0; i < employees.size(); i++) {
            Employee item = employees.get(i);
            System.out.println(item.getName() + "       " + item.getSalary());
        }
    }
}

