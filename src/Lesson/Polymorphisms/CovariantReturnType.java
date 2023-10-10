package Lesson.Polymorphisms;

public class CovariantReturnType {

    public static void main(String[] args) {
        System.out.println("Welcome to Covariant Return Type");
    }
}


//Simple example of Covariant Return Type:
class A1 {
    A1 get() {
        return this;
    }
}

class B1 extends A1 {
    @Override
    B1 get() {
        return this;
    }

    void message() {
        System.out.println("Welcome to covariant return type");
    }

    public static void main(String[] args) {
        new B1().get().message();
    }
}