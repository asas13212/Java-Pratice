package com.test5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main
{

    static void main()
    {
        InputS();
    }

    static void InputS()  // FileInputStream
    {
        String filePath = "E:\\hello.txt";
        FileInputStream fileInputStream = null;
        int readDate = 0;
        byte[] bufDate = new byte[3];

        try
        {
            fileInputStream = new FileInputStream(filePath);
//            while((readDate = fileInputStream.read()) != -1)
//            {
//                System.out.print((char) readDate);
//            }

            while((readDate = fileInputStream.read(bufDate)) != -1)
            {
                System.out.print(new String(bufDate,0,readDate));
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            try
            {
                fileInputStream.close();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    // 字节流 8bit 一个字节InputStream OutStream    字符流(按字符) Writer Reader
    // 以上四个所有的类全部都是抽象类
    /*
        流与文件的区别:：流就相当于是快递员，送东西的
     */

    // 输入流与输出流  处理流与包装流
}
