/*
 *File Name:Exercise1.java
 *Package Name:com.cyt
 * Author:cyt
 * Description:求字符在Unicode中的位置
 */
package com.cyt;

public class Exercise1
{

    public static void main(String[] args)
    {
        char ch1 = '程';
        char ch2 = '序';
        int c1 = (int) ch1;
        int c2 = (int) ch2;
        String output = String.format("程序的 Unicode 对应的是 %d 与 %d", c1, c2);
        System.out.println(output);
    }
}
