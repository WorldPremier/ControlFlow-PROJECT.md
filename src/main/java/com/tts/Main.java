package com.tts;

import java.util.Random;
import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String someString = input.next();
        System.out.println("hello " + someString);
        System.out.println("Do you wish to continue?");
        String yesOrNo = input.next();




        if(yesOrNo.equals("yes")){
            do{

            System.out.println("Do you have a red car?");
            String redVehicle = input.next();

            System.out.println("What's your favorite pet's name?");
            String petsName = input.next();

            System.out.println("How old is your favorite pet?");
            int agePet = input.nextInt();
            System.out.println("Your pets is: " + agePet + " years old. Then you're in luck. Lets play lottery");

            System.out.println("What is your favorite number?");
              int luckyNum = input.nextInt();

            System.out.println("Do you have a favorite quarterback?");
            yesOrNo = input.next();

             int jerseyNum = 0;

            if(yesOrNo.equals("yes")){
            System.out.println("what is your jersey number?");
               jerseyNum = input.nextInt();
            }

                System.out.print("What is two-digit model year of your car? ");
                int modelYr = input.nextInt();
                System.out.print("What is the first name of your favorite actor or actress? ");
                String actorName = input.next();

            System.out.println("Enter a random number between 1-50");
            int randomNum = input.nextInt();
                System.out.println();

                Random random = new Random();
                int magicBall;

//set the random range
                int firstRandom = random.nextInt(50);
                int secondRandom = random.nextInt(50);
                int thirdRandom = random.nextInt(50);

                if((random.nextInt(2)==1) &&(jerseyNum != 0)){
                    //choose quarterback jersey num *or* lucky number
                    magicBall = jerseyNum * firstRandom;
                }else{
                    magicBall = luckyNum * firstRandom;
                }

                while(magicBall > 75){
                    magicBall = magicBall - 75;
                }
                //generate other 5 number
                int num1;
                int num2;
                int num3;
                int num4;
                int num5;
                //Use the 2 digit model year of their car and add their lucky number to it.
                num1 = modelYr + luckyNum;
                //checking the number are in range
                if(num1 > 65){
                    num1 -= 65;
                }
                if(num1 < 1){
                    num1 += 65;
                }

                //Use the random number between 1-50, subtracting one of the generated random numbers.
                num2 = random.nextInt(50) - secondRandom;
                //checking the number are in range
                if(num2 > 65){
                    num2 -= 65;
                }
                if(num2 < 1){
                    num1 += 65;
                }

                //Use the age of their fav pet  + their car modelYr.
                num3 = agePet + modelYr;
                if(num3 > 65){
                    num3 -= 65;
                }
                if(num3 < 1){
                    num3 += 65;
                }

                //Fav quarterback number + age of pet + luckyNUm
                num4 = jerseyNum + agePet + luckyNum;
                //checking the number are in range
                if(num4 > 65){
                    num4 -= 65;
                }
                if(num4 < 1)
                {
                    num4 += 65;
                }
                //Convert the first letter of their fav actor to an int and use that value.
                num5 = (int)actorName.charAt(0);
                //Checking the num are in range
                if(num5 > 65){
                    num5 -= 65;
                }
                if(num5 < 1){
                    num5 += 65;
                }

                System.out.println("\nLottery number: " + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + "," + magicBall);

                System.out.println("\nIf you would like to continue playing, then enter: yes or no");
                yesOrNo = input.next();

            }while(yesOrNo.equals("yes"));


        }else{
            yesOrNo.equals("no");
            System.out.println("Better luck next time!\n");
        }

    }
}








///////////////////////////////////////////////////////////////////////////////////////////////////
//package com.tts;
//import java.util.Random;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        AsciiChars.printNumbers();
//        AsciiChars.printUpperCase();
//        AsciiChars.printLowerCase();
//        Scanner input = new Scanner(System.in);
//        System.out.print("\nPlease enter your name: ");
//        String userName = input.next();
//        System.out.println("Hello " + userName );
//        String continueOption;
//        System.out.print("If you wish to continue, Enter yes/no:  ");
//        String chooseOption = input.next();
//        if(chooseOption.equals("yes") || chooseOption.equals("y")){
//            do{
//                System.out.print("Do you have a red car?(yes, no) : ");
//                String redCar = input.next();
//                System.out.print("What is the name of your favorite pet? ");
//                String petName = input.next();
//                System.out.print("What is the age of your favorite pet? ");
//                int petAge = input.nextInt();
//                System.out.print("What is your lucky number? ");
//                int luckyNum = input.nextInt();
//                System.out.print("Do they have a favorite quarterback?(yes/no): ");
//                chooseOption = input.next();
//                int jerseyNum = 0;
//                if(chooseOption.equals("yes") || chooseOption.equals("y")){
//                    System.out.println("What is your jersey number? ");
//                    jerseyNum = input.nextInt();
//                }
//                System.out.print("What is two-digit model year of your car? ");
//                int modelYear = input.nextInt();
//                System.out.print("What is the first name of your favorite actor or actress? ");
//                String actFirstName = input.next();
//                System.out.print("Enter a random number between 1 and 50: ");
//                int randomNum = input.nextInt();
//                Random random = new Random();
//                int magicBallNum;
//                int random1 = random.nextInt(50);
//                int random2 = random.nextInt(50);
//                int random3 = random.nextInt(50);
//                if((random.nextInt(2) == 1) && (jerseyNum != 0)){
//                    //choose quarterback jersey number *or* their lucky number
//                    magicBallNum = jerseyNum * random1;
//                }else {
//                    magicBallNum = luckyNum * random1;
//                }
//                while(magicBallNum > 75){
//                    magicBallNum = magicBallNum - 75;
//                }
//                //generate other 5 number
//                int num1, num2, num3, num4, num5;
//                //Use the two digit model year of their car and add their lucky number to it.
//                num1 = modelYear + luckyNum;
//                //Checking the number are in range
//                if(num1 > 65){
//                    num1 -= 65;
//                }
//                if(num1 < 1){
//                    num1 += 65;
//                }
//                //Use the random number between 1 and 50, subtracting one of the generated random numbers.
//                num2 = random.nextInt(50) - random2;
//                //Checking the number are in range
//                if(num2 > 65){
//                    num2 -= 65;
//                }
//                if(num2 < 1){
//                    num2 += 65;
//                }
//                //Use the age of their favorite pet + their car model year.
//                num3 = petAge + modelYear;
//                //Checking the number are in range
//                if(num3 > 65){
//                    num3 -= 65;
//                }
//                if(num3 < 1){
//                    num3 += 65;
//                }
//                //Favorite quarterback number + age of pet + lucky number.
//                num4 = jerseyNum + petAge + luckyNum;
//                //Checking the number are in range
//                if(num4 > 65){
//                    num4 -= 65;
//                }
//                if(num4 < 1){
//                    num4 += 65;
//                }
//                //Convert the first letter of their favorite actor/actress to an integer and use that value.
//                num5 = (int)actFirstName.charAt(0);
//                //Checking the number are in range
//                if(num5 > 65){
//                    num5 -= 65;
//                }
//                if(num5 < 1){
//                    num5 += 65;
//                }
//                System.out.print("\nLottery numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4
//                        + ", " + num5 + " " + "Magic ball: " + magicBallNum);
//                System.out.println("\nif you like to answer questions to generate another set of numbers,(yes/no)? ");
//                continueOption = input.next();
//            }while(continueOption.equals("yes"));
//        }else{
//            System.out.println("Please return later to complete the process.");
//        }
//        System.out.println("Thank you!");
//    }
//}