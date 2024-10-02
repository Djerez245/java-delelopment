package com.pluralsight;

import com.pluralsight.*; //imported all classes

import java.util.Scanner;

public class main {

    public static void main(String[] args) {  //called classes
        FutureValue fv = new FutureValue();
        Mortgage m = new Mortgage();
        Annuity A = new Annuity();

        Scanner logicscanner = new Scanner(System.in); //made scanner

        boolean loop = true;  // conditional loop variable
        while (loop) {
            System.out.println("***SELECT YOUR CALCULATOR***");
            System.out.println("For future value calculator select 1\nFor mortgage calculator select 2\nFor annuity calculator select 3\n To exit select 4 ");
            int userChoice = logicscanner.nextInt();
            if (userChoice == 1) {
                fv.FutureValue();
            } else if (userChoice == 2) {
                m.Mortgage();
            } else if (userChoice == 3) {
                A.Annuity();
            }
            else if (userChoice == 4) {
                loop = false;
                System.out.println("SCREW YOU THEN!!");
            }
            else{System.out.println("Would you like to exit this program?\nEnter 1 for yes\nEnter 2 for no");
            userChoice = logicscanner.nextInt();  // made it loop if user puts incorrect input
            if (userChoice == 1) {
                loop = false;
            }
            }

        }
    }



    }

