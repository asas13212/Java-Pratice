package com.test9;

import java.io.FileWriter;
import java.io.IOException;

public class Main
{

    static void main() throws IOException
    {
        String str = "风雨之后，必见彩虹";
        char[] chars = str.toCharArray();
        String filePath = "E:\\rainbow.txt";

        FileWriter fileWriter = null;

        try
        {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('a');
            fileWriter.write(str);
            fileWriter.write(str);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            fileWriter.close();
            System.out.println("关闭成功");
        }

    }

}
