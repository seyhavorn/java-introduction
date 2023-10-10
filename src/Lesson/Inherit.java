package Lesson;

import org.w3c.dom.ls.LSOutput;

class Inherit {
    float salary = 4000;
}

class Programmer extends Inherit {
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programing salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }
}

//Single Inheritance
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        System.out.println("Test Inheritance with Dog...");
        Dog d = new Dog();
        d.bark();
        d.eat();

        System.out.println("Test Inheritance with Animals..");
        Animal a = new Animal();
        a.eat();
    }
}

//Multilevel Inheritance Example:

class Animal2 {
    void eat() {
        System.out.println("Earting...");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog2 extends Dog2 {
    void weep() {
        System.out.println("Weeping..");
    }
}

class Inheritance2 {
    public static void main(String[] args) {
        BabyDog2 d = new BabyDog2();
        System.out.println("Multilevel Inheritance Example");
        d.weep();
        d.bark();
        d.eat();
        System.out.println("---------------------");
    }
}

//Hierarchical Inheritance Example:

class Animal3 {
    void eat() {
        System.out.println("Eating....");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Braking...");
    }
}

class Cat extends Animal3 {
    void meow() {
        System.out.println("Meowing...");
    }
}

class Inheritance3 {
    public static void main(String[] args) {

        System.out.println("Inheritance 3 with Cat...");
        Cat c = new Cat();
        c.meow();
        c.eat();
        System.out.println("Inheritance 3 with Dog");
        Dog3 d = new Dog3();
        d.bark();
        d.eat();

        System.out.println("---------------------------------");

    }
}

//End Hierarchical Inheritance Example:

//Why Multiple Inheritance is not supported in Java?
class A {
    void msg() {
        System.out.println("Hello Class A");
    }
}

class B {
    void msg() {
        System.out.println("Hello class B");
    }
}

class C extends A {

    public void msg() {
        System.out.println("Hello From class C");
    }

    public static void main(String[] args) {
        C object = new C();
        object.msg();
    }
}
