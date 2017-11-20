package io;/********************************************************************
 /**
 * @Project: java_main
 * @Package filetest
 * @author guohongjin
 * @date 2017/8/28 14:34
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * @author guohongjin
 * @ClassName FileReaderChartSet
 * @Description 类描述
 * @date 2017/8/28
 */
public class FileReaderChartSet extends InputStreamReader {
    //重构filereader构造方法
    public FileReaderChartSet(String fileName,String chartSet) throws FileNotFoundException, UnsupportedEncodingException {
        super(new FileInputStream(fileName),chartSet);
    }

    /**
     * Creates a new <tt>FileReader</tt>, given the <tt>File</tt>
     * to read from.
     *
     * @param file the <tt>File</tt> to read from
     * @exception  java.io.FileNotFoundException  if the file does not exist,
     *                   is a directory rather than a regular file,
     *                   or for some other reason cannot be opened for
     *                   reading.
     */
    public FileReaderChartSet(File file,String chartSet) throws FileNotFoundException, UnsupportedEncodingException {
        super(new FileInputStream(file),chartSet);
    }


}
