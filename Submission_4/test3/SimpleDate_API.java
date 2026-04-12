package test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate_API
{

    public SimpleDate_API()
    {
        Date d = new Date(0);
        SimpleDateFormat s = new SimpleDateFormat();
        SimpleDateFormat s2 =new SimpleDateFormat("yyyy年MM月dd日");
        String str = s2.format(d);      // 需要Date对象

        System.out.println(str);
    }
}
