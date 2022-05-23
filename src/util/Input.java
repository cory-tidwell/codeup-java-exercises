package util;

import java.net.SocketOption;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("What did you eat for dinner? ");
        String userInput = scanner.nextLine();
        System.out.println(userInput + " tastes like crap!");
        return userInput;
    }

    public String getString(String prompt) {
        System.out.println("What did you eat for dinner? ");
        String userInput = scanner.nextLine();
        System.out.println(userInput + " tastes like crap!");
        return userInput;
    }

    public boolean yesNo() {
        System.out.println("Did you enjoy dinner last night? (yes/no) ");
        String userInput = scanner.next();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public int getInt(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int num = scanner.nextInt();
        if (num < 10 && num > 1){
            return num;
        }else return getInt(min, max);
    }

    public double getDouble(double min, double max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        double num = scanner.nextDouble();
        if (num < 10 && num > 1){
            return num;
        }else return getDouble(min, max);
    }

}