public class Cat extends Animal
{

    public Cat()
    {
        super();
    }
}

abstract class Animal
{
    protected String name;
    protected int age;

    void sleep(){System.out.println("睡觉");};

}

