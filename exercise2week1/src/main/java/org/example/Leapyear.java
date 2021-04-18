package org.example;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        Scanner in = new Scanner((System.in));

        System.out.println("Current Year: ");//This part confused me a bit since i put the int before the println. :'D
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))

            System.out.println("is a leapyear!");

        else

            System.out.println("is not a leapyear!");


    }
}
