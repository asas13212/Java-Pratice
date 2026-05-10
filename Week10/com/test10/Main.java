package com.test10;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.Reader;

public class Main
{

    static void main()
    {
       BufferedReader_ b = new BufferedReader_(new FileReader_());
       BufferedReader_ b2 = new BufferedReader_(new StringReader());
       b2.readStrings(10);
       b.readFiles(10);
    }
}

abstract class Reader_
{
    // 抽象的处理流
    public void fileReader(){};
    public void stringReader(){};
}

class FileReader_ extends Reader_
{

    public void fileReader(){
        System.out.println("读取文件");
    }
}

class StringReader extends Reader_
{
    public void stringReader(){
        System.out.println("读取字符");
    }
}

class BufferedReader_ extends Reader_
{
    private Reader_ r;

    public BufferedReader_(Reader_ r)
    {
        this.r = r;
    }

    public void readFiles(int num){
        for (int i = 0; i < num; i++)
        {
            r.fileReader();
        }
    }

    public void readStrings(int num){
        for (int i = 0; i < num; i++)
        {
            r.stringReader();
        }
    }
}