package T2;

import java.util.Comparator;

public class Test
{
    public static void main()
    {
        Animal a = new Animal() {};
        new Animal(){};
        Animal animal = new Cat("猫猫",2);
        Say h = new Cat("猫1",3);
        h.sayHello();

        System.out.println( h instanceof Cat );

        makeSound( h );

    }

    static void makeSound(Say say)
    {
        say.sayHello();
    }
}

abstract class Animal
{
    protected String name;
    protected int age;




    //<editor-fold desc="构造方法">
    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Animal() {}
    //</editor-fold>
}

class Cat extends Animal implements Say
{
    @Override
    public void sayHello(){
        System.out.println("你好");
    }
    //<editor-fold desc="构造方法">
    public Cat(String name, int age)
    {
        super(name, age);
    }
    public Cat() {}
    //</editor-fold>
}

interface Say { void sayHello();}