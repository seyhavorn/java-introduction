package Lesson.Polymorphisms;

public class JavaInstanceof {
    public static void main(String[] args) {
        System.out.println("Java Instance of");
    }
}

class Simple1 {
    public static void main(String[] args) {
        Simple1 s = new Simple1();
        System.out.println(s instanceof Simple1);
    }
}

