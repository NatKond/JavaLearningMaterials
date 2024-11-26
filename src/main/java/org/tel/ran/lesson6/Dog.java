package org.tel.ran.lesson6;

public class Dog {

    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addName(String secondName){
        this.name = name + "-" + secondName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSum(int a, int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;
    }
}
