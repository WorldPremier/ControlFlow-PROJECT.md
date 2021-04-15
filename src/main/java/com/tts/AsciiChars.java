package com.tts;

public class AsciiChars {


    public static void printNumbers()
    {
        // TODO: print valid numeric input
        System.out.println("\nThe valid number are: ");

        for(int i = 0; i < 10; i++){
            System.out.println(i + "");
        }

    }

    public static void printLowerCase()
    {
        // TODO: print valid lowercase alphabetic input
        System.out.println("\nThe valid lowercase alphabets are: ");
        for(char character = 'a'; character <= 'z'; character++){
            System.out.println(character + "");
        }
    }

    public static void printUpperCase()
    {
        System.out.println("\nThe valid uppercase alphabets are: ");

        // TODO: print valid uppercase alphabetic input
        for(char character = 'A'; character <= 'Z'; character++){
            System.out.println(character + "");
        }
    }

}
