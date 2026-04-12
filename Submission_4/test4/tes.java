package test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tes
{

    public tes()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个9位数字");

        String s = sc.nextLine();
        String regex = "\\d{9}";

        if(s.matches(regex)){
            System.out.println("你输入的是" + s);
        }else{
            System.out.println("你输入的有误!");
        }


    }
}
