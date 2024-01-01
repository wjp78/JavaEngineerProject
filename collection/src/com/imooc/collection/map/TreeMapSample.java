package com.imooc.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {
    class RecordComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }

    public void sort() {
        Map<String, Object> record = new TreeMap<>(new RecordComparator());
        record.put("A1", "1");
        record.put("C3", "2");
        record.put("B5", "3");
        record.put("X1", "4");
        record.put("C1", "5");
        record.put("B1", "6");
        System.out.println(record);
    }
    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();
        sample.sort();
    }
}
