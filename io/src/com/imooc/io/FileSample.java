package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileSample {
    public static void main(String[] args) {
        File f = new File("/Users/hugh/Downloads/b.txt");
        File d = new File("/Users/hugh/Downloads/电影/华语/大陆");
        try {
            boolean r1 = f.createNewFile();
            System.out.println(f.getPath() + "文件创建是否成功: " + r1);
            System.out.println(f.getPath() + "是否存在: " + f.exists());
            System.out.println(f.getPath() + "是否是目录: " + f.isDirectory());
            System.out.println(f.getPath() + "是否是文件: " + f.isFile());
            System.out.println(f.getPath() + "的大小: " + f.length());
            System.out.println(f.getPath() + "的文件名: " + f.getName());
            boolean r2 = f.delete();
            System.out.println(f.getPath() + "是否存在: " + f.exists());
            boolean r3 = d.mkdirs();
            System.out.println("[" + d.getPath() + "]目录是否创建成功: " + r3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
