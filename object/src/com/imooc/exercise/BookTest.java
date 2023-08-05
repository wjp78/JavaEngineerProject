package com.imooc.exercise;

public class BookTest {

    // 测试方法
    public static void main(String[] args) {
        //实例化对象，调用相关方法实现运行效果
        Book book = new Book("红楼梦", "曹雪芹", "人民文学出版社", 8);
        book.infoIntroduce();
        System.out.println("================================");
        Book book2 = new Book("小李飞刀", "古龙", "中国长安出版社", 55.5);
        book2.infoIntroduce();
    }
}
