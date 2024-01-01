package com.imooc.exercise_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomObjectSortSample {
    private class CustomComparator implements Comparator<Goods> {
        @Override
        public int compare(Goods o1, Goods o2) {
            // return o2.getSn().compareTo(o1.getSn());
            return o2.getTitle().compareTo(o1.getTitle());
        }
    }

    public List<Goods> sort(List<Goods> list) {
        CustomComparator comp = new CustomComparator();
        Collections.sort(list, comp);
        return list;
    }

    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("18827382190", "商品A"));
        goodsList.add(new Goods("83219078978", "商品B"));
        goodsList.add(new Goods("83241781237", "商品C"));
        goodsList.add(new Goods("18579831426", "商品D"));
        System.out.println("排序前");
        System.out.println(goodsList);
        System.out.println("排序后");
        List<Goods> list = new CustomObjectSortSample().sort(goodsList);
        System.out.println(list);
    }
}
