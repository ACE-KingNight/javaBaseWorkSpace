package io;/********************************************************************
 /**
 * @Project: java_main
 * @Package filetest
 * @author guohongjin
 * @date 2017/8/25 16:42
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.*;

/**
 * @author guohongjin
 * @ClassName FiletestMain
 * @Description 类描述
 * @date 2017/8/25
 */
public class FiletestMain {

    public static void  main(String[] args){
//        String str="test\\test1";
//        str.replace("\\","/");
//        str.split("/");
//        str.lastIndexOf("\\");
//        str.substring(0,1);
        File file=new File("C:"+File.separator+"testx"+File.separator+"file"+File.separator+"test.txt");
        System.out.println(File.separator);
        System.getenv();
        //判断文件是否存在
        if (file.exists()){
            //文件名称
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            InputStream inputStream = null;
            BufferedInputStream bufferedInputStream = null;
            InputStreamReader inputStreamReader =null;

            try {
                inputStream = new FileInputStream(file);
                bufferedInputStream  = new BufferedInputStream(inputStream);
                inputStreamReader = new InputStreamReader(bufferedInputStream,"gbk");
                char[] chars = new char[1024];

                while (inputStreamReader.read(chars)!=-1){
                    System.out.println(new String(chars).trim());
//                    int i=0;
//                    System.out.println(i++);
                }
                System.out.println("12");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException io){
                io.printStackTrace();
            }finally {
                try {
                    inputStream.close();
                    bufferedInputStream.close();
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

//            //创建新文件
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            //删除文件
//            file.delete();
//            //绝对路径
//            file.getAbsolutePath();
//            //是否为文件夹
//            file.isDirectory();
//            //是否为文件
//            file.isFile();
//            //返回文件目录下的文件名称
//            file.list();
//            //文件目录下文件的数量
//            file.length();
//            //创建文件目录
//            file.mkdir();
//            //创建层级文件目录
//            file.mkdirs();
//
//
//
//        }else{
//            try {
////                file.mkdirs();
////                file.
//                file.createNewFile();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
        }
    }
}
