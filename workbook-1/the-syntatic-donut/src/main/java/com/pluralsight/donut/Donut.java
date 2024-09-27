package com.pluralsight.donut;

/*
 *  { } curly braces
 *  surround: method body, class declaration, array initializer
 *  [ ] square brackets
 *  array declaration, array access
 *  < > pointy brackets
 *  template parameter lists
 *  ; semi-colin
 *  end of statement
 */

import java.util.Scanner;

public class Donut {
    static double price = .25;

    public static double getTotalprice( int numberOfDonuts ) {

        return price * numberOfDonuts;
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Welcome, How many donuts do you want? :");
        int numberOfDonuts = inputScanner.nextInt();
        inputScanner.nextLine();
        
        System.out.println( "your donuts cost:" );
        
        double toalPrice = getTotalprice(numberOfDonuts);
        
        System.out.println( getTotalprice(numberOfDonuts) + " dollars" );
        System.out.printf("In dollars, that would be $%4.2f\n", getTotalprice(12));

        System.out.printf("The square root of 5 is %8.15f\n", Math.sqrt(5.0));
    }
}
