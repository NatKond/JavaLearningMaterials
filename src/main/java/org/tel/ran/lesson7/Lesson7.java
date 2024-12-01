package org.tel.ran.lesson7;

public class Lesson7 {
    public static void findEvenOdd (int num) {
        if (num%2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            findEvenOdd(i);
        }
        System.out.println();

        System.out.println("Отвечает студент " + RandomStudent.chooseStudent(22));

        int a = 5;
        int b = 7;
        System.out.println("a = " + a + ", b = " + b);

        Switch twoNumbersInt = new Switch(a,b);
        twoNumbersInt.switchNumbersInt();
        a = twoNumbersInt.getFirstInt();
        b = twoNumbersInt.getSecondInt();
        System.out.println("a = " + a + ", b = " + b);

        double a1 = 5.6;
        double b1 = 7.9;
        System.out.println("a = " + a1 + ", b = " + b1);

        Switch twoNumbersDouble = new Switch(a1,b1);
        twoNumbersDouble.switchNumbersInt();
        a1 = twoNumbersDouble.getFirstDouble();
        b1 = twoNumbersDouble.getSecondDouble();
        System.out.println("a = " + a1 + ", b = " + b1);
        System.out.println();

        double temperature = 15;
        System.out.println("Температура в цельсиях: " + temperature);
        System.out.println("Температура в фаренгейтах: " + Converter.runFahrenheitConverter(temperature));
        System.out.println("Температура в кельвинах: " + Converter.runKelvinConverter(temperature));
    }
}
