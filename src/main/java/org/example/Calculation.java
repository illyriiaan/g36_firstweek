package org.example;

public class Calculation {
    public static void main(String[] args) {

        int a,b,resultaddition;
        a=45;
        b=11;

        resultaddition= a+b;

        System.out.println("45 + 11 = "+resultaddition);

        int c,d,resultmultiplication;
        c=12;
        d=4;

        resultmultiplication = c*d;

        System.out.println("12 * 4 = "+resultmultiplication);

        int e,f,resultdivision;  //chose int instead of float or double since its a fixed number and nr 4 looks better than 4.0 :D
        e=24;
        f=6;

        resultdivision = (e/f);

        System.out.println("24 / 6 = " + resultdivision);

        int g,h,resultsubtraction;
        g=55;
        h=12;

        resultsubtraction = g-h;

        System.out.println("55 - 12 = "+resultsubtraction);


    }
}
