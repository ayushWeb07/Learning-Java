package section4;

public class Employee {
    String firstName;
    String lastName;
    byte age;
    double salary;
    String role;
    char gender;

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
