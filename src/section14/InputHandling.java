package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int n= sc.nextInt();
            System.out.println("You entered: " + n);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
        }
    }
}
