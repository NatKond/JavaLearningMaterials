package org.tel.ran.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(5);
        dog.setName("Bobik");
        dog.addName("Tusik");
        System.out.println(dog.toString());
        int a = 10;
        int b = 2;
        int sum = dog.getSum(10, 15);
        System.out.print("a = " + a + ", b = " + b + ", sum = " + sum);
    }
}
