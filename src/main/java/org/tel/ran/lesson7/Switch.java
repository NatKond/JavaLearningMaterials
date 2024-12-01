package org.tel.ran.lesson7;

public class Switch {
    private int firstInt;
    private int secondInt;
    private double firstDouble;
    private double secondDouble;


    public Switch(int a, int b){
        firstInt = a;
        secondInt = b;
    }

    public Switch(double a, double b){
        firstDouble = a;
        secondDouble = b;
    }

    public int getFirstInt(){
        return firstInt;
    }

    public int getSecondInt(){
        return secondInt;
    }

    public double getFirstDouble(){
        return firstInt;
    }

    public double getSecondDouble(){
        return secondInt;
    }

    public void switchNumbersDouble(){
        double temp = firstDouble;
        firstDouble = secondDouble;
        secondDouble = temp;
    }

    public void switchNumbersInt(){
        int temp = firstInt;
        firstInt = secondInt;
        secondInt = temp;
    }

}
