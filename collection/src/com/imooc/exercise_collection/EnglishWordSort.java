package com.imooc.exercise_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnglishWordSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //给list添加元素
        list.add("orange");
        list.add("tomato");
        list.add("apple");
        list.add("litchi");
        list.add("banana");
        //输出排序前list中的内容
        System.out.println("排序前："  + '\n' + list);

        //对list中的元素进行排序
        Collections.sort(list);

        //输出排序后list中的内容
        System.out.println("排序后："  + '\n' + list);
    }
}
