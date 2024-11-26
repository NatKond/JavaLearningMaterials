package org.tel.ran.lesson5;

public class Cat {
    String name;
    int age;
    static int count;
    static int counterS;

    Cat(String name, int age) {
        this.age = age;
        this.name = name;
        count++;
    }

    Cat(){
        this.name = "Street cat " + ++counterS;
        count++;
    }

    Cat(int age){
        this.age = age;
        this.name = "Street cat " + ++counterS;
        count++;
    }

    Cat(String name){
       this.name = name;
        count++;
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
