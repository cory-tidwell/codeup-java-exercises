import java.util.Scanner;

public class Warmup {
//    Create a function that takes the age in years and returns the age in days.
//    example input: 65
//    expected output: 23725

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* Input number of days from user */
        System.out.print("Enter you age: ");
        int age = in.nextInt();

        /* Year, weeks and days conversion  */
        int years = (age * 365);
//        int weeks = (days % 365) / 7;
//        days  = (days % 365) % 7;

        /* Print total years, weeks and remaining days in given days */
        System.out.println("Year/s = " + years);
//        System.out.println("Week/s = " + weeks);
//        System.out.println("Day/s  = " + days);

//        Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
//                example inputs: 4, '/', 2
//        expected output: 2 (edited)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int n2 = scanner.nextInt();
        System.out.println("Input the mathematical operator: ");
        String operator = scanner.next();
        if (operator.equals("+"))
        {
            System.out.println(String.valueOf(n1 + n2));
        }
        else if (operator.equals("-"))
        {
            System.out.println(String.valueOf(n1 - n2));        }
        else if (operator.equals("*"))
        {
            System.out.println(String.valueOf(n1 * n2));        }
        else if (operator.equals("/"))
        {
            System.out.println(String.valueOf(n1 / n2));        }
        else
        {
            System.out.println("Error ...");        }
//        int sum = n1 + n2;
//        int minus = n1 - n2;
//        int multiply = n1 * n2;
//        int subtract = n1 + n2;
//        int divide = n1 / n2;
//        int rnums = n1 % n2;
//        System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);
    }
}
