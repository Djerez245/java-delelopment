package com.pluralsight;

import java.util.Scanner;

public class Annuity {

    public void Annuity() {
        double presentValue = 0;
        double payment = 0;
        double intrestRate = 0;
        double totalNumberOfPayments = 0;




        Scanner annuityscanner = new Scanner(System.in);

        System.out.println("Enter your payment here: ");
        payment = annuityscanner.nextDouble();
        annuityscanner.nextLine();

        System.out.println("Enter your interest rate here: ");
        intrestRate = annuityscanner.nextDouble() / 100;
        annuityscanner.nextLine();

        intrestRate = intrestRate/12;

        System.out.println("Enter Your total number of payments: ");
        totalNumberOfPayments = annuityscanner.nextDouble();
        annuityscanner.nextLine();

        double n = totalNumberOfPayments * 12;

        presentValue = payment * ((1 - (Math.pow(1 + intrestRate, -n ))) / intrestRate);


        System.out.println( "Your present value is: " + presentValue );



    }

}
