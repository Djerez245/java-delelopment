package com.pluralsight;

import com.pluralsight.*;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        FutureValue fv = new FutureValue();
        Mortgage m = new Mortgage();
        Annuity A = new Annuity();

        Scanner logicscanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.println("***SELECT YOUR CALCULATOR***");
            System.out.println("For future value calculator select 1\nFor mortgage calculator select 2\nFor annuity calculator select 3 ");
            int userChoice = logicscanner.nextInt();
            if (userChoice == 1) {
                fv.FutureValue();
            } else if (userChoice == 2) {
                m.Mortgage();
            } else if (userChoice == 3) {
                A.Annuity();
            }
            else{System.out.println("Would you like to exit this program?\nEnter 1 for yes\nEnter 2 for no");
            userChoice = logicscanner.nextInt();
            if (userChoice == 1) {
                loop = false;
            }
            }

        }
    }



    }

