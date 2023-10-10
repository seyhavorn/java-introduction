package Lesson.Polymorphisms;

public class InstanceInitializerBlock {
    public static void main(String[] args) {
        System.out.println("Instance Initializer Block");
    }
}

class Bike7 {
    int speed;

    Bike7() {
        System.out.println("speed is: " + speed);
    }

    //instance initializer block invoked
    {
        speed = 100;
    }

    public static void main(String[] args) {
        Bike7 b1 = new Bike7();
        Bike7 b2 = new Bike7();
        Bike7 b3 = new Bike7();
    }
}
/*
    There are three place in java where you can perform operations.
    1. method
    2. constructor
    3. block
 */

//What is invoked first, Instance initializer block or constructor?

class Bike8 {
    int speed;

    Bike8() {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer invoked");
    }

    public static void main(String[] args) {
        Bike8 b = new Bike8();
        Bike8 b2 = new Bike8();
    }
}

