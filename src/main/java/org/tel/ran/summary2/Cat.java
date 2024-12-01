package org.tel.ran.summary2;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public Cat(){
    }

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow (){
        System.out.println("Cat " + name + " says MEOW!");
    }

    public boolean seeVet (){
        if (age > 5){
            return true;
        }else{
            return false;
        }
    }

    private void addException(){
        throw new NullPointerException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
