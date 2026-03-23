package com.cyt;

public class test1
{

    static void main()
    {
        int arr[] = {12, 42};

        int[] arr2 = arr;
        arr = null;
        System.out.println(arr);
        System.out.println(arr2[1]);

        //        arr2[1] = 2;
        Person p1 = new Person("过颖萌", 18);

        System.out.println("-------");
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println("-------");

        p1.SayHello();
        ;
        p1.SayMyName();
    }

}

class Person
{

    public int age;
    public boolean sex;
    public String name;

    public void SayHello()
    {
        System.out.println("你好啊");
    }

    public void SayMyName()
    {
        System.out.println("我的名字是" + name);

    }

    public Person(String name, int age, boolean sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person()
    {
    }

    public Person(String name, int age)
    {
        this(name, age, true);
    }
}
