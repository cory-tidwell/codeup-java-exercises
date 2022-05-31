package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Student Zach = new Student("zgulde");
        Zach.addGrade(100);
        Zach.addGrade(92);
        Zach.addGrade(86);

        Student Ryan = new Student("ryanorsinger");
        Ryan.addGrade(86);
        Ryan.addGrade(91);
        Ryan.addGrade(82);

        Student James = new Student("jreich5");
        James.addGrade(71);
        James.addGrade(77);
        James.addGrade(81);

        Student Fred = new Student("fmendozaro");
        Fred.addGrade(89);
        Fred.addGrade(93);
        Fred.addGrade(98);

        Student Luis = new Student("MontealegreLuis");
        Luis.addGrade(100);
        Luis.addGrade(98);
        Luis.addGrade(99);


        HashMap<String, Student> gitNameStudent = new HashMap<>();

        gitNameStudent.put("zgulde", Zach);
        gitNameStudent.put("ryanorsinger", Ryan);
        gitNameStudent.put("jreich5", James);
        gitNameStudent.put("fmendozaro", Fred);
        gitNameStudent.put("MontealegreLuis", Luis);


//        System.out.println(gitNameStudent);           //


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome");
        String tryAgain = "";

        do {
            System.out.println("Here are the github user-names of our students: ");
            System.out.println(gitNameStudent.keySet());
            System.out.println("What student would you like to see more information on?");
            String userChoice = scanner.next();

            if (userChoice.equalsIgnoreCase("zgulde")) {

                System.out.println("Name: " + gitNameStudent.get("zgulde").getName() + " - " + "Github Username: zgulde");
                System.out.println("Current Average: " + gitNameStudent.get("zgulde").getGradeAverage());


            } else if (userChoice.equalsIgnoreCase("ryanorsinger")) {

                System.out.println("Name: " + gitNameStudent.get("ryanorsinger").getName() + " - " + "Github Username: ryanorsinger");
                System.out.println("Current Average: " + gitNameStudent.get("ryanorsinger").getGradeAverage());


            } else if (userChoice.equalsIgnoreCase("jreich5")) {

                System.out.println("Name: " + gitNameStudent.get("jreich5").getName() + " - " + "Github Username: jreich5");
                System.out.println("Current Average: " + gitNameStudent.get("jreich5").getGradeAverage());


            } else if (userChoice.equalsIgnoreCase("fmendozaro")) {

                System.out.println("Name: " + gitNameStudent.get("fmendozaro").getName() + " - " + "Github Username: fmendozaro");
                System.out.println("Current Average: " + gitNameStudent.get("fmendozaro").getGradeAverage());


            } else if (userChoice.equalsIgnoreCase("MontealegreLuis")) {

                System.out.println("Name: " + gitNameStudent.get("MontealegreLuis").getName() + " - " + "Github Username: MontealegreLuis");
                System.out.println("Current Average: " + gitNameStudent.get("MontealegreLuis").getGradeAverage());


            } else {
                scanner.next();
                System.out.println("Error, there is no user with that name.");
            }
            System.out.println("Do you want to try again? (y/n)");
            tryAgain = scanner.next();

        }while(tryAgain.equalsIgnoreCase("y"));

        System.out.println("GoodBye");


    }



}

