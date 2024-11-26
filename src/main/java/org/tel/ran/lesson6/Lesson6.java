package org.tel.ran.lesson6;

import java.util.Random;

public class Lesson6 {
    public static int getSum(int a, int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;
    }
    public static double getSum(double a, double b){
        double sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(5);
        dog.setName("Bobik");
        dog.addName("Tusik");
        System.out.println(dog.toString());

        Random rand = new Random();

        int intNumber1 = rand.nextInt(0,25);
        int intNumber2  = rand.nextInt(-25,0);
        int intSum = getSum(intNumber1, intNumber2);
        System.out.println("a = " + intNumber1 + ", b = " + intNumber2 + ", sum = " + intSum);

        double doubleNumber1 = rand.nextDouble(0,25);
        double doubleNumber2 = rand.nextDouble(-25,0);
        double sum = getSum(doubleNumber1, doubleNumber2);
        System.out.println("a = " + doubleNumber1 + ", b = " + doubleNumber2 + ", sum = " + sum);

        System.out.println("Random integer: " + rand.nextInt(-25,25));
        System.out.println("Random float: " + rand.nextFloat(0,10));
        System.out.println("Random double: " + rand.nextDouble());
        System.out.println("Random boolean: " + rand.nextBoolean());
        System.out.println("Random from Math: " + Math.random());
    }
}
