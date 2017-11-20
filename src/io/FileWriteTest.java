package io;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package io
 * @author wangzhenxin
 * @date 2017-08-28 16:30
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.*;

/**
 * @author wangzhenxin
 * @ClassName FileWriteTest
 * @Description 类描述
 * @date 2017-08-28
 */
public class FileWriteTest {
    public static void main(String[] args) {
        File file = new File("C:"+File.separator+"testx"+File.separator+"file"+File.separator+"test.txt");
        File fileOut = new File("C:"+File.separator+"testx"+File.separator+"file"+File.separator+"test1.txt");

        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);
            inputStreamReader = new InputStreamReader(inputStream,"gbk");
            bufferedReader = new BufferedReader(inputStreamReader);

            outputStream = new FileOutputStream(fileOut);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            outputStreamWriter = new OutputStreamWriter(outputStream,"gbk");
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            String readLine="";
            while ((readLine = bufferedReader.readLine()) != null) {
                bufferedWriter.write(readLine);
                //换行
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
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
    }
}
