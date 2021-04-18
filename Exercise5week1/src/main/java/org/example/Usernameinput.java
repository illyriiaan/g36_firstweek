package org.example;

import java.util.Scanner;

public class Usernameinput {
    public static void main(String[] args) {
        System.out.println("Enter your name:");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();


        System.out.println("Hello "+name+("!")+(" Please enter your age:"));
        //From now on im just experimenting a bit by adding age. I wanted to add more but lets focus on the right things haha!!

        int age = in.nextInt();

        System.out.println("Thank you "+name+", "+age+"!");
        System.out.println("Redirecting to your profile..");


    }
}
