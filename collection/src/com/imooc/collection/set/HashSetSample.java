package com.imooc.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample {
    public static void main(String[] args) {
        // 实例化Set集合
        Set<String> mobileSet = new HashSet<String>();
        // 通过add方法增加新的元素
        mobileSet.add("13311112222");
        mobileSet.add("13333334444");
        mobileSet.add("13355556666");
        // Set集合不允许出现重复，add方法返回值代表是否真正在集合中插入数据
        boolean isChanged = mobileSet.add("13377778888");
        System.out.println("Set集合是否发生改变：" + isChanged);
        // 对于已有的数据，再次调用add方法写入将返回false
        isChanged = mobileSet.add("13377778888");
        System.out.println("Set集合是否发生改变：" + isChanged);
        System.out.println(mobileSet);
        // Set集合可以使用所有Collection接口定义的方法
        int count = mobileSet.size();
        System.out.println("count = " + count);
        boolean result = mobileSet.contains("13377778888");
        System.out.println("result = " + result);
        // 需要额外注意的是，get等以索引获取数据的方法属于List接口，因此Set实现类无法使用
        // mobileSet.get(0);
        mobileSet.add(null);
        mobileSet.add(null);
        System.out.println(mobileSet);
    }
}
