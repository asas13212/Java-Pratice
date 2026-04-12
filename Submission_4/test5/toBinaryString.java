package test5;

import java.util.Scanner;

public class toBinaryString
{

    public toBinaryString()
    {
        System.out.println("这是一个十进制转二进制");
        System.out.println("请输入一个数字");

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        int[] res = new int[30];
        StringBuilder sb = new StringBuilder();

        while(true){
            if (i == 0)
                break;

            int remainder = i % 2;
//            System.out.print(remainder);
            sb.insert(0,remainder);
            i /= 2;

        }

        System.out.println(sb);

    }
}
