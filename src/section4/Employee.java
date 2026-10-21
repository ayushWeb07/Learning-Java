package section4;

public class Employee {
    String firstName;
    String lastName;
    byte age;
    double salary;
    String role;
    char gender;

    public Employee() {
        this("Virat", "Kohli", (byte) 38, 140000000.99, "Cricketer", 'm');

        System.out.println("Default constructor calling....");
    }

    public Employee(String firstName, String lastName, byte age, double salary, String role, char gender) {
        System.out.println("Parameterized constructor calling....");

        this.firstName= firstName;
        this.lastName= lastName;
        this.age= age;
        this.salary= salary;
        this.role= role;
        this.gender= gender;
    }

    byte getAge() {
        return this.age;
    }

    String getGender() {
        if (this.gender == 'm') {
            return "Male";
        }

        else if (this.gender == 'f') {
            return "Female";
        }

        else {
            return "Others";
        }
    }
}
