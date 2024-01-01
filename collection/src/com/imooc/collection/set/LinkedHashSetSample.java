package com.imooc.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSample {
    public static void main(String[] args) {
        Set<String> mobileSet = new LinkedHashSet<String>();
        mobileSet.add("13377778888");
        mobileSet.add("13311112222");
        mobileSet.add("13333334444");
        mobileSet.add("13355556666");
        System.out.println("mobileSet = " + mobileSet);
    }
}
