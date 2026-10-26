package section14;

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc= null;

        try {
            sc= new Scanner(System.in);

            System.out.println("Enter a number: ");
            int n= sc.nextInt();
            System.out.println("You entered: " + n);
        } catch (Exception e) {
            System.out.println("Input is not an integer");
        } finally {
            System.out.println("Finally executed");
            if (sc != null) {
                sc.close();
            }
        }
    }
}
