package section13;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // accept word
        System.out.println("Enter name: ");
        String firstName= sc.next();

        // accept age
        System.out.println("Enter age: ");
        int age= sc.nextInt();
        sc.nextLine();

        // accept line
        System.out.println("Enter dream car: ");
        String dreamCar= sc.nextLine();

        // accept float
        System.out.println("Enter deadlift pr: ");
        float deadliftPr= sc.nextFloat();

        // accept boolean
        System.out.println("Do you have high testosterone: ");
        boolean hasHighTestosterone= sc.nextBoolean();

        System.out.println("Name: " + firstName);
        System.out.println("Dream car: " + dreamCar);
        System.out.println("Age: " + age);
        System.out.println("Deadlift pr (in kgs): " + deadliftPr);
        System.out.println("Has high testosterone: " + hasHighTestosterone);

        sc.close();
    }
}
