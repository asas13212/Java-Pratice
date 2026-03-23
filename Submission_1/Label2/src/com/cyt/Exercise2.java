package com.cyt;

import java.util.Scanner;

public class Exercise2
{

    public static void main(String[] args)
    {
        System.out.println("请输入1或2或3\n1是直接判断一个数是否为水仙花数\n2是判断范围内存在哪些水仙花数\n3是退出程序");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        int userNumber = 0;

        while (userChoice != 3)
        {
            switch (userChoice)
            {
                case 1:
                    System.out.println("请输入数字：");
                    userNumber = sc.nextInt();
                    boolean isNarcissus = IsNarcissusNumber(userNumber);
                    if (isNarcissus)
                    {
                        System.out.println(userNumber + " 是水仙花数");
                    }
                    else
                    {
                        if (userNumber < 100 || userNumber > 999)
                        {
                            System.out.println(userNumber + " 不是3位数，水仙花数仅针对3位数哦！");
                        }
                        else
                        {
                            System.out.println(userNumber + " 不是水仙花数");
                        }
                    }
                    break;

                case 2:
                    System.out.println("请输入范围起始值（正整数）：");
                    int start = sc.nextInt();
                    System.out.println("请输入范围结束值（正整数）：");
                    int end = sc.nextInt();

                    if (start < 0 || end < start)
                    {
                        System.out.println("输入有误！结束值需≥起始值，且为正整数");
                        break;
                    }

                    System.out.println(start + "~" + end + "范围内的水仙花数：");
                    int cnt = 0;
                    for (int i = start; i <= end; i++)
                    {
                        if (IsNarcissusNumber(i))
                        {
                            System.out.print(i + " ");
                            cnt++;
                        }
                    }

                    if (cnt > 0)
                    {
                        System.out.println("\n该范围内共有 " + cnt + " 个水仙花数");
                    }
                    else
                    {
                        System.out.println("无");
                    }
                    break;

                default:
                    System.out.println("输入有误！请输入1、2或3");
                    break;
            }
            System.out.println("\n请输入1或2或3");
            userChoice = sc.nextInt();
        }

        System.out.println("程序已退出");
    }

    public static boolean IsNarcissusNumber(int num)
    {
        if (num < 100 || num > 999)
        {
            return false;
        }

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;

        int sum = hundreds * hundreds * hundreds + tens * tens * tens + units * units * units;
        return (sum == num);
    }
}