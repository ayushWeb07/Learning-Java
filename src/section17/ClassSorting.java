package section17;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age + " years old";
    }

    @Override
    public int compareTo(Person p) {
        // compare based on the age
        return Integer.compare(this.age, p.age);
    }

}

public class ClassSorting {
    public static void main(String[] args) {
        var persons = new ArrayList<Person>();
        persons.add(new Person("James", 65));
        persons.add(new Person("Sneha", 34));
        persons.add(new Person("Jenna", 30));
        persons.add(new Person("Harry", 29));

        System.out.println(persons);

        // Sort the Persons based on age
        Collections.sort(persons);

        System.out.println(persons);

    }
}
