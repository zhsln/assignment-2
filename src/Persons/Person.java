package Persons;

import Persons.interfaces.Payable;

public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;

    // default constructor
    public Person() {
        id = id_gen++;
    }

    // parametrized constructor
    public Person (String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    // toString returns information about person, like id, name and surname.
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

   /* getPaymentAmount() returns Person's payment amount.
    Method returns 0.00 by default. It's overrided in subclasses.*/
    @Override
    public double getPaymentAmount() {
        return 0.00; // default implementation
    }

    // compareTo() compares two persons payment amounts.
    @Override
    public int compareTo(Person anotherPerson) {
        return Double.compare(this.getPaymentAmount(), anotherPerson.getPaymentAmount());
    }

    // getPosition() returns information about is Person's position. For example, student, employee etc.
    public String getPosition() {
        return "Student"; // returns "Student" for default. It is overrided in Employee subclass.
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
