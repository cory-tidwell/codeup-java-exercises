import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s", pi);
//        System.out.format("The value of pi is approximately %.2f%n", pi);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an number: ");


//        String input1;
//        String input2;
//        String input3;
//
        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter three words: ");
//
//        System.out.print("Enter your name: ");
//        input1 = scanner.next();
//        input2 = scanner.next();
//        input3 = scanner.next();
////        int userInput = scanner.nextInt();
//        System.out.printf("Your three words are: \n%s \n%s\n%s", input1, input2, input3);
//        System.out.println("Your number is: " + userInput + "!");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a sentence: ");
//        String userString = scanner.nextLine();
//        System.out.printf("Your sentence: " + userString);

        System.out.println("Enter the width of your room: ");
        String widthInput = scanner.nextLine();
        System.out.println("Enter the length of your room: ");
        String lengthInput = scanner.nextLine();

        int roomArea = Integer.valueOf(widthInput) * (Integer.valueOf(lengthInput));
        int roomPerimeter =  (Integer.valueOf(widthInput) * 2) + (Integer.valueOf(lengthInput) * 2);

        System.out.printf("The width entered was %s, the length entered was %s.", widthInput, lengthInput);
        System.out.printf("\nThe area of the room is %s, the perimeter is %s.", roomArea, roomPerimeter);

    }
}
