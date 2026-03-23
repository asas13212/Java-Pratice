package com.cyt;

import java.util.Random;
import java.util.Scanner;

public class Exercise3
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int pcNumber;
        int gameRound = 0, playerWin = 0, computerWin = 0;
        int playerChoice = -1;

        System.out.println("规则：输入 1=石头  2=剪刀  3=布");

        while (gameRound < 5)
        {
            pcNumber = random.nextInt(3) + 1;
            System.out.println("请输入你的选择");
            playerChoice = sc.nextInt();

            String playerChoiceStr = "";
            String pcChoiceStr = "";

            switch (playerChoice)
            {
                case 1:
                    playerChoiceStr = "石头";
                    break;
                case 2:
                    playerChoiceStr = "剪刀";
                    break;
                case 3:
                    playerChoiceStr = "布";
                    break;
                default:
                    playerChoiceStr = "无效选择";
            }

            switch (pcNumber)
            {
                case 1:
                    pcChoiceStr = "石头";
                    break;
                case 2:
                    pcChoiceStr = "剪刀";
                    break;
                case 3:
                    pcChoiceStr = "布";
                    break;
            }
            System.out.println("你出了：" + playerChoiceStr);
            System.out.println("电脑出了：" + pcChoiceStr);
            switch (playerChoice)
            {
                case 1:
                    if (pcNumber == 2)
                    {
                        playerWin++;
                        System.out.println("你赢了一局");
                    }
                    else if (pcNumber == 1)
                    {
                        System.out.println("平局");
                    }
                    else
                    {
                        System.out.println("你输了这一局");
                        computerWin++;
                    }
                    break;
                case 2:
                    if (pcNumber == 3)
                    {
                        playerWin++;
                        System.out.println("你赢了一局");
                    }
                    else if (pcNumber == 2)
                    {
                        System.out.println("平局");
                    }
                    else
                    {
                        System.out.println("你输了这一局");
                        computerWin++;
                    }
                    break;
                case 3:
                    if (pcNumber == 1)
                    {
                        playerWin++;
                        System.out.println("你赢了一局");
                    }
                    else if (pcNumber == 3)
                    {
                        System.out.println("平局");
                    }
                    else
                    {
                        System.out.println("你输了这一局");
                        computerWin++;
                    }
                    break;
                default:
                    System.out.println("请重新输入");
                    continue;
            }
            gameRound++;
        }
        if (playerWin > computerWin)
        {
            System.out.println("最终结果：你赢了");
        }
        else if (playerWin < computerWin)
        {
            System.out.println("最终结果：你没赢");
        }
        else
        {
            System.out.println("最终结果：平局");
        }
        sc.close();
    }
}