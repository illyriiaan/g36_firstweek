package org.example;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int a, b, c;
        long sum;
        float ave;
        System.out.println("Enter first number: ");
        a=in.nextInt();
        System.out.println("Enter second number: ");
        b=in.nextInt();
        System.out.println("Enter third number: ");
        c=in.nextInt();

        sum= a+b+c;
        ave= sum / 3;

        System.out.println("The entered sum is = "+sum);
        System.out.println("The average of the entered sum is = "+ave);







    }
}
