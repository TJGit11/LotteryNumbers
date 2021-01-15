package com.tts;

import java.util.Scanner;

public class AsciiChars
{
    public static void printNumbers() {
        // TODO: print valid numeric input
        for (int i = 0; i <= 9; i++) {
            System.out.println((char)i + " = " + i);

        }
    }

    public static void printLowerCase()
    {
        // TODO: print valid lowercase alphabetic input
        for (char ch1= 'a'; ch1 <= 'z'; ch1++){
            System.out.printf("\n%s " , ch1);

        }

    }

    public static void printUpperCase()
    {
        // TODO: print valid uppercase alphabetic
        for(char ch2= 'A'; ch2<= 'Z'; ch2++){
            System.out.printf("\n%s ", ch2);
        }

    }

}


