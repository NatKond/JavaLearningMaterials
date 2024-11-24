package org.tel.ran.summary;

public class Cat {
    public String name;
    public int age;
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
        this.name = "Street cat" + ++counterS;
        counter ++;
    }

    public void meow(){
        System.out.println(name + " says: "+ "meow");
    }

}
