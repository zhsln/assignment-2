import Persons.Person;
import Persons.subclasses.Employee;
import Persons.subclasses.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personsList = new ArrayList<>();

        // adding persons to the list
        personsList.add(new Student("Zhasulan", "Abdigaliyev", 4.0)); // That's me ᕦ(ò_óˇ)ᕤ
        personsList.add(new Employee("Joseph", "Biden", "Political Science lecturer",1000000.00));
        personsList.add(new Student("Akylbek", "Tusupayev", 2.0)); // My friend that lost his stipend...
        personsList.add(new Employee("Donald", "Trump", "Economics Science lecturer", 1500000.00));
        personsList.add(new Student("Miras", "Tulebayev", 3.6)); // Also my friend, but stipend is ok
        personsList.add(new Employee("Albert", "Einstein", "Physics lecturer", 500000.00));

        // Sorting the list
        Collections.sort(personsList);

        // printing the list...
        printData(personsList);
    }

    // printData() method prints information about payment amount of every Person from "persons" arraylist.
    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.println(person + " earns " + String.format("%.2f", person.getPaymentAmount())+ " tenge.");
            /* String.format allows to print double type with 2 numbers after period,
            just person.getPaymentAmount() will give something like: "36660.0", not "36660.00"
            Honestly, I googled how to output double like this... */
        }
    }
}
