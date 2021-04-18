package org.example;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        long num1 = in.nextInt();

        System.out.println("Input second number");
        long num2 = in.nextInt();

        System.out.println("Result:");

        System.out.println(num1 +" x "+num2+ " = "+(num1 * num2));

        System.out.println(num1 +" / "+num2+ " = "+(num1 / num2));

        System.out.println(num1 +" - "+num2+ " = "+(num1 - num2));


    }
}
