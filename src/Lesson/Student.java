package Lesson;

public class Student {
    int id;
    String name;

    public static void main(String[] args) {
        int y = 10;
        int x = 12;
        int p = 0;
        int sumXY = x + y;
        String name = "SeyhaVORn";
        System.out.print(x + "\n");
        System.out.print("X + Y" + sumXY + "\n");
        System.out.println(name);
        System.out.println(x);

        Student s1 = new Student();
        s1.id = 122;
        s1.name = "Seyha VORN";
        System.out.println("Stundent 1" + s1.id);
        System.out.println(s1.name);
    }
}

// Ways to initialize object
class Student1 {
    public static void main(String[] args) {
        Student s2 = new Student();
        Student s3 = new Student();

        s2.id = 10;
        s2.name = "Chansokcheat";

        s3.id = 11;
        s3.name = "Chan DaraRit";

        System.out.println("Student 1 " + s2);
        System.out.println("Student 2 " + s3);
    }
}

class StudentShowResult {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

// NOTE:: 2) Object and Class Example: Initialization through method
class MyResultOfStudent {
    public static void main(String[] args) {
        StudentShowResult student1 = new StudentShowResult();
        StudentShowResult student2 = new StudentShowResult();

        student1.insertRecord(122, "Seyha Vorb");
        student2.insertRecord(1222, "Chan Sommand Mean Chey");

        student1.displayInformation();
        student2.displayInformation();
    }
}

//3) Object and Class Example: Initialization through a constructor

class Employee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

}

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();


        e1.insert(121212, "Sun day", 23232323);
        e2.insert(121212, "Jeck Ma", 232232323);
        e3.insert(121212, "Oh my Good", 232323);

        e1.display();
        e2.display();
        e3.display();
    }
}

//Object and Class Example: Rectangle

class Rectangle {
    int length;
    int width;

    void insert(int l, int w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        System.out.println(length * width);
    }

}

class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.insert(12, 12);
        r2.insert(12, 123);

        r1.calculateArea();
        r2.calculateArea();
    }
}

/* What are the different ways to create an object in Java?
    - By new keyword
    - By newInstance() method
    - By clone() method
    - By Deserialization
    - By factory method etc.
 */

class Calculation {
    void fact(int n) {
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
        }
        System.out.println("Factories is " + fact);
    }

    public static void main(String[] args) {

        //calling method with anonymous object
        new Calculation().fact(5);

        //Calling method through a reference:
        Calculation c = new Calculation();
        c.fact(3);

        //How to create two Object:
        Calculation c1 = new Calculation(), c2 = new Calculation();
    }
}

//Constructor Overloading:

class Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor:
    Student5(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] arg) {
        Student5 s1 = new Student5(111, "Seyha VORN");
        Student5 s2 = new Student5(31223, "Seyha Dara", 232);

        s1.display();
        s2.display();
    }
}