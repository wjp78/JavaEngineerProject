package com.imooc.io;

import java.io.*;
/*
 * 应用转换流向文件写入文本，并将文本读取出来输入到控制台上。
 * 任务要求：
 *    1、为提高读写速率，要求使用带有缓冲区的字符流进行读写；
 *    2、创建方法transWriteByBuf（）写入文件；
 *    3、创建方法transReadByBuf（）从文件读出内容；
 *    4、从字符输入流中读取文本时可以使用readLine（）方法，从而对换行符进行识别，一行一行地读取文本；
 *    5、在测试方法中调用transWriteByBuf（）方法和transReadByBuf（）方法。
 * */
public class FileWriteAndReadDemo {
    File file = new File("/Users/hugh/Downloads/hello.txt");

    public static void main(String[] args) {
        FileWriteAndReadDemo sample = new FileWriteAndReadDemo();
        sample.transWriteBybuf();
        sample.transReadByBuf();
    }

    public void transWriteBybuf() {
        Writer fw = null; // 定义输出字符流
        BufferedWriter bw = null; // 定义缓冲字符输出流
        try {

            // 创建 FileWriter 对象
            fw = new FileWriter(file);
            // 转换成缓冲字符流
            bw = new BufferedWriter(fw);
            // 通过缓存去写入数据
            bw.write("你好吗？");
            bw.newLine();
            bw.append("我很好！");
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void transReadByBuf() {
        Reader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
