package com.test4;

import java.io.File;
import java.io.IOException;

public class Main
{

    static void main()
    {
//        info();
//        method();
//        dirMake();

    }


    static public void info(){
        File file = new File("E:\\news.txt");

        System.out.println("文件的名字" + file.getName());
        System.out.println("文件的绝对路径" + file.getAbsolutePath());
        System.out.println("文件的父级目录" + file.getParent());
        System.out.println("文件的大小" + file.length());
        System.out.println("文件是否存在" + file.exists());
        System.out.println("是否是一个文件" + file.equals(file));

    }

    static public void method()
    {
        String filePath = "D:\\news.txt";
        File file = new File(filePath);

        if (file.exists())
        {
            if(file.delete()){
                System.out.println(file.getName() + "删除成功");
            }else {
                System.out.println("删除失败");
            }

        }
        else {
            System.out.println("该文件不存在");
            try
            {
                file.createNewFile();
                System.out.println("创造文件");
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }

        }
    }

    static public void dirMake(){
        String directoryPath = "D:\\demo\\a\\b\\c";
        File file = new File(directoryPath);

        if(file.exists()){
            System.out.println(directoryPath + "存在");
            if (file.delete())
            {
                System.out.println("删除成功");
            }
        }else {
            if (file.mkdirs()) {
                System.out.println("创建了目录");
            }
        }
    }  // mkdir创建了一级目录，mkdirs创建了多级目录
}

class Directory
{

}
