package com.test2;

public class test2
{
    static void main(){
        Animal a = new Cat();
        System.out.println(a.age);
        a.eat();
        
    }
}


class Cat extends Animal
{
    public int age = 132;

    public void eat(){
        System.out.println("猫吃东西 ");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
}

class Animal
{
    public int age = 10;

    public void eat(){
        System.out.println("动物吃东西");
    }


}