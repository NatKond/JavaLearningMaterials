package org.tel.ran.lesson8;

import java.util.Random;

public class lesson8 {
    public static void main(String[] args) {
        int number = 8;
        number = UnaryF.doMinus(number);
        System.out.println(number);

        Unary u1 = new Unary();
        u1.setNumber(9);
        Unary u2 = new Unary(9);
        u1.doMinus(); u2.doMinus();
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println("u1 == u2: " + (u1 == u2));
        System.out.println("u1 == u2: " + (u1.equals(u2)));

        int number1 = 9;
        int number2 = 9;
        int number3 = 9;
        System.out.println("number1 = " + number1 + ", number2 = " + number2 + ", number3 = " + number3 + ".");
        System.out.println("number1 == number2 " + (number1 == number2));
        System.out.println("number1 == number3: " + (number1 == number3));

        System.out.println("number1 < number2: " + (number1 < number2));
        System.out.println("number1 < number3: " + (number1 < number3));
        System.out.println("number1 <= number3: " + (number1 <= number3));

        System.out.println("number1 != number2: " + (number1 != number2));
        System.out.println("number1 != number3: " + (number1 != number3));

        System.out.println("----------------------------------- ");

        if ((number1 != number2) && (number2 != number3))  {
            System.out.println("(number1 != number2) OR (number2 != number3):");
        } else {
            System.out.println("(number1 == number2) AND (number2 == number3)");
        }
        Random r = new Random();

        int a = r.nextInt(0,10),
                b = r.nextInt(0,10),
                c = r.nextInt(0,10),
                d = r.nextInt(0,10);

        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ".");
        if ((a < b) && (b == c)){
            System.out.println("(a < b) && (b == c) : true");
        }else{
            System.out.println("(a < b) && (b == c) : false");
        }

        if ((a > b) || (c == d)) {
            System.out.println("(a > b) || (c == d) : true");
        }else{
            System.out.println("(a > b) || (c == d) : false");
        }

        if (a != b) {
            System.out.println("a != b : true");
        }else{
            System.out.println("a != b : false");
        }
    }
}