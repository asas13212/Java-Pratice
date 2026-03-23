package com.cyt;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2
{

    static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();
        String userNameIn;
        String userPasswordIn = "";
        int cnt = 0;

        userList.add(new User("王宇", "123456"));
        userList.add(new User("王v", "888888"));
        userList.add(new User("晓风", "57575"));
        //<editor-fold desc="打印功能">
        System.out.println("编写程序实现简单的注册登录功能。程序包含以下4个功能：");
        System.out.println("（1）登录功能，用户输入正确的账号密码登录成功");
        System.out.println("（2）注册功能，输入用户名和密码进行注册");
        System.out.println("（3）查看功能，查看所有的用户名与密码；");
        System.out.println("（4）退出功能，退出系统。");
        //</editor-fold>
        while (true)
        {
            System.out.println("\n请输入功能序号（1-4）：");
            while (!sc.hasNextInt())
            {
                System.out.println("输入无效，请输入数字1-4！");
                sc.next();
            }
            int input = sc.nextInt();
            sc.nextLine();

            switch (input)
            {
                case 1: // 登录功能
                    System.out.println("请输入用户名：");
                    userNameIn = sc.nextLine().trim();
                    System.out.println("请输入密码：");
                    userPasswordIn = sc.nextLine().trim();

                    boolean loginSuccess = false;
                    for (User u : userList)
                    {
                        if (u.userName.equals(userNameIn) && u.userPassWord.equals(userPasswordIn))
                        {
                            loginSuccess = true;
                            break;
                        }
                    }
                    if (loginSuccess)
                    {
                        System.out.println("登录成功！");
                    }
                    else
                    {
                        System.out.println("用户名或密码错误！");
                    }
                    break;

                case 2: // 注册功能
                    System.out.println("请输入用户名：");
                    userNameIn = sc.nextLine().trim();
                    if (isExist(userNameIn, userList))
                    {
                        System.out.println("用户名已经存在，注册失败！");
                    }
                    else
                    {
                        System.out.println("请输入密码：");
                        userPasswordIn = sc.nextLine().trim();
                        userList.add(new User(userNameIn, userPasswordIn));
                        System.out.println("注册成功！");
                    }
                    break;

                case 3: // 查看所有用户
                    if (userList.isEmpty())
                    {
                        System.out.println("暂无注册用户！");
                        break;
                    }
                    cnt = 0;
                    for (User u : userList)
                    {
                        cnt++;
                        System.out.println(cnt + ".用户名:" + u.userName + ",密码:" + u.userPassWord);
                    }
                    break;

                case 4: // 退出系统
                    System.out.println("退出系统，感谢使用！");
                    sc.close();
                    return;

                default:
                    System.out.println("输入错误，请输入1-4的数字！");
                    break;
            }
        }
    }

    public static boolean isExist(String userNameIn, ArrayList<User> userList)
    {
        for (User u : userList)
        {
            if (u.userName.equals(userNameIn))
            {
                return true;
            }
        }
        return false;
    }
}

class User
{

    public String userName;
    public String userPassWord;

    public User()
    {
    }

    public User(String userName, String userPassWord)
    {
        this.userName = userName;
        this.userPassWord = userPassWord;
    }
}
