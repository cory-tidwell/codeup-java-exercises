package com.mkyong.service;
import java.util.Scanner;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //*** JAVA ASCII ***
        int width = 100;
        int height = 30;

        //BufferedImage image = ImageIO.read(new File("/Users/mkyong/Desktop/logo.jpg"));
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("misfits", 10, 20);

        //save this image
        //ImageIO.write(image, "png", new File("/users/mkyong/ascii-art.png"));

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }
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
//        for(int i = 0; i <= 100; i++) {
//            if ((i % 5 == 0) && (i % 3 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
            //*** Table of Powers ***
        Scanner scanner = new Scanner(System.in);
        boolean continuePlaying;
        do{
            System.out.print("What number would you like to go up to? ");
            int userInput = scanner.nextInt();
            System.out.println("number \t | squared \t | cubed \n ----- \t | -----\t | ----- ");
            for(int i = 1; i <= userInput; i++){
                System.out.printf("%s \t \t | %s \t \t | %s \n", i, ((int )Math.pow(i, 2)), ((int)Math.pow(i, 3)));
            }
            System.out.println("Press y to continue");
            String userContinue = scanner.next();
            continuePlaying = userContinue.equalsIgnoreCase("y");
        }while(continuePlaying);

        //*** Grades ***
//        boolean studentContinue;
//        do{
//            System.out.print("\nEnter your grade (from 0 to 100): ");
//            int studentGrade = scanner.nextInt();
//            if(studentGrade >= 88 && studentGrade <= 100){
//                System.out.println("You got an A!");
//            }else if (studentGrade < 88 && studentGrade >= 80){
//                System.out.println("You got a B.");
//            }else if (studentGrade < 80 && studentGrade >= 67){
//                System.out.println("You got a C.");
//            }else if(studentGrade < 67 && studentGrade >= 60){
//                System.out.println("You got a D.");
//            }else if(studentGrade < 60){
//                System.out.println("You got an F.");
//            }else {
//                System.out.println("Good Bye!");
//            }
//            System.out.println("Would you like to continue? enter y");
//            String continueGrades = scanner.next();
//            studentContinue = continueGrades.equalsIgnoreCase("y");
//        }while(studentContinue);
    }
}
