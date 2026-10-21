package section4;

public class Employee {
    String firstName;
    String lastName;
    byte age;
    double salary;
    String role;
    char gender;

    public Employee() {
        System.out.println("Default constructor calling....");

        this.firstName= "John";
        this.lastName= "Doe";
        this.age= 18;
        this.salary= 19491.1994;
        this.role= "SDE 2";
        this.gender= 'm';
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
