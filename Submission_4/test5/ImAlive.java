package test5;

import test3.SimpleDate_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ImAlive
{

    public ImAlive() throws ParseException
    {
        System.out.println("请输入你的出生年月日: YY-MM-DD");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        Date d = sdf.parse(s);
        long time = d.getTime();

        System.out.println("你已经活了" + time/1000/60/60/24);
    }
}
