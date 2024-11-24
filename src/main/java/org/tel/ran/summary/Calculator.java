package org.tel.ran.summary;

public class Calculator {
    int a;
    int b;


    public void printAllCalculate(int a, int b) {
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("sum = " + sum);
        System.out.println("sub = " + sub);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
    }

    public int getSum(int a, int b){
        return a + b;
    }

    public int getSub(int a, int b){
        return a - b;
    }

    public int getMul(int a, int b){
        return a * b;
    }

    public int getDev(int a, int b){
        return a / b;
    }

}
