package Persons;

public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;

    public Person() {
        id = id_gen++;
    }

    public Person (String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0.00; // default implementation
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return Double.compare(this.getPaymentAmount(), anotherPerson.getPaymentAmount());
    }

    /*public String getPosition() {
        return "Student"
    }*/

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
