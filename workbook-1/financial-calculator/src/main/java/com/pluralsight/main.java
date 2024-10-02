package com.pluralsight;

import com.pluralsight.*; //imported all classes

import java.util.Scanner;

public class main {

    public static <string> void main(String[] args) {  //called classes
        FutureValue fv = new FutureValue();
        Mortgage m = new Mortgage();
        Annuity A = new Annuity();
        String reset = "\033[0m";    // made colors for the terminal to print
        String red = "\033[0;31m";
        String cyan = "\033[0;36m";
        String magenta = "\033[0;35m";

        Scanner logicscanner = new Scanner(System.in); //made scanner

        boolean loop = true;  // conditional loop variable that WHILE as the loop is true it will keep running and if false it will exit.
        while (loop) {
            System.out.println( cyan + "\n***SELECT YOUR CALCULATOR***\n" + reset);  // color + adds the color + reset resets he color back after that line
            System.out.println(magenta + "For future value calculator select 1\n\nFor mortgage calculator select 2\n\nFor annuity calculator select 3\n\n" + reset);
            System.out.println(red + "To exit select 4 " +reset);
            int userChoice = logicscanner.nextInt();

            //says if the user types 1 it will call the future value calculator and so on.
            if (userChoice == 1) {
                fv.FutureValue();
            } else if (userChoice == 2) {
                m.Mortgage();
            } else if (userChoice == 3) {
                A.Annuity();
            }

            //says if they select 4 the loop will be false and exit the code
            else if (userChoice == 4) {
                loop = false;
                System.out.println(red + "SCREW YOU THEN!!" + reset);
            }

            // made it loop if user puts incorrect input
            else{System.out.println("Would you like to exit this program?\nEnter 1 for yes\nEnter 2 for no");
            userChoice = logicscanner.nextInt();
            if (userChoice == 1) {
                loop = false;
            }
            }

        }
    }



    }

