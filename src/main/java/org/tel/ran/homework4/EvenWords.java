package org.tel.ran.homework4;

import java.util.Scanner;

public class EvenWords {
    private String firstWord;
    private String secondWord;

    public EvenWords() {
        setFirstWord();
        setSecondWord();
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord() {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Enter the first word with even number of letters:");
            this.firstWord = scn.nextLine();
        } while (firstWord.length() % 2 != 0);
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord() {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Enter the second word with even number of letters:");
            this.secondWord = scn.nextLine();
        } while (secondWord.length() % 2 != 0);
    }

    public String switchHalves(){
        return firstWord.substring(0, firstWord.length()/2) + secondWord.substring(secondWord.length()/2);
    }


    @Override
    public String toString() {
        return "EvenWords{" +
                "firstWord='" + firstWord + '\'' +
                ", secondWord='" + secondWord + '\'' +
                '}';
    }
}
