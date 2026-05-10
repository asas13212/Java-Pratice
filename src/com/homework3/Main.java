package com.homework3;

import java.io.*;
import java.security.DigestException;
import java.util.Properties;

public class Main
{

    static void main() throws IOException
    {
        String filePath ="C:\\Users\\80486\\IdeaProjects\\Week10\\src\\com\\homework3\\dog.dat";
        //g();
        Properties p = new Properties();
        p.load(new FileReader(filePath));

        String name = p.get("name") + "";
        int age = Integer.parseInt(p.get("age") +"");
        String color = p.get("color") + "";

        Dog dog = new Dog(name,age,color);
        System.out.println(dog);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(dog);

        oos.close();
    }

    private static void g() throws IOException
    {
        String filePath ="C:\\Users\\80486\\IdeaProjects\\Week10\\src\\com\\homework3\\dog.dat";
        File f = new File(filePath);
        if (!f.exists())
        {
            if (f.createNewFile())
                System.out.println("创建成功");
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("name=tom");
        bufferedWriter.newLine();
        bufferedWriter.write("age=5");
        bufferedWriter.newLine();
        bufferedWriter.write("color=red");

        bufferedWriter.close();
    }
}

class Dog implements Serializable
{
    private String name;
    private int age;
    private String color;


    @Override
    public String toString()
    {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog(String name, int age, String color)
    {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}