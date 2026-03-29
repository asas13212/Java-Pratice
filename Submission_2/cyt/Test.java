package com.cyt;

import java.math.MathContext;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.SortedMap;
import java.util.Arrays;

public class Test
{

    static void main()
    {
        //<editor-fold desc="Integer">
        /*
         基本包装类 Integer
                 public static final int MIN_VALUE
                 public static final int MIN_VALUE
                System.out.println(Integer.MAX_VALUE);
                System.out.println(Integer.MIN_VALUE);

                <editor-fold desc="已经过时的构造">
                 String 与 Integer 的相互转换
                Integer i = new Integer(1);
                Integer i2 = new Integer("31");
                System.out.println(i);
                System.out.println(i2);
//                </editor-fold>

                 可以使用的构造
                Integer i3 = Integer.valueOf(10);
                Integer i4 = Integer.valueOf("3232");

                 之前学过的简单拼接
                int number = 100;
                String s = "" + number;

                // 利用基本包装类来拼接
                String s2 = String.valueOf(number);
                Integer i5 = Integer.valueOf("32");
                System.out.println(i5);
                System.out.println(i3.intValue());  // 注意intValue()相当于把自己的Integer变成int
                // 这是最简单的静态方法转换
                int y = Integer.parseInt("100");
                //</editor-fold>

                <editor-fold desc="字符串分割">
                String str = "32 42 31";
                String[] str3 = str.split(" ");
                for(String s32 : str3){
                    System.out.println(s32);
                }

        Student s = new Student();
        s.sayHello();
        s.test();
        */
        //      </editor-fold>

        //<editor-fold desc="猫与狗测试">
        Cat c = new Cat("猫猫", 1);
        c.抓老鼠();

        Dog d = new Dog("狗狗", 32);
        d.看门();
        //</editor-fold>

//        int i = 32;
        //        String s = i.toString();

//        System.out.println(System.currentTimeMillis());

        long start = System.currentTimeMillis();
        for(int i = 0;i<1000;i++){
        }
        long end = System.currentTimeMillis();

        int student = 10;

        System.out.println("花费了" + (end - start) + "毫秒");
        String str = "32";
        str.equals("afh");

        int[] arr = {21,32,42};
        System.out.println("排序之前" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序之后" + Arrays.toString(arr));
    }
}

class Person
{

    public String name;
    public int age;
    public boolean sex;
    public int test = 10;

    public Person(String name, int age, boolean sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person()
    {
        System.out.println("父类构造函数调用");
    }

    public void sayHello()
    {
        System.out.println("你好");
    }

}


class Student extends Person
{

    public int test = 11;

    @Override
    public void sayHello()
    {
        System.out.println("你好3");
    }

    public void test()
    {
        int test = 12;
        System.out.println(super.test);
    }

    public Student()
    {

        System.out.println("子类无参构造函数调用");
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "test=" + test +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return test == student.test;
    }

    @Override
    public int hashCode()
    {
        return test;
    }
}
