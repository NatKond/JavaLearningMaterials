package org.tel.ran.homework3;

import org.tel.ran.summary.Calculator;

import java.util.Locale;

public class Homework {
    private static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args){
        String str = "I study Basic Java!";
        sayHello(str);
        System.out.println(str.charAt(str.length() - 1));
        System.out.print("str contains Java: ");
        System.out.println(str.contains("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(str.length()-5, str.length()-1));

        Calculator calculator = new Calculator();
        int a = 15;
        int b = 5;
        System.out.println("a + b = " + calculator.getSum(a,b));
        System.out.println("a - b =  " + calculator.getSub(a,b));
        System.out.println("a * b =  " + calculator.getMul(a,b));
        System.out.println("a / b =  " + calculator.getDev(a,b));
    }
}
