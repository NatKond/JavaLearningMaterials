package org.tel.ran.summary3;

import java.util.ArrayList;
import java.util.Scanner;

public class Summary3 {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scn.nextInt();

            System.out.println("getSumFor(number) = " + getSumFor(number));

            System.out.println("getSumWhile(number) = " + getSumWhile(number));

            System.out.print("Another number? (Y/N) ");
            answer = scn.next();
        } while (!answer.equals("N"));
    }

    private static int getSumWhile(int number) {
        int sum = 0;

        while (number != 0){
            int ost = number % 10;
            number = number /10;
            sum += ost;
        }
        return sum;
    }

    private static int getSumFor(int number) {
        int sum = 0;

        for (int reducedNumber = number; reducedNumber != 0; reducedNumber /= 10){
            int ost = reducedNumber % 10;
            sum += ost;
        }
        return sum;
    }
}
