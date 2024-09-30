package com.pluralsight;

import java.util.Scanner;

public class FutureValue {

    public static void main(String[] args) {

        double FutureValue = 0.0;
        double cd = 0.0;
        double interest = 0.0;
        int yearsToMature = 0;

        Scanner futureValueScanner = new Scanner(System.in);

        System.out.println("Enter CD amount: ");
        cd = futureValueScanner.nextDouble();
        futureValueScanner.nextLine();

        System.out.println("Enter Interest: ");
        interest = futureValueScanner.nextDouble();
        futureValueScanner.nextLine();

        interest = interest/100;

        System.out.println("Enter amount of years");
        yearsToMature = futureValueScanner.nextInt();
        futureValueScanner.nextLine();


       double a = FutureValue;
       double p = cd;
       double r = interest;
       int t = yearsToMature;
       int n = 365;
       double numerator = r;
       double denominator = n;
       double b = n * t;
       double s = (1 + (r / n));
       double c = Math.pow(s,b);

       FutureValue = p * c;

       double earnedinterest = FutureValue - cd;


        System.out.println("Your future value is: " + FutureValue);
        System.out.println("Amount earned in interest:" + earnedinterest);



    }
}

