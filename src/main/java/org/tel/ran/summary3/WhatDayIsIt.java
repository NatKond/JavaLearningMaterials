package org.tel.ran.summary3;

import java.util.Scanner;

public class WhatDayIsIt {
    public static void main(String[] args) {
        int day;
        do {
            Scanner scr = new Scanner(System.in);
            System.out.print("Enter the number of the day of the week: ");
            day = scr.nextInt();
            //whatDayIsItIf(day);
            whatDayIsItSwitch(day);
        } while (day!=0);

    }

    private static void whatDayIsItIf(int day) {
        if(day >=1 && day <= 5){
            if (day == 3){
                System.out.println("You can sleep a little longer");
            }
            System.out.println("Go to work");
        } else if (day == 6 || day == 7) {
            System.out.println("You can sleep");
        }else {
            System.out.println("You've entered the wrong number");
        }
    }

    private static void whatDayIsItSwitch(int day) {
        switch (day){
            case 1, 2, 4, 5 -> {
                System.out.println("Go to work");
                break;
            }
            case 3 -> {
                System.out.println("You can sleep a little longer");
                System.out.println("Go to work");
                break;
            }
            case 6, 7 -> {
                System.out.println("You can sleep");
                break;
            }
            default -> {
                System.out.println("You've entered the wrong number");
            }
        }
    }

    private static void whatDayIsItSwitch2(int day) {
        switch (day){
            case 1, 2, 4, 5:{
                System.out.println("Go to work");
                break;
            }
            case 3:{
                System.out.println("You can sleep a little longer");
                System.out.println("Go to work");
                break;
            }
            case 6, 7:{
                System.out.println("You can sleep");
                break;
            }
            default:{
                System.out.println("You've entered the wrong number");
            }
        }
    }

    private static void whatDayIsItSwitchClassic(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Надо идти на работу!");
                if(day==3) {
                    System.out.println("Можешь еще поспать, ты во вторую смену!");
                }
                break;
            case 6:
            case 7:
                System.out.println("Спи дальше! Выходной");
                break;
            default: {
                System.out.println("Вы не корректно ввели день недели!");
            }
        }

    }

}
