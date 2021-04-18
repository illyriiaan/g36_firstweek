package org.example;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        final int MINUTES_IN_HOURS = 60;
        final int SECONDS_IN_MINUTES = 60;
        int seconds;
        int minutes;
        int hours;
        System.out.println("Enter seconds: ");
        seconds = console.nextInt();

        //This exercise really got my brain into ultra mode. Felt like Einstein when i got it to work :'D


        minutes = seconds / SECONDS_IN_MINUTES;
        seconds -= minutes * SECONDS_IN_MINUTES;


        hours = minutes / MINUTES_IN_HOURS;
        minutes -= hours * MINUTES_IN_HOURS;

        System.out.println("The time is: " +hours+":"+minutes+":"+seconds);

    }
}
