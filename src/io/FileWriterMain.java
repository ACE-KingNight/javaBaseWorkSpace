package io;/********************************************************************
 /**
 * @Project: java_main
 * @Package filetest
 * @author guohongjin
 * @date 2017/8/28 16:19
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.*;

/**
 * @author guohongjin
 * @ClassName FileWriterMain
 * @Description 类描述
 * @date 2017/8/28
 */
public class FileWriterMain {

    public static void  main(String[] args){
        File file = new File("C:"+File.separator+"testx"+File.separator+"file"+File.separator+"test.txt");
        File fileOut = new File("C:"+File.separator+"testx"+File.separator+"file"+File.separator+"test1.txt");

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
        //输入字符流
        InputStreamReader inputStreamReader=null;
        //输入字符缓冲流
        BufferedReader bufferedReader=null;
        //输出字符流
        OutputStreamWriter outputStreamWriter=null;
        //输出字符缓冲流
        BufferedWriter bufferedWriter=null;
        try {
            //设置输入流
            inputStream=new FileInputStream(file);
            //创建输入缓冲流
            bufferedInputStream=new BufferedInputStream(inputStream);
            //设置输入字符流
            inputStreamReader=new InputStreamReader(inputStream,"gbk");
            //设置输入字符缓冲流
            bufferedReader=new BufferedReader(inputStreamReader);
            //设置输出流
            outputStream=new FileOutputStream(fileOut);
            //设置输出缓冲流
            bufferedOutputStream=new BufferedOutputStream(outputStream);
            //设置输出字符流
            outputStreamWriter=new OutputStreamWriter(outputStream,"gbk");
            //设置输出缓冲流
            bufferedWriter=new BufferedWriter(outputStreamWriter);
            String readLine="";
            while ((readLine=bufferedReader.readLine())!=null){
                bufferedWriter.write(readLine);
                //换行
                bufferedWriter.newLine();
            }

//            byte[] bytes=new byte[100];
//            String testStr="";
//            while ((testStr=bufferedReader.readLine())!=null){
//                bufferedOutputStream.write(test);
//            }

//            byte[] bytes=new byte[1024];
//            int length=-1;
//            while ((length=bufferedInputStream.read(bytes))!=-1){
//                bufferedOutputStream.write(bytes,0,length);
//                System.out.println(length);
//            }


//            byte[] bytes=new byte[1024];
//            int length=-1;
//            while ((length=bufferedInputStream.read(bytes,0,bytes.length))!=-1){
//                bufferedOutputStream.write(bytes,0,length);
//                System.out.println(length);
//            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.flush();;
                bufferedOutputStream.flush();
                bufferedWriter.flush();
                inputStream.close();
                bufferedInputStream.close();
                bufferedReader.close();
                outputStream.close();
                bufferedOutputStream.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
