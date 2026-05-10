package com.homework2;

import java.io.*;

public class Main {

    // 必须是标准main方法！！！
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\hello.txt";

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"gb18030");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str;
        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }

        bufferedReader.close();
    }
}