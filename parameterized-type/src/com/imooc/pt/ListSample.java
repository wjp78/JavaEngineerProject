package com.imooc.pt;

import java.util.ArrayList;

public class ListSample {
    public void sample1() {
        ArrayList bookList = new ArrayList();
        bookList.add("三国演义");
        bookList.add("水浒传");
        bookList.add(3.1415926f);
        Object o1 = bookList.get(0);
        String bookName1 = (String) o1;
        System.out.println(bookName1.substring(0, 1));
        Object o2 = bookList.get(2);
        String bookName2 = (String) o2;
        System.out.println(bookName2.substring(0, 1));
    }

    public void sample2() {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("三国演义");
        bookList.add("水浒传");
        // bookList.add(3.1415926f);
        String bookName1 = bookList.get(0);
        System.out.println(bookName1.substring(0, 1));
        Object o2 = bookList.get(2);
        String bookName2 = (String) o2;
        System.out.println(bookName2.substring(0, 1));
    }

    public static void main(String[] args) {
        ListSample listSample = new ListSample();
        listSample.sample1();
                
    }
}
