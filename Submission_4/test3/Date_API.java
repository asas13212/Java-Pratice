package test3;

import java.util.Date;

public class Date_API
{

    public Date_API()
    {
        Date d = new Date();
        System.out.println(d);

        Date d2 = new Date(0);
        System.out.println(d2);      // 过了0毫秒的时间
    }
}
