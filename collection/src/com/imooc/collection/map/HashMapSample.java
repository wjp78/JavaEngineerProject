package com.imooc.collection.map;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        // 泛型可以只写在左边，右边泛型可以省略
        HashMap<String, Object> student = new HashMap<>();
        // put方法向Map放入键值对
        student.put("name", "张三");
        // 多次为同一个key赋值，新的value会覆盖旧value，同时将旧value返回
        String name = (String) student.put("name", "李四");
        System.out.println(name + "已被替换为李四");
        // Map可以存储多组键值对，且value可以是不同类型
        student.put("age", 18);
        student.put("height", 182);
        student.put("weight", 60);
        System.out.println(student);

        // 利用get方法获取指定key的value
        String n = (String) student.get("name");
        System.out.println(n);

        // 利用containsKey方法判断Map对象是否存在该key
        boolean r1 = student.containsKey("name");
        System.out.println("r1 = " + r1);
        // 利用containsValue方法判断Map对象是否存在该value
        boolean r2 = student.containsValue(61);
        System.out.println("r2 = " + r2);

        // size方法获取Map的键值对数量
        int count = student.size();
        System.out.println("count = " + count);

        // remove方法删除键值对
        Integer w = (Integer) student.remove("weight");
        System.out.println("weight项已被移除，其值为: " + w);
        System.out.println(student);
    }
}
