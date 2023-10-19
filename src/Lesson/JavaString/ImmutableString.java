package Lesson.JavaString;

public class ImmutableString {
    public static void main(String[] args) {
        String s = "Seyha VORN";
        System.out.println("Immutable String in Java");
        s = s.concat(" is Handsome");
        System.out.println(s);
    }
}
