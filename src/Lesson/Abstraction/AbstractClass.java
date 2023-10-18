package Lesson.Abstraction;

public class AbstractClass {

    public static void main(String[] args) {
        System.out.println("Abstract Class");
    }
}

//Abstract Method in Java

abstract class Bike {
    abstract void run();

    abstract void showing();
}

class Honda extends Bike {
    void run() {
        System.out.println("Running safely...");
    }

    void showing() {
        System.out.println("Showing my passionate and talent....!");
    }

    public static void main(String[] args) {
        Bike object = new Honda();
        object.run();
        object.showing();
    }
}

abstract class Shape {
    abstract void draw();
}


//in real scenario, implementation in provided by others i.e. Unknown by end user
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle....");
    }
}

class Circle1 extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

//in real scenario, method is called by programing or user
class TestAbstractAction1 {
    public static void main(String[] args) {
        Shape s = new Circle1(); //in a real scenario, object is provide through method, e.g., get Shape() method.
        s.draw();
    }
}

//Other example:
abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of interest is: " + b.getRateOfInterest() + " % ");

        b = new PNB();
        System.out.println("Rate of interest is: " + b.getRateOfInterest() + " %");
    }
}

//Abstract class having constructor, data member and methods
abstract class Bike2 {
    Bike2() {
        System.out.println("Bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear changed");
    }
}

class Honda1 extends Bike2 {
    void run() {
        System.out.println("Running safely...");
    }
}

class TestAbstraction2 {
    public static void main(String[] args) {
        Bike2 object = new Honda1();
        object.run();
        object.changeGear();
    }
}

//Another real scenario of abstract class
interface A {
    void a();

    void b();

    void c();

    void d();
}

abstract class B implements A {
    public void c() {
        System.out.println("I am c");
    }
}

class M extends B {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}

class Test5 {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}