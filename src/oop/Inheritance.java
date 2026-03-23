// Animal base class
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
        return "...";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", age=" + age + "]";
    }
}

// Dog subclass
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String speak() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return super.toString() + " breed=" + breed;
    }
}

// Cat subclass
class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    @Override
    public String toString() {
        return super.toString() + " indoor=" + isIndoor;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Rex", 3, "German Shepherd"),
            new Cat("Whiskers", 5, true),
            new Dog("Buddy", 2, "Labrador"),
            new Cat("Shadow", 4, false)
        };

        for (Animal animal : animals) {
            System.out.println(animal + " says: " + animal.speak());
        }

        // instanceof check
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println(dog.getName() + " is a " + dog.getBreed());
            }
        }
    }
}
