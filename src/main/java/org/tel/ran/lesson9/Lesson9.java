package org.tel.ran.lesson9;

public class Lesson9 {
    public static void main(String[] args) {
        String name = "Natalia";
        System.out.println("Hello " + name + "!");

        Person person = new Person("Natalia","natkond",36);

        int a = 7;
        int b = 4;
        int c = 5;
        System.out.println("a * b * c = " + a * b * c);

        if ((a * b * c) % 2 == 0) {
            System.out.println("All numbers are even");
        }else {
            System.out.println("One of the numbers is odd");
        }
        for (int i = 10; i > 0 ; i--) {
            if (i % 2 == 0){
                System.out.println("i = " + i + " is even.");
            } else {
                System.out.println("i = " + i + " is odd.");
            }
        }

        int x = 5;
        System.out.println(x++ + " + " + ++x + " = " + (x++ + ++x));
        String s = "5";

        System.out.println("s + c + c = " + s + c + c);
        System.out.println("s + c + c = " + s + (c + c));

        char i = 'A';
        while (i < 'H') {
            System.out.println("i = " + i);
            i++;
        }

    }

}
