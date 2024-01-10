package com.imooc.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionSample {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            URL url = new URL("https://img1.sycdn.imooc.com/59e5760700017cb901000100-100-100.jpg");
            URLConnection connection = url.openConnection();
            is = connection.getInputStream();
            os = new FileOutputStream("/Users/hugh/Downloads/wechat.jpg");
            byte[] bs = new byte[1024];
            int len = 0;
            while((len = is.read(bs)) != -1) {
                System.out.println(len);
                os.write(bs, 0, len);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if(is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
