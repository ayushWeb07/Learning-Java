package section24;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
    }
}

class Exercise {

    public static List<Person> filterByAge(int age) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));

        // Write your code below
        Predicate<Person> predicate= (Person person) -> person.getAge() > age;
        return filter(persons, predicate);
    }

    public static List<Person> filterByCity(String city) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));

        // Write your code below
        Predicate<Person> predicate= (Person person) -> person.getCity().equals(city);
        return filter(persons, predicate);
    }

    public static List<Person> filter(List<Person> persons, Predicate<Person> predicate) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (predicate.test(person)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

}


public class PredicateDemo {
    public static void main(String[] args) {
        // predicate 1
        Predicate<Integer> isEven= (Integer num) -> num % 2 == 0;

        // predicate 2
        Predicate<String> doesContainVowels= (String s) -> s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u");

        // predicate 3
        Predicate<Integer> isGreaterThanTen= (Integer num) -> num > 10;

        // predicate 4 -> negate the predicate
        Predicate<Integer> isOdd= isEven.negate();

        // Predicate 5 -> is equal predicate
        Predicate<String> isEqual= Predicate.isEqual("goat");

        // test the predicates
        System.out.println(isEven.test(50));
        System.out.println(isEven.test(31));
        System.out.println(isOdd.test(50));
        System.out.println(isOdd.test(31));

        System.out.println();

        System.out.println(doesContainVowels.test("ayush"));
        System.out.println(doesContainVowels.test("lynx"));

        System.out.println();

        System.out.println(isEqual.test("haha"));
        System.out.println(isEqual.test("goat"));

        System.out.println();

        System.out.println(isEven.and(isGreaterThanTen).test(12)); // true
        System.out.println(isEven.and(isGreaterThanTen).test(8)); // false
        System.out.println(isEven.or(isGreaterThanTen).test(11));; // true
        System.out.println(isEven.or(isGreaterThanTen).test(5));; // false
        System.out.println(isEven.or(isGreaterThanTen).test(4));; // true
    }
}
