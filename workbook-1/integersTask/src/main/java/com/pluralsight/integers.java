package com.pluralsight;

import java.util.Scanner;

public class integers {



    int variable1;
    int variable2;
    public static void main(String[] args) {

        Scanner addscanner = new Scanner(System.in);

        System.out.println("Enter variable 1: ");
        int variable1 =addscanner.nextInt();
        addscanner.nextLine();

        System.out.println("Enter variable 2: ");
        int variable2 =addscanner.nextInt();
        addscanner.nextLine();

        int answer = variable1 + variable2;

        System.out.println("your answer is: " + answer);


    }
}
