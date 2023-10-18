package Lesson;

public class Array {
    public static void main(String[] args) {
        System.out.println("Welcome to Array...!");
    }
}

/*
    There are two type of array:
        1. Single Dimensional Array
        2. Multidimensional Array
 */

// Single Dimensional Array in Java:
/*
    dataType[] arr; (or)
    dataType []arr; (or)
    dataType arr[];
*/

//Example:

class TestArray {
    public static void main(String[] args) {
        int a[] = new int[5]; //declaration and instantiation
        int a1[] = {23, 1, 2, 122,};

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }

        System.out.println("Declaration, Instantiation and Initialization");

        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[i] = " + a1[i]);
        }

        //Using for-each loop:
        for (int i : a1) {
            System.out.println("using For Each Loop");
            System.out.println("i for: For each loop = " + i);
        }
    }
}

//Passing Array to a method in java
class TestArray2 {
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                System.out.println("min" + min);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {23, 231, 44};
        min(a);
    }
}

