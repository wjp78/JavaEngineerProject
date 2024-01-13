package com.imooc.downloader;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Downloader {
    private Integer threadNum = 10;

    public static void main(String[] args) {

        Downloader downloader = new Downloader();
        downloader.start("/Users/hugh/study/JavaEngineer/JavaEngineerProject/downloader/src");
        // downloader.download("https://img1.sycdn.imooc.com/59e5760700017cb901000100-100-100.jpg", "/Users/hugh/Downloads");
    }

    /**
     * 下载单个文件保存到本地
     *
     * @param source    原图片到网址
     * @param targetDir 目标目录，要确保已存在
     */
    public void download(String source, String targetDir) {
        InputStream is = null;
        OutputStream os = null;
        try {
            // https://img1.sycdn.imooc.com/59e5760700017cb901000100-100-100.jpg
            URL url = new URL(source);
            String fileName = source.substring(source.lastIndexOf("/") + 1);
            File targetFile = new File(targetDir + "/" + fileName);
            if (!targetFile.exists()) {
                targetFile.createNewFile();
            }
            URLConnection connection = url.openConnection();
            is = connection.getInputStream();
            os = new FileOutputStream(targetFile);
            byte[] bs = new byte[1024];
            int len = 0;
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
            System.out.println("[INFO]图片下载完毕：" + source + "\n\t   -> " + targetFile.getPath() + "（" + Math.floor((double) targetFile.length() / 1024) + "kb）");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 从指定文件读取下载地址，批量下载网络资源
     *
     * @param targetDir   下载文件的存储目录
     * @param downloadTxt download.txt完整路径
     */
    public void multiDownloadFromFile(String targetDir, String downloadTxt) {
        File dir = new File(targetDir);
        if (!dir.exists()) {
            dir.mkdirs();
            System.out.println("[INFO]发现下载目录[" + dir.getPath() + "]不存在，已自动创建");
        }
        List<String> resources = new ArrayList<>();
        BufferedReader reader = null;
        ExecutorService threadPool = null;
        try {
            reader = new BufferedReader(new FileReader(downloadTxt));
            String line = null;
            while ((line = reader.readLine()) != null) {
                resources.add(line);
                System.out.println(line);
            }
            threadPool = Executors.newFixedThreadPool(this.threadNum);
            Downloader that = this;
            for (String res : resources) {
                threadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                        that.download(res, targetDir);
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (threadPool != null) {
                threadPool.shutdown();
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 开始多线程下载
     *
     * @param propDir config.properties所在目录
     */
    public void start(String propDir) {
        // 指定config.properties完整路径
        File propFile = new File(propDir + "/config.properties");
        // 实例化Properties属性类
        Properties properties = new Properties();
        Reader reader = null;
        try {
            // 实例化FileReader对象
            reader = new FileReader(propFile);
            // properties对象读取配置文件
            properties.load(reader);
            // 通过getProperty方法得到对应的选项值
            String threadNum = properties.getProperty("thread-num");
            this.threadNum = Integer.parseInt(threadNum);
            String targetDir = properties.getProperty("target-dir");
            // 打印输出
            // System.out.println(threadNum);
            // System.out.println(targetDir);
            // 读取download.txt进行多线程下载
            this.multiDownloadFromFile(targetDir, propDir + "/download.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
