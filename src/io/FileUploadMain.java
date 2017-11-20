package io;/********************************************************************
 /**
 * @Project: java_main
 * @Package filetest
 * @author guohongjin
 * @date 2017/8/28 15:16
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.*;

/**
 * @author guohongjin
 * @ClassName FileUploadMain
 * @Description 类描述
 * @date 2017/8/28
 */
public class FileUploadMain {

    public static void  main(String[] args){
        //定义输入文件
        File file=new File("D:"+File.separator+"TaskDate"+File.separator+"java4541.txt");
        //输出文件
        File fileOut=new File("D:"+File.separator+"TaskDate"+File.separator+"随便写.txt");
        //判断输出文件是否存在
        if (!fileOut.exists()){
            try {
                fileOut.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //输入流
        InputStream inputStream=null;
        //输入缓冲流
        BufferedInputStream bufferedInputStream=null;
        //输出流
        OutputStream outputStream=null;
        //输出缓冲流
        BufferedOutputStream bufferedOutputStream=null;
        try {
            //设置输入流
            inputStream=new FileInputStream(file);
            //创建输入缓冲流
            bufferedInputStream=new BufferedInputStream(inputStream);
//            InputStreamReader inputStreamReader=new InputStreamReader(inputStream,"gbk");
//            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            //设置输出流
            outputStream=new FileOutputStream(fileOut);
            //设置输出缓冲流
            bufferedOutputStream=new BufferedOutputStream(outputStream);

            byte[] bytes=new byte[1024];
            int length=-1;
            while ((length=bufferedInputStream.read(bytes,0,bytes.length))!=-1){
                bufferedOutputStream.write(bytes,0,length);
                System.out.println(length);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.flush();
                bufferedOutputStream.flush();
                inputStream.close();
                bufferedInputStream.close();
                outputStream.close();
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //输入读取流
//        InputStreamReader inputStreamReader=null;
//        BufferedReader bufferedReader=null;
    }
}
