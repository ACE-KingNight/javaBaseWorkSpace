package io;/********************************************************************
 /**
 * @Project: java_main
 * @Package filetest
 * @author guohongjin
 * @date 2017/8/28 14:39
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author guohongjin
 * @ClassName FileReaderChartSetMain
 * @Description 类描述
 * @date 2017/8/28
 */
public class FileReaderChartSetMain {

    public static void  main(String[] args){
        //定义文件对象
        File file=new File("C:"+File.separator+"testx"+File.separator+"file"+File.separator+"test.txt");
        //定义文本读取对象
        FileReaderChartSet fileReaderChartSet=null;
        try {
//            String string = "sda";
//            //获取当前字符串字符集
//            byte[] strbyte = string.getBytes("utf-8");
//            //转换当前字符串编码集
//            String strings = new String(strbyte,"iso-8859-1");

            //通过文件对象和指定字符集初始化对象
            fileReaderChartSet=new FileReaderChartSet(file,"gbk");
            //定义字符数组
            char[] testChar=new char[1024];
            //循环读取文件内容
            while (fileReaderChartSet.read(testChar,0,testChar.length)!=-1){
                System.out.println(new String(testChar));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭文件读取流
                fileReaderChartSet.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
