package org.tel.ran.lesson11;

public class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String convertSalaryToString(double Salary){
        return "{" + salary + "}";
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
