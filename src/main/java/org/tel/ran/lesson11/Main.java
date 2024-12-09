package org.tel.ran.lesson11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Nik", "Mike"};
        String[] deps ={"IT", "HR"};

        Random random = new Random();
        Employee e1 = new Employee(1, names[0], deps[0], random.nextDouble(2000,3000));
        Employee e2 = new Employee(2, names[1], deps[1], random.nextDouble(2000,3000));

        Employee[] employees = {e1,e2};
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            System.out.println(currentEmployee.toString());
            if (currentEmployee.salary > 2_500) {
                System.out.println(currentEmployee.convertSalaryToString(currentEmployee.salary));
            }

        }
    }
}
