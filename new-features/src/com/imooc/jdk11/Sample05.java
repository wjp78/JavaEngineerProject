package com.imooc.jdk11;

public class Sample05 {
    public static void main(String[] args) {
        String str = "    www.imooc.com ";
        boolean isblank = str.isBlank();  // 判断字符串是空白,可以都是空格,长度不为0
        System.out.println(str + "是否空白:" + isblank);
        boolean isempty = str.isEmpty();  // 判断字符串是否为空,长度=0
        System.out.println(str + "是否为空:" + isempty);
        String result1 = str.strip();    // 去掉首尾空白（包括全角空格），trim()只能去掉半角空格
        System.out.println(str + "去除首尾空白:" + result1.length());
        String result2 = str.stripTrailing();  // 去除尾部空白
        System.out.println(str + "去除尾部空白:" + result2.length());
        String result3 = str.stripLeading();  // 去除首部空白
        System.out.println(str + "去除首部空白:" + result3.length());
        String copyStr = str.repeat(2);  //s 复制几遍字符串
        System.out.println(str + "复制两次:" + copyStr);
        long lineCount = copyStr.lines().count();  // 行数统计
        System.out.println(str + "行数:" + lineCount);//
    }
}