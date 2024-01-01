package com.imooc.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 实现随机选择List中的元素
public class CollectionUtils<E> {
    private List<E> data = new ArrayList<>();
    public void add(E element) {
        data.add(element);
    }
    public E randomSelect() {
        int idx = new Random().nextInt(data.size());
        E ret = data.get(idx);
        return ret;
    }

    public static void main(String[] args) {
        CollectionUtils<String> utils = new CollectionUtils<>();
        utils.add("张三");
        utils.add("李四");
        utils.add("王五");
        utils.add("赵六");
        String name = utils.randomSelect();
        System.out.println(name);
        System.out.println(utils.randomSelect());
        System.out.println(utils.randomSelect());
        System.out.println(utils.randomSelect());
        System.out.println(utils.randomSelect());
        System.out.println(utils.randomSelect());
    }
}
