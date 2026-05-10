package com.test7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main
{

    static void main() throws IOException
    {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String srcFile = "E:\\hello.txt";
        String outFile = "D:\\hello.txt";

        byte[] b = new byte[1024];
        int readDate = 0;

        fileInputStream = new FileInputStream(srcFile);
        fileOutputStream = new FileOutputStream(outFile);

        while (( readDate = fileInputStream.read(b)) != -1)
        {
            fileOutputStream.write(b,0,readDate);
        }
        System.out.println("拷贝成功");
        fileOutputStream.close();
        fileInputStream.close();


    }
}
