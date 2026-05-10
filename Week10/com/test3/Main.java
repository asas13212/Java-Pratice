package com.test3;

import java.io.File;
import java.io.IOException;

public class Main
{

    public static void main()
    {
        createFile();
    }

    static public void createFile()
    {
        String filePath = "E:\\news1.txt";
        File file = new File(filePath);

        try
        {
            file.createNewFile();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static public void createFile2()
    {
        File parentFile = new File("E:\\");  // 只是在内存里面创造了一个文件

        String fileName = "news2.txt";

        File file = new File(parentFile,fileName);

        try
        {
            file.createNewFile();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static public void createFile3(){
        String parentFile = "E:\\";
        String fileName = "new3.txt";

        File file = new File(parentFile,fileName);

        try
        {
            file.createNewFile();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

}
