package Review;

public class Review {
    //    1a. Make a class called review and create a public static method that takes in a double called radius, so that you can find the circumference of a circle. (Circumference Equation: C = 2πr)

//    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        circumference(1);
//        System.out.println("Your total is $"+total(11.89, 20));

        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        even(myArr);
    }
// Create a public static method called total with two double parameters named 'bill' and 'tipPercentage'.
//Return the final bill (double), including tip. (Equation: bill + ((tipPercentage / 100) * bill) = total)
    public static double total(double bill, double tipPercentage) {
        double finalBill = bill + ((tipPercentage/100) * bill);
        return finalBill;
    }

    public static void even(int[] arr) {
        int[] result = new int[16];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
//                result[] += arr[i];
                System.out.println(arr[i]);
            }

        }
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


