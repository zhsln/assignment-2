package Persons.subclasses;

import Persons.Person;

public class Employee extends Person {
    String position;
    double salary;

    // default constructor
    public Employee() {
        super();
    }

    // parametrized constructor
    public Employee(String name, String surname, String position, double salary) {
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    // toString() returns information about Employee.
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    // getPaymentAmount() returns information about Employee's salary.
    @Override
    public double getPaymentAmount() { return salary; }

    // getters and setters
    public String getPosition() { return position; }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
