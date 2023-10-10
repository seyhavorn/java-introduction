package Lesson.Polymorphisms;

public class SuperKeyword {
}

class Animal {
    String color = "white";
}

class Dogs extends Animal {
    String color = "black";

    void printColor() {
        System.out.println("Child color" + color);
        System.out.println("Super Color" + super.color);
    }
}

class TestSupper {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.printColor();
    }
}

//Super can be used to invoke parent class method.
class Animal2 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal2 {
    void eat() {
        System.out.println("Eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
        eat();
    }

}

class TestSuper2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}

//Super is used to invoke parent class constructor
class Animal3 {
    Animal3() {
        System.out.println("Animal is created");
    }
}

class Dog2 extends Animal3 {
    Dog2() {
        super();
        System.out.println("Dog is created");
    }
}

class TestSuper3 {
    public static void main(String[] arg) {
        Dog2 d = new Dog2();
    }
}

//Super Example: real use

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;

    Emp(int id, String name, float salary) {
        super(id, name); //reusing parent constructor
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class TestSuper5 {
    public static void main(String[] args) {
        Emp e1 = new Emp(12, "Seyha Vorn", 54000);
        e1.display();
    }
}