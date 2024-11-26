package org.tel.ran.lesson5;

public class Cat {
    String name;
    int age;
    static int count;
    static int counterStreetCat;

    Cat(String name, int age) {
        this.age = age;
        this.name = name;
        count++;
    }

    Cat(){
        this ("Street cat " + ++counterStreetCat, 0);
    }

    Cat(int age){
        this ("Street cat " + ++counterStreetCat, age);
    }

    Cat(String name){
        this (name, 0);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String sayMeow(){
        return "Cat " + name + " says meow.";
    }

}
