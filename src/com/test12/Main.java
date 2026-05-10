package com.test12;

import javax.swing.*;
import java.io.*;

/**
 * @author cyt
 * @version 序列化与反序列化
 * 演示ObjectInputStream 使用
 */
public class Main
{

    static void main() throws IOException, ClassNotFoundException
    {
        init();
        read();



    }

    private static void read() throws IOException, ClassNotFoundException
    {
        String filePath = "E:\\data.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readUTF());
        Object dog = objectInputStream.readObject();
        System.out.println(dog);  // 打印出的dog使用toString 打印信息

        Dog dogRun = (Dog)dog;
        System.out.println(dogRun);
    }

    private static void init() throws IOException
    {
        // ObjectInputStream 是初始序列号
        // ObjectOutStream 是反序列化
        String filePath = "E:\\data.dat";  // 不是纯文本格式
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeChar('a');  // 全部都是自动装箱
        objectOutputStream.writeUTF("我是猪猪");
        objectOutputStream.writeObject(new Dog("猪猪",10,"ri",new Master("zhur")));
    }

}

class Dog implements Serializable
{
    //
    private Master m;
    private String name;
    // 不想序列化就用transient
    private transient int age;
    private String nation;
    // 序列号与反序列化时候，可以提高兼容性
    @Serial
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age, String nation, Master m)
    {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.m = m;
    }

    @Override
    public String toString()
    {
        return "Dog{" +
                "m=" + m +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }
}

class Master implements Serializable
{
    private String name;

    public Master(String name)
    {
        this.name = name;
    }
}