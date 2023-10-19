package Lesson.OOPsMisc;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a);
        Integer j = a;

        System.out.println("Value of Integer i : " + i);
        System.out.println("Value of Integer j: " + j);
        System.out.println("Wrapper Class In Java...!");
    }
}
