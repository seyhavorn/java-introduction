package Lesson.Polymorphisms;

public class CovariantExample {
    public static void main(String[] args) {
        W w = new W();
        w.foo().print();

        W2 w2 = new W2();
        ((W2) w2.foo()).print();

        W3 w3 = new W3();
        ((W3) w3.foo()).print();
    }
}

class W {
    W foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class W");
    }
}

class W2 extends W {
    @Override
    W foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class W2");
    }
}

//W3 is the child class of W2
class W3 extends W2 {
    @Override
    W foo() {
        return this;
    }

    @Override
    void print() {
        System.out.println("Inside the class W3");
    }
}