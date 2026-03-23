package com.cyt;

//import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManage
{

    public ArrayList<Student> studentList = new ArrayList<>();
    private final int MAX_NUMBER = 50;

    public void addStudent()
    {
        String studentNameTemp;
        int studentAgeTemp, studentIdTemp, studentClassTemp;
        Scanner sc = new Scanner(System.in);
        if (Student.totalStudentNumber >= MAX_NUMBER)
        {
            System.out.println("学生人数已满");
            return;
        }
        do
        {

            //<editor-fold desc="读取输入数据“>
            System.out.println("请输入学生姓名");
            studentNameTemp = sc.nextLine();
            System.out.println("请输入学生年龄");
            studentAgeTemp = sc.nextInt();
            sc.nextLine();
            System.out.println("请输入学生学号");
            studentIdTemp = sc.nextInt();
            sc.nextLine();
            System.out.println("请输入学生班级");
            studentClassTemp = sc.nextInt();
            sc.nextLine();
            //</editor-fold>

            if (!StudentManage.isExist(studentIdTemp, studentList))
            {
                studentList.add(new Student(studentNameTemp, studentAgeTemp, studentIdTemp, studentClassTemp));
                System.out.println("添加学生成功");
                return;
            }
            else System.out.println("学号有重复，请重新输入");
        } while (StudentManage.isExist(studentIdTemp, studentList));
    }


    private static boolean isExist(int studentId, ArrayList<Student> studentList)
    {
        // 变成静态方法，使得类的内部可以自由调用
        boolean ret = false;
        for (Student s : studentList)
        {
            if (s.getId() == studentId) return true;
        }
        return ret;
    }


    private static boolean isExist(String studentName, ArrayList<Student> studentList)
    {
        boolean ret = false;
        for (Student s : studentList)
        {
            if (s.getName().equals(studentName)) return true;
        }
        return ret;
    }


    public void showStudentInfo() // 不用加上静态修饰符号，因为要实例化对象后才能使用
    {
        for (Student s : studentList)
        {
            s.showInfo();
        }
    }


    public void checkStudent()
    {
        Scanner sc = new Scanner(System.in);
        int userInput, studentIdTemp;
        String studentNameTemp = "";
        System.out.println("请选择输入方式,1是学号查询，2是名字查询");

        do
        {
            userInput = sc.nextInt();
            sc.nextLine(); // 记得清楚换换行符号

            switch (userInput)
            {
                case 1:
                    System.out.println("请输入学号");
                    studentIdTemp = sc.nextInt();
                    sc.nextLine();

                    if (isExist(studentIdTemp, studentList))
                    {
                        Student s = useCheck(studentIdTemp, studentList);
                        if (s != null)
                        {
                            System.out.println("找到该学生了\n学生信息如下");
                            s.showInfo();
                        }
                    }
                    else
                    {
                        System.out.println("没有找到该学生");
                    }
                    break;

                case 2:
                    System.out.println("请输入名字");
                    studentNameTemp = sc.nextLine();

                    if (isExist(studentNameTemp, studentList))
                    {
                        Student s = useCheck(studentNameTemp, studentList);
                        if (s != null)
                        {
                            System.out.println("找到改学生了\n学生信息如下");
                            s.showInfo();
                        }
                    }
                    break;

                default:
                    System.out.println("你的输入有误，请重新输入");
                    break;
            }

        } while (!(userInput == 1 || userInput == 2));
    }


    private static Student useCheck(int studentId, ArrayList<Student> studentList)
    {
        for (Student s : studentList)
        {
            if (s.getId() == studentId) return s;
        }
        return null;
    }


    private static Student useCheck(String studentName, ArrayList<Student> studentList)
    {
        for (Student s : studentList)
        {
            if (s.getName().equals(studentName)) return s;
        }
        return null;
    }

    public void deleteStudent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号");
        int studentIdTemp = sc.nextInt();
        sc.nextLine();

        Student target = useCheck(studentIdTemp, studentList);
        if (target != null)
        {
            studentList.remove(target);
            System.out.println("删除成功");
            Student.totalStudentNumber--;
        }
        else
        {
            System.out.println("没有找到该学号对应的学生");
        }

    }


    public void studentSort()
    {
        if (studentList == null || studentList.isEmpty())
        {
            System.out.println("暂无学生数据，无法排序");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要进行的排序,1为年龄排序,2为学号排序");
        if (!sc.hasNextInt())
        {
            System.out.println("您的输入有误");
            sc.nextLine();
            return;
        }

        int userChoice = sc.nextInt();
        sc.nextLine();

        Comparator<Student> comparator;
        if (userChoice == 1)
        {
            comparator = Comparator.comparingInt(Student::getAge).thenComparingInt(Student::getId);
        }
        else if (userChoice == 2)
        {
            comparator = Comparator.comparingInt(Student::getId).thenComparingInt(Student::getAge);
        }
        else
        {
            System.out.println("您的输入有误");
            return;
        }

        studentList.sort(comparator);
        System.out.println("排序完成，结果如下：");
        showStudentInfo();
    }

    public StudentManage()
    {
        studentList.add(new Student("熊大", 21, 10, 22));
        studentList.add(new Student("熊二", 21, 11, 22));
        studentList.add(new Student("美牛牛", 22, 13, 21));

    }
}
