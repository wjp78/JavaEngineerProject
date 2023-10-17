package com.imooc.exercise_string;

public class StringDemo1 {
    /*
    *  使用String类常用方法完成字符串处理。
    *  任务
    *    1、 定义一个字符串"abcdefg"
    *    2、 取出子串cde并转换为大写
    *    3、 将DE替换为MM
    *    4、 最后得到结果CMM
    * */
    public static void main(String[] args) {
		/*已知字符串"abcdefg"，使之经过处理得到字符串"CDE",并进一步
        将“DE”替换为“MM”，得到结果：CMM */
        String str = "abcdefg";
        str = str.substring(2,5).toUpperCase().replace("DE", "MM");
        System.out.println("str = " + str);
    }
}
