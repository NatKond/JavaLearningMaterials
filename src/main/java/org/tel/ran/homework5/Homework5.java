package org.tel.ran.homework5;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first double: ");
        double m = scn.nextDouble();
        System.out.print("Enter the second double: ");
        double n = scn.nextDouble();
        if (Math.abs(10-m) < Math.abs(10-n)){
            System.out.println("Number m = " + m + " is closer to ten");
        } else if (Math.abs(10-m) > Math.abs(10-n)) {
            System.out.println("Number n = " + n + " is closer to ten");
        } else {
            System.out.println("Numbers m = " + n + " and m = " + m + " are equally distant from ten");
        }

        Random rnd = new Random();
        int timeToWork = rnd.nextInt(0,28800);
        System.out.println("Remaining time: " + timeToWork + "s");
        System.out.println("Remaining time: " + timeToWork /3600 + "h " + (timeToWork%3600)/60 + "m " + (timeToWork %3600)%60 + "s ");

    }
}
