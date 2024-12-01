package org.tel.ran.homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        EvenWords twoWords = new EvenWords();
        System.out.println("twoWords.firstWord = " + twoWords.getFirstWord());
        System.out.println("twoWords.secondWord = " + twoWords.getSecondWord());
        System.out.println("twoWords.switchHalves() = " + twoWords.switchHalves());

        Calculator clc = new Calculator();
        clc.printAllCalculate();
    }

}

