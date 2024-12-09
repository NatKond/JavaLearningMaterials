package org.tel.ran.lesson11;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Faker faker = new Faker();
        Random random = new Random();

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(i + 1,
                                        faker.name().firstName(),
                                        faker.commerce().department(),
                                        random.nextDouble(1_999,5_001));
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println(faker.address().streetAddress());
        System.out.println(faker.address().streetAddress(true));
        System.out.println(faker.bothify("??????##@gmail.com"));
        /*
        Faker fakerRU = Faker.instance(new Locale("ru-RU"));
        Employee[] employeesRU = new Employee[5];

        for (int i = 0; i < employeesRU.length; i++) {
            employeesRU[i] = new Employee(i + 1,
                    fakerRU.name().firstName(),
                    fakerRU.commerce().department(),
                    random.nextDouble(1_999,5_001));
        }
        for (int i = 0; i < employeesRU.length; i++) {
            System.out.println(employeesRU[i]);
        }
         */
    }
}
