package org.tel.ran.lesson11;

public class Lesson11 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.id = 1;
        emp1.department = "IT";
        emp1.name = "Mike";
        emp1.salary = 1223.50;

        emp2.id = 2;
        emp2.department = "HR";
        emp2.name = "Nik";
        emp2.salary = 1923.50;

        System.out.println(emp1.toString());

        System.out.println("emp1.convertSalaryToString(emp1.salary) = " + emp1.convertSalaryToString(emp1.salary));
    }
}
