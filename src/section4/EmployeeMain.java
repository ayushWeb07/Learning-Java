package section4;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp= new Employee();

        emp.firstName= "John";
        emp.lastName= "Doe";
        emp.age= 18;
        emp.salary= 19491.1994;
        emp.role= "SDE 2";
        emp.gender= 'm';

        System.out.println(emp.getAge());
        System.out.println(emp.getGender());
    }
}
