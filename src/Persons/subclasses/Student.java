package Persons.subclasses;

import Persons.Person;

public class Student extends Person{
    double GPA;

    // default constructor
    public Student() {
        super();
    }

    // parametrized constructor
    public Student(String name, String surname, double GPA) {
        this();
        setName(name);
        setSurname(surname);
        setGPA(GPA);
    }

    // toString() returns information about Student.
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    /* getPaymentAmount() returns information about the student's scholarship,
    which depends on the student's GPA.*/
    @Override
    public double getPaymentAmount() { return (GPA > 2.67) ? 36660.00 : 0; }

    //getters and setters
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
