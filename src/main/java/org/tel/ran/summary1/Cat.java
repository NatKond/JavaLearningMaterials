package org.tel.ran.summary1;

public class Cat {
    public String name = "cat";
    public int age = 0;
    public static int counter;
    public static int counterS;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
        counter ++;
    }

    public Cat(Integer age, String name) {
        this.name = name;
        this.age = age;
        counter ++;
    }

    public Cat() {
        counter ++;
    }

    public void meow(){
        System.out.println(name + " says: "+ "meow");
    }

}
