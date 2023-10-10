package Lesson;

//Simple Example of Aggregation:
public class Aggregation {
    void mgs() {
        System.out.println("Welcome to Aggregation");
    }

    public static void main(String[] args) {
        Aggregation a = new Aggregation();
        a.mgs();
    }
}

class Operation {
    int square(int n) {
        return n * n;
    }
}

class Circle {
    Operation op;
    double pi = 3.14;

    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius); //code reusability (i.e delegates the method call).
        return pi * rsquare;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println("Result of Circle: " + result);
    }
}


