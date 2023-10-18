package Lesson.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Encapsulation...!");
        Encapsulation e = new Encapsulation();
        e.setName("Seyha VORN");
        e.showName();
    }

    private String name;
    //getter method for name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println(this.name);
    }
}

