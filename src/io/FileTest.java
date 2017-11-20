package io;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package io
 * @author wangzhenxin
 * @date 2017-08-25 17:42
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @author wangzhenxin
 * @ClassName FileTest
 * @Description 文件操作类
 * @date 2017-08-25
 */
public class FileTest {
    /**
     * @Title: CreateMultilayerFile
     * @Description: 创建多层文件目录
     * @author wangzhenxin
     * @date 2017-08-25
     * @param dir 目录
     * @return Boolean
     */

    private static Boolean CreateMultilayerFile(String dir)
    {
        try {
            File dirPath = new File(dir);
            if (!dirPath.exists()) {
                dirPath.mkdirs();
            }
        } catch (Exception e) {
            System.out.println("创建多层目录操作出错: "+e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }
    /**
     * @Title: createNewFile
     * @Description: 创建新文件
     * @author wangzhenxin
     * @date 2017-08-25
     * @param path 文件名
     */

    public static void createNewFile(String path) {
        try {
            //创建目录分隔数组
            String[] lists = path.split("\\.");
            //判断目录层数
            int lastLength = lists[0].lastIndexOf("\\");
            //得到文件夹目录字符串
            String dir = lists[0].substring(0, lastLength);
            //得到文件名称
            String fileName = lists[0].substring(lastLength);
            //得到路径e:\a\b之后,先创建文件夹
            if (CreateMultilayerFile(dir) == true) {
                File filePath = new File(path);
                if (!filePath.exists()) {
                    filePath.createNewFile();
                }
            }
        } catch (Exception e) {
            System.out.println("新建文件操作出错: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        //定义文件名字符串
        String docFileString = "C:\\testx\\file\\test.doc";
        String txtFileString = "C:\\testx\\file\\test.txt";
        //定义文件对象
        File fileDoc = new File("C:\\testx\\file\\test.doc");
        File fileTxt = new File("C:\\testx\\file\\test.txt");
        //判断文件是否存在，如果存在则操作，如果不存在则创建文件
        if (fileDoc.exists() && fileTxt.exists()){
            //获取文件字节大小
            Long fileLength = fileDoc.length();
            System.out.println(fileLength);
            //判断文件是否是可执行的
            fileDoc.canExecute();
            //判断文件是否可读
            fileDoc.canRead();
            //判断文件是否可写
            fileDoc.canWrite();
            //检查指定文件路径间的顺序
            fileDoc.compareTo(fileTxt);
            //获取文件绝对路径
            fileDoc.getAbsolutePath();
            //获取文件名
            fileDoc.getName();
            //返回文件父目录路径。
            fileDoc.getParent();
            //返回文件和目录清单
            fileDoc.list();
            //更名文件
            fileDoc.renameTo(fileTxt);
            //将文件设置为可读。
            fileDoc.setReadOnly();
            //将文件的路径字符串转换成URL
            fileDoc.toURI();
            //判断文件后缀是否为.doc
            fileDoc.getName().endsWith(".doc");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(simpleDateFormat.format(fileDoc.lastModified()));
            fileDoc.lastModified();

        }else {
            createNewFile(docFileString);
            createNewFile(txtFileString);
            System.out.println("创建文件成功!");
        }
    }
}
