package com.test13;

import java.io.*;
import java.util.Scanner;

/**
 * @author cyt
 * @version 1.0
 *  标准输入输出  以及转换流(字节与字符转换)
 */
public class Main
{

    static void main() throws IOException, InterruptedException
    {
//        BufferedReader bufferedReader = getBufferedReader();

        // 字节流转换成字符流，改变编码方式---> FileInputStream 转为字符流,GBK
        String filePath = "E:\\hello.txt";
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"gbk");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while (true)
        {
            String s = bufferedReader.readLine();
            System.out.println(s);
            Thread.sleep(100);
        }

        //        bufferedReader.close();
    }

    private static BufferedReader getBufferedReader() throws IOException
    {
        System.out.println(System.out.getClass());  // printStream
        String filePath = "E:\\hello.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String s = bufferedReader.readLine();
        System.out.println(s);
        System.out.println(System.in.getClass());   // 字节流
        return bufferedReader;
    }

}
