package org.tel.ran.homework4;

import java.util.Scanner;

public class EvenWords {
    private String firstWord;
    private String secondWord;

    public EvenWords() {

    }

    public String getFirstWord() {
        return firstWord;
    }

    public boolean setFirstWord(String firstWord) {
       if (firstWord.length() % 2 == 0) {
           this.firstWord = firstWord;
           return true;
       }
       else {
           return false;
       }
    }

    public String getSecondWord() {
        return secondWord;
    }

    public boolean setSecondWord(String secondWord) {
        if (secondWord.length() % 2 == 0) {
            this.secondWord = secondWord;
            return true;
        }
        else {
            return false;
        }
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
