package Lesson.Polymorphisms;

public class StaticBindingAndDynamicBinding {

    public static void main(String[] args) {
        System.out.println("Welcome to Static Binding And Dynamic Binding");
    }
}


/*
   There are two type of Binding.
   1. Static Binding (also known as Early Binding)
   2. Dynamic Binding (also known as Late Binding)
* */

class Dog6 {

    void getHello() {
        System.out.println("This is my dog");
    }

    public static void main(String[] args) {
        Dog6 d1 = new Dog6();
        d1.getHello();
    }
}