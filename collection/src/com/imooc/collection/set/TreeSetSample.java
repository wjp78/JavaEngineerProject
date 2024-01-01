package com.imooc.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
    class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    public void sort() {
        Set<Integer> set = new TreeSet<Integer>(new IntegerComparator());
        set.add(100);
        set.add(140);
        set.add(180);
        set.add(200);
        System.out.println("set = " + set);
    }

    public static void main(String[] args) {
        new TreeSetSample().sort();
    }
}
