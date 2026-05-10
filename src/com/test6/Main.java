package com.test6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main
{

    static void main()
    {
        OutS();
    }

    static public void OutS()
    {
        String filePath = "E:\\hello.txt";
        File fileName = new File("HelloWorld");
        FileOutputStream fileOutputStream = null;
        String str = "你好";

        try
        {
            fileOutputStream = new FileOutputStream(filePath,true);
            // apend为true 则是在后面追加
            fileOutputStream.write('a');
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            // 会正常覆盖之前的内容
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

//        if (fileName.exists(filePath))
    }
}
