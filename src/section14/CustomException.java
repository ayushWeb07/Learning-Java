package section14;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {

        try (Scanner sc= new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age= sc.nextInt();

            if ((age < 1) || (age > 100)) {
                throw new InvalidAgeException("Age must be in the range [1 - 100]");
            }

            System.out.println("Your age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: please type an integer as the age");
        } catch (InvalidAgeException e) {
            System.out.println("Error: age must be in the range [1 - 100]");
        } catch (Exception e) {
            System.out.println("Error: something went wrong while taking the input");
        }
    }
}
