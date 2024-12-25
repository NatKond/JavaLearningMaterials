package org.tel.ran.lesson15;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class Lesson15 {
    public static void main(String[] args) {
        Cat fluffy = new Cat("Fluffy", 2);
        Animal fuzzy = new Cat("Fuzzy", 5);
        Dog milo = new Dog("Milo", 2,new Owner());
        fluffy.makeNoise();
        milo.makeNoise();

    }
}
