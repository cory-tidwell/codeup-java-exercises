package Review;
import java.util.Scanner;

public class Review {
    //    1a. Make a class called review and create a public static method that takes in a double called radius, so that you can find the circumference of a circle. (Circumference Equation: C = 2πr)

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        circumference(1);
    }

//    public static void getRadius(double radius) {
//        double getRadius = radius;
//        circumference(getRadius);
//    }

    private static void circumference(double radius) {
//        System.out.println("Enter the radius: ");
        double myRadius = Math.PI * 2*radius;
//        getRadius = Math.PI * 2*getRadius;
        System.out.println(myRadius);
    }

    private static void circumference(int radius) {
//        System.out.println("Enter the radius: ");
        int myRadius = (int) (Math.PI * 2*radius);
//        getRadius = Math.PI * 2*getRadius;
        System.out.println(myRadius);
    }


//        // Circumference = 2*PI*radius
//        double circumference = Math.PI * 2*radius;
//        System.out.println("The circumference of the circle is: "+circumference);
    }


