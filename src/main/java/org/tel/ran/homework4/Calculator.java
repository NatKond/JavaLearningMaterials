package org.tel.ran.homework4;

import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;

    public Calculator() {

    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }


    public int getB() {
        return b;
    }

    public void printAllCalculate() {
        System.out.println(this.a + " + " + this.b + " = " + this.getSum());
        System.out.println(this.a + " - " + this.b + " = " + this.getSub());
        System.out.println(this.a + " * " + this.b + " = " + this.getMul());
        System.out.println(this.a + " / " + this.b + " = " + this.getDev());
    }

    public int getSum(){
        return a + b;
    }

    public int getSub(){
        return a - b;
    }

    public int getMul(){
        return a * b;
    }

    public int getDev(){
        return a / b;
    }

}
