package org.tel.ran.lesson15;

public class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal " + this.name);
    }

    public void makeNoise (){
        System.out.println("Animal scream!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
        System.out.println("Cat " + this.getName());
    }

    public void makeNoise(){
        System.out.println("Meow!");
    }

}

class Owner{
    String address;
}
class Dog extends Animal {
    private Owner owner;
    public Dog(String name, int age, Owner owner) {
        super(name, age);
        System.out.println("Dog " + this.getName());
    }
}

