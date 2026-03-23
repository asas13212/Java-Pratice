package com.cyt;

import java.util.Scanner;

public class Main
{

    static void main()
    {

        Scanner sc = new Scanner(System.in);
        StudentManage studentManage = new StudentManage();

        int userInput;
        //<editor-fold desc="菜单功能">
        System.out.println("-----欢迎来到我的学生管理系统-----");
        System.out.println("1,增加学生");
        System.out.println("2,删除学生");
        System.out.println("3,查看所有学生信息");
        System.out.println("4,查找指定学生");
        System.out.println("5,按年龄或学号排序查看学生信息");
        System.out.println("6,查看学生总人数");
        System.out.println("7,退出程序");
        //</editor-fold>


        do
        {
            userInput = sc.nextInt();
            sc.nextLine();
            switch (userInput)
            {
                case 1:
                    studentManage.addStudent();
                    break;
                case 2:
                    studentManage.deleteStudent();
                    break;
                case 3:
                    studentManage.showStudentInfo();
                    break;
                case 4:
                    studentManage.checkStudent();
                    break;
                case 5:
                    studentManage.studentSort();
                    break;
                case 6:
                    System.out.println("学生总人数为" + Student.getTotalStudentNumber());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.print("您的输入有误，");
                    break;
            }
            System.out.println("请重新输入");
            //            userInput = 0;
        } while (true);

    }
}
