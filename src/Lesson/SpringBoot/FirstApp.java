package Lesson.SpringBoot;

public class FirstApp {
    public static void main(String[] args) {
        System.out.println("First String Boot!");
    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Hello: " + name);
    }
}