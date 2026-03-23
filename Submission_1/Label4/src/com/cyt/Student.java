package com.cyt;

public class Student
{

    private int age;
    private String name;
    private int id;
    private int classIdx;

    public static int totalStudentNumber = 0;

    public Student(String name, int age, int id, int classIdx)
    {
        this.name = name;
        this.age = age;
        this.id = id;
        this.classIdx = classIdx;
        totalStudentNumber++;
    }

    public Student()
    {
    }

    public void showInfo()
    {
        System.out.println("学生姓名" + name);
        System.out.println("学生年龄" + age);
        System.out.println("学生学号" + id);
        System.out.println("学生班级" + classIdx);
    }

    //<editor-fold desc="一些取值函数">
    public static int getTotalStudentNumber()
    {
        return totalStudentNumber;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public int getClassIdx()
    {
        return classIdx;
    }
    //</editor-fold>
}
