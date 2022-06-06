import java.util.stream.IntStream;

public class FizzBuzz {
    //Warmup: Write a function that prints the numbers 1 - 100 unless the number is divisible by 3, 5 or both 3 and 5. If divisible by 3 print "Fizz" . If divisible by 5 print "Buzz". If divisible by both 3 and 5 print "FizzBuzz"
    public static void main(String[] args) {

//        fizzBuzzOld(100);
        fizzBuzzNew(100);

    }
    private static void fizzBuzzOld ( int num){
        for (int i = 1; i <= num; i++) {

                if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 3 & 5?
                    System.out.println("fizzbuzz");
                else if ((i % 3) == 0) // Is it a multiple of 3?
                    System.out.println("fizz");
                else if ((i % 5) == 0) // Is it a multiple of 5?
                    System.out.println("buzz");
                else
                    System.out.println(i); // Not a multiple of 3 or 5
            }
        }

    private static void fizzBuzzNew(int num) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

}
