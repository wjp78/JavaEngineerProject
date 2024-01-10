package com.imooc.io;

import java.io.*;

public class TextFileSample {
    /* FileReader读取文本文件案例 */
    public void readTextFile() {
        Reader reader = null;
        try {
            File file = new File("/Users/hugh/Downloads/test.txt");
            // 实例化Reader对象
            reader = new FileReader(file);
            int ch = 0;
            // 逐个字符读取
            while((ch = reader.read()) != -1) {
                System.out.println((char) ch); // UTF-8编码集
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    // 关闭reader对象
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* Writer写入文本文件过程 */
    public void writeTextFile() {
        Writer writer = null;
        try {
            File file = new File("/Users/hugh/Downloads/test.txt");
            // 创建文件
            if(!file.exists()) {
               file.createNewFile();
            }
            // 实例化writer对象
            writer = new FileWriter(file);
            writer.write("这是一个新文件New");
            writer.append(": Append内容");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(writer != null) {
                try {
                    // 关闭writer对象
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
     }

     public void isrSample() {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try{
            File file = new File("/Users/hugh/Downloads/test.txt");
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis, "UTF-8");
            StringBuffer buffer = new StringBuffer();
            while(isr.ready()) {
                buffer.append((char)isr.read());
            }
            System.out.println(buffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
     }

    // 利用OutputStreamWriter写入文本文件
    public void oswSample() {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            File file = new File("/Users/hugh/Downloads/test.txt");
            //创建文件
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos, "UTF-8");
            osw.write("这是一个新文件!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null) {
                    osw.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readBuffer() {
        Reader reader = null;
        BufferedReader br = null;
        try{
            File file = new File("/Users/hugh/Downloads/FileSample.java");
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String line = null;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TextFileSample sample = new TextFileSample();
        // sample.writeTextFile();
        // sample.readTextFile();
        // sample.isrSample();
        // sample.oswSample();
        sample.readBuffer();
    }
}
