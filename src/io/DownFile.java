package io;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package io
 * @author wangzhenxin
 * @date 2017-11-21 16:56
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * @author wangzhenxin
 * @ClassName DownFile
 * @Description 类描述
 * @date 2017-11-21
 */
public class DownFile {
    /**
     * 下载
     *
     * @throws Exception
     *
     */
    public void down(String path, int threadnum) throws Exception {
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(10 * 1000);
        conn.setRequestMethod("GET");
        // 获得网络文件的长度
        int length = conn.getContentLength();
        // 每个线程负责下载的文件大小
        int block = (length % threadnum) == 0 ? length / threadnum : length
                / threadnum + 1;
        //从http相应消息获取的状态码，200:OK;401:Unauthorized
        if (conn.getResponseCode() == 200) {
            for (int i = 0; i < threadnum; i++) {
                // 开启线程下载
                new DownThread(i, new File(realPath(),getFileName(path)), block, url).start();
            }
        }
    }

    /**
     * 文件的下载目录
     * @return
     */
    public String realPath(){
        String realPath = "E:/downloadasdasdsa";
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return realPath;
    }

    /**
     * 获取文件名
     * @param path
     * @return
     */
    public String getFileName(String path) {
        return path.substring(path.lastIndexOf("/") + 1);
    }

    public static void main(String[] args) {
        DownFile test = new DownFile();
        //String path = "http://www.java.net/download/jdk6/6u10/promoted/b32/binaries/jdk-6u10-rc2-bin-b32-windows-i586-p-12_sep_2008.exe";
        String path ="http://www.baidu.com/img/baidu_sylogo1.gif";
        int threadnum = 3;
        try {
            test.down(path, threadnum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
