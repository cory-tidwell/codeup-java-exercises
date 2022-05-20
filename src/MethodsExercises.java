import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(5,7));
//
//        System.out.println(subtraction(10,6));
//
//        System.out.println(multiplication(6, 4));
//
//        System.out.println(division(15,3)); //cannot divide by 0
//
//        System.out.println(modulus(18,6));

//        System.out.println(getInteger(1, 10));

//        factorial();
//        System.out.println("The factorial of 6 is: " + factorial(6));
//        System.out.println("The factorial of 0 is: " + factorial(0));
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int userScore = 0;
        int cpuScore = 0;

        System.out.println("How many rounds?: ");
        int rounds = scan.nextInt();

        for(int x = 0; x < rounds; x++) {
            int userChoice = rand.nextInt(6) + 1;
            int cpuChoice = rand.nextInt(6) + 1;

            if(cpuChoice > userChoice) {
                cpuScore += 1;
            } else if(cpuChoice < userChoice) {
                userScore += 1;
            }
        }
        System.out.printf("User Score: %d\n cpuScore: %d\n", userScore, cpuScore );

        if(cpuScore > userScore) {
            System.out.println("cpu won!");
        } else if(cpuScore < userScore){
            System.out.println("cpu won!");
        } else {
            System.out.println("It was a tie!");
        }
    }
//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
////    public static int multiplication(int num1, int num2) {
////        return num1 * num2;
////    }
//
////    public static int multiplication(int num1, int num2) {
////        int result = 0;
////        for(int i = 0; i< num2; i++){
////            result += num1;
////        }
////        return result;
////    }
//
//    public static int multiplication(int num1, int num2) {
//        if (num1 < num2)
//            return multiplication(num2, num1);
//        else if (num2 != 0)
//            return (num1 + multiplication(num1, num2 - 1));
//        else
//        return 0;
//    }
//
//    public static int division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2){
//        return num1 % num2;
//    }

//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number between 1 and 10: ");
//        int num = scanner.nextInt();
//        if (num < 10 && num > 1){
//            return num;
//        }else return getInteger(min, max);
//    }

//    public static void factorial() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int num = scanner.nextInt();
//        if (num >= 1 && num <= 10) {
//            int fact = 1;
//            String table = "";
//            for (int i = 1; i <= num; i++) {
//                fact *= i;
//                table += " " + i + " x";
//            }
//            String factTable = table.substring(0, (table.length() - 1));
//            System.out.printf("%d! = %s = %d", num, factTable, fact);
//        }
//    }
//        public static long factorial(long n) {
//            if(n <= 1)
//                return 1;
//            else
//            System.out.println( n + "!" + " = " + n + " * factorial(" + (n - 1) + ")");
//            return n * factorial(n - 1);
//}




}
