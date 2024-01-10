package com.imooc.io;

import java.io.*;

public class FileCopySample {
    public static void main(String[] args) {
        File source = new File("/Users/hugh/Downloads/demo.txt");
        File target = new File("/Users/hugh/Downloads/demo1.txt");
        InputStream fis = null;
        OutputStream fos = null;
        try {
            // 实例化InputStream对象
            fis = new FileInputStream(source);
            // 实例化OutputStream对象
            fos = new FileOutputStream(target);
            byte[] bs = new byte[1024];
            int len;
            // 利用read方法循环读取的字节数据，并进行处理
            while((len = fis.read(bs)) != -1) {
                System.out.println(len);
                // 将读取到的字节数组写入到输出流
                fos.write(bs, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 通过finally块确保fis/fos对象执行close方法
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
