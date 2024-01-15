package com.imooc.jdk10;

import java.util.ArrayList;
import java.util.List;

public class Sample04 {
    public static void main(String[] args) {
        final var list = new ArrayList<String>();
        list.add("ABC");
        list.add("BCD");
        list.add("EFG");
        List<String> copyList = List.copyOf(list);
        copyList.add("A");
    }
}
