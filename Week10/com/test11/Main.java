package com.test11;

import java.io.*;

public class Main
{
    static void main() throws IOException
    {
        //<editor-fold desc="处理流">
        //        d();
//        c();
        // 字符处理
//        copyOfBufferedReader();
//        copyOfBufferedInputStream();
        //</editor-fold>
        // 保存数据的值时候，要储存他的类型
        // 保存值与保存类型 称为序列化



    }

    private static void copyOfBufferedInputStream() throws IOException
    {
        // 字节处理--视频与图片，文本都可以处理
        String srcPath = "E:\\2.png";
        String destPath = "D:\\2.png";
        int readDate;
        String str;
        byte[] bytes = new byte[128];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcPath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destPath));

        while ((readDate = bufferedInputStream.read(bytes)) != -1)
        {
            // 字符流的读取传缓冲区长度
            bufferedOutputStream.write(bytes,0,readDate);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
        System.out.println("拷贝成功");
    }

    private static void copyOfBufferedReader() throws IOException
    {
        String srcFilePath = "E:\\hello.txt";
        String destFilePath = "D:\\helo.txt";

        BufferedReader b = null;
        BufferedWriter b2 = null;
        String str;
        try
        {
            b = new BufferedReader(new FileReader(srcFilePath));
            b2 = new BufferedWriter(new FileWriter(destFilePath));

            while((str = b.readLine()) != null){
                //读取一行打上换行符
                b2.write(str);
                b2.newLine();
            }

        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            if (b != null)
                b.close();
            if (b2 != null)
                b2.close();

            System.out.println("拷贝完毕");
        }
    }

    private static void c() throws IOException
    {
        String input = "你好啊";
        String filePath = "E:\\ok.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write(input);
        bufferedWriter.newLine();
        bufferedWriter.write(input);
        bufferedWriter.newLine();
        bufferedWriter.write(input);

        bufferedWriter.close();
    }

    private static void d() throws IOException
    {
        // 字符传入---读取文本文件
        String filePath = "E:\\hello.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;

        // 返回null会停止
        while( (line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }

        bufferedReader.close();
    }

}
