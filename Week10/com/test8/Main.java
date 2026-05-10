package com.test8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author cyt
 * @version 1.0
 */
public class Main
{

    static void main() throws IOException
    {
        String filePath = "E:\\hello.txt";
        char[] buf = new char[8];
        int readDate = 0;

//        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try
        {
            fileReader = new FileReader(filePath);
//            fileWriter = new FileWriter(filePath);

            // 使用的是 单个字符读取
            while((readDate = fileReader.read()) != -1)
            {
                System.out.print((char) readDate);
            }
            System.out.println();
            fileReader.close();
            fileReader = new FileReader(filePath);

            // 使用的是字符数组
            while ((readDate = fileReader.read(buf)) != -1)
            {
                System.out.print(new String(buf,0,readDate));
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("结束运行");
    }

    static void method(){

    }
}
