package org.tel.ran.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty", 8);
        System.out.println(kitty.toString());

        Cat fluffy = new Cat("Fluffy");
        System.out.println(fluffy.toString());

        Cat cat1 = new Cat(5);
        System.out.println(cat1.toString());

        Cat cat2 = new Cat(7);
        System.out.println(cat2.toString());
        System.out.println(cat1.sayMeow());
    }
}
