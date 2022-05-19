import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String userInput;
        do{
        Scanner scanner = new Scanner(System.in);
        System.out.println("*Lackadaisical Bob*");
        userInput = scanner.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Woah, Chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. be that way!");
        } else {
            System.out.println("Whatever");
        }
        } while(!userInput.equals("bye"));
    }
}

