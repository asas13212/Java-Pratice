package com.test14;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @author cyt
 *  打印流的test
 */
public class Main
{

    static void main() throws IOException
    {
        //jjjk();
        //adkjf();
        //Properties 类->配置文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\80486\\IdeaProjects\\Week10\\src\\com\\test14\\MySql.properties"));
        String line;

//        while((line = bufferedReader.readLine()) != null)
//        {
//            String[] split = line.split("=");
//            System.out.println(split[0] + "值是" + split[1]);
//            // 传统方法非常的复杂
//        }

        Properties p = new Properties();
        p.load(new FileReader("C:\\Users\\80486\\IdeaProjects\\Week10\\src\\com\\test14\\MySql.properties"));
//        p.list(System.out);
        String user = p.getProperty("user");
        String psw = p.getProperty("psw");   // 该文件没有就是创建，有的话就是修改
        p.setProperty("charset","ut8");
        p.setProperty("user","王霸");
        p.setProperty("age","18");

        p.store(new FileOutputStream("C:\\Users\\80486\\IdeaProjects\\Week10\\src\\com\\test14\\MySql.properties"),null);
        System.out.println("保存成功");

        System.out.println("用户名是" + user);
        System.out.println("密码是" + psw);
    }

    private static void adkjf() throws FileNotFoundException
    {
        PrintWriter printWriter = new PrintWriter("E:\\hello.txt");
        printWriter.println("sd");
        printWriter.close();    // 真正写入数据的东西
    }

    private static void jjjk() throws FileNotFoundException
    {
        String filePath = "E:\\hello.txt";

        PrintStream out = System.out; // 默认的输出流在 标准输出--->显示器
        out.println("你好啊");
        System.setOut(new PrintStream("E:\\hello.txt"));
        System.out.println("你好啊");

        out.close();
    }

}
