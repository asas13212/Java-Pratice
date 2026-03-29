package com.cyt;

public class Cat extends Animal
{

    public Cat()
    {
    }

    public Cat(String name, int age)
    {
        super(name, age);
    }

    public void 抓老鼠(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal
{

    public Dog(String name, int age)
    {
        super(name, age);
    }

    public Dog()
    {

    }

    public void 看门(){
        System.out.println("看门");
    }
}

class Animal
{
    private String name;
    private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public  Animal(){}
}