public class ControlFlowExercises {
    public static void main(String[] args) {
        //*** While Loop ***
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//        //*** Do While Loop ***
//        int a = 0;
//        do{
//            System.out.println(a);
//            a += 2;
//        }while(a <= 100);
//        int b = 100;
//        do{
//            System.out.println(b);
//            b -= 5;
//        }while(b >= -10);
//        int c = 2;
//        do{
//            System.out.println(c);
//            c = (int) Math.pow(c, 2);
//        }while(c <= 1000000);
//        //*** For Loops ***
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//        for(int a = 0; a <= 100; a += 2){
//            System.out.println(a);
//        }
//        for(int b = 100; b >= -10; b -=5){
//            System.out.println(b);
//        }
//        for(int c = 2; c <= 1000000; c = (int) Math.pow(c, 2)){
//            System.out.println(c);
//        }
          //*** FizzBuzz ***
        for(int i = 0; i <= 100; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
