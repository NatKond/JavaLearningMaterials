package org.tel.ran.homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        EvenWords twoWords = new EvenWords();
        boolean flag = false;
        do {
            System.out.print("Enter the first word with even number of letters: ");
            flag = twoWords.setFirstWord(scn.nextLine());
        } while (!flag);

        do {
            System.out.print("Enter the second word with even number of letters: ");
            flag = twoWords.setSecondWord(scn.nextLine());
        } while (!flag);

        System.out.println("twoWords.firstWord = " + twoWords.getFirstWord());
        System.out.println("twoWords.secondWord = " + twoWords.getSecondWord());
        System.out.println("twoWords.switchHalves() = " + twoWords.switchHalves());

        System.out.print("Enter the first integer: ");
        int a = scn.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scn.nextInt();
        Calculator clc = new Calculator(a, b);
        clc.printAllCalculate();
    }

}

