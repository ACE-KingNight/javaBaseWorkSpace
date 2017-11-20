package io;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package io
 * @author wangzhenxin
 * @date 2017-08-28 16:00
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.*;

/**
 * @author wangzhenxin
 * @ClassName FileWrite
 * @Description 类描述
 * @date 2017-08-28
 */
public class FileWrite {
    public static void main(String[] args) {
        File file = new File("C:"+File.separator+"testx"+File.separator+"file"+File.separator+"test.txt");
        File fileOut = new File("C:"+File.separator+"testx"+File.separator+"file"+File.separator+"test1.txt");

        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        OutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            inputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream(fileOut);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            byte[] bytes = new byte[1024];
            int length = -1;
            while ((length = bufferedInputStream.read(bytes,0,bytes.length))!=-1){
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

    }
}
