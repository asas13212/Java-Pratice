package test1;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Random;

public class BigInteger_API
{

    public BigInteger_API()
    {
        // 一旦创建，内部的值无法改变
        BigInteger b1 = new BigInteger("322323232332");   // 第一种构造方法是直接写出数字
        BigInteger b2 = new BigInteger(23,new Random());    // 获取随机大整数,前面是2的numBits

        System.out.println(b1);
        System.out.println(b2);


        // 没有超出long，可以用静态方法获取
        System.out.println("BigInteger.valueof()的作用:");
        BigInteger b3 = BigInteger.valueOf(123);
        BigInteger b4 = BigInteger.valueOf(13);
        System.out.println((Objects.equals(b3,b4)));  // 返回true
        System.out.println();

        System.out.println("b3 + b4 = " + b3.add(b4));
        System.out.println();

        System.out.println("BigInteger中的方法");
        System.out.println("add,subtract,multiply,divide,divideAndReminder,pow");
        BigInteger[] arr = b3.divideAndRemainder(b4);
        System.out.println(arr[0]);     // 0索引是商
        System.out.println(arr[1]);     // 1索引是余数

        System.out.println();
        b3.pow(3); // 注意给的参数是int类型

        BigInteger b5 = BigInteger.valueOf(3299);
        int i = b5.intValue();
        System.out.println(i);

        double d = b5.doubleValue();
        System.out.println(d);
    }
}
