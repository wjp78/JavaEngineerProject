package com.imooc.jdk9;

import java.io.*;

// 通过try块自动关闭资源
public class Sample02 {
    public static void main(String[] args) throws FileNotFoundException {
        File source = new File("/Users/hugh/Downloads/demo.jpg");
        File target = new File("/Users/hugh/Downloads/demo1.jpg");
        // 通过try块自动关闭资源
        try (InputStream fis = new FileInputStream(source);
             OutputStream fos = new FileOutputStream(target);) {
            byte[] bs = new byte[1024];
            int len;
            // 利用read方法循环读取的字节数据，并进行处理
            while ((len = fis.read(bs)) != -1) {
                System.out.println(len);
                // 将读取到的字节数组写入到输出流
                fos.write(bs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
