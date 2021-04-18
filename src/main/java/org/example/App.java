package org.example;

import java.util.Scanner;

//This is my finished calculator. I've looked through the lecture videos on testing in Junit over and over again without any success.
//I have also watched other videos on testing but i just can't understand how to perform tests on the different methods and how to structure the test.
//I really enjoy programming and i really hope i will get the hang of testing very soon.


public class Calculator {
    public static void main(String[] args) {
        double result;
        String op;
        double num1;
        double num2;
        String again;
        boolean yesorno = true;

        Scanner input = new Scanner(System.in);

        while (yesorno) {
            System.out.println("Select operation: +,-,*,/ :");
            op = input.nextLine();
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            num2 = input.nextDouble();
            if (op.equals("+")) {
                result = (num1 + num2);
                System.out.println("Result: "+result);
            }
            else if (op.equals("-")){
                result = (num1 - num2);
                System.out.println("Result: "+result);
            }
            else if (op.equals("*")){
                result = (num1 * num2);
                System.out.println("Result: "+result);
            }
            else if (op.equals("/")){
                result = (num1 / num2);
                System.out.println("Result: "+result);
            }
            System.out.println("Would you like to continue? (yes/no)");

            again = input.nextLine();
            again = input.nextLine();
            if (again.equals("yes")){
                yesorno = true;
            } else if (again.equals("no")){
                yesorno = false;
                System.out.println("Have a nice day!");

            }



        }
    }
}
