package io;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package io
 * @author wangzhenxin
 * @date 2017-11-21 16:57
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author wangzhenxin
 * @ClassName DownThread
 * @Description 类描述
 * @date 2017-11-21
 */
public class DownThread extends Thread {
    private int id; // 线程id

    private File file;// 目标文件

    private int block;// 每个线程下载文件的大小

    private URL url;

    public DownThread() {
    }

    public DownThread(int id, File file, int block, URL url) {
        this.id = id;
        this.file = file;
        this.block = block;
        this.url = url;
    }

    @Override
    public void run() {
        int start = (id * block);// 当前线程开始下载处
        int end = (id + 1) * block - 1;// 当前线程结束下载处
        // 建立随机操作文件对象
        try {
            RandomAccessFile accessFile = new RandomAccessFile(file, "rwd");
            accessFile.seek(start);// 设置操作文件的入点
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5 * 1000);
            conn.setRequestMethod("GET");
            // 指定网络位置从什么位置开始下载,到什么位置结束
            conn.setRequestProperty("RANGE", "bytes=" + start + "-" + end + "");

            InputStream in = conn.getInputStream();// 获得输入流
            byte[] data = new byte[1024];
            int len = 0;
            while ((len = in.read(data)) != -1) {
                accessFile.write(data, 0, len);
            }
            accessFile.close();
            in.close();
            System.out.println("线程:" + id + "下载完成!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
