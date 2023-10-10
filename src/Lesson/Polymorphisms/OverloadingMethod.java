package Lesson.Polymorphisms;

public class OverloadingMethod {

    public static void main(String[] args) {
        System.out.println("Hello from Overloading Method...!");
    }
}

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class TesOverloadingMethod1 {
    public static void main(String[] args) {
        int sum1 = Adder.add(12, 12);
        int sum2 = Adder.add(15, 536, 34);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
    }
}
