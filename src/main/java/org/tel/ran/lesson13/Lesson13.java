package org.tel.ran.lesson13;

import com.github.javafaker.Faker;

class Human{
    private int age;
    private String name;
    String department;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Lesson13 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.department = "IT";
        human1.setAge(33);
        Company company1 = new Company(1, "Tesla", "San Carlos");
        System.out.println("company1 = " + company1);
        company1.setId(-1);
        company1.setId(2);
        System.out.println("company1 = " + company1);

        Company company2 = new Company();

        company2.setId(80);
        company2.setName("Google");
        company2.setAddress("NY");
        
        Company company3 = new Company();
        company3.setId(180);
        company3.setName("Netflix");
        company3.setAddress("LA");
    }
    
}
