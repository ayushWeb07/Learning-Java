package section4;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1= new Employee("John", "Doe", (byte)19, 1000.99, "SDE 3", 'm');

        System.out.println(emp1.getAge());
        System.out.println(emp1.getGender());

        Employee emp2= new Employee("Jane", "Lily", (byte)20, 1100.99, "SDE 2", 'f');

        System.out.println(emp2.getAge());
        System.out.println(emp2.getGender());

        Employee emp3= new Employee();

        System.out.println(emp3.getAge());
        System.out.println(emp3.getGender());

    }
}
