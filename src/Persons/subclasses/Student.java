package Persons.subclasses;

import Persons.Payable;
import Persons.Person;

public class Student extends Person{
    double GPA;

    public Student() {
        super();
    }
    public Student(String name, String surname, double GPA) {
        this();
        setName(name);
        setSurname(surname);
        setGPA(GPA);
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return (GPA > 2.67) ? 36660.00 : 0;
    }

    //getters and setters
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
