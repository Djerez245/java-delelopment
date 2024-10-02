package com.pluralsight;

import com.pluralsight.*; //imported all classes

import java.util.Scanner;

public class main {

    public static <string> void main(String[] args) {  //called classes
        FutureValue fv = new FutureValue();
        Mortgage m = new Mortgage();
        Annuity A = new Annuity();
        String reset = "\033[0m";
        String red = "\033[0;31m";
        String cyan = "\033[0;36m";
        String magenta = "\033[0;35m";

        Scanner logicscanner = new Scanner(System.in); //made scanner

        boolean loop = true;  // conditional loop variable
        while (loop) {
            System.out.println( cyan + "\n***SELECT YOUR CALCULATOR***\n" + reset);
            System.out.println(magenta + "For future value calculator select 1\n\nFor mortgage calculator select 2\n\nFor annuity calculator select 3\n\n" + reset);
            System.out.println(red + "To exit select 4 " +reset);
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
                System.out.println( "SCREW YOU THEN!!");
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

