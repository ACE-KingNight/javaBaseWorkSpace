package util;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package util
 * @author wangzhenxin
 * @date 2017-08-28 17:05
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.*;

/**
 * @author wangzhenxin
 * @ClassName FileTransferUtils
 * @Description 文件传输帮助类
 * @date 2017-08-28
 */
public class FileTransferUtils {
    /**
     * @Title: charFileUpload
     * @Description: 字符流文件输入
     * @author wangzhenxin
     * @date 2017-08-28
     * @param inPutFile 输入文件
     * @return String
     */

    public static String charFileUpload(File inPutFile){
        if (inPutFile.exists()){
            //输入流
            InputStream inputStream=null;
            //输入缓冲流
            BufferedInputStream bufferedInputStream=null;
            //输入字符流
            InputStreamReader inputStreamReader=null;
            //输入字符缓冲流
            BufferedReader bufferedReader=null;

            String readChars = null;
            String string = null;
            try {
                //设置输入流
                inputStream = new FileInputStream(inPutFile);
                //设置输入缓冲流
                bufferedInputStream = new BufferedInputStream(inputStream);
                //设置字符流
                inputStreamReader = new InputStreamReader(inputStream,"gbk");
                //设置字符缓冲流
                bufferedReader = new BufferedReader(inputStreamReader);
                //将文件内容读取到string中
                while ((readChars = bufferedReader.readLine()) != null) {
                    string = string + readChars;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                    bufferedInputStream.close();
                    inputStreamReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return string;
        }else {
            return "文件不存在无法读取";
        }
    }

    /**
     * @Title: charDownload
     * @Description: 字符流输出文件
     * @author wangzhenxin
     * @date 2017-08-28
     * @param inputFile 输入文件
     * @param outputFile 输出文件
     * @return String
     */
    public static String charDownload(File outputFile,File inputFile){
        //判断输入文件
        if (!inputFile.exists()){
            return "输入文件不存在！请检查";
        }
        //判断输出文件是否存在
        if (!outputFile.exists()){
            //如果文件不存在则创建文件
            createNewFile(outputFile.getAbsolutePath());
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
            inputStream=new FileInputStream(inputFile);
            //创建输入缓冲流
            bufferedInputStream=new BufferedInputStream(inputStream);
            //设置输入字符流
            inputStreamReader=new InputStreamReader(inputStream,"gbk");
            //设置输入字符缓冲流
            bufferedReader=new BufferedReader(inputStreamReader);
            //设置输出流
            outputStream=new FileOutputStream(outputFile);
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
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.flush();
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
        return "输出文件成功";
    }

    /**
     * @Title: FileUpload
     * @Description: 字节流文件输入
     * @author wangzhenxin
     * @date 2017-08-29
     * @param inPutFile 输入流文件
     * @return byte[][]
     */

    public static byte[][] FileUpload(File inPutFile){
        if (inPutFile.exists()){
            //输入流
            InputStream inputStream=null;
            //输入缓冲流
            BufferedInputStream bufferedInputStream=null;

            byte[] bytes = new byte[1024];
            byte[][] bytes1 = new byte[1024][1024];
            try {
                //设置输入流
                inputStream = new FileInputStream(inPutFile);
                //设置输入缓冲流
                bufferedInputStream = new BufferedInputStream(inputStream);
                int i = 0;
                //将文件内容读取到string中
                while (bufferedInputStream.read(bytes,0,bytes.length) != -1) {
                    bytes1[i] = bytes;
                    i++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return bytes1;
        }else {
            return null;
        }
    }

    public static String FileDownload(File inputFile,File outputFile){
        //判断输入文件
        if (!inputFile.exists()){
            return "输入文件不存在！请检查";
        }
        //判断输出文件是否存在
        if (!outputFile.exists()){
            //如果文件不存在则创建文件
            createNewFile(outputFile.getAbsolutePath());
        }
        //定义输入流
        InputStream inputStream = null;
        //定义输入缓冲流
        BufferedInputStream bufferedInputStream = null;
        //定义输出流
        OutputStream outputStream = null;
        //定义输出缓冲流
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //设置输入流
            inputStream = new FileInputStream(inputFile);
            //设置输入缓冲流
            bufferedInputStream = new BufferedInputStream(inputStream);
            //设置输出流
            outputStream = new FileOutputStream(outputFile);
            //设置输出缓冲流
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            //定义字节数组
            byte[] bytes = new byte[1024];
            //定义长度判断
            int length = -1;
            //循环读取
            while ((length = bufferedInputStream.read(bytes,0,bytes.length))!=-1){
                //循环写入
                bufferedOutputStream.write(bytes,0,length);
            }
        } catch (FileNotFoundException e) {
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
        return "文件输出成功";
    }


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

    private static void createNewFile(String path) {
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
            if (CreateMultilayerFile(dir)) {
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
}
