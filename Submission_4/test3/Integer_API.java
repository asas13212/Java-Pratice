package test3;

import java.util.StringTokenizer;

public class Integer_API
{

    public Integer_API()
    {
        //Integer i = new Integer("3223");   Depreciated
        //Integer i = new Integer.valueOf(213); Depreciated    -128 ~ 127 是一个引用对象
        Integer i2 = new Integer(2);
        Integer i3 = new Integer(3);

        int res = i2.intValue() + i3.intValue();  // 自动拆装箱
        String s = "23" + res;
        System.out.println(res);



        int i = Integer.parseInt("232");    // 自动转换
    }
}
