package com.tts;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

//        Ask for name + enter name
        Scanner basic = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        String firstName = basic.next();
        System.out.printf("\n Hello %s", firstName);

        System.out.println("\n Do you wish to continue? (yes/no)");
        Scanner yesOrNo = new Scanner(System.in);
        String yNInput = yesOrNo.next();
        System.out.println();
        // Ask if they want to continue (accept Yes,yes,Y,y,YES)
        if (yNInput.equals("yes")
                || yNInput.equals("Yes")
                || yNInput.equals("Y")
                || yNInput.equals("y")
                || yNInput.equals("YES")) {
            System.out.println(" ");

            // End survey & return later if yes is not the answer

        } else {
            System.out.println("Please return later to finish the survey");
            System.out.println();
            basic.close();


        }
        Scanner input = new Scanner(System.in);

        // Fav pet
        System.out.println("What is the name of your favorite pet");
        String favPet = input.next();
        int petNum = favPet.charAt(2);

        System.out.println("What is the age of your favorite pet?");
        int petAge = input.nextInt();

        System.out.println("What is your lucky number?");
        int luckyNumber = input.nextInt();

        System.out.println("Do you have a favorite quarterback?");
        String qBackYN = yesOrNo.next();
        if (qBackYN.equals("yes") || qBackYN.equals("Yes") || qBackYN.equals("Y") || qBackYN.equals("y") || qBackYN.equals("YES")) {
            System.out.println("What is their jersey number?");
            int jerseyNumber = input.nextInt();
        } else {
            System.out.println("\t I don't like football either");
        }

        System.out.println("What is the two-digit model year of your car? (ex: 2019 would be 19)");
        int carInt = input.nextInt();

        System.out.println("Please enter a number between 1 and 50");
        int inputNumber = input.nextInt();
        if (inputNumber > 1 && inputNumber < 50) {
            System.out.println();
        } else {
            System.out.println("Your number was not between 1 and 50, please try again");
            int inputNumber2 = input.nextInt();
            if (inputNumber2 > 1 && inputNumber2 < 50) {
                System.out.println();
            }
        }
        System.out.println("What is the first name of your favorite actor or actress?");
        String favAct = input.next();
        int actNum = favAct.charAt(0);

        int ranNum = Math.random() > 0.5 ? luckyNumber : inputNumber;

        int magicBall = luckyNumber * inputNumber;
        System.out.println("Your lotto numbers are: " + carInt + " " + petNum + " " + petAge+ " " + ranNum + " " + actNum + " " + " Magic Ball:" + magicBall  );



//        int magicBall = luckyNumber * Math.random();
//        System.out.println("Do you want to play the lottery?");
//        System.out.println("Yes/No: ");
//        String lottery = info.nextLine();
//        if (lottery.equals("y")) {
//            System.out.println("Let's play!");

//        }


    }
}




