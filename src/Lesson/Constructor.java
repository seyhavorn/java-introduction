package Lesson;

public class Constructor {
    int id;
    String name;

    Constructor(int i, String n) {
        id = i;
        name = n;
    }

    //constructor to initialize another object
    Constructor(Constructor s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Constructor s1 = new Constructor(122, "Seyha VORN");
        Constructor s2 = new Constructor(s1);

        s1.display();
        s2.display();
    }
}

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

//Java Object Class: