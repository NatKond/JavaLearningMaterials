package org.tel.ran.lesson12;

public class Human {
    int id;
    String name;
    int age;
    Pet pet;

    public Human(int id, String name, int age, Pet pet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public Human(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Human() {
        this(0,null,0);
    }
}
