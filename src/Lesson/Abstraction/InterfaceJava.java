package Lesson.Abstraction;

public class InterfaceJava {
    public static void main(String[] args) {
        System.out.println("Interface java");
    }
}

//How to declare an interface?
//Syntax:
/*interface <interface_Name> {
     Declare constant fields
     Declare methods that abstract
     by default
   }
*/

//Java Interface Example:
interface printable {
    void print();

    void getName();
}

class A6 implements printable {
    public void print() {
        System.out.println("Hello...!");
    }

    public void getName() {
        System.out.println("Get Name....!");
    }

    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
        obj.getName();
    }
}

//Java interface Example: Drawable

interface Drawable {
    void draw();
}

//implementation: by second user
class Rectangle1 implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class TestInterface {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}

//Java interface Example: Bank

interface Bank3 {
    float rateOfInterest();
}

class SBI2 implements Bank3 {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNB2 implements Bank3 {
    public float rateOfInterest() {
        return 9.7f;
    }
}

class TestInterface2 {
    public static void main(String[] args) {
        Bank3 b = new SBI2();
        Bank3 p = new PNB2();
        System.out.println("SBI2: ");
        System.out.println("ROI: " + b.rateOfInterest());
        System.out.println("PNB2: ");
        System.out.println("ROI: " + p.rateOfInterest());
    }
}

//Multiple inheritance in Java by interface:
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A7 implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
        System.out.println("a + b: " + (10 + 12));
    }

    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}

//Interface Inheritance:
interface Printable1 {
    void print();
}

interface Showable1 extends Printable1 {
    void show();
}

class TestInterface3 implements Showable1 {
    public void print() {
        System.out.println("Hello...!");
    }

    public void show() {
        System.out.println("Welcome....!");
    }

    public static void main(String[] args) {
        TestInterface3 obj = new TestInterface3();
        obj.print();
        obj.show();
    }
}

//Java 8 Default Method in interface:
interface Drawable1 {
    void draw();

    default void msg() {
        System.out.println("Default Method");
    }
}

class Rectangle2 implements Drawable1 {
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

class TestInterfaceDefault {
    public static void main(String[] args) {
        Drawable1 d = new Rectangle2();
        d.draw();
        d.msg();
    }
}
