package com.homework1;

import java.io.*;

public class Main
{

    static void main() throws IOException
    {
        String filePath = "E:\\mytemp";
        String fileName = "\\hello.txt";
        File f = new File(filePath);

        if(!f.exists())
        {
            if(f.mkdir())
                System.out.println("创建成功");
        }else
            System.out.println("创建失败");

        f = new File(filePath + fileName);
        if (!f.exists())
        {
            if(f.createNewFile()){
                System.out.println("创建成功");

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
                bufferedWriter.write("你好啊");
                bufferedWriter.close();

            }else {
                System.out.println("创建失败,文件已经存在");
            }
        }


    }


}
